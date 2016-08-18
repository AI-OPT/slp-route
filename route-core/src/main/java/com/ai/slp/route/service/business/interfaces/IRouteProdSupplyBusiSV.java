package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumResponse;

public interface IRouteProdSupplyBusiSV {
	public RouteProdSupplyPageSearchResponse queryPageSearch(RouteProdSupplyPageSearchRequest request);
	public RouteProdSupplyUpdateUsableNumResponse updateUsableNum(RouteProdSupplyUpdateUsableNumRequest request);
}
