package com.ai.slp.route.api.routegroupmanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RouteGroupAddRequest extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String standedProdId;
	private String standedProdName;
	private String routeGroupId;
	private Long operId; 
	public Long getOperId() {
		return operId;
	}

	public void setOperId(Long operId) {
		this.operId = operId;
	}

	public String getStandedProdName() {
		return standedProdName;
	}

	public void setStandedProdName(String standedProdName) {
		this.standedProdName = standedProdName;
	}
	public String getStandedProdId() {
		return standedProdId;
	}

	public void setStandedProdId(String standedProdId) {
		this.standedProdId = standedProdId;
	}

	public String getRouteGroupId() {
		return routeGroupId;
	}

	public void setRouteGroupId(String routeGroupId) {
		this.routeGroupId = routeGroupId;
	}

}
