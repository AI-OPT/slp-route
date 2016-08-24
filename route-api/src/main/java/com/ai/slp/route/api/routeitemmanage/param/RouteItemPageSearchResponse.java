package com.ai.slp.route.api.routeitemmanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class RouteItemPageSearchResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PageInfo<RouteItemResponse> pageInfo = new PageInfo<RouteItemResponse>();

	public PageInfo<RouteItemResponse> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<RouteItemResponse> pageInfo) {
		this.pageInfo = pageInfo;
	}

}
