package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;

public class RouteSupplyAddsLog {
    private String supplyAddsLogId;

    private String supplyId;

    private String supplyName;

    private Long beforeUsableNum;

    private Long supplyNum;

    private String source;

    private Long operId;

    private Timestamp operTime;

    public String getSupplyAddsLogId() {
        return supplyAddsLogId;
    }

    public void setSupplyAddsLogId(String supplyAddsLogId) {
        this.supplyAddsLogId = supplyAddsLogId == null ? null : supplyAddsLogId.trim();
    }

    public String getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(String supplyId) {
        this.supplyId = supplyId == null ? null : supplyId.trim();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName == null ? null : supplyName.trim();
    }

    public Long getBeforeUsableNum() {
        return beforeUsableNum;
    }

    public void setBeforeUsableNum(Long beforeUsableNum) {
        this.beforeUsableNum = beforeUsableNum;
    }

    public Long getSupplyNum() {
        return supplyNum;
    }

    public void setSupplyNum(Long supplyNum) {
        this.supplyNum = supplyNum;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
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