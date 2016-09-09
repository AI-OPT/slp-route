package com.ai.slp.route.api.routeitemmanage.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.route.api.routeitemmanage.interfaces.IRouteItemManageSV;
import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdQueryRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemDeleteByRouteItemIdRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemDeleteByRouteItemIdResponse;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemListResponse;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemPageSearchResponse;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class RouteItemManageSVImplTest {
	private static final Logger log = LogManager.getLogger(RouteItemManageSVImplTest.class);
	@Autowired
	private IRouteItemManageSV routeItemManageSV;
	@Test
	public void queryPageInfo(){
		RouteGroupIdRequest request = new RouteGroupIdRequest();
		request.setPageNo(1);
		request.setPageSize(10);
		request.setRouteGroupId("12345");
		log.info("request:"+JSON.toJSONString(request));
		RouteItemPageSearchResponse response = this.routeItemManageSV.queryPageInfo(request);
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void queryRouteItemList(){
		RouteGroupIdQueryRequest request = new RouteGroupIdQueryRequest();
		request.setRouteGroupId("12345");
		log.info("request:"+JSON.toJSONString(request));
		RouteItemListResponse response = this.routeItemManageSV.queryRouteItemList(request);
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void deleteByRouteItemId(){
		RouteItemDeleteByRouteItemIdRequest request = new RouteItemDeleteByRouteItemIdRequest();
		request.setRouteItemId("111");
		log.info("request:"+JSON.toJSONString(request));
		RouteItemDeleteByRouteItemIdResponse response = this.routeItemManageSV.deleteByRouteItemId(request);
		log.info("response:"+JSON.toJSONString(response));		
	}

}
