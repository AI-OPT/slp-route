package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routegroupmanage.param.RouteGroupAddRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupAddResponse;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchResponse;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupStateRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupStateResponse;

public interface IRouteGroupBusiSV {
	/**
	 * 查询路有组
	 */
	public RouteGroupPageSearchResponse queryPageSearch(RouteGroupPageSearchRequest request);
	/**
	 * 添加路由组
	 */
	public RouteGroupAddResponse insertRouteGroup(RouteGroupAddRequest request);
	/**
	 * 查询路有组状态
	 */
	public RouteGroupStateResponse findRouteGroupState(RouteGroupStateRequest request);
}
