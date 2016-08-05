package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routemanage.param.RouteAddParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteAddParamResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchRequest;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchResponse;

public interface IRouteBusiSV {
	public RouteAddParamResponse addRoute(RouteAddParamRequest request);
	public RoutePageSearchResponse queryPageSearch(RoutePageSearchRequest request);
}
