package com.ai.slp.route.api.routeprodsupplymanage.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.route.api.routeprodsupplymanage.interfaces.IRouteProdSupplyManageSV;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchResponse;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class RouteProdSupplyManageSVImplTest {
	private static final Logger log = LogManager.getLogger(RouteProdSupplyManageSVImplTest.class);
	
	@Autowired
	private IRouteProdSupplyManageSV routeProdSupplyManageSV;
	
	@Test
	public void queryPageSearch(){
		RouteProdSupplyPageSearchRequest request = new RouteProdSupplyPageSearchRequest();
		//
		request.setTenantId("SLP");
		request.setPageNo(1);
		request.setPageSize(1000);
		//
		log.info("request:"+JSON.toJSONString(request));
		RouteProdSupplyPageSearchResponse response = this.routeProdSupplyManageSV.queryPageSearch(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}

}
