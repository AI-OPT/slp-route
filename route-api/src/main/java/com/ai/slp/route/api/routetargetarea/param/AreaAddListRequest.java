package com.ai.slp.route.api.routetargetarea.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class AreaAddListRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<AreaAddVo> voList = new ArrayList<AreaAddVo>();

	public List<AreaAddVo> getVoList() {
		return voList;
	}

	public void setVoList(List<AreaAddVo> voList) {
		this.voList = voList;
	}

}
