package com.ai.slp.route.api.routeitemmanage.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class RouteItemResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String routeId;
	private String routeName;
	private String routeGroupId;
	private String routeItemId;
	private List<AreaVo> area = new ArrayList<AreaVo>();

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getRouteGroupId() {
		return routeGroupId;
	}

	public void setRouteGroupId(String routeGroupId) {
		this.routeGroupId = routeGroupId;
	}

	public String getRouteItemId() {
		return routeItemId;
	}

	public void setRouteItemId(String routeItemId) {
		this.routeItemId = routeItemId;
	}

	public List<AreaVo> getArea() {
		return area;
	}

	public void setArea(List<AreaVo> area) {
		this.area = area;
	}

}
