package com.ai.slp.route.api.routeprodsupplymanage.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.common.recycler.Recycler.V;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.route.api.routeprodsupplymanage.interfaces.IRouteProdSupplyManageSV;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateListRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateVo;
import com.ai.slp.route.api.routeprodsupplymanage.param.ProductCatIdListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteAmountResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddListRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyRouteIdRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdRouteListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdRoutePageSearchResponse;
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
	@Test
	public void updateUsableNum(){
		RouteProdSupplyUpdateUsableNumRequest request = new RouteProdSupplyUpdateUsableNumRequest();
		request.setSupplyId("1000000001");
		request.setSupplyName("山东 移动手机 话费充值 10元");
		request.setUsableNum(99999999l);
		//
		log.info("request:"+JSON.toJSONString(request));
		RouteProdSupplyUpdateUsableNumResponse response = this.routeProdSupplyManageSV.updateUsableNum(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	/**
	 * 仓库下选择商品
	 * 
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode
	 */
	@Test
	public void addRouteProdSupplyList(){
		RouteProdSupplyAddListRequest request = new RouteProdSupplyAddListRequest();
		//
		List<RouteProdSupplyAddRequest> voList = new ArrayList<RouteProdSupplyAddRequest>();
		//
		
		RouteProdSupplyAddRequest vo = new RouteProdSupplyAddRequest();
		vo.setProdId("1233333");
		vo.setRouteId("12345");
		vo.setProdName("测试");
		vo.setTenantId("CH");
		vo.setAmount(100);
		//
		voList.add(vo);
		request.setRouteProdSupplyAddRequestList(voList);
		//
		log.info("request:"+JSON.toJSONString(request));
		RouteProdSupplyAddResponse response = this.routeProdSupplyManageSV.addRouteProdSupplyList(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void queryStandedProdIdList(){
		RouteProdSupplyRouteIdRequest request = new RouteProdSupplyRouteIdRequest();
		//
		request.setTenantId("changhong");
		request.setRouteId("0000000000000254");
		//
		log.info("request:"+JSON.toJSONString(request));
		StandedProdIdListResponse response = this.routeProdSupplyManageSV.queryStandedProdIdList(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void queryRouteAmount(){
		StandedProdIdRequest request = new StandedProdIdRequest();
		request.setStandedProdId("1111");
		//
		log.info("request:"+JSON.toJSONString(request));
		RouteAmountResponse response = this.routeProdSupplyManageSV.queryRouteAmount(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	
	@Test
	public void queryStandedProdRouteList(){
		StandedProdIdRequest request = new StandedProdIdRequest();
		request.setStandedProdId("100000000199");
		//
		log.info("request:"+JSON.toJSONString(request));
		StandedProdRouteListResponse response = this.routeProdSupplyManageSV.queryStandedProdRouteList(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void updateCostPrice(){
		CostPriceUpdateListRequest request = new CostPriceUpdateListRequest();
		//request.setStandedProdId("100000000199");
		List<CostPriceUpdateVo> voList = new ArrayList<CostPriceUpdateVo>();
		//
		CostPriceUpdateVo vo = new CostPriceUpdateVo();
		vo.setRouteId("0000000000000254");
		vo.setStandedProdId("100000000199");
		vo.setSupplyId("0000000000000277");
		vo.setTenantId("changhong");
		vo.setCostPrice(12667l);
		
//		CostPriceUpdateVo vo2 = new CostPriceUpdateVo();
//		vo2.setRouteId("0000000000000188");
//		vo2.setStandedProdId("100000000199");
//		vo2.setTenantId("changhong");
//		vo2.setCostPrice(12555l);
		//
		voList.add(vo);
		//voList.add(vo2);
		//
		request.setVoList(voList);
		//
		log.info("request:"+JSON.toJSONString(request));
		CostPriceUpdateResponse response = this.routeProdSupplyManageSV.updateCostPrice(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void queryStandedProdRoutePageSearch(){
		StandedProdIdPageSearchRequest request = new StandedProdIdPageSearchRequest();
		//
		request.setPageNo(1);
		request.setPageSize(10);
		request.setTenantId("changhong");
		request.setStandedProdId("100000000199");
		//
		log.info("request:"+JSON.toJSONString(request));
		StandedProdRoutePageSearchResponse response = this.routeProdSupplyManageSV.queryStandedProdRoutePageSearch(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
	@Test
	public void queryProductCatList(){
		RouteProdSupplyRouteIdRequest request = new RouteProdSupplyRouteIdRequest();
		//
		request.setTenantId("changhong");
		request.setRouteId("0000000000000304");
		//
		log.info("request:"+JSON.toJSONString(request));
		ProductCatIdListResponse response = this.routeProdSupplyManageSV.queryProductCatList(request);
		//
		log.info("response:"+JSON.toJSONString(response));
	}
}
