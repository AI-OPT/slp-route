package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdQueryRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemListResponse;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemPageSearchResponse;

public interface IRouteItemBusiSV {
	public RouteItemPageSearchResponse queryPageInfo(RouteGroupIdRequest request);
	public RouteItemListResponse queryRouteItemList(RouteGroupIdQueryRequest request);
}
