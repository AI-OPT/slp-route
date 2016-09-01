package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateListRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.ProductCatIdListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteAmountResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddListRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyRouteIdRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdRouteListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdRoutePageSearchResponse;

public interface IRouteProdSupplyBusiSV {
	public RouteProdSupplyPageSearchResponse queryPageSearch(RouteProdSupplyPageSearchRequest request);
	public RouteProdSupplyUpdateUsableNumResponse updateUsableNum(RouteProdSupplyUpdateUsableNumRequest request);
	public RouteProdSupplyAddResponse addRouteProdSupplyList(RouteProdSupplyAddListRequest request);
	public StandedProdIdListResponse queryStandedProdIdList(RouteProdSupplyRouteIdRequest request);
	public RouteAmountResponse queryRouteAmount(StandedProdIdRequest request);
	public StandedProdRouteListResponse queryStandedProdRouteList(StandedProdIdRequest request);
	public CostPriceUpdateResponse updateCostPrice(CostPriceUpdateListRequest request);
	public StandedProdRoutePageSearchResponse queryStandedProdRoutePageSearch(StandedProdIdPageSearchRequest request);
	public ProductCatIdListResponse queryProductCatList(RouteProdSupplyRouteIdRequest request);
}
