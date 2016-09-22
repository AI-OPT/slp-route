package com.ai.slp.route.api.routemanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;

public class RouteQueryByGroupIdAndAreaResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String routeId;
	public String getRouteId() {
		return routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

}
