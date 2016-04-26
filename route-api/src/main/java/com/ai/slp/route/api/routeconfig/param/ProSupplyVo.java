package com.ai.slp.route.api.routeconfig.param;

import java.io.Serializable;

/**
 * 供应商品 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ProSupplyVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 供应品标识
     */
    private String supplyId;

    /**
     * 标准品标识
     */
    private String standedProdId;

    /**
     * 标准品名称
     */
    private String standedProductName;

    /**
     * 总量
     */
    private long totalNum;

    public String getStandedProdId() {
        return standedProdId;
    }

    public void setStandedProdId(String standedProdId) {
        this.standedProdId = standedProdId;
    }

    public long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(long totalNum) {
        this.totalNum = totalNum;
    }

    public String getStandedProductName() {
        return standedProductName;
    }

    public void setStandedProductName(String standedProductName) {
        this.standedProductName = standedProductName;
    }

    public String getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(String supplyId) {
        this.supplyId = supplyId;
    }

}
