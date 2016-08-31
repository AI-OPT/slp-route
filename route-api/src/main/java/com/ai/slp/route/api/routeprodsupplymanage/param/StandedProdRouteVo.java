package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

public class StandedProdRouteVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String standedProdId;
	private String routeId;
	private String routeName;
	private Long usableNum;
	private Long totalNum;
	public Long getUsableNum() {
		return usableNum;
	}
	public void setUsableNum(Long usableNum) {
		this.usableNum = usableNum;
	}
	public Long getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
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
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

}
