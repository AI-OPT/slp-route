package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routetargetarea.param.AreaAddListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaAddListResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteAreaIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteAreaIdResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdResponse;

public interface IRouteTargetAreaBusiSV {
	/**
	 * 查询地域集合
	 */
	public AreaQueryByRouteItemIdResponse queryAreaListByRouteItemId(AreaQueryByRouteItemIdRequest request);
	/**
	 * 查询地域集合
	 */
	public AreaQueryByRouteItemIdResponse queryAreaListByRouteItemIdList(AreaQueryByRouteItemIdListRequest request);
	/**
	 * 添加地域
	 */
	public AreaAddListResponse addTargetAreaToList(AreaAddListRequest request);
	/**
	 * 删除地域信息
	 */
	public AreaDeleteResponse deleteByRouteItemId(AreaDeleteByRouteItemIdRequest request);
	/**
	 * 删除
	 */
	public AreaDeleteByRouteAreaIdResponse deleteByRouteAreaId(AreaDeleteByRouteAreaIdRequest request);
}
