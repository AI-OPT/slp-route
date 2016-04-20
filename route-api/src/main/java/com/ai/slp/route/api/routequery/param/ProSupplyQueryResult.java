package com.ai.slp.route.api.routequery.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 路由下商品查询返回参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ProSupplyQueryResult extends BaseResponse {

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

    /**
     * 属性列表
     */
    private List<ProAttrDefVo> proAttrDefList;

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

    public long getTotalNum() {
        return totalNum;
    }

    public long getUsableNum() {
        return usableNum;
    }

    public List<ProAttrDefVo> getProAttrDefList() {
        return proAttrDefList;
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

    public void setTotalNum(long totalNum) {
        this.totalNum = totalNum;
    }

    public void setUsableNum(long usableNum) {
        this.usableNum = usableNum;
    }

    public void setProAttrDefList(List<ProAttrDefVo> proAttrDefList) {
        this.proAttrDefList = proAttrDefList;
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

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

}
