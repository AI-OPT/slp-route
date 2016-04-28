package com.ai.slp.route.api.routequery.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 路由组查询返回参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteGroupQueryResult extends BaseResponse {

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
    private String state;

    /**
     * 优先级个数
     */
    private int priorityNum;

    /**
     * 库存组标识
     */
    private String storageGroupId;

    /**
     * 库存组标识
     */
    private String storageGroupName;

    /**
     * 子库存列表
     */
    private List<StoStorageVo> stostorageList;

    /**
     * 路由组下路由
     */
    private List<RouteItemVo> routeList;

    public String getRouteGroupId() {
        return routeGroupId;
    }

    public String getRouteGroupName() {
        return routeGroupName;
    }

    public String getState() {
        return state;
    }

    public int getPriorityNum() {
        return priorityNum;
    }

    public void setRouteGroupId(String routeGroupId) {
        this.routeGroupId = routeGroupId;
    }

    public void setRouteGroupName(String routeGroupName) {
        this.routeGroupName = routeGroupName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPriorityNum(int priorityNum) {
        this.priorityNum = priorityNum;
    }

    public String getStorageGroupId() {
        return storageGroupId;
    }

    public List<StoStorageVo> getStostorageList() {
        return stostorageList;
    }

    public List<RouteItemVo> getRouteList() {
        return routeList;
    }

    public void setStorageGroupId(String storageGroupId) {
        this.storageGroupId = storageGroupId;
    }

    public void setStostorageList(List<StoStorageVo> stostorageList) {
        this.stostorageList = stostorageList;
    }

    public void setRouteList(List<RouteItemVo> routeList) {
        this.routeList = routeList;
    }

    public String getStorageGroupName() {
        return storageGroupName;
    }

    public void setStorageGroupName(String storageGroupName) {
        this.storageGroupName = storageGroupName;
    }

}
