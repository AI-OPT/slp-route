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
	public RouteAddParamResponse addRoute(RouteAddParamRequest request);
	public RouteUpdateParamResponse updateRoute(RouteUpdateParamRequest request);
	public RoutePageSearchResponse queryPageSearch(RoutePageSearchRequest request);
	public RouteUpdateStateResponse updateRouteState(RouteUpdateStateRequest request);
	public RouteResponse findRouteInfo(RouteIdParamRequest request);
	public RouteListResponse queryRouteList(RouteListRequest request);
	public RouteQueryByGroupIdAndAreaResponse queryRouteInfoByGroupIdAndArea(RouteQueryByGroupIdAndAreaRequest request);
}
