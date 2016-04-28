package com.ai.slp.route.api.routequery.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.api.routequery.interfaces.IRouteQuerySV;
import com.ai.slp.route.api.routequery.param.ProSupplyLogQueryVo;
import com.ai.slp.route.api.routequery.param.ProSupplyLogResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryVo;
import com.ai.slp.route.api.routequery.param.RouteGroupProSupplyQueryResult;
import com.ai.slp.route.api.routequery.param.RouteGroupQueryResult;
import com.ai.slp.route.api.routequery.param.RouteGroupQueryVo;
import com.ai.slp.route.api.routequery.param.RouteQueryResult;
import com.ai.slp.route.api.routequery.param.RouteQueryVo;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryResult;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryVo;
import com.ai.slp.route.service.business.interfaces.IRouteQueryBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service(validation = "true")
public class RouteQuerySVImpl implements IRouteQuerySV {
    @Autowired
    private IRouteQueryBusiSV iRouteQueryBusiSV;

    @Override
    public PageInfo<RouteQueryResult> routeQuery(RouteQueryVo vo) throws BusinessException,
            SystemException {
        return iRouteQueryBusiSV.routeQuery(vo);
    }

    @Override
    public RouteQueryResult routeDetailQuery(String routeId) throws BusinessException,
            SystemException {
        return iRouteQueryBusiSV.routeDetailQuery(routeId);
    }

    @Override
    public PageInfo<ProSupplyQueryResult> routeProSupplyQuery(ProSupplyQueryVo vo)
            throws BusinessException, SystemException {
        return iRouteQueryBusiSV.routeProSupplyQuery(vo);
    }

    @Override
    public ProSupplyLogResult proSupplyLogQuery(ProSupplyLogQueryVo vo) throws BusinessException,
            SystemException {
        return iRouteQueryBusiSV.proSupplyLogQuery(vo);
    }

    @Override
    public PageInfo<RouteRuleQueryResult> routeRuleQuery(RouteRuleQueryVo vo)
            throws BusinessException, SystemException {
        return iRouteQueryBusiSV.routeRuleQuery(vo);
    }

    @Override
    public RouteRuleQueryResult routeRuleDetailQuery(String routeId) throws BusinessException,
            SystemException {
        return iRouteQueryBusiSV.routeRuleDetailQuery(routeId);
    }

    @Override
    public PageInfo<RouteGroupQueryResult> routeGroupQuery(RouteGroupQueryVo vo)
            throws BusinessException, SystemException {
        return iRouteQueryBusiSV.routeGroupQuery(vo);
    }

    @Override
    public RouteGroupQueryResult routeGroupDetailQuery(String routeGroupId)
            throws BusinessException, SystemException {
        return iRouteQueryBusiSV.routeGroupDetailQuery(routeGroupId);
    }

    public RouteGroupProSupplyQueryResult routeGroupProSupplyQuery(List<String> routeIdList)
            throws BusinessException, SystemException {
        return iRouteQueryBusiSV.routeGroupProSupplyQuery(routeIdList);
    }

}
