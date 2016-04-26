package com.ai.slp.route.api.routequery.param;

import java.io.Serializable;
import java.util.List;

import com.ai.opt.base.vo.PageInfo;

/**
 * 路由规则查询请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteRuleQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由ID
     */
    private String routeId;

    /**
     * 路由名称
     */
    private String routeName;

    /**
     * 路由状态列表
     */
    private List<String> stateList;

    /**
     * 分页信息,分页查询时必填
     */
    private PageInfo<RouteRuleQueryResult> pageInfo;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public List<String> getStateList() {
        return stateList;
    }

    public void setStateList(List<String> stateList) {
        this.stateList = stateList;
    }

    public PageInfo<RouteRuleQueryResult> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<RouteRuleQueryResult> pageInfo) {
        this.pageInfo = pageInfo;
    }

}
