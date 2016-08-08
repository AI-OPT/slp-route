package com.ai.slp.route.api.routegroupmanage.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class RouteGroupPageSearchResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PageInfo<RouteGroupPageSearchVo> pageInfo = new PageInfo<RouteGroupPageSearchVo>();

	public PageInfo<RouteGroupPageSearchVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<RouteGroupPageSearchVo> pageInfo) {
		this.pageInfo = pageInfo;
	}

}
