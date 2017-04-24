package com.ai.slp.route.api.routegroupmanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RouteGroupAddRequest extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 标准品id
	 */
	private String standedProdId;
	/**
	 * 标准品名称
	 */
	private String standedProdName;
	/**
	 * 路由组标识
	 */
	private String routeGroupId;
	/**
	 * 操作人
	 */
	private Long operId;
	/**
	 * 商品标识
	 */
	private String productId;

	/**
	 * 路由组成ID
	 */
	private String routeItemId;

	public String getProductId() {
		return productId;
	}

	public String getRouteItemId() {
		return routeItemId;
	}

	public void setRouteItemId(String routeItemId) {
		this.routeItemId = routeItemId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

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
