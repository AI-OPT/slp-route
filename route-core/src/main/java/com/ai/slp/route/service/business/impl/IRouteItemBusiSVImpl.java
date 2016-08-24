package com.ai.slp.route.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.slp.common.api.area.interfaces.IGnAreaQuerySV;
import com.ai.slp.common.api.area.param.GnAreaVo;
import com.ai.slp.route.api.routeitemmanage.param.AreaVo;
import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemPageSearchResponse;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemResponse;
import com.ai.slp.route.dao.mapper.bo.Route;
import com.ai.slp.route.dao.mapper.bo.RouteItem;
import com.ai.slp.route.dao.mapper.bo.RouteTargetArea;
import com.ai.slp.route.service.atom.interfaces.IRouteAtomSV;
import com.ai.slp.route.service.atom.interfaces.IRouteItemAtomSV;
import com.ai.slp.route.service.atom.interfaces.IRouteTargetAreaAtomSV;
import com.ai.slp.route.service.business.interfaces.IRouteItemBusiSV;
@Service
public class IRouteItemBusiSVImpl implements IRouteItemBusiSV {

	@Autowired
	private IRouteItemAtomSV routeItemAtomSV;
	@Autowired
	private IRouteTargetAreaAtomSV routeTargetAreaAtomSV;
	@Autowired
	private IRouteAtomSV routeAtomSV;
	
	@Override
	public RouteItemPageSearchResponse queryPageInfo(RouteGroupIdRequest request) {
		RouteItemPageSearchResponse response = new RouteItemPageSearchResponse();
		//
		Integer pageNo = request.getPageNo();
		Integer pageSize = request.getPageSize();
		//
		RouteItem routeItem = new RouteItem();
		//
		routeItem.setRouteGroupId(request.getRouteGroupId());
		//
		PageInfo<RouteItem> pageInfo = this.routeItemAtomSV.queryPageSearch(routeItem, pageNo, pageSize);
		//
		PageInfo<RouteItemResponse> pageInfoVo = new PageInfo<RouteItemResponse>();
		//
		pageInfoVo.setCount(pageInfo.getCount());
		pageInfoVo.setPageCount(pageInfo.getPageCount());
		pageInfoVo.setPageNo(pageNo);
		pageInfoVo.setPageSize(pageSize);
		//
		List<RouteItemResponse> voList = new ArrayList<RouteItemResponse>();
		//
		RouteItemResponse vo = null;
		for(RouteItem voNew : pageInfo.getResult()){
			vo = new RouteItemResponse();
			//
			vo.setRouteId(voNew.getRouteId());
			vo.setRouteGroupId(voNew.getRouteGroupId());
			vo.setRouteItemId(voNew.getRouteItemId());
			//find routeName from routeAtomSv of method findRouteInfo
			Route route = this.routeAtomSV.findRouteInfo(voNew.getRouteId());
			vo.setRouteName(route.getRouteName());
			//
			List<RouteTargetArea> areaList = this.routeTargetAreaAtomSV.queryAreaListForRouteItemId(voNew.getRouteItemId());
			List<AreaVo> areaVoList = new ArrayList<AreaVo>();
			AreaVo areaVo = null;
			for(RouteTargetArea routeTargetArea : areaList){
				areaVo = new AreaVo();
				areaVo.setProvinceCode(routeTargetArea.getProvCode().toString());
				GnAreaVo gnAreaVo = DubboConsumerFactory.getService(IGnAreaQuerySV.class).queryGnArea(routeTargetArea.getProvCode().toString());
				areaVo.setProvinceName(null != gnAreaVo?gnAreaVo.getAreaName():"");
				//
				areaVoList.add(areaVo);
			}
			vo.setArea(areaVoList);
			//
			voList.add(vo);
		}
		//
		pageInfoVo.setResult(voList);
		response.setPageInfo(pageInfoVo);
		//
		return response;
	}
	
}
