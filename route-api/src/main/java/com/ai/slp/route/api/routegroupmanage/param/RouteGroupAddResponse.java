package com.ai.slp.route.api.routegroupmanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;

public class RouteGroupAddResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String routeGroupId;

	public String getRouteGroupId() {
		return routeGroupId;
	}

	public void setRouteGroupId(String routeGroupId) {
		this.routeGroupId = routeGroupId;
	}
	

}
