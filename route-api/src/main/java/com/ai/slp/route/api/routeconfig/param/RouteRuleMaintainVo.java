package com.ai.slp.route.api.routeconfig.param;

import java.io.Serializable;
import java.util.List;

/**
 * 路由规则维护请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteRuleMaintainVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 变更标识 A 新增 M 修改 S 状态变更
     */
    private String chgFlag;

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

    /**
     * 路由规则项列表
     */
    private List<RouteRuleItemVo> proSupplyList;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getChgFlag() {
        return chgFlag;
    }

    public void setChgFlag(String chgFlag) {
        this.chgFlag = chgFlag;
    }

    public List<RouteRuleItemVo> getProSupplyList() {
        return proSupplyList;
    }

    public void setProSupplyList(List<RouteRuleItemVo> proSupplyList) {
        this.proSupplyList = proSupplyList;
    }

    public String getState() {
        return state;
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
