package com.ai.slp.route.api.routeitemmanage.param;

import java.io.Serializable;

public class AreaVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 地域标识
	 */
	private String routeAreaId;
	/**
	 * 地域编码
	 */
	private String provinceCode;
	/**
	 * 地域名称
	 */
	private String provinceName;
	
	public String getRouteAreaId() {
		return routeAreaId;
	}

	public void setRouteAreaId(String routeAreaId) {
		this.routeAreaId = routeAreaId;
	}
	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}
