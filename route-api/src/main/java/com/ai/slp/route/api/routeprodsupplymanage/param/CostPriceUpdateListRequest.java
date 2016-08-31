package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CostPriceUpdateListRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<CostPriceUpdateVo> voList = new ArrayList<CostPriceUpdateVo>();

	public List<CostPriceUpdateVo> getVoList() {
		return voList;
	}

	public void setVoList(List<CostPriceUpdateVo> voList) {
		this.voList = voList;
	}

}
