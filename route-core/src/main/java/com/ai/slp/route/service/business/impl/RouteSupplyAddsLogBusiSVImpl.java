package com.ai.slp.route.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.platform.common.api.sysuser.interfaces.ISysUserQuerySV;
import com.ai.platform.common.api.sysuser.param.SysUserQueryRequest;
import com.ai.platform.common.api.sysuser.param.SysUserQueryResponse;
import com.ai.slp.route.api.routesupplyaddslog.param.RouteSupplyAddsLogPageSearchRequest;
import com.ai.slp.route.api.routesupplyaddslog.param.RouteSupplyAddsLogPageSearchResponse;
import com.ai.slp.route.api.routesupplyaddslog.param.RouteSupplyAddsLogPageSearchVo;
import com.ai.slp.route.dao.mapper.bo.RouteSupplyAddsLog;
import com.ai.slp.route.service.atom.interfaces.IRouteSupplyAddsLogAtomSV;
import com.ai.slp.route.service.business.interfaces.IRouteSupplyAddsLogBusiSV;
import com.alibaba.fastjson.JSON;
import com.esotericsoftware.minlog.Log;
@Service
public class RouteSupplyAddsLogBusiSVImpl implements IRouteSupplyAddsLogBusiSV {

	@Autowired
	private IRouteSupplyAddsLogAtomSV routeSupplyAddsLogAtomSV;
	@Override
	public RouteSupplyAddsLogPageSearchResponse queryPageSearch(RouteSupplyAddsLogPageSearchRequest request) {
		//
		RouteSupplyAddsLogPageSearchResponse response = new RouteSupplyAddsLogPageSearchResponse();
		//
		RouteSupplyAddsLog routeSupplyAddsLog = new RouteSupplyAddsLog();
		//
		routeSupplyAddsLog.setSupplyId(request.getSupplyId());
		routeSupplyAddsLog.setSupplyName(request.getSupplyName());
		//
		Integer pageNo = request.getPageNo();
		Integer pageSize = request.getPageSize();
		//
		PageInfo<RouteSupplyAddsLog> pageInfo = this.routeSupplyAddsLogAtomSV.queryPageInfo(routeSupplyAddsLog, pageNo, pageSize);
		//
		PageInfo<RouteSupplyAddsLogPageSearchVo> voPageInfo = new PageInfo<RouteSupplyAddsLogPageSearchVo>();
		voPageInfo.setCount(pageInfo.getCount());
		voPageInfo.setPageCount(pageInfo.getPageCount());
		voPageInfo.setPageNo(pageNo);
		voPageInfo.setPageSize(pageSize);
		//
		List<RouteSupplyAddsLogPageSearchVo> voList = new ArrayList<RouteSupplyAddsLogPageSearchVo>();
		RouteSupplyAddsLogPageSearchVo vo = null;
		//
		SysUserQueryRequest sysUserQueryRequest = null;
		//
		int index = 0;
		for(RouteSupplyAddsLog routeSupplyAddsLogVo : pageInfo.getResult()){
			index++;
			vo = new RouteSupplyAddsLogPageSearchVo();
			//
			vo.setIndex((pageNo - 1) * pageSize + index);
			vo.setSupplyId(routeSupplyAddsLogVo.getSupplyId());
			vo.setSupplyName(routeSupplyAddsLogVo.getSupplyName());
			vo.setBeforeUsableNum(routeSupplyAddsLogVo.getBeforeUsableNum());
			vo.setSupplyNum(routeSupplyAddsLogVo.getSupplyNum());
			vo.setOperId(String.valueOf(routeSupplyAddsLogVo.getOperId()));
			vo.setOperTime(routeSupplyAddsLogVo.getOperTime());
			//
			sysUserQueryRequest = new SysUserQueryRequest();
			//
			sysUserQueryRequest.setTenantId(request.getTenantId());
			sysUserQueryRequest.setId(routeSupplyAddsLogVo.getOperId().toString());
			//
			SysUserQueryResponse sysUserQueryResponse = DubboConsumerFactory.getService(ISysUserQuerySV.class).queryUserInfo(sysUserQueryRequest);
			Log.info("员工姓名:"+JSON.toJSONString(sysUserQueryResponse.getName()));
			vo.setEmployeeName(sysUserQueryResponse.getName());
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
