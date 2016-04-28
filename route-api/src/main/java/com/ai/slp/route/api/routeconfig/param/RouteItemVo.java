package com.ai.slp.route.api.routeconfig.param;

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
     * 路由标识
     */
    private String routeId;

    /**
     * 优先级
     */
    private int priorityNum;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public int getPriorityNum() {
        return priorityNum;
    }

    public void setPriorityNum(int priorityNum) {
        this.priorityNum = priorityNum;
    }

}
