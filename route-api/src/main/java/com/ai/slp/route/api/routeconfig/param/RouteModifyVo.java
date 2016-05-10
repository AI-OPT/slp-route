package com.ai.slp.route.api.routeconfig.param;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 路由修改请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteModifyVo extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 路由Id
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
     * 服务标识
     */
    private String splServId;

    /**
     * 供应商账号
     */
    private String userLoginName;

    /**
     * 合同编号
     */
    private String contractCode;

    /**
     * 供货开始时间
     */
    private String beginDate;

    /**
     * 供货结束时间
     */
    private String endDate;

    /**
     * 操作人
     */
    private long operId;

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

    public String getSplServId() {
        return splServId;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public String getEndDate() {
        return endDate;
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

    public void setSplServId(String splServId) {
        this.splServId = splServId;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public long getOperId() {
        return operId;
    }

    public void setOperId(long operId) {
        this.operId = operId;
    }

}
