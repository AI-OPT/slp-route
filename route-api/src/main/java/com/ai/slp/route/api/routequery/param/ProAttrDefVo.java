package com.ai.slp.route.api.routequery.param;

import java.io.Serializable;

/**
 * 商品属性定义 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ProAttrDefVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 属性标识
     */
    private long arrtId;

    /**
     * 属性名称
     */
    private String attrName;

    /**
     * 属性类型
     */
    private String attrType;

    public long getArrtId() {
        return arrtId;
    }

    public String getAttrName() {
        return attrName;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setArrtId(long arrtId) {
        this.arrtId = arrtId;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

}
