package com.ai.slp.route.api.routequery.param;

import java.io.Serializable;
import java.util.List;

/**
 * 路由组查询 请求参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteGroupQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由组ID
     */
    private String routeGroupId;

    /**
     * 路由组名称
     */
    private String routeGroupName;

    /**
     * 路由组状态
     */
    private List<String> stateList;

    public String getRouteGroupId() {
        return routeGroupId;
    }

    public String getRouteGroupName() {
        return routeGroupName;
    }

    public List<String> getStateList() {
        return stateList;
    }

    public void setRouteGroupId(String routeGroupId) {
        this.routeGroupId = routeGroupId;
    }

    public void setRouteGroupName(String routeGroupName) {
        this.routeGroupName = routeGroupName;
    }

    public void setStateList(List<String> stateList) {
        this.stateList = stateList;
    }

}
