package com.ai.slp.route.api.routeconfig.param;

import java.io.Serializable;

/**
 * 路由组组成维护请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteItemMaintainVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 变更标识 A 新增 M 修改 S 状态修改
     */
    private String chgFlag;

    /**
     * 路由组Id
     */
    private long routeGroupId;

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

    public String getChgFlag() {
        return chgFlag;
    }

    public long getRouteGroupId() {
        return routeGroupId;
    }

    public String getRouteId() {
        return routeId;
    }

    public String getState() {
        return state;
    }

    public void setChgFlag(String chgFlag) {
        this.chgFlag = chgFlag;
    }

    public void setRouteGroupId(long routeGroupId) {
        this.routeGroupId = routeGroupId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getOperId() {
        return operId;
    }

    public void setOperId(long operId) {
        this.operId = operId;
    }

}
