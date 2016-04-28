package com.ai.slp.route.api.routequery.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 路由规则查询返回参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteRuleQueryResult extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 路由ID
     */
    private String routeId;

    /**
     * 路由名称
     */
    private String routeName;

    /**
     * 路由类型
     */
    private String routeType;

    /**
     * 所在省
     */
    private String provCode;

    /**
     * 所在市
     */
    private String cityCode;

    /**
     * 供应商ID
     */
    private String sellerId;

    /**
     * 供应商名称
     */
    private String sellerName;

    /**
     * 行业类型
     */
    private String cateGoryType;

    /**
     * 路由状态
     */
    private String state;

    /**
     * 并发量（次/秒）
     */
    private long concurrentNum;

    /**
     * 订单量(单)
     */
    private long orderNum;

    /**
     * 订单量周期
     */
    private String orderNumCycleValue;

    /**
     * 金额（万）
     */
    private long amount;

    /**
     * 金额周期
     */
    private String amountCycleValue;

    public String getRouteId() {
        return routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public String getRouteType() {
        return routeType;
    }

    public String getProvCode() {
        return provCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public String getState() {
        return state;
    }

    public long getConcurrentNum() {
        return concurrentNum;
    }

    public long getOrderNum() {
        return orderNum;
    }

    public String getOrderNumCycleValue() {
        return orderNumCycleValue;
    }

    public long getAmount() {
        return amount;
    }

    public String getAmountCycleValue() {
        return amountCycleValue;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setConcurrentNum(long concurrentNum) {
        this.concurrentNum = concurrentNum;
    }

    public void setOrderNum(long orderNum) {
        this.orderNum = orderNum;
    }

    public void setOrderNumCycleValue(String orderNumCycleValue) {
        this.orderNumCycleValue = orderNumCycleValue;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setAmountCycleValue(String amountCycleValue) {
        this.amountCycleValue = amountCycleValue;
    }

    public String getCateGoryType() {
        return cateGoryType;
    }

    public void setCateGoryType(String cateGoryType) {
        this.cateGoryType = cateGoryType;
    }

}
