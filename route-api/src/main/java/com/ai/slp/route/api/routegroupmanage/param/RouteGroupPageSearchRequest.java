package com.ai.slp.route.api.routegroupmanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

public class RouteGroupPageSearchRequest extends BaseInfo implements Serializable {

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
	 * 分页
	 */
	private Integer pageNo;
	/**
	 * 分页 每页数据条数
	 */
	private Integer pageSize;

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

}
