package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdQueryRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemDeleteByRouteItemIdRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemDeleteByRouteItemIdResponse;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemListResponse;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemPageSearchResponse;

public interface IRouteItemBusiSV {
	/**
	 * 分页查询路有组组成
	 */	
	public RouteItemPageSearchResponse queryPageInfo(RouteGroupIdRequest request);
	/**
	 * 查询路有组组成
	 */
	public RouteItemListResponse queryRouteItemList(RouteGroupIdQueryRequest request);
	/**
	 * 删除
	 */
	public RouteItemDeleteByRouteItemIdResponse deleteByRouteItemId(RouteItemDeleteByRouteItemIdRequest request);
}
