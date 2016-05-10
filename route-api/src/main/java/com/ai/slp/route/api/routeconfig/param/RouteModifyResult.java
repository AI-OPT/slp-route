package com.ai.slp.route.api.routeconfig.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 路由修改返回参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteModifyResult extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 路由ID
     */
    private String routeId;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

}
