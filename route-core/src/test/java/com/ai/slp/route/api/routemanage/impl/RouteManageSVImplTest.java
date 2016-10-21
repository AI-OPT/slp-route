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
import com.ai.slp.route.api.routemanage.param.RouteListRequest;
import com.ai.slp.route.api.routemanage.param.RouteListResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchRequest;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchResponse;
import com.ai.slp.route.api.routemanage.param.RouteQueryByGroupIdAndAreaRequest;
import com.ai.slp.route.api.routemanage.param.RouteQueryByGroupIdAndAreaResponse;
import com.ai.slp.route.api.routemanage.param.RouteUpdateStateRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateStateResponse;
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
		request.setTenantId("SLP");
		request.setPageNo(1);
		request.setPageSize(200);
		//
		log.info("request:"+JSON.toJSONString(request));
		RoutePageSearchResponse response = this.routeManageSV.queryPageSearch(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void queryRouteList(){
		RouteListRequest request = new RouteListRequest();
		request.setTenantId("changhong");
		//
		log.info("request:"+JSON.toJSONString(request));
		RouteListResponse response = this.routeManageSV.queryRouteList(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void queryRouteInfoByGroupIdAndArea(){
		RouteQueryByGroupIdAndAreaRequest request = new RouteQueryByGroupIdAndAreaRequest();
		//
		request.setTenantId("changhong");
		request.setRouteGroupId("0000000000000159");
		request.setProvinceCode("70");
		//
		log.info("request:"+JSON.toJSONString(request));
		RouteQueryByGroupIdAndAreaResponse response = this.routeManageSV.queryRouteInfoByGroupIdAndArea(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void updateRouteState(){
		RouteUpdateStateRequest request = new RouteUpdateStateRequest();
		request.setRouteId("0000000000000408");
		request.setTenantId("changhong");
		request.setState("6");
		//
		log.info("request:"+JSON.toJSONString(request));
		RouteUpdateStateResponse response = this.routeManageSV.updateRouteState(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}

}
