package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemPageSearchResponse;

public interface IRouteItemBusiSV {
	public RouteItemPageSearchResponse queryPageInfo(RouteGroupIdRequest request);
}
