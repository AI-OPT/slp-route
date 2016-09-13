package com.ai.slp.route.api.routegroupmanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;

public class RouteGroupStateResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
