package com.ai.slp.route.api.routeitemmanage.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class RouteItemListResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<RouteItemVo> voList = new ArrayList<RouteItemVo>();

	public List<RouteItemVo> getVoList() {
		return voList;
	}

	public void setVoList(List<RouteItemVo> voList) {
		this.voList = voList;
	}

}
