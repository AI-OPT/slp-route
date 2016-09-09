package com.ai.slp.route.api.routetargetarea.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.route.api.routetargetarea.interfaces.IRouteTargetAreaSV;
import com.ai.slp.route.api.routetargetarea.param.AreaAddListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaAddListResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaAddVo;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteAreaIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteAreaIdResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdListRequest;
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
	
	@Test
	public void queryAreaListByRouteItemIdList(){
		AreaQueryByRouteItemIdListRequest request  = new AreaQueryByRouteItemIdListRequest();
		//
		request.setTenantId("changhong");
		List<String> routeItemIdList = new ArrayList<String>();
		routeItemIdList.add("90006");
		request.setRouteItemIdList(routeItemIdList);
		//
		log.info("request:"+JSON.toJSONString(request));
		
		AreaQueryByRouteItemIdResponse response = this.routeTargetAreaSV.queryAreaListByRouteItemIdList(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void addTargetAreaToList(){
		AreaAddListRequest request = new AreaAddListRequest();
		//
		List<AreaAddVo> voList = new ArrayList<AreaAddVo>();
		//
		AreaAddVo vo = new AreaAddVo();
		vo.setOperId("1");
		vo.setProvCode("1001");
		vo.setRouteItemId("90007");
		vo.setState("1");
		vo.setTenantId("changhong");
		//
		AreaAddVo vo2 = new AreaAddVo();
		vo2.setOperId("1");
		vo2.setProvCode("1002");
		vo2.setRouteItemId("90007");
		vo2.setState("1");
		vo2.setTenantId("changhong");
		//
		voList.add(vo);
		voList.add(vo2);
		//
		request.setVoList(voList);

		//
		log.info("request:"+JSON.toJSONString(request));
		
		AreaAddListResponse response = this.routeTargetAreaSV.addTargetAreaToList(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	
	@Test
	public void deleteByRouteItemId(){
		AreaDeleteByRouteItemIdRequest request = new AreaDeleteByRouteItemIdRequest();
		//
		request.setTenantId("changhong");
		request.setRouteItemId("90007");
		//
		log.info("request:"+JSON.toJSONString(request));
		
		AreaDeleteResponse response = this.routeTargetAreaSV.deleteByRouteItemId(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void deleteByRouteAreaId(){
		AreaDeleteByRouteAreaIdRequest request = new AreaDeleteByRouteAreaIdRequest();
		//
		request.setTenantId("changhong");
		request.setRouteAreaId("90007");
		//
		log.info("request:"+JSON.toJSONString(request));
		
		AreaDeleteByRouteAreaIdResponse response = this.routeTargetAreaSV.deleteByRouteAreaId(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
}
