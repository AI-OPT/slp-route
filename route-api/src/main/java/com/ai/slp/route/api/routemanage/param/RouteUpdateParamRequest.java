package com.ai.slp.route.api.routemanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RouteUpdateParamRequest extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由标识
	 */
	private String routeId;
	/**
	 * 路由名称
	 */
	private String routeName;
	/**
	 * 省编码
	 */
	private Long provCode;
	/**
	 * 市编码
	 */
	private Long cityCode;
	/**
	 * 县编码
	 */
	private Long countyCode;
	/**
	 * 地址
	 */
	private String address;

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public Long getProvCode() {
		return provCode;
	}

	public void setProvCode(Long provCode) {
		this.provCode = provCode;
	}

	public Long getCityCode() {
		return cityCode;
	}

	public void setCityCode(Long cityCode) {
		this.cityCode = cityCode;
	}

	public Long getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(Long countyCode) {
		this.countyCode = countyCode;
	}

}
