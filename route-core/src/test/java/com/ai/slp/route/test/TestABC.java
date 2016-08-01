package com.ai.slp.route.test;

import com.ai.slp.route.api.routequery.interfaces.IRouteQuerySV;
import com.ai.slp.route.api.routequery.param.RouteQueryResult;
import com.ai.slp.route.api.server.interfaces.IRouteServer;
import com.ai.slp.route.api.server.params.IRouteServerRequest;
import com.ai.slp.route.util.SequenceUtil;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/core-context.xml")
public class TestABC {

    // @Autowired
    IRouteQuerySV routeQuerySV;
    
   @Autowired
   IRouteServer routeServer;

    @Test
    public void testRegister() {
        RouteQueryResult bo = routeQuerySV.routeDetailQuery("123");
        System.out.println(JSON.toJSONString(bo));
    }

    @Test
    public void getRouteId() {
        for(int i=0;i<10;i++){
            String seq = SequenceUtil.createRouteId();
            System.out.println(seq); 
        }
    }
    
    @Test
    public void callRoute() {
        IRouteServerRequest request = new IRouteServerRequest();
        request.setTenantId("slp");
        request.setRouteId("100000003");
        RouteServReqVo routeServReqVo = new RouteServReqVo();
        routeServReqVo.setOrderId("2000000339271929");
        routeServReqVo.setBizType("10000010020000");
        routeServReqVo.setAccountVal("13552491314");
        routeServReqVo.setBuyNum(1);
        routeServReqVo.setNotifyUrl("http://10.1.245.9:10887/slp-order/o2pservice/callback");
        routeServReqVo.setProId("1000000000000055");
        routeServReqVo.setUnitPrice(300);
        routeServReqVo.setCoSysId("123123");
        request.setRequestData(JSON.toJSONString(routeServReqVo));
        routeServer.callServerByRouteId(request);
    }

}
