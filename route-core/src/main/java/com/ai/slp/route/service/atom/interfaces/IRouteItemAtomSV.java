package com.ai.slp.route.service.atom.interfaces;

import java.util.List;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.dao.mapper.bo.RouteItem;

public interface IRouteItemAtomSV {
	public PageInfo<RouteItem> queryPageSearch(RouteItem routeItem,Integer pageNo,Integer pageSize);
	public void deleteByPrimaryKey(String routeItemId);
	public void insert(RouteItem routeItem);
	public List<RouteItem> findRouteItemByRouteGroupId(String routeGroupId);
}
