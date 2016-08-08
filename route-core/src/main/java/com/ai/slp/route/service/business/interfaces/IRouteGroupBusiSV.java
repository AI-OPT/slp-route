package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchResponse;

public interface IRouteGroupBusiSV {
	public RouteGroupPageSearchResponse queryPageSearch(RouteGroupPageSearchRequest request);
}
