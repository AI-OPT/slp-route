package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class StandedProdIdListResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<StandedProdIdVo> list = new ArrayList<StandedProdIdVo>();

	public List<StandedProdIdVo> getList() {
		return list;
	}

	public void setList(List<StandedProdIdVo> list) {
		this.list = list;
	}

}
