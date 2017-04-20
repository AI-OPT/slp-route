package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateListRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.ProductCatIdListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteAmountResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdResponse;
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
	/**
	 * 查询供应商品
	 */
	public RouteProdSupplyPageSearchResponse queryPageSearch(RouteProdSupplyPageSearchRequest request);
	/**
	 * 更新可用数量
	 */
	public RouteProdSupplyUpdateUsableNumResponse updateUsableNum(RouteProdSupplyUpdateUsableNumRequest request);
	/**
	 * 添加供应商品
	 */
	public RouteProdSupplyAddResponse addRouteProdSupplyList(RouteProdSupplyAddListRequest request);
	
	/**
	 * 添加供应商品
	 */
	public RouteProdResponse addRouteProdSupply(RouteProdSupplyAddListRequest request);
	/**
	 * 查询标准品
	 */
	public StandedProdIdListResponse queryStandedProdIdList(RouteProdSupplyRouteIdRequest request);
	/**
	 * 查询路由数量
	 */
	public RouteAmountResponse queryRouteAmount(StandedProdIdRequest request);
	/**
	 * 查询标准品标准品路由 
	 */
	public StandedProdRouteListResponse queryStandedProdRouteList(StandedProdIdRequest request);
	/**
	 * 更新成本价
	 */
	public CostPriceUpdateResponse updateCostPrice(CostPriceUpdateListRequest request);
	/**
	 * 分页查询
	 */
	public StandedProdRoutePageSearchResponse queryStandedProdRoutePageSearch(StandedProdIdPageSearchRequest request);
	/**
	 * 查询商品类目
	 */
	public ProductCatIdListResponse queryProductCatList(RouteProdSupplyRouteIdRequest request);
}
