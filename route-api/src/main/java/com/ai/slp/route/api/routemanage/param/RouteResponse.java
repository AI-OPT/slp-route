package com.ai.slp.route.api.routemanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;

public class RouteResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String routeId;
	private String routeName;
	private String state;
	private Long provCode;
	private Long cityCode;
	private Long countyCode;
	private String provName;
	private String cityName;
	private String countyName;
	private String address;

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getProvName() {
		return provName;
	}

	public void setProvName(String provName) {
		this.provName = provName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
