package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

public class StandedProdRouteVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 租户标识
	 */
	private String tenantId;
	/**
	 * 标准品标识
	 */
	private String standedProdId;
	/**
	 * 路由标识
	 */
	private String routeId;
	/**
	 * 路由名称
	 */
	private String routeName;
	/**
	 * 供应品名称
	 */
	private String supplyName;
	/**
	 * 供应品标识
	 */
	private String supplyId;
	/**
	 *  成本价
	 */
	private Long costPrice;
	
	public Long getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(Long costPrice) {
		this.costPrice = costPrice;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getSupplyId() {
		return supplyId;
	}
	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}
	public String getSupplyName() {
		return supplyName;
	}
	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}
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
