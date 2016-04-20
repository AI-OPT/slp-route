package com.ai.slp.route.api.routeconfig.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 路由规则维护结果返回<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteRuleMaintainResult extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 路由规则ID
     */
    private List<Long> routeRuleId;

    public List<Long> getRouteRuleId() {
        return routeRuleId;
    }

    public void setRouteRuleId(List<Long> routeRuleId) {
        this.routeRuleId = routeRuleId;
    }

}
