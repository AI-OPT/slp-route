package com.ai.slp.route.api.routesupplyaddslog.param;

import java.io.Serializable;

public class RouteSupplyAddsLogPageSearchRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 供应品标识
	 */
	private String supplyId;
	/**
	 * 供应品名称
	 */
	private String supplyName;
	/**
	 * 分页
	 */
	private Integer pageNo;
	/**
	 * 分页--每页数据量
	 */
	private Integer pageSize;
	/**
	 * 租户标识 
	 */
	private String tenantId;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

}
