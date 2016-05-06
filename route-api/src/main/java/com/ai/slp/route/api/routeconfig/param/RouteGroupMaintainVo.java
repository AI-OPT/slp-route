package com.ai.slp.route.api.routeconfig.param;

import java.io.Serializable;
import java.util.List;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 路由组维护请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteGroupMaintainVo extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 变更标识 A 新增 M 修改 S 状态修改 B 路由修改
     */
    private String chgFlag;

    /**
     * 路由组Id
     */
    private String routeGroupId;

    /**
     * 路由组名称
     */
    private String routeGroupName;

    /**
     * 状态
     */
    private String state;

    /**
     * 库存组标识
     */
    private long storageGroupId;

    /**
     * 路由列表优先级
     */
    private List<RouteItemVo> routeItemVoList;

    /**
     * 操作人
     */
    private long operId;

    public String getRouteGroupName() {
        return routeGroupName;
    }

    public void setRouteGroupName(String routeGroupName) {
        this.routeGroupName = routeGroupName;
    }

    public String getChgFlag() {
        return chgFlag;
    }

    public String getState() {
        return state;
    }

    public void setChgFlag(String chgFlag) {
        this.chgFlag = chgFlag;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getStorageGroupId() {
        return storageGroupId;
    }

    public void setStorageGroupId(long storageGroupId) {
        this.storageGroupId = storageGroupId;
    }

    public long getOperId() {
        return operId;
    }

    public void setOperId(long operId) {
        this.operId = operId;
    }

    public List<RouteItemVo> getRouteItemVoList() {
        return routeItemVoList;
    }

    public void setRouteItemVoList(List<RouteItemVo> routeItemVoList) {
        this.routeItemVoList = routeItemVoList;
    }

    public String getRouteGroupId() {
        return routeGroupId;
    }

    public void setRouteGroupId(String routeGroupId) {
        this.routeGroupId = routeGroupId;
    }

}
