package com.ai.slp.route.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.platform.common.api.area.interfaces.IGnAreaQuerySV;
import com.ai.platform.common.api.area.param.GnAreaVo;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdVo;
import com.ai.slp.route.dao.mapper.bo.RouteTargetArea;
import com.ai.slp.route.service.atom.interfaces.IRouteTargetAreaAtomSV;
import com.ai.slp.route.service.business.interfaces.IRouteTargetAreaBusiSV;
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

}