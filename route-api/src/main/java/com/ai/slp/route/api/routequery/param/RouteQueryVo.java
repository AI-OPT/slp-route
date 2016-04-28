package com.ai.slp.route.api.routequery.param;

import java.io.Serializable;
import java.util.List;

import com.ai.opt.base.vo.PageInfo;

/**
 * 路由查询请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由ID
     */
    private List<String> routeIdList;

    /**
     * 供应商名称
     */
    private String sellerName;

    /**
     * 路由名称
     */
    private String routeName;

    /**
     * 路由状态
     */
    private List<String> stateList;

    /**
     * 分页信息,分页查询时必填
     */
    private PageInfo<RouteQueryResult> pageInfo;

    public String getSellerName() {
        return sellerName;
    }

    public String getRouteName() {
        return routeName;
    }

    public List<String> getStateList() {
        return stateList;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public void setStateList(List<String> stateList) {
        this.stateList = stateList;
    }

    public PageInfo<RouteQueryResult> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<RouteQueryResult> pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<String> getRouteIdList() {
        return routeIdList;
    }

    public void setRouteIdList(List<String> routeIdList) {
        this.routeIdList = routeIdList;
    }

}
