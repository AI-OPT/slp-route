package com.ai.slp.route.api.routegroupmanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RouteGroupStateRequest extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由组id
	 */
	private String routeGroupId;

	public String getRouteGroupId() {
		return routeGroupId;
	}

	public void setRouteGroupId(String routeGroupId) {
		this.routeGroupId = routeGroupId;
	}
	
}
