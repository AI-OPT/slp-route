package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;

public class RouteItem {
    private String routeItemId;

    private String routeId;

    private String routeGroupId;

    private Short priorityNumber;

    private Short serialNumber;

    private String state;

    private Long operId;

    private Timestamp operTime;

    public String getRouteItemId() {
        return routeItemId;
    }

    public void setRouteItemId(String routeItemId) {
        this.routeItemId = routeItemId == null ? null : routeItemId.trim();
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    public String getRouteGroupId() {
        return routeGroupId;
    }

    public void setRouteGroupId(String routeGroupId) {
        this.routeGroupId = routeGroupId == null ? null : routeGroupId.trim();
    }

    public Short getPriorityNumber() {
        return priorityNumber;
    }

    public void setPriorityNumber(Short priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    public Short getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Short serialNumber) {
        this.serialNumber = serialNumber;
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
}