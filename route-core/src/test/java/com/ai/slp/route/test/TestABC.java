package com.ai.slp.route.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.route.api.routequery.interfaces.IRouteQuerySV;
import com.ai.slp.route.api.routequery.param.RouteQueryResult;
import com.ai.slp.route.util.SequenceUtil;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/core-context.xml")
public class TestABC {

    // @Autowired
    IRouteQuerySV routeQuerySV;

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

}
