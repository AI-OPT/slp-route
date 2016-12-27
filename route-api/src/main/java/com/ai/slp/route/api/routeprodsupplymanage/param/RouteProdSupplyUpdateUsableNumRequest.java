package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

public class RouteProdSupplyUpdateUsableNumRequest implements Serializable {

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
	 * 操作人
	 */
	private String operId;
	public String getOperId() {
		return operId;
	}
	public void setOperId(String operId) {
		this.operId = operId;
	}
	public String getSupplyName() {
		return supplyName;
	}
	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}
	private Long usableNum;
	public String getSupplyId() {
		return supplyId;
	}
	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}
	public Long getUsableNum() {
		return usableNum;
	}
	public void setUsableNum(Long usableNum) {
		this.usableNum = usableNum;
	}

}
