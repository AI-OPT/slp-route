package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RouteProdSupplyAddListRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<RouteProdSupplyAddRequest> routeProdSupplyAddRequestList = new ArrayList<RouteProdSupplyAddRequest>();

	public List<RouteProdSupplyAddRequest> getRouteProdSupplyAddRequestList() {
		return routeProdSupplyAddRequestList;
	}

	public void setRouteProdSupplyAddRequestList(List<RouteProdSupplyAddRequest> routeProdSupplyAddRequestList) {
		this.routeProdSupplyAddRequestList = routeProdSupplyAddRequestList;
	}

}
