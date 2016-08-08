package com.ai.slp.route.api.routesupplyaddslog.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class RouteSupplyAddsLogPageSearchResponse extends BaseResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PageInfo<RouteSupplyAddsLogPageSearchVo> pageInfo = new PageInfo<RouteSupplyAddsLogPageSearchVo>();

	public PageInfo<RouteSupplyAddsLogPageSearchVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<RouteSupplyAddsLogPageSearchVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
	
}
