package com.ai.slp.route.service.business.interfaces;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.PageInfo;
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

public interface IRouteQueryBusiSV {

    PageInfo<RouteQueryResult> routeQuery(RouteQueryVo vo);

    RouteQueryResult routeDetailQuery(String routeId);

    PageInfo<ProSupplyQueryResult> routeProSupplyQuery(ProSupplyQueryVo vo)
            throws BusinessException;

    ProSupplyLogResult proSupplyLogQuery(ProSupplyLogQueryVo vo) throws BusinessException;

    PageInfo<RouteRuleQueryResult> routeRuleQuery(RouteRuleQueryVo vo) throws BusinessException;

    RouteRuleQueryResult routeRuleDetailQuery(String routeId);

    PageInfo<RouteGroupQueryResult> routeGroupQuery(RouteGroupQueryVo vo);

    RouteGroupQueryResult routeGroupDetailQuery(String routeGroupId);

    RouteGroupProSupplyQueryResult routeGroupProSupplyQuery(List<String> routeIdList)
            throws BusinessException;

}
