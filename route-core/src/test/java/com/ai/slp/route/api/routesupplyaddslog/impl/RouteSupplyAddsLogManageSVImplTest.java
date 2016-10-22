package com.ai.slp.route.api.routesupplyaddslog.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.route.api.routesupplyaddslog.interfaces.IRouteSupplyAddsLogManageSV;
import com.ai.slp.route.api.routesupplyaddslog.param.RouteSupplyAddsLogPageSearchRequest;
import com.ai.slp.route.api.routesupplyaddslog.param.RouteSupplyAddsLogPageSearchResponse;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class RouteSupplyAddsLogManageSVImplTest {

	private static final Logger log = LogManager.getLogger(RouteSupplyAddsLogManageSVImplTest.class);
	@Autowired
	private IRouteSupplyAddsLogManageSV routeSupplyAddsLogManageSV; 
	@Test
	public void queryPageSearch(){
		RouteSupplyAddsLogPageSearchRequest request = new RouteSupplyAddsLogPageSearchRequest();
		//
		request.setTenantId("changhong");
		request.setPageNo(1);
		request.setPageSize(1);
		//
		log.info("request:"+JSON.toJSONString(request));
		
		RouteSupplyAddsLogPageSearchResponse response = this.routeSupplyAddsLogManageSV.queryPageSearch(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
}
