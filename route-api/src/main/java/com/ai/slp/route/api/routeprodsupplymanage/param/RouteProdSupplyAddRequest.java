package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RouteProdSupplyAddRequest extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由id
	 */
	private String routeId;
	/**
	 * 商品标识
	 */
	private String prodId;
	/**
	 * 商品名称
	 */
	private String prodName;
	/**
	 * 数量=
	 */
	private Integer amount;
	/**
	 * 类目标书
	 */
	private String prodCatId;
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

	public String getProdCatId() {
		return prodCatId;
	}

	public void setProdCatId(String prodCatId) {
		this.prodCatId = prodCatId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

}
