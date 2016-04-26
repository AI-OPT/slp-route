package com.ai.slp.route.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.api.routequery.param.ProSupplyLogQueryVo;
import com.ai.slp.route.api.routequery.param.ProSupplyLogResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryVo;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryResult;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryVo;

public interface IRouteQueryBusiSV {

    /**
     * 
     * 供货记录查询
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @author zhangxw
     * @ApiDocMethod
     */
    ProSupplyLogResult proSupplyLogQuery(ProSupplyLogQueryVo vo) throws BusinessException;

    PageInfo<ProSupplyQueryResult> routeProSupplyQuery(ProSupplyQueryVo vo)
            throws BusinessException;

    PageInfo<RouteRuleQueryResult> routeRuleQuery(RouteRuleQueryVo vo) throws BusinessException;

}
