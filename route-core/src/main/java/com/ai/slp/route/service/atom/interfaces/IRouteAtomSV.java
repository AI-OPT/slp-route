package com.ai.slp.route.service.atom.interfaces;

import java.util.List;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.dao.mapper.bo.Route;

public interface IRouteAtomSV {
	public void insert(Route route);
	public void update(Route route);
	public PageInfo<Route> queryRouteListPageInfo(String tenantId,String routeId,String routeName,List<String> states,Integer pageNo,Integer pageSize);
	public Route findRouteInfo(String routeId);
	public List<Route> queryRouteList(String tenantId);
}
