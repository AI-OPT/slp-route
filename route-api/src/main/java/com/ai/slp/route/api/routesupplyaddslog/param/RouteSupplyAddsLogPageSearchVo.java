package com.ai.slp.route.api.routesupplyaddslog.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class RouteSupplyAddsLogPageSearchVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer index;
	
	private String supplyId;
	private String supplyName;
	private Long beforeUsableNum;
	private Long supplyNum;
	private String operId;
	private Timestamp operTime;

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
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
	public Long getBeforeUsableNum() {
		return beforeUsableNum;
	}
	public void setBeforeUsableNum(Long beforeUsableNum) {
		this.beforeUsableNum = beforeUsableNum;
	}
	public Long getSupplyNum() {
		return supplyNum;
	}
	public void setSupplyNum(Long supplyNum) {
		this.supplyNum = supplyNum;
	}
	public String getOperId() {
		return operId;
	}
	public void setOperId(String operId) {
		this.operId = operId;
	}
	public Timestamp getOperTime() {
		return operTime;
	}
	public void setOperTime(Timestamp operTime) {
		this.operTime = operTime;
	}

}
