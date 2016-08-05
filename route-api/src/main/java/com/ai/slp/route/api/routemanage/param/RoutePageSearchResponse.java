package com.ai.slp.route.api.routemanage.param;


import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class RoutePageSearchResponse extends BaseResponse {

	
	private PageInfo<RoutePageSearchVo> pageInfo = new PageInfo<RoutePageSearchVo>();

	public PageInfo<RoutePageSearchVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<RoutePageSearchVo> pageInfo) {
		this.pageInfo = pageInfo;
	}

}
