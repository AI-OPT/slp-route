package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;

public class RouteTargetArea {
    private String routeAreaId;

    private String tenantId;

    private String routeItemId;

    private Integer provCode;

    private Integer cityCode;

    private Integer countyCode;

    private String state;

    private String operId;

    private Timestamp operTime;

    public String getRouteAreaId() {
        return routeAreaId;
    }

    public void setRouteAreaId(String routeAreaId) {
        this.routeAreaId = routeAreaId == null ? null : routeAreaId.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getRouteItemId() {
        return routeItemId;
    }

    public void setRouteItemId(String routeItemId) {
        this.routeItemId = routeItemId == null ? null : routeItemId.trim();
    }

    public Integer getProvCode() {
        return provCode;
    }

    public void setProvCode(Integer provCode) {
        this.provCode = provCode;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(Integer countyCode) {
        this.countyCode = countyCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId == null ? null : operId.trim();
    }

    public Timestamp getOperTime() {
        return operTime;
    }

    public void setOperTime(Timestamp operTime) {
        this.operTime = operTime;
    }
}