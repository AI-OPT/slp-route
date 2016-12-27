package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

public class ProductCatIdVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 类目标识
	 */
	private String productCatId;
	/**
	 * 类目名称
	 */
	private String productCatName;

	public String getProductCatId() {
		return productCatId;
	}

	public void setProductCatId(String productCatId) {
		this.productCatId = productCatId;
	}

	public String getProductCatName() {
		return productCatName;
	}

	public void setProductCatName(String productCatName) {
		this.productCatName = productCatName;
	}

}
