package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routemanage.param.RouteAddParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteAddParamResponse;
import com.ai.slp.route.api.routemanage.param.RouteIdParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteListRequest;
import com.ai.slp.route.api.routemanage.param.RouteListResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchRequest;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchResponse;
import com.ai.slp.route.api.routemanage.param.RouteQueryByGroupIdAndAreaRequest;
import com.ai.slp.route.api.routemanage.param.RouteQueryByGroupIdAndAreaResponse;
import com.ai.slp.route.api.routemanage.param.RouteResponse;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamResponse;
import com.ai.slp.route.api.routemanage.param.RouteUpdateStateRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateStateResponse;

public interface IRouteBusiSV {
	/**
	 * 添加路由
	 */
	public RouteAddParamResponse addRoute(RouteAddParamRequest request);
	/**
	 * 更新路由
	 */
	public RouteUpdateParamResponse updateRoute(RouteUpdateParamRequest request);
	/**
	 * 分页查询
	 */
	public RoutePageSearchResponse queryPageSearch(RoutePageSearchRequest request);
	/**
	 * 更新路由状态
	 */
	public RouteUpdateStateResponse updateRouteState(RouteUpdateStateRequest request);
	/**
	 * 查询路由信息
	 */
	public RouteResponse findRouteInfo(RouteIdParamRequest request);
	/**
	 * 查询路由
	 */
	public RouteListResponse queryRouteList(RouteListRequest request);
	/**
	 * 根据路由路有组和地域 查询路由信息
	 */
	public RouteQueryByGroupIdAndAreaResponse queryRouteInfoByGroupIdAndArea(RouteQueryByGroupIdAndAreaRequest request);
}
