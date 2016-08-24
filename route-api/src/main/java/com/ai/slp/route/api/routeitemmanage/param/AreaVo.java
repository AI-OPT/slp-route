package com.ai.slp.route.api.routeitemmanage.param;

import java.io.Serializable;

public class AreaVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String provinceCode;
	private String provinceName;

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
