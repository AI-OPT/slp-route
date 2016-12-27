package com.ai.slp.route.api.routemanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RouteQueryByGroupIdAndAreaRequest extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由组标识
	 */
	private String routeGroupId;
	/**
	 * 省编码
	 */
	private String provinceCode;

	public String getRouteGroupId() {
		return routeGroupId;
	}

	public void setRouteGroupId(String routeGroupId) {
		this.routeGroupId = routeGroupId;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
