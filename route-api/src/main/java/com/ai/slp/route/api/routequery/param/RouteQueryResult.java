package com.ai.slp.route.api.routequery.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 路由查询返回参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteQueryResult extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 路由ID
     */
    private String routeId;

    /**
     * 供应商ID
     */
    private String sellerId;

    /**
     * 供应商名称
     */
    private String sellerName;

    /**
     * 合同ID
     */
    private String contractId;

    /**
     * 行业类型
     */
    private String cateGoryType;

    /**
     * 服务标识
     */
    private String splServId;

    /**
     * 服务类型
     */
    private String servType;

    /**
     * 服务名称
     */
    private String servName;

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
     * 商品数量
     */
    private long usableNum;

    /**
     * 供货开始时间
     */
    private String beginDate;

    /**
     * 供货结束时间
     */
    private String endDate;

    /**
     * 路由状态
     */
    private String state;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getSplServId() {
        return splServId;
    }

    public void setSplServId(String splServId) {
        this.splServId = splServId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getRouteType() {
        return routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCateGoryType() {
        return cateGoryType;
    }

    public String getServType() {
        return servType;
    }

    public String getServName() {
        return servName;
    }

    public long getUsableNum() {
        return usableNum;
    }

    public void setCateGoryType(String cateGoryType) {
        this.cateGoryType = cateGoryType;
    }

    public void setServType(String servType) {
        this.servType = servType;
    }

    public void setServName(String servName) {
        this.servName = servName;
    }

    public void setUsableNum(long usableNum) {
        this.usableNum = usableNum;
    }

}
