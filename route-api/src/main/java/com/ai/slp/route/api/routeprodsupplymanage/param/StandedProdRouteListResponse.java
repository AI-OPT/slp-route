package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class StandedProdRouteListResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<StandedProdRouteVo> voList = new ArrayList<StandedProdRouteVo>();

	public List<StandedProdRouteVo> getVoList() {
		return voList;
	}

	public void setVoList(List<StandedProdRouteVo> voList) {
		this.voList = voList;
	}

}
