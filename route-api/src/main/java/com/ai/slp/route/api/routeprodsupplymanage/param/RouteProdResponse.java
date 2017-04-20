package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;

public class RouteProdResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String supplyId;

	public String getSupplyId() {
		return supplyId;
	}

	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}

}
