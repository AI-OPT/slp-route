package com.ai.slp.route.api.routetargetarea.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class AreaAddVo extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由组组成标识
	 */
	private String routeItemId;
	/**
	 * 省编码
	 */
	private String provCode;
	/**
	 * 状态
	 */
	private String state;
	/**
	 * 操作人
	 */
	private String operId;

	public String getRouteItemId() {
		return routeItemId;
	}

	public void setRouteItemId(String routeItemId) {
		this.routeItemId = routeItemId;
	}

	public String getProvCode() {
		return provCode;
	}

	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getOperId() {
		return operId;
	}

	public void setOperId(String operId) {
		this.operId = operId;
	}

}
