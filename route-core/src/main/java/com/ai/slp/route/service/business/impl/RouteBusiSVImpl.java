package com.ai.slp.route.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.slp.common.api.area.interfaces.IGnAreaQuerySV;
import com.ai.slp.common.api.area.param.GnAreaVo;
import com.ai.slp.route.api.routemanage.param.RouteAddParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteAddParamResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchRequest;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchVo;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamResponse;
import com.ai.slp.route.constants.RouteConstant;
import com.ai.slp.route.dao.mapper.bo.Route;
import com.ai.slp.route.service.atom.interfaces.IRouteAtomSV;
import com.ai.slp.route.service.business.interfaces.IRouteBusiSV;
import com.ai.slp.route.util.SequenceUtil;
@Service
public class RouteBusiSVImpl implements IRouteBusiSV {
	@Autowired
	private IRouteAtomSV routeAtomSV;
	
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

	

}
