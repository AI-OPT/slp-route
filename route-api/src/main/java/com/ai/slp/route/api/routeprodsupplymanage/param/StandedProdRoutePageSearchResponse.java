package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class StandedProdRoutePageSearchResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PageInfo<StandedProdRouteVo> pageInfo = new PageInfo<StandedProdRouteVo>();

	public PageInfo<StandedProdRouteVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<StandedProdRouteVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
	

}
