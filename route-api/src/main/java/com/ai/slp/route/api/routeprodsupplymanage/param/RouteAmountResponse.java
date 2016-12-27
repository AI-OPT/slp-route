package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;

public class RouteAmountResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由数量
	 */
	private Integer routeAmount;

	public Integer getRouteAmount() {
		return routeAmount;
	}

	public void setRouteAmount(Integer routeAmount) {
		this.routeAmount = routeAmount;
	}

}
