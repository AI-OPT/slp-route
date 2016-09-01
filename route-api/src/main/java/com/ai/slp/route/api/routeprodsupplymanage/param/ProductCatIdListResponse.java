package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class ProductCatIdListResponse extends BaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ProductCatIdVo> voList = new ArrayList<ProductCatIdVo>();

	public List<ProductCatIdVo> getVoList() {
		return voList;
	}

	public void setVoList(List<ProductCatIdVo> voList) {
		this.voList = voList;
	}

}
