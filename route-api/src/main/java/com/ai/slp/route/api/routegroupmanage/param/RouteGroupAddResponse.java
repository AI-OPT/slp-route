package com.ai.slp.route.api.routegroupmanage.param;

import java.io.Serializable;
import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class RouteGroupAddResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 路由组标识
	 */
	private String routeGroupId;

	private List<String> routeItemIds;

	public String getRouteGroupId() {
		return routeGroupId;
	}

	public List<String> getRouteItemIds() {
		return routeItemIds;
	}

	public void setRouteItemIds(List<String> routeItemIds) {
		this.routeItemIds = routeItemIds;
	}

	public void setRouteGroupId(String routeGroupId) {
		this.routeGroupId = routeGroupId;
	}

}
