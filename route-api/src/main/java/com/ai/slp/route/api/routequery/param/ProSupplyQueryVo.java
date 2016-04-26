package com.ai.slp.route.api.routequery.param;

import java.io.Serializable;
import java.util.List;

import com.ai.opt.base.vo.PageInfo;

/**
 * 路由下商品查询请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ProSupplyQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由ID
     */
    private List<String> routeIdList;

    /**
     * 供应品标识
     */
    private String supplyId;

    /**
     * 供应品名称
     */
    private String supplyName;

    /**
     * 分页信息,分页查询时必填
     */
    private PageInfo<ProSupplyQueryResult> pageInfo;

    public String getSupplyId() {
        return supplyId;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyId(String supplyId) {
        this.supplyId = supplyId;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public List<String> getRouteIdList() {
        return routeIdList;
    }

    public void setRouteIdList(List<String> routeIdList) {
        this.routeIdList = routeIdList;
    }

    public PageInfo<ProSupplyQueryResult> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<ProSupplyQueryResult> pageInfo) {
        this.pageInfo = pageInfo;
    }
}
