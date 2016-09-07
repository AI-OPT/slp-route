package com.ai.slp.route.api.routetargetarea.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.route.api.routetargetarea.interfaces.IRouteTargetAreaSV;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdResponse;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class RouteTargetAreaSVImplTest {
	private static final Logger log = LogManager.getLogger(RouteTargetAreaSVImplTest.class);
	@Autowired
	private IRouteTargetAreaSV routeTargetAreaSV; 
	@Test
	public void queryAreaListByRouteItemId(){
		AreaQueryByRouteItemIdRequest request  = new AreaQueryByRouteItemIdRequest();
		//
		request.setTenantId("changhong");
		request.setRouteItemId("90006");
		//
		log.info("request:"+JSON.toJSONString(request));
		
		AreaQueryByRouteItemIdResponse response = this.routeTargetAreaSV.queryAreaListByRouteItemId(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
}
