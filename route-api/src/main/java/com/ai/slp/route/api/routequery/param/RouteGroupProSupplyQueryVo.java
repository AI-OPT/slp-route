package com.ai.slp.route.api.routequery.param;

import java.io.Serializable;

/**
 * 路由组下商品查询返回参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteGroupProSupplyQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由组ID
     */
    private String routeId;

    /**
     * 路由组名称
     */
    private String routeName;

    /**
     * 供应商品ID
     */
    private String supplyId;

    /**
     * 供应商品名称
     */
    private String supplyName;

    /**
     * 总量
     */
    private long totalNum;

    /**
     * 可用量
     */
    private long usableNum;

    public long getTotalNum() {
        return totalNum;
    }

    public long getUsableNum() {
        return usableNum;
    }

    public void setTotalNum(long totalNum) {
        this.totalNum = totalNum;
    }

    public void setUsableNum(long usableNum) {
        this.usableNum = usableNum;
    }

    public String getSupplyId() {
        return supplyId;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyId(String supplyId) {
        this.supplyId = supplyId;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public String getRouteId() {
        return routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

}
