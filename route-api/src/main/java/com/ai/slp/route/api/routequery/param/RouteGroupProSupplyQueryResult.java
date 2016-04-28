package com.ai.slp.route.api.routequery.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 路由组下商品查询返回参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteGroupProSupplyQueryResult extends BaseResponse {

    private static final long serialVersionUID = 1L;

    private List<RouteGroupProSupplyQueryVo> routeGroupProSupplyVoList = null;

    public List<RouteGroupProSupplyQueryVo> getRouteGroupProSupplyVoList() {
        return routeGroupProSupplyVoList;
    }

    public void setRouteGroupProSupplyVoList(
            List<RouteGroupProSupplyQueryVo> routeGroupProSupplyVoList) {
        this.routeGroupProSupplyVoList = routeGroupProSupplyVoList;
    }

}
