package com.ai.slp.route.api.routetargetarea.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class AreaDeleteByRouteItemIdRequest extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由组组成标识
	 */
	private String routeItemId;

	public String getRouteItemId() {
		return routeItemId;
	}

	public void setRouteItemId(String routeItemId) {
		this.routeItemId = routeItemId;
	}

}
