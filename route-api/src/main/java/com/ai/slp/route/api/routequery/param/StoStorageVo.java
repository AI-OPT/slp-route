package com.ai.slp.route.api.routequery.param;

import java.io.Serializable;

/**
 * 库存定义 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class StoStorageVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 库存标识
     */
    private long storageId;

    /**
     * 库存名称
     */
    private String storageName;

    /**
     * 库存状态
     */
    private String state;

    public long getStorageId() {
        return storageId;
    }

    public String getStorageName() {
        return storageName;
    }

    public String getState() {
        return state;
    }

    public void setStorageId(long storageId) {
        this.storageId = storageId;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public void setState(String state) {
        this.state = state;
    }

}
