package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class CostPriceUpdateVo extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String standedProdId;
	private String routeId;
	private Long costPrice;

	public String getStandedProdId() {
		return standedProdId;
	}

	public void setStandedProdId(String standedProdId) {
		this.standedProdId = standedProdId;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public Long getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Long costPrice) {
		this.costPrice = costPrice;
	}

}
