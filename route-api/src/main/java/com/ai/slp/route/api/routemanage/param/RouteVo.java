package com.ai.slp.route.api.routemanage.param;

import java.io.Serializable;

public class RouteVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String routeId;
	private String routeName;

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

}
