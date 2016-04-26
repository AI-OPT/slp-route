package com.ai.slp.route.api.routequery.param;

import java.io.Serializable;

/**
 * 供货记录查询请求参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ProSupplyLogQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 供货商品Id
     */
    private String supplyId;

    /**
     * 供应商品名称
     */
    private String supplyName;

    public String getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(String supplyId) {
        this.supplyId = supplyId;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

}
