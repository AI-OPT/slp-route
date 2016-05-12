package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;

public class RouteServInfo {
    private Integer servId;

    private String tenantId;

    private String servName;

    private String visitType;

    private String servType;

    private String servContent;

    private String url;

    private String requestParam;

    private String returnParam;

    private String callbackUrl;

    private String callbackParam;

    private String state;

    private Long operId;

    private Timestamp operTime;

    public Integer getServId() {
        return servId;
    }

    public void setServId(Integer servId) {
        this.servId = servId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getServName() {
        return servName;
    }

    public void setServName(String servName) {
        this.servName = servName == null ? null : servName.trim();
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType == null ? null : visitType.trim();
    }

    public String getServType() {
        return servType;
    }

    public void setServType(String servType) {
        this.servType = servType == null ? null : servType.trim();
    }

    public String getServContent() {
        return servContent;
    }

    public void setServContent(String servContent) {
        this.servContent = servContent == null ? null : servContent.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam == null ? null : requestParam.trim();
    }

    public String getReturnParam() {
        return returnParam;
    }

    public void setReturnParam(String returnParam) {
        this.returnParam = returnParam == null ? null : returnParam.trim();
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl == null ? null : callbackUrl.trim();
    }

    public String getCallbackParam() {
        return callbackParam;
    }

    public void setCallbackParam(String callbackParam) {
        this.callbackParam = callbackParam == null ? null : callbackParam.trim();
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