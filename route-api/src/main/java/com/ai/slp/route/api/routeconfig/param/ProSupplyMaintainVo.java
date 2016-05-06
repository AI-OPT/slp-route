package com.ai.slp.route.api.routeconfig.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 供应商品维护请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ProSupplyMaintainVo extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 变更标识 A 增加供货量 D 删除
     */
    private String chgFlag;

    /**
     * 供应品标识
     */
    private String supplyId;

    /**
     * 新增供货量
     */
    private long supplyNum;

    /**
     * 操作人
     */
    private long operId;

    public String getChgFlag() {
        return chgFlag;
    }

    public String getSupplyId() {
        return supplyId;
    }

    public long getSupplyNum() {
        return supplyNum;
    }

    public void setChgFlag(String chgFlag) {
        this.chgFlag = chgFlag;
    }

    public void setSupplyId(String supplyId) {
        this.supplyId = supplyId;
    }

    public void setSupplyNum(long supplyNum) {
        this.supplyNum = supplyNum;
    }

    public long getOperId() {
        return operId;
    }

    public void setOperId(long operId) {
        this.operId = operId;
    }

}
