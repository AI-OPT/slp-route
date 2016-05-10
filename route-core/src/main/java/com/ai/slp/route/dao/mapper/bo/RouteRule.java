package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;

public class RouteRule {
    private String routeRuleId;

    private String routeId;

    private String routeRuleType;

    private String routeRuleItem;

    private Long warningValue;

    private String timeType;

    private String cycleValue;

    private String cycleUnit;

    private Timestamp beginDate;

    private Timestamp endDate;

    private String state;

    private Long operId;

    private Timestamp operTime;

    public String getRouteRuleId() {
        return routeRuleId;
    }

    public void setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId == null ? null : routeRuleId.trim();
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    public String getRouteRuleType() {
        return routeRuleType;
    }

    public void setRouteRuleType(String routeRuleType) {
        this.routeRuleType = routeRuleType == null ? null : routeRuleType.trim();
    }

    public String getRouteRuleItem() {
        return routeRuleItem;
    }

    public void setRouteRuleItem(String routeRuleItem) {
        this.routeRuleItem = routeRuleItem == null ? null : routeRuleItem.trim();
    }

    public Long getWarningValue() {
        return warningValue;
    }

    public void setWarningValue(Long warningValue) {
        this.warningValue = warningValue;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType == null ? null : timeType.trim();
    }

    public String getCycleValue() {
        return cycleValue;
    }

    public void setCycleValue(String cycleValue) {
        this.cycleValue = cycleValue == null ? null : cycleValue.trim();
    }

    public String getCycleUnit() {
        return cycleUnit;
    }

    public void setCycleUnit(String cycleUnit) {
        this.cycleUnit = cycleUnit == null ? null : cycleUnit.trim();
    }

    public Timestamp getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Timestamp beginDate) {
        this.beginDate = beginDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
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