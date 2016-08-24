package com.ai.slp.route.service.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.slp.route.service.atom.interfaces.IRouteTargetAreaAtomSV;
import com.ai.slp.route.service.business.interfaces.IRouteItemBusiSV;
@Service
public class IRouteItemBusiSVImpl implements IRouteItemBusiSV {

	@Autowired
	private IRouteItemBusiSV routeItemBusiSV;
	@Autowired
	private IRouteTargetAreaAtomSV routeTargetAreaAtomSV;
	
}
