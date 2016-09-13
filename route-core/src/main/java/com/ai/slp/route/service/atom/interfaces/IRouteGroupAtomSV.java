package com.ai.slp.route.service.atom.interfaces;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.dao.mapper.bo.RouteGroup;

public interface IRouteGroupAtomSV {
	public PageInfo<RouteGroup> queryPageInfo(RouteGroup routeGroup,Integer pageNo,Integer pageSize);
	public void insert(RouteGroup routeGroup);
	public RouteGroup findRouteGroup(String routeGroupId);
	public RouteGroup findRouteGroup(String tenantId,String routeGroupId);
	public void updateState(String state,String routeGroupId);
}
