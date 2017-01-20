package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routesupplyaddslog.param.RouteSupplyAddsLogPageSearchRequest;
import com.ai.slp.route.api.routesupplyaddslog.param.RouteSupplyAddsLogPageSearchResponse;

public interface IRouteSupplyAddsLogBusiSV {
	/**
	 * 分页查询
	 */
	public RouteSupplyAddsLogPageSearchResponse queryPageSearch(RouteSupplyAddsLogPageSearchRequest request);
}
