package com.ai.slp.route.api.routegroupmanage.param;

import java.io.Serializable;
import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseInfo;

public class RouteGroupPageSearchVo extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由组标识
	 */
	private String routeGroupId;
	/**
	 * 路由组名称
	 */
	private String routeGroupName;
	/**
	 * 操作人
	 */
	private String operId;
	/**
	 *操作时间 
	 */
	private Timestamp operTime;
	/**
	 * 状态
	 */
	private String state;

	public String getRouteGroupId() {
		return routeGroupId;
	}

	public void setRouteGroupId(String routeGroupId) {
		this.routeGroupId = routeGroupId;
	}

	public String getRouteGroupName() {
		return routeGroupName;
	}

	public void setRouteGroupName(String routeGroupName) {
		this.routeGroupName = routeGroupName;
	}

	public String getOperId() {
		return operId;
	}

	public void setOperId(String operId) {
		this.operId = operId;
	}

	public Timestamp getOperTime() {
		return operTime;
	}

	public void setOperTime(Timestamp operTime) {
		this.operTime = operTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
