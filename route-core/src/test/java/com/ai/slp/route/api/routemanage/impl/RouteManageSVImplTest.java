package com.ai.slp.route.api.routemanage.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.route.api.routemanage.interfaces.IRouteManageSV;
import com.ai.slp.route.api.routemanage.param.RouteAddParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteAddParamResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchRequest;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchResponse;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class RouteManageSVImplTest {
	private static final Logger log = LogManager.getLogger(RouteManageSVImplTest.class);
	@Autowired
	private IRouteManageSV routeManageSV;
	@Test
	public void addRoute(){
		RouteAddParamRequest request = new RouteAddParamRequest();
		//
		request.setTenantId("CH");
		request.setRouteName("北京第一仓库");
		request.setCountyCode(0001l);
		request.setCityCode(0001l);
		request.setCountyCode(0001l);
		request.setAddress("北京市海淀区西北旺路10号院亚信研发总部");
		//
		log.info("request:"+JSON.toJSONString(request));
		RouteAddParamResponse response = this.routeManageSV.addRoute(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void queryPageSearch(){
		RoutePageSearchRequest request = new RoutePageSearchRequest();
		//
		//request.setTenantId("SLP");
//		request.setPageNo(1);
//		request.setPageSize(200);
		//
		log.info("request:"+JSON.toJSONString(request));
		RoutePageSearchResponse response = this.routeManageSV.queryPageSearch(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}

}
