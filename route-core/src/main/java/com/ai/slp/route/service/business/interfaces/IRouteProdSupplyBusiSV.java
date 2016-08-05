package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchResponse;

public interface IRouteProdSupplyBusiSV {
	public RouteProdSupplyPageSearchResponse queryPageSearch(RouteProdSupplyPageSearchRequest request);
}
