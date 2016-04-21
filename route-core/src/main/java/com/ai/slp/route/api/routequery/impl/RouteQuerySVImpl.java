package com.ai.slp.route.api.routequery.impl;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routequery.interfaces.IRouteQuerySV;
import com.ai.slp.route.api.routequery.param.ProSupplyLogQueryVo;
import com.ai.slp.route.api.routequery.param.ProSupplyLogResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryVo;
import com.ai.slp.route.api.routequery.param.RouteGroupQueryResult;
import com.ai.slp.route.api.routequery.param.RouteGroupQueryVo;
import com.ai.slp.route.api.routequery.param.RouteQueryResult;
import com.ai.slp.route.api.routequery.param.RouteQueryVo;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryResult;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryVo;
import com.alibaba.dubbo.config.annotation.Service;

@Service(validation = "true")
public class RouteQuerySVImpl implements IRouteQuerySV {

    @Override
    public RouteQueryResult routeQuery(RouteQueryVo vo) throws BusinessException, SystemException {
        return null;
    }

    @Override
    public ProSupplyQueryResult routeProSupplyQuery(ProSupplyQueryVo vo) throws BusinessException,
            SystemException {
        return null;
    }

    @Override
    public ProSupplyLogResult proSupplyLogQuery(ProSupplyLogQueryVo vo) throws BusinessException,
            SystemException {
        return null;
    }

    @Override
    public RouteRuleQueryResult routeRuleQuery(RouteRuleQueryVo vo) throws BusinessException,
            SystemException {
        return null;
    }

    @Override
    public RouteGroupQueryResult routeGroupQuery(RouteGroupQueryVo vo) throws BusinessException,
            SystemException {
        return null;
    }

}
