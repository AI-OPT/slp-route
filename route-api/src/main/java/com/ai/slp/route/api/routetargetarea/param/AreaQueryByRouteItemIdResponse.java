package com.ai.slp.route.api.routetargetarea.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class AreaQueryByRouteItemIdResponse extends BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<AreaQueryByRouteItemIdVo> voList = new ArrayList<AreaQueryByRouteItemIdVo>();

	public List<AreaQueryByRouteItemIdVo> getVoList() {
		return voList;
	}

	public void setVoList(List<AreaQueryByRouteItemIdVo> voList) {
		this.voList = voList;
	}

}
