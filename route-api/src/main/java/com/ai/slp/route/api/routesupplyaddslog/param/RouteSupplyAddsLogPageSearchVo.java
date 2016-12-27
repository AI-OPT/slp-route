package com.ai.slp.route.api.routesupplyaddslog.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class RouteSupplyAddsLogPageSearchVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 编码
	 */
	private Integer index;
	/**
	 * 供应品标识
	 */
	private String supplyId;
	/**
	 * 供应品名称
	 */
	private String supplyName;
	/**
	 * 增前可用量
	 */
	private Long beforeUsableNum;
	/**
	 * 供应数量
	 */
	private Long supplyNum;
	/**
	 * 操作人
	 */
	private String operId;
	/**
	 * 操作时间
	 */
	private Timestamp operTime;
	/**
	 * 员工名称
	 */
	private String employeeName;
	

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

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
