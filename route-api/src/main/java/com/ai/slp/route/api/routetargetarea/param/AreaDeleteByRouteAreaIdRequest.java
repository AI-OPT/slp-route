package com.ai.slp.route.api.routetargetarea.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class AreaDeleteByRouteAreaIdRequest extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由地域标识
	 */
	private String routeAreaId;

	public String getRouteAreaId() {
		return routeAreaId;
	}

	public void setRouteAreaId(String routeAreaId) {
		this.routeAreaId = routeAreaId;
	}

}
