package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RouteProdSupplyPageSearchVo extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
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
	 * 路由标识
	 */
	private String routeId;
	/**
	 * 总量
	 */
	private Long totalNum;
	/**
	 * 可用量
	 */
	private Long usableNum;
	/**
	 * 使用数量
	 */
	private Long usedNum;
	/**
	 * 标准品标识
	 */
	private String standedProdId;

	public String getStandedProdId() {
		return standedProdId;
	}

	public void setStandedProdId(String standedProdId) {
		this.standedProdId = standedProdId;
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
