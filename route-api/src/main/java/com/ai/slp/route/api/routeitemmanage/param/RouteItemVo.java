package com.ai.slp.route.api.routeitemmanage.param;

import java.io.Serializable;

public class RouteItemVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由标识
	 */
	private String routeId;
	/**
	 * 路由组标识
	 */
	private String routeGroupId;
	/**
	 * 路由组组成标识
	 */
	private String routeItemId;

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getRouteGroupId() {
		return routeGroupId;
	}

	public void setRouteGroupId(String routeGroupId) {
		this.routeGroupId = routeGroupId;
	}

	public String getRouteItemId() {
		return routeItemId;
	}

	public void setRouteItemId(String routeItemId) {
		this.routeItemId = routeItemId;
	}
}
