package com.ai.slp.route.service.business.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.platform.common.api.area.interfaces.IGnAreaQuerySV;
import com.ai.platform.common.api.area.param.GnAreaVo;
import com.ai.slp.route.api.routemanage.param.RouteAddParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteAddParamResponse;
import com.ai.slp.route.api.routemanage.param.RouteIdParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteListRequest;
import com.ai.slp.route.api.routemanage.param.RouteListResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchRequest;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchVo;
import com.ai.slp.route.api.routemanage.param.RouteQueryByGroupIdAndAreaRequest;
import com.ai.slp.route.api.routemanage.param.RouteQueryByGroupIdAndAreaResponse;
import com.ai.slp.route.api.routemanage.param.RouteResponse;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamResponse;
import com.ai.slp.route.api.routemanage.param.RouteUpdateStateRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateStateResponse;
import com.ai.slp.route.api.routemanage.param.RouteVo;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.constants.RouteConstant;
import com.ai.slp.route.dao.mapper.bo.Route;
import com.ai.slp.route.dao.mapper.bo.RouteItem;
import com.ai.slp.route.dao.mapper.bo.RouteTargetArea;
import com.ai.slp.route.service.atom.interfaces.IRouteAtomSV;
import com.ai.slp.route.service.atom.interfaces.IRouteItemAtomSV;
import com.ai.slp.route.service.atom.interfaces.IRouteProdSupplyAtomSV;
import com.ai.slp.route.service.atom.interfaces.IRouteTargetAreaAtomSV;
import com.ai.slp.route.service.business.interfaces.IRouteBusiSV;
import com.ai.slp.route.util.SequenceUtil;
@Service
public class RouteBusiSVImpl implements IRouteBusiSV {
	@Autowired
	private IRouteAtomSV routeAtomSV;
	@Autowired
	private IRouteItemAtomSV routeItemAtomSV;
	@Autowired
	private IRouteTargetAreaAtomSV routeTargetAreaAtomSV;
	@Autowired
	private IRouteProdSupplyAtomSV routeProdSupplyAtomSV;
	
	
	
	@Override
	@Transactional
	public RouteAddParamResponse addRoute(RouteAddParamRequest request) {
		//
		RouteAddParamResponse response = new RouteAddParamResponse();
		ResponseHeader responseHeader =new ResponseHeader();
		
		//
		Route route = new Route();
		//
		route.setTenantId(request.getTenantId());
		route.setRouteId(SequenceUtil.createRouteId());
		route.setRouteName(request.getRouteName());
		route.setProvCode(request.getProvCode());
		route.setCityCode(request.getCityCode());
		route.setCountyCode(request.getCountyCode());
		route.setAddress(request.getAddress());
		route.setState("1");
		route.setRouteType(RouteConstant.Route.RouteType.STORAGE);
		route.setCreateId(0001l);
		route.setOperId(0001l);
		route.setOperTime(DateUtil.getSysDate());
		route.setCreateTime(DateUtil.getSysDate());
		//
		this.routeAtomSV.insert(route);
		responseHeader.setIsSuccess(true);
		responseHeader.setResultCode("000000");
		responseHeader.setResultMessage("仓库创建成功");
		//
		response.setResponseHeader(responseHeader);
		//
		return response;
		
	}

	@Override
	public RoutePageSearchResponse queryPageSearch(RoutePageSearchRequest request) {
		RoutePageSearchResponse response = new RoutePageSearchResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		//
		String tenantId = request.getTenantId();
		String routeId = request.getRouteId();
		String routeName = request.getRouteName();
		List<String> states = request.getStates();
		Integer pageNo = request.getPageNo();
		Integer pageSize = request.getPageSize();
		//
		PageInfo<Route> pageInfo = this.routeAtomSV.queryRouteListPageInfo(tenantId,routeId, routeName, states, pageNo, pageSize);
		//
		PageInfo<RoutePageSearchVo> routePageSearchVoPageInfo = new PageInfo<RoutePageSearchVo>();
		routePageSearchVoPageInfo.setCount(pageInfo.getCount());
		routePageSearchVoPageInfo.setPageCount(pageInfo.getPageCount());
		routePageSearchVoPageInfo.setPageNo(pageNo);
		routePageSearchVoPageInfo.setPageSize(pageSize);
		//
		List<RoutePageSearchVo> voList = new ArrayList<RoutePageSearchVo>();
		RoutePageSearchVo vo = null;
		//
		int index = 0;
		for(Route route : pageInfo.getResult()){
			index++;
			vo = new RoutePageSearchVo();
			//
			vo.setIndex((pageNo - 1) * pageSize + index);
			vo.setTenantId(tenantId);
			vo.setRouteId(route.getRouteId());
			vo.setRouteName(route.getRouteName());
			vo.setProvCode(route.getProvCode());
			vo.setCityCode(route.getCityCode());
			vo.setCountyCode(route.getCountyCode());
			vo.setState(route.getState());
			vo.setAddress(route.getAddress());
			//
			GnAreaVo provVo = DubboConsumerFactory.getService(IGnAreaQuerySV.class).queryGnArea(route.getProvCode().toString());
			if(null != provVo){
				vo.setProvName(provVo.getAreaName());
			}
			GnAreaVo cityVo = DubboConsumerFactory.getService(IGnAreaQuerySV.class).queryGnArea(route.getCityCode().toString());
			if(null != cityVo){
				vo.setCityName(cityVo.getAreaName());
			}
			GnAreaVo countyVo = DubboConsumerFactory.getService(IGnAreaQuerySV.class).queryGnArea(route.getCountyCode().toString());
			if(null != countyVo){
				vo.setCountyName(countyVo.getAreaName());
			}
			
			//
			voList.add(vo);
		}
		//
		routePageSearchVoPageInfo.setResult(voList);
		response.setPageInfo(routePageSearchVoPageInfo);
		responseHeader.setIsSuccess(true);
		responseHeader.setResultCode("000000");
		responseHeader.setResultMessage("成功");
		response.setResponseHeader(responseHeader);
		//
		return response;
	}

	@Override
	@Transactional
	public RouteUpdateParamResponse updateRoute(RouteUpdateParamRequest request) {
		//
		RouteUpdateParamResponse response = new RouteUpdateParamResponse();
		ResponseHeader responseHeader =new ResponseHeader();
		
		Route route = new Route();
		//
		route.setRouteId(request.getRouteId());
		//
		route.setRouteName(request.getRouteName());
		route.setProvCode(request.getProvCode());
		route.setCityCode(request.getCityCode());
		route.setCountyCode(request.getCountyCode());
		route.setAddress(request.getAddress());
		//
		this.routeAtomSV.update(route);
		//
		responseHeader.setIsSuccess(true);
		responseHeader.setResultCode("000000");
		responseHeader.setResultMessage("仓库修改成功");
		//
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	@Transactional
	public RouteUpdateStateResponse updateRouteState(RouteUpdateStateRequest request) {
		RouteUpdateStateResponse response = new RouteUpdateStateResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		//
		Route route = new Route();
		route.setTenantId(request.getTenantId());
		//
		route.setRouteId(request.getRouteId());
		route.setState(request.getState());
		//
		this.routeAtomSV.update(route);
		if(request.getState() == "6" || "6".equals(request.getState())){
			this.routeProdSupplyAtomSV.updateState(request.getRouteId(), request.getTenantId(), "0");
		}
		//
		responseHeader.setIsSuccess(true);
		responseHeader.setResultCode("000000");
		responseHeader.setResultMessage("仓库状态成功");
		//
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public RouteResponse findRouteInfo(RouteIdParamRequest request) {
		RouteResponse response = new RouteResponse();
		//
		
		Route route = this.routeAtomSV.findRouteInfo(request.getRouteId());
		//
		if(null != route){
			response.setRouteId(route.getRouteId());
			response.setRouteName(route.getRouteName());
			response.setProvCode(route.getProvCode());
			response.setCityCode(route.getCityCode());
			response.setCountyCode(route.getCountyCode());
			response.setState(route.getState());
			response.setAddress(route.getAddress());
		}
		
		return response;
	}

	@Override
	public RouteListResponse queryRouteList(RouteListRequest request) {
		RouteListResponse response = new RouteListResponse();
		//
		String tenantId = request.getTenantId();
		//
		List<Route> list = this.routeAtomSV.queryRouteList(tenantId);
		List<RouteVo> voList = new ArrayList<RouteVo>();
		//
		RouteVo vo = null;
		for(Route route : list){
			vo = new RouteVo();
			//
			vo.setRouteId(route.getRouteId());
			vo.setRouteName(route.getRouteName());
			//
			voList.add(vo);
		}
		//
		response.setVoList(voList);
		//
		return response;
	}

	@Override
	public RouteQueryByGroupIdAndAreaResponse queryRouteInfoByGroupIdAndArea(
			RouteQueryByGroupIdAndAreaRequest request) {
		//
		RouteQueryByGroupIdAndAreaResponse response = new RouteQueryByGroupIdAndAreaResponse();
		//
		String routeGroupId = request.getRouteGroupId();
		String provinceCode = request.getProvinceCode();
		String tenantId = request.getTenantId();
		//
		List<RouteItem> routeItemList = this.routeItemAtomSV.findRouteItemByRouteGroupId(routeGroupId);
		//
		RouteTargetArea routeTargetArea = null;
		//
		
		if(!CollectionUtil.isEmpty(routeItemList)){
			//
			Map<String,String> routeItemMap = new HashMap<String,String>();
			//
			List<String> routeItemIdList = new ArrayList<String>();
			//
			for(RouteItem routeItem : routeItemList){
				routeItemMap.put(routeItem.getRouteItemId(),routeItem.getRouteId());
				//
				routeItemIdList.add(routeItem.getRouteItemId());
			}
			//
			routeTargetArea = this.routeTargetAreaAtomSV.queryTargetAreaByItemIdListAndAreaCode(routeItemIdList, provinceCode,tenantId);
			//
			String routeId = routeItemMap.get(routeTargetArea.getRouteItemId());
			//
			response.setRouteId(routeId);
		}
		if(StringUtil.isBlank(response.getRouteId())){
			//
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"仓库信息不存在");
		}
		//
		return response;
	}

	

}
