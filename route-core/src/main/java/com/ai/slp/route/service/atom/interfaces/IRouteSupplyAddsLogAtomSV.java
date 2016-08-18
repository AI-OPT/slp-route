package com.ai.slp.route.service.atom.interfaces;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.dao.mapper.bo.RouteSupplyAddsLog;

public interface IRouteSupplyAddsLogAtomSV {
	public PageInfo<RouteSupplyAddsLog> queryPageInfo(RouteSupplyAddsLog routeSupplyAddsLog,Integer pageNo,Integer pageSize);
	public void insert(RouteSupplyAddsLog routeSupplyAddsLog);
}
