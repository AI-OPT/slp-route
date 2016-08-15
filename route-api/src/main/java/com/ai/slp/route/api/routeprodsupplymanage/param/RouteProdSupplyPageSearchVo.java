package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RouteProdSupplyPageSearchVo extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer index;
	private String supplyId;
	private String supplyName;
	private String routeId;
	private Long totalNum;
	private Long usableNum;
	private Long usedNum;

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

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public Long getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Long getUsableNum() {
		return usableNum;
	}

	public void setUsableNum(Long usableNum) {
		this.usableNum = usableNum;
	}

	public Long getUsedNum() {
		return usedNum;
	}

	public void setUsedNum(Long usedNum) {
		this.usedNum = usedNum;
	}

}
