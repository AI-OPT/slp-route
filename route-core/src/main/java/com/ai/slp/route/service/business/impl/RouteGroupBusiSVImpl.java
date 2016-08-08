package com.ai.slp.route.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchResponse;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchVo;
import com.ai.slp.route.dao.mapper.bo.RouteGroup;
import com.ai.slp.route.service.atom.interfaces.IRouteGroupAtomSV;
import com.ai.slp.route.service.business.interfaces.IRouteGroupBusiSV;
@Service
public class RouteGroupBusiSVImpl implements IRouteGroupBusiSV {

	@Autowired
	private IRouteGroupAtomSV routeGroupAtomSV;

	@Override
	public RouteGroupPageSearchResponse queryPageSearch(RouteGroupPageSearchRequest request) {
		RouteGroupPageSearchResponse response = new RouteGroupPageSearchResponse();
		//
		RouteGroup routeGroup = new RouteGroup();
		//
		routeGroup.setTenantId(request.getTenantId());
		routeGroup.setRouteGroupId(request.getRouteGroupId());
		routeGroup.setRouteGroupName(request.getRouteGroupName());
		//
		Integer pageNo = request.getPageNo();
		Integer pageSize = request.getPageSize();
		//
		PageInfo<RouteGroup> pageInfo = this.routeGroupAtomSV.queryPageInfo(routeGroup, pageNo, pageSize);
		PageInfo<RouteGroupPageSearchVo> voPageInfo = new PageInfo<RouteGroupPageSearchVo>();
		voPageInfo.setCount(pageInfo.getCount());
		voPageInfo.setPageCount(pageInfo.getPageCount());
		voPageInfo.setPageNo(pageNo);
		voPageInfo.setPageSize(pageSize);
		//
		List<RouteGroupPageSearchVo> voList = new ArrayList<RouteGroupPageSearchVo>();
		RouteGroupPageSearchVo vo = null;
		//
		for(RouteGroup routeGroupVo : pageInfo.getResult()){
			vo = new RouteGroupPageSearchVo();
			//
			vo.setTenantId(routeGroupVo.getTenantId());
			vo.setRouteGroupId(routeGroupVo.getRouteGroupId());
			vo.setRouteGroupName(routeGroupVo.getRouteGroupName());
			vo.setOperId(String.valueOf(routeGroupVo.getOperId()));
			vo.setOperTime(routeGroupVo.getOperTime());
			vo.setState(routeGroupVo.getState());
			//
			voList.add(vo);
		}
		voPageInfo.setResult(voList);
		//
		response.setPageInfo(voPageInfo);
		//
		return response;
	}

}
