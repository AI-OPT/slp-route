package com.ai.slp.route.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.route.api.routequery.param.ProSupplyLogQueryVo;
import com.ai.slp.route.api.routequery.param.ProSupplyLogResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryVo;
import com.ai.slp.route.api.routequery.param.ProdSupplyAddsLogVo;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryResult;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryVo;
import com.ai.slp.route.dao.mapper.bo.ProdSupply;
import com.ai.slp.route.dao.mapper.bo.ProdSupplyAddsLog;
import com.ai.slp.route.dao.mapper.bo.ProdSupplyAddsLogCriteria;
import com.ai.slp.route.dao.mapper.bo.ProdSupplyCriteria;
import com.ai.slp.route.dao.mapper.bo.Route;
import com.ai.slp.route.dao.mapper.bo.RouteCriteria;
import com.ai.slp.route.dao.mapper.bo.RouteRule;
import com.ai.slp.route.dao.mapper.bo.RouteRuleCriteria;
import com.ai.slp.route.dao.mapper.interfaces.ProdSupplyAddsLogMapper;
import com.ai.slp.route.dao.mapper.interfaces.ProdSupplyMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteRuleMapper;
import com.ai.slp.route.service.business.interfaces.IRouteQueryBusiSV;

@Service
@Transactional
public class RouteQueryBusiSVImpl implements IRouteQueryBusiSV {
    @Autowired
    private transient ProdSupplyAddsLogMapper prodSupplyAddsLogMapper;

    @Autowired
    private transient ProdSupplyMapper prodSupplyMapper;

    @Autowired
    private transient RouteMapper routeMapper;

    @Autowired
    private transient RouteRuleMapper routeRuleMapper;

    @Override
    public ProSupplyLogResult proSupplyLogQuery(ProSupplyLogQueryVo vo) throws BusinessException {
        ProdSupplyAddsLogCriteria prodSupplyAddsLogCriteria = new ProdSupplyAddsLogCriteria();
        ProdSupplyAddsLogCriteria.Criteria criteria = prodSupplyAddsLogCriteria.createCriteria();
        ProSupplyLogResult proSupplyLogResult = new ProSupplyLogResult();
        if (!StringUtil.isBlank(vo.getSupplyId())) {
            criteria.andSupplyIdEqualTo(vo.getSupplyId());
        }
        if (!StringUtil.isBlank(vo.getSupplyName())) {
            criteria.andSupplyNameLike(vo.getSupplyName());
        }
        List<ProdSupplyAddsLog> prodSupplyAddsLogs = prodSupplyAddsLogMapper
                .selectByExample(prodSupplyAddsLogCriteria);
        if (!CollectionUtil.isEmpty(prodSupplyAddsLogs)) {
            List<ProdSupplyAddsLogVo> prodSupplyAddsLogVos = new ArrayList<ProdSupplyAddsLogVo>();
            for (ProdSupplyAddsLog prodSupplyAddsLog : prodSupplyAddsLogs) {
                ProdSupplyAddsLogVo prodSupplyAddsLogVo = new ProdSupplyAddsLogVo();
                BeanUtils.copyProperties(prodSupplyAddsLogVo, prodSupplyAddsLog);
                prodSupplyAddsLogVos.add(prodSupplyAddsLogVo);
            }
            proSupplyLogResult.setProdSupplyAddsLogVos(prodSupplyAddsLogVos);
        }

        return proSupplyLogResult;
    }

    @Override
    public PageInfo<ProSupplyQueryResult> routeProSupplyQuery(ProSupplyQueryVo vo)
            throws BusinessException {

        ProdSupplyCriteria prodSupplyCriteria = new ProdSupplyCriteria();
        ProdSupplyCriteria.Criteria criteria = prodSupplyCriteria.createCriteria();

        if (!StringUtil.isBlank(vo.getSupplyId())) {
            criteria.andSupplyIdEqualTo(vo.getSupplyId());
        }
        if (!CollectionUtil.isEmpty(vo.getRouteIdList())) {
            criteria.andRouteIdIn(vo.getRouteIdList());
        }
        if (!StringUtil.isBlank(vo.getSupplyId())) {
            criteria.andSupplyNameEqualTo(vo.getSupplyName());
        }
        PageInfo<ProSupplyQueryResult> pageInfo = new PageInfo<ProSupplyQueryResult>();
        pageInfo.setCount(prodSupplyMapper.countByExample(prodSupplyCriteria));

        if (vo.getPageInfo() == null) {
            pageInfo.setPageNo(1);
            pageInfo.setPageSize(pageInfo.getCount() == 0 ? 10 : pageInfo.getCount());
        } else {
            prodSupplyCriteria.setLimitStart(vo.getPageInfo().getStartRowIndex() - 1);
            prodSupplyCriteria.setLimitEnd(vo.getPageInfo().getPageSize());
            pageInfo.setPageNo(vo.getPageInfo().getPageNo());
            pageInfo.setPageSize(vo.getPageInfo().getPageSize());
        }

        List<ProdSupply> prodSupplys = prodSupplyMapper.selectByExample(prodSupplyCriteria);
        if (!CollectionUtil.isEmpty(prodSupplys)) {
            List<ProSupplyQueryResult> proSupplyQueryResultList = new ArrayList<ProSupplyQueryResult>();
            for (ProdSupply prodSupply : prodSupplys) {
                ProSupplyQueryResult proSupplyQueryResult = new ProSupplyQueryResult();
                BeanUtils.copyProperties(prodSupply, proSupplyQueryResult);
                proSupplyQueryResultList.add(proSupplyQueryResult);
            }
            pageInfo.setResult(proSupplyQueryResultList);

        }
        return pageInfo;
    }

    @Override
    public PageInfo<RouteRuleQueryResult> routeRuleQuery(RouteRuleQueryVo vo)
            throws BusinessException {

        RouteCriteria routeCriteria = new RouteCriteria();
        RouteCriteria.Criteria criteria = routeCriteria.createCriteria();

        if (!StringUtil.isBlank(vo.getRouteId())) {
            criteria.andRouteIdEqualTo(vo.getRouteId());
        }
        if (!StringUtil.isBlank(vo.getRouteName())) {
            criteria.andRouteNameEqualTo(vo.getRouteName());
        }
        if (!CollectionUtil.isEmpty(vo.getStateList())) {
            criteria.andStateNotIn(vo.getStateList());
        }
        PageInfo<RouteRuleQueryResult> pageInfo = new PageInfo<RouteRuleQueryResult>();
        pageInfo.setCount(routeMapper.countByExample(routeCriteria));
        if (vo.getPageInfo() == null) {
            pageInfo.setPageNo(1);
            pageInfo.setPageSize(pageInfo.getCount() == 0 ? 10 : pageInfo.getCount());
        } else {
            routeCriteria.setLimitStart(vo.getPageInfo().getStartRowIndex() - 1);
            routeCriteria.setLimitEnd(vo.getPageInfo().getPageSize());
            pageInfo.setPageNo(vo.getPageInfo().getPageNo());
            pageInfo.setPageSize(vo.getPageInfo().getPageSize());
        }
        List<Route> routeList = routeMapper.selectByExample(routeCriteria);
        if (!CollectionUtil.isEmpty(routeList)) {
            List<RouteRuleQueryResult> routeRuleQueryResultList = new ArrayList<RouteRuleQueryResult>();
            for (Route route : routeList) {
                RouteRuleQueryResult routeRuleQueryResult = new RouteRuleQueryResult();
                routeRuleQueryResult.setRouteId(route.getRouteId());
                routeRuleQueryResult.setRouteName(route.getRouteName());
                routeRuleQueryResult.setState(route.getState());
                this.routeRuleList(routeRuleQueryResult);
                routeRuleQueryResultList.add(routeRuleQueryResult);
            }
            pageInfo.setResult(routeRuleQueryResultList);

        }
        return pageInfo;
    }

    public void routeRuleList(RouteRuleQueryResult routeRuleQueryResult) throws BusinessException {
        RouteRuleCriteria routeRuleCriteria = new RouteRuleCriteria();
        RouteRuleCriteria.Criteria criteria = routeRuleCriteria.createCriteria();
        if (!StringUtil.isBlank(routeRuleQueryResult.getRouteId())) {
            criteria.andRouteIdEqualTo(routeRuleQueryResult.getRouteId());
        }
        criteria.andStateEqualTo("1");
        List<RouteRule> routeRuleList = routeRuleMapper.selectByExample(routeRuleCriteria);
        for (RouteRule routeRule : routeRuleList) {
            if ("C".equals(routeRule.getRouteRuleItem())) {
                routeRuleQueryResult.setConcurrentNum(routeRule.getWarningValue());
            } else if ("V".equals(routeRule.getRouteRuleItem())) {
                routeRuleQueryResult.setOrderNum(routeRule.getWarningValue());
                routeRuleQueryResult.setOrderNumCycleValue(this.cycleValueCal(routeRule));
            }else if("A".equals(routeRule.getRouteRuleItem())){
                routeRuleQueryResult.setAmount(routeRule.getWarningValue());
                routeRuleQueryResult.setAmountCycleValue(this.cycleValueCal(routeRule));
            }
        }
    }

    private String cycleValueCal(RouteRule routeRule) {
        String cycleValue="";
        if ("S".equals(routeRule.getTimeType())) {
            cycleValue=routeRule.getCycleValue()+routeRule.getCycleUnit();
        } else {
            cycleValue=routeRule.getBeginDate()+"~"+routeRule.getEndDate();
        }
        return cycleValue;
    }

}
