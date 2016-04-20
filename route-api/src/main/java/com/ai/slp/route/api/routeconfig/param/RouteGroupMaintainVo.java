package com.ai.slp.route.api.routeconfig.param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 路由组维护请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteGroupMaintainVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 变更标识 A 新增 M 修改 S 状态修改 B 路由修改
     */
    private String chgFlag;

    /**
     * 路由组Id
     */
    private long routeGroupId;

    /**
     * 路由组名称
     */
    private String routeGroupName;

    /**
     * 状态
     */
    private String state;

    /**
     * 库存组列表
     */
    private List<Long> storageGroupList;

    /**
     * 路由列表优先级
     */
    private Map<String, List<String>> routeList;

    public String getRouteGroupName() {
        return routeGroupName;
    }

    public List<Long> getStorageGroupList() {
        return storageGroupList;
    }

    public Map<String, List<String>> getRouteList() {
        return routeList;
    }

    public void setRouteGroupName(String routeGroupName) {
        this.routeGroupName = routeGroupName;
    }

    public void setStorageGroupList(List<Long> storageGroupList) {
        this.storageGroupList = storageGroupList;
    }

    public void setRouteList(Map<String, List<String>> routeList) {
        this.routeList = routeList;
    }

    public String getChgFlag() {
        return chgFlag;
    }

    public long getRouteGroupId() {
        return routeGroupId;
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

    public void setState(String state) {
        this.state = state;
    }

}
