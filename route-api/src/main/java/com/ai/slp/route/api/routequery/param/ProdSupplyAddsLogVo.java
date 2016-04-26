package com.ai.slp.route.api.routequery.param;

import java.io.Serializable;

/**
 * 供应品量增加日志<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ProdSupplyAddsLogVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 供货商品Id
     */
    private String supplyId;

    /**
     * 供应商品名称
     */
    private String supplyName;

    /**
     * 可用量
     */
    private long beforeUsableNum;

    /**
     * 增加供货数量
     */
    private long supplyNum;

    /**
     * 操作人Id
     */
    private long operId;

    /**
     * 操作人姓名
     */
    private String operName;

    /**
     * 操作时间
     */
    private String operTime;

    public String getSupplyId() {
        return supplyId;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public long getOperId() {
        return operId;
    }

    public String getOperName() {
        return operName;
    }

    public String getOperTime() {
        return operTime;
    }

    public void setSupplyId(String supplyId) {
        this.supplyId = supplyId;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public void setOperId(long operId) {
        this.operId = operId;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public void setOperTime(String operTime) {
        this.operTime = operTime;
    }

    public long getBeforeUsableNum() {
        return beforeUsableNum;
    }

    public long getSupplyNum() {
        return supplyNum;
    }

    public void setBeforeUsableNum(long beforeUsableNum) {
        this.beforeUsableNum = beforeUsableNum;
    }

    public void setSupplyNum(long supplyNum) {
        this.supplyNum = supplyNum;
    }

}
