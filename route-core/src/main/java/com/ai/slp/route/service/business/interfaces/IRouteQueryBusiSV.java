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
	/**
	 * 分页查询路由
	 */
    PageInfo<RouteQueryResult> routeQuery(RouteQueryVo vo);
    /**
	 * 根据路由标志查询
	 */
    RouteQueryResult routeDetailQuery(String routeId);
    /**
	 * 查询供应商品
	 */
    PageInfo<ProSupplyQueryResult> routeProSupplyQuery(ProSupplyQueryVo vo)
            throws BusinessException;
    /**
	 * 查询供应商品
	 */
    ProSupplyLogResult proSupplyLogQuery(ProSupplyLogQueryVo vo) throws BusinessException;
    /**
	 * 路由规则
	 */
    PageInfo<RouteRuleQueryResult> routeRuleQuery(RouteRuleQueryVo vo) throws BusinessException;
    /**
	 * 根据路由id查询路由规则
	 */
    RouteRuleQueryResult routeRuleDetailQuery(String routeId);
    /**
	 * 路由组查询
	 */
    PageInfo<RouteGroupQueryResult> routeGroupQuery(RouteGroupQueryVo vo);
    /**
	 * 根据路由组id查询路有组信息
	 */
    RouteGroupQueryResult routeGroupDetailQuery(String routeGroupId);
    /**
	 * 路由组供应商品
	 */
    RouteGroupProSupplyQueryResult routeGroupProSupplyQuery(List<String> routeIdList)
            throws BusinessException;

}
