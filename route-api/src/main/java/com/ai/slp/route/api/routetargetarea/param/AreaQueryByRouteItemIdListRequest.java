package com.ai.slp.route.api.routetargetarea.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ai.opt.base.vo.BaseInfo;

public class AreaQueryByRouteItemIdListRequest extends BaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> routeItemIdList = new ArrayList<String>();

	public List<String> getRouteItemIdList() {
		return routeItemIdList;
	}

	public void setRouteItemIdList(List<String> routeItemIdList) {
		this.routeItemIdList = routeItemIdList;
	}

}
