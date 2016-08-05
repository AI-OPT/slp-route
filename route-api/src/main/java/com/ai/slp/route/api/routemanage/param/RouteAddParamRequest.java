package com.ai.slp.route.api.routemanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RouteAddParamRequest extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String routeName;
	private Long provCode;
	private Long cityCode;
	private Long countyCode;

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
