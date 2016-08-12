package com.ai.slp.route.api.routemanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RoutePageSearchVo extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer index;
	private String routeId;
	private String routeName;
	private String state;
	private Long provCode;
	private Long cityCode;
	private Long countyCode;
	private String address;
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

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

}
