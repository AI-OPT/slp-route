package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routetargetarea.param.AreaAddListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaAddListResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdResponse;

public interface IRouteTargetAreaBusiSV {
	public AreaQueryByRouteItemIdResponse queryAreaListByRouteItemId(AreaQueryByRouteItemIdRequest request);
	public AreaQueryByRouteItemIdResponse queryAreaListByRouteItemIdList(AreaQueryByRouteItemIdListRequest request);
	public AreaAddListResponse addTargetAreaToList(AreaAddListRequest request);
}
