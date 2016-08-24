package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;

public class RouteGroup {
    private String routeGroupId;

    private String tenantId;

    private String routeGroupName;

    private String state;

    private Long operId;

    private Timestamp operTime;

    private String supplierId;

    private String routeGroupType;

    public String getRouteGroupId() {
        return routeGroupId;
    }

    public void setRouteGroupId(String routeGroupId) {
        this.routeGroupId = routeGroupId == null ? null : routeGroupId.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getRouteGroupName() {
        return routeGroupName;
    }

    public void setRouteGroupName(String routeGroupName) {
        this.routeGroupName = routeGroupName == null ? null : routeGroupName.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getOperId() {
        return operId;
    }

    public void setOperId(Long operId) {
        this.operId = operId;
    }

    public Timestamp getOperTime() {
        return operTime;
    }

    public void setOperTime(Timestamp operTime) {
        this.operTime = operTime;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getRouteGroupType() {
        return routeGroupType;
    }

    public void setRouteGroupType(String routeGroupType) {
        this.routeGroupType = routeGroupType == null ? null : routeGroupType.trim();
    }
}