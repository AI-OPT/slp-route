package com.ai.slp.route.api.routequery.param;

import java.io.Serializable;

/**
 * 路由组组成 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteItemVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 优先级
     */
    private long priorityNum;

    /**
     * 路由ID
     */
    private String routeId;

    /**
     * 路由名称
     */
    private String routeName;

    public long getPriorityNum() {
        return priorityNum;
    }

    public String getRouteId() {
        return routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setPriorityNum(long priorityNum) {
        this.priorityNum = priorityNum;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

}
