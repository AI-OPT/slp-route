package com.ai.slp.route.service.atom.interfaces;

import java.util.List;

import com.ai.slp.route.dao.mapper.bo.RouteTargetArea;

public interface IRouteTargetAreaAtomSV {

	public void deleteByRouteItemId(String routeItemId);
	public List<RouteTargetArea> queryAreaListForRouteItemId(String routeItemId);
	public List<RouteTargetArea> queryAreaListForRouteItemId(String tenantId,String routeItemId);
	public List<RouteTargetArea> queryAreaListByRouteItemIdList(String tenantId,List<String> routeItemIds);
	public void insertSelective(RouteTargetArea routeTargetArea);
	public void delete(String tenantId,String routeItemId);
	public void deleteByRouteAreaId(String tenantId,String routeAreaId);
	public RouteTargetArea queryTargetAreaByItemIdListAndAreaCode(List<String> routeItemIdList,String provinceCode,String tenantId);
	
}
