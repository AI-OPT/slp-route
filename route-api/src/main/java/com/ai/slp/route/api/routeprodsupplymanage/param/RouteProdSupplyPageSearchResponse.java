package com.ai.slp.route.api.routeprodsupplymanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class RouteProdSupplyPageSearchResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PageInfo<RouteProdSupplyPageSearchVo> pageInfo = new PageInfo<RouteProdSupplyPageSearchVo>();

	public PageInfo<RouteProdSupplyPageSearchVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<RouteProdSupplyPageSearchVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}
