package com.ai.slp.route.api.routeconfig.param;

import java.util.List;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 路由商品添加请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteProSupplyAddVo extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 路由Id
     */
    private String routeId;

    /**
     * 操作人
     */
    private long operId;

    /**
     * 供应商品列表
     */
    private List<ProSupplyVo> proSupplyList;

    public String getRouteId() {
        return routeId;
    }

    public long getOperId() {
        return operId;
    }

    public List<ProSupplyVo> getProSupplyList() {
        return proSupplyList;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public void setOperId(long operId) {
        this.operId = operId;
    }

    public void setProSupplyList(List<ProSupplyVo> proSupplyList) {
        this.proSupplyList = proSupplyList;
    }

}
