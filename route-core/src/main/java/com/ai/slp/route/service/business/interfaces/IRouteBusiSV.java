package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routemanage.param.RouteAddParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteAddParamResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchRequest;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchResponse;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamResponse;

public interface IRouteBusiSV {
	public RouteAddParamResponse addRoute(RouteAddParamRequest request);
	public RouteUpdateParamResponse updateRoute(RouteUpdateParamRequest request);
	public RoutePageSearchResponse queryPageSearch(RoutePageSearchRequest request);
}
