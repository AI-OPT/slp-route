package com.ai.slp.route.service.atom.interfaces;

import java.util.List;

import com.ai.slp.route.dao.mapper.bo.RouteTargetArea;

public interface IRouteTargetAreaAtomSV {

	public void deleteByRouteItemId(String routeItemId);
	public List<RouteTargetArea> queryAreaListForRouteItemId(String routeItemId);
	public List<RouteTargetArea> queryAreaListForRouteItemId(String tenantId,String routeItemId);

}
