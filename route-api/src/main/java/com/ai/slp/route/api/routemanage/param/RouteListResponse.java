package com.ai.slp.route.api.routemanage.param;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import com.ai.opt.base.vo.BaseResponse;
@SuppressWarnings("unchecked")
public class RouteListResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<RouteVo> voList = Collections.EMPTY_LIST;

	public List<RouteVo> getVoList() {
		return voList;
	}

	public void setVoList(List<RouteVo> voList) {
		this.voList = voList;
	}

}
