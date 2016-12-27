package com.ai.slp.route.api.routeitemmanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RouteGroupIdQueryRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由组标识
	 */
	private String routeGroupId;

	public String getRouteGroupId() {
		return routeGroupId;
	}

	public void setRouteGroupId(String routeGroupId) {
		this.routeGroupId = routeGroupId;
	}

}
