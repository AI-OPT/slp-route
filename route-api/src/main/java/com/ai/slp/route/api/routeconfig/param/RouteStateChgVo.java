package com.ai.slp.route.api.routeconfig.param;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 路由状态变更请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteStateChgVo extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 路由Id
     */
    private String routeId;

    /**
     * 状态
     */
    private String state;

    /**
     * 操作人
     */
    private long operId;

    public String getRouteId() {
        return routeId;
    }

    public String getState() {
        return state;
    }

    public long getOperId() {
        return operId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setOperId(long operId) {
        this.operId = operId;
    }

}
