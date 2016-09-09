package com.ai.slp.route.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.platform.common.api.area.interfaces.IGnAreaQuerySV;
import com.ai.platform.common.api.area.param.GnAreaVo;
import com.ai.slp.route.api.routetargetarea.param.AreaAddListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaAddListResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaAddVo;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteAreaIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteAreaIdResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdVo;
import com.ai.slp.route.dao.mapper.bo.RouteTargetArea;
import com.ai.slp.route.service.atom.interfaces.IRouteTargetAreaAtomSV;
import com.ai.slp.route.service.business.interfaces.IRouteTargetAreaBusiSV;
import com.ai.slp.route.util.SequenceUtil;
@Service
public class RouteTargetAreaBusiSVImpl implements IRouteTargetAreaBusiSV {

	@Autowired
	private IRouteTargetAreaAtomSV routeTargetAreaAtomSV;
	
	@Override
	public AreaQueryByRouteItemIdResponse queryAreaListByRouteItemId(AreaQueryByRouteItemIdRequest request) {
		AreaQueryByRouteItemIdResponse response = new AreaQueryByRouteItemIdResponse();
		//
		String tenantId = request.getTenantId();
		String routeItemId = request.getRouteItemId();
		//
		List<RouteTargetArea> routeTargetAreaList = this.routeTargetAreaAtomSV.queryAreaListForRouteItemId(tenantId, routeItemId);
		List<AreaQueryByRouteItemIdVo> voList = new ArrayList<AreaQueryByRouteItemIdVo>();
		AreaQueryByRouteItemIdVo vo = null;
		//
		for(RouteTargetArea routeTargetArea : routeTargetAreaList){
			vo = new AreaQueryByRouteItemIdVo();
			//
			vo.setAreaCode(routeTargetArea.getProvCode().toString());
			GnAreaVo gnAreaVo = DubboConsumerFactory.getService(IGnAreaQuerySV.class).queryGnArea(routeTargetArea.getProvCode().toString());
			vo.setAreaName(null != gnAreaVo?gnAreaVo.getAreaName():"");
			//
			voList.add(vo);
			
		}
		//
		response.setVoList(voList);
		//
		return response;
	}

	@Override
	public AreaQueryByRouteItemIdResponse queryAreaListByRouteItemIdList(AreaQueryByRouteItemIdListRequest request) {
		AreaQueryByRouteItemIdResponse response = new AreaQueryByRouteItemIdResponse();
		//
		String tenantId = request.getTenantId();
		List<String> routeItemIds = request.getRouteItemIdList();
		//
		List<RouteTargetArea> routeTargetAreaList = this.routeTargetAreaAtomSV.queryAreaListByRouteItemIdList(tenantId, routeItemIds);
		List<AreaQueryByRouteItemIdVo> voList = new ArrayList<AreaQueryByRouteItemIdVo>();
		AreaQueryByRouteItemIdVo vo = null;
		//
		for(RouteTargetArea routeTargetArea : routeTargetAreaList){
			vo = new AreaQueryByRouteItemIdVo();
			//
			vo.setAreaCode(routeTargetArea.getProvCode().toString());
			GnAreaVo gnAreaVo = DubboConsumerFactory.getService(IGnAreaQuerySV.class).queryGnArea(routeTargetArea.getProvCode().toString());
			vo.setAreaName(null != gnAreaVo?gnAreaVo.getAreaName():"");
			//
			voList.add(vo);
			
		}
		//
		response.setVoList(voList);
		//
		return response;
	}

	@Override
	@Transactional
	public AreaAddListResponse addTargetAreaToList(AreaAddListRequest request) {
		AreaAddListResponse response  = new AreaAddListResponse();
		//
		List<AreaAddVo> voList = request.getVoList();
		//
		RouteTargetArea routeTargetArea = null;
		//
		for(AreaAddVo areaAddVo : voList){
			routeTargetArea = new RouteTargetArea();
			//
			routeTargetArea.setTenantId(areaAddVo.getTenantId());
			routeTargetArea.setRouteAreaId(SequenceUtil.createRouteAreaId());
			routeTargetArea.setRouteItemId(areaAddVo.getRouteItemId());
			routeTargetArea.setProvCode(Integer.parseInt(areaAddVo.getProvCode()));
			routeTargetArea.setOperId(areaAddVo.getOperId());
			routeTargetArea.setOperTime(DateUtil.getSysDate());
			//
			this.routeTargetAreaAtomSV.insertSelective(routeTargetArea);
		}
		//
		return response;
	}

	@Override
	@Transactional
	public AreaDeleteResponse deleteByRouteItemId(AreaDeleteByRouteItemIdRequest request) {
		AreaDeleteResponse response = new AreaDeleteResponse();
		//
		String tenantId = request.getTenantId();
		String routeItemId = request.getRouteItemId();
		//
		this.routeTargetAreaAtomSV.delete(tenantId, routeItemId);
		
		return response;
	}

	@Override
	@Transactional
	public AreaDeleteByRouteAreaIdResponse deleteByRouteAreaId(AreaDeleteByRouteAreaIdRequest request) {
		AreaDeleteByRouteAreaIdResponse response = new AreaDeleteByRouteAreaIdResponse();
		//
		String tenantId = request.getTenantId();
		String routeAreaId = request.getRouteAreaId();
		//
		this.routeTargetAreaAtomSV.deleteByRouteAreaId(tenantId, routeAreaId);
		//
		return response;
	}

}
