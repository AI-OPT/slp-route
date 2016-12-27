package com.ai.slp.route.api.routetargetarea.param;

import java.io.Serializable;

public class AreaQueryByRouteItemIdVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 地域编码
	 */
	private String areaCode;
	/**
	 * 地域名称
	 */
	private String areaName;

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
}
