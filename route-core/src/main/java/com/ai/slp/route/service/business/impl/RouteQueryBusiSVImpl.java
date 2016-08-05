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
import com.ai.slp.route.api.routequery.param.RouteGroupProSupplyQueryResult;
import com.ai.slp.route.api.routequery.param.RouteGroupProSupplyQueryVo;
import com.ai.slp.route.api.routequery.param.RouteGroupQueryResult;
import com.ai.slp.route.api.routequery.param.RouteGroupQueryVo;
import com.ai.slp.route.api.routequery.param.RouteItemVo;
import com.ai.slp.route.api.routequery.param.RouteQueryResult;
import com.ai.slp.route.api.routequery.param.RouteQueryVo;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryResult;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryVo;
import com.ai.slp.route.dao.mapper.bo.ProdSupply;
import com.ai.slp.route.dao.mapper.bo.ProdSupplyAddsLog;
import com.ai.slp.route.dao.mapper.bo.ProdSupplyAddsLogCriteria;
import com.ai.slp.route.dao.mapper.bo.ProdSupplyCriteria;
import com.ai.slp.route.dao.mapper.bo.Route;
import com.ai.slp.route.dao.mapper.bo.RouteCriteria;
import com.ai.slp.route.dao.mapper.bo.RouteGroup;
import com.ai.slp.route.dao.mapper.bo.RouteGroupCriteria;
import com.ai.slp.route.dao.mapper.bo.RouteItem;
import com.ai.slp.route.dao.mapper.bo.RouteItemCriteria;
import com.ai.slp.route.dao.mapper.bo.RouteRule;
import com.ai.slp.route.dao.mapper.bo.RouteRuleCriteria;
import com.ai.slp.route.dao.mapper.interfaces.ProdSupplyAddsLogMapper;
import com.ai.slp.route.dao.mapper.interfaces.ProdSupplyMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteGroupMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteItemMapper;
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

    @Autowired
    private transient RouteGroupMapper routeGroupMapper;

    @Autowired
    private transient RouteItemMapper routeItemMapper;

    @Override
    public PageInfo<RouteQueryResult> routeQuery(RouteQueryVo vo) {
        RouteCriteria routeCriteria = new RouteCriteria();
        RouteCriteria.Criteria criteria = routeCriteria.createCriteria();

        if (!CollectionUtil.isEmpty(vo.getRouteIdList())) {
            criteria.andRouteIdIn(vo.getRouteIdList());
        }
        if (!StringUtil.isBlank(vo.getRouteName())) {
            criteria.andRouteNameLike(vo.getRouteName());
        }
        if (!StringUtil.isBlank(vo.getSellerName())) {
            long sellerId = 0;// 需要根据供应商名称查询得到供应商ID
            criteria.andSellerIdEqualTo(String.valueOf(sellerId));
        }
        if (!CollectionUtil.isEmpty(vo.getStateList())) {
            criteria.andStateIn(vo.getStateList());
        }
        PageInfo<RouteQueryResult> pageInfo = new PageInfo<RouteQueryResult>();
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
            List<RouteQueryResult> routeQueryResultList = new ArrayList<RouteQueryResult>();
            for (Route route : routeList) {
                RouteQueryResult routeQueryResult = new RouteQueryResult();
                BeanUtils.copyProperties(route, routeQueryResult);
                route.getSellerId();// 根据这个查询供应商名称
                String sellerName = "";
                routeQueryResult.setSellerName(sellerName);
                route.getContractCustId();// 根据合同客户ID查询出行业类型
                String cateGoryType = "";
                routeQueryResult.setCateGoryType(cateGoryType);
                routeQueryResultList.add(routeQueryResult);
            }
            pageInfo.setResult(routeQueryResultList);

        }
        return pageInfo;

    }

    @Override
    public RouteQueryResult routeDetailQuery(String routeId) {
        RouteQueryResult routeQueryResult = null;
        RouteCriteria routeCriteria = new RouteCriteria();
        RouteCriteria.Criteria criteria = routeCriteria.createCriteria();
        if (!StringUtil.isBlank(routeId)) {
            criteria.andRouteIdEqualTo(routeId);
        }
        List<Route> routeList = routeMapper.selectByExample(routeCriteria);
        if (!CollectionUtil.isEmpty(routeList)) {
            Route route = routeList.get(0);
            routeQueryResult = new RouteQueryResult();
            BeanUtils.copyProperties(route, routeQueryResult);
            route.getSellerId();// 根据这个查询供应商名称
            String sellerName = "";
            routeQueryResult.setSellerName(sellerName);
            route.getContractCustId();// 根据合同客户ID查询出行业类型
            String cateGoryType = "";
            routeQueryResult.setCateGoryType(cateGoryType);
        }
        return routeQueryResult;

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
        if (!StringUtil.isBlank(vo.getSupplyName())) {
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
                prodSupply.getStandedProdId();// 根据标准品查询属性信息
                proSupplyQueryResult.setProAttrDefList(null);
                proSupplyQueryResultList.add(proSupplyQueryResult);
            }
            pageInfo.setResult(proSupplyQueryResultList);

        }
        return pageInfo;
    }

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
            } else if ("A".equals(routeRule.getRouteRuleItem())) {
                routeRuleQueryResult.setAmount(routeRule.getWarningValue());
                routeRuleQueryResult.setAmountCycleValue(this.cycleValueCal(routeRule));
            }
        }
    }

    private String cycleValueCal(RouteRule routeRule) {
        String cycleValue = "";
        if ("S".equals(routeRule.getTimeType())) {
            cycleValue = routeRule.getCycleValue() + routeRule.getCycleUnit();
        } else {
            cycleValue = routeRule.getBeginDate() + "~" + routeRule.getEndDate();
        }
        return cycleValue;
    }

    @Override
    public RouteRuleQueryResult routeRuleDetailQuery(String routeId) {
        RouteRuleQueryResult routeRuleQueryResult = null;
        RouteCriteria routeCriteria = new RouteCriteria();
        RouteCriteria.Criteria criteria = routeCriteria.createCriteria();

        if (!StringUtil.isBlank(routeId)) {
            criteria.andRouteIdEqualTo(routeId);
        }
        List<Route> routeList = routeMapper.selectByExample(routeCriteria);
        if (!CollectionUtil.isEmpty(routeList)) {
            Route route = routeList.get(0);
            routeRuleQueryResult = new RouteRuleQueryResult();
            BeanUtils.copyProperties(route, routeRuleQueryResult);
            route.getSellerId();// 根据这个查询供应商名称
            String sellerName = "";
            routeRuleQueryResult.setSellerName(sellerName);
            route.getContractCustId();// 根据合同客户ID查询出行业类型
            String cateGoryType = "";
            routeRuleQueryResult.setCateGoryType(cateGoryType);
            this.routeRuleList(routeRuleQueryResult);

        }
        return routeRuleQueryResult;

    }

    @Override
    public PageInfo<RouteGroupQueryResult> routeGroupQuery(RouteGroupQueryVo vo) {

        RouteGroupCriteria routeGroupCriteria = new RouteGroupCriteria();
        RouteGroupCriteria.Criteria criteria = routeGroupCriteria.createCriteria();

        if (!StringUtil.isBlank(vo.getRouteGroupId())) {
            criteria.andRouteGroupIdEqualTo(vo.getRouteGroupId());
        }
        if (!StringUtil.isBlank(vo.getRouteGroupName())) {
            criteria.andRouteGroupNameEqualTo(vo.getRouteGroupName());
        }
        if (!CollectionUtil.isEmpty(vo.getStateList())) {
            criteria.andStateNotIn(vo.getStateList());
        }
        PageInfo<RouteGroupQueryResult> pageInfo = new PageInfo<RouteGroupQueryResult>();
        pageInfo.setCount(routeGroupMapper.countByExample(routeGroupCriteria));
        if (vo.getPageInfo() == null) {
            pageInfo.setPageNo(1);
            pageInfo.setPageSize(pageInfo.getCount() == 0 ? 10 : pageInfo.getCount());
        } else {
            routeGroupCriteria.setLimitStart(vo.getPageInfo().getStartRowIndex() - 1);
            routeGroupCriteria.setLimitEnd(vo.getPageInfo().getPageSize());
            pageInfo.setPageNo(vo.getPageInfo().getPageNo());
            pageInfo.setPageSize(vo.getPageInfo().getPageSize());
        }
        List<RouteGroup> routeGroupList = routeGroupMapper.selectByExample(routeGroupCriteria);
        if (!CollectionUtil.isEmpty(routeGroupList)) {
            List<RouteGroupQueryResult> routeGroupQueryResultList = new ArrayList<RouteGroupQueryResult>();
            for (RouteGroup routeGroup : routeGroupList) {
                RouteGroupQueryResult routeGroupQueryResult = new RouteGroupQueryResult();
                routeGroupQueryResult.setRouteGroupId(routeGroup.getRouteGroupId());
                routeGroupQueryResult.setRouteGroupName(routeGroup.getRouteGroupName());
                routeGroupQueryResult.setState(routeGroup.getState());
                int result = this.getRouteCount(routeGroup.getRouteGroupId());
                routeGroupQueryResult.setPriorityNum(result);
                List<RouteItemVo> routeItemVoList = this.getRouteList(vo.getRouteGroupId());
                routeGroupQueryResult.setRouteList(routeItemVoList);
                routeGroupQueryResultList.add(routeGroupQueryResult);
            }
            pageInfo.setResult(routeGroupQueryResultList);

        }
        return pageInfo;

    }

    private int getRouteCount(String routeGroupId) {
        RouteItemCriteria routeItemCriteria = new RouteItemCriteria();
        RouteItemCriteria.Criteria criteria = routeItemCriteria.createCriteria();
        if (!StringUtil.isBlank(routeGroupId)) {
            criteria.andRouteGroupIdEqualTo(routeGroupId);
        }
        criteria.andStateEqualTo("1");
        int result = routeItemMapper.countByExample(routeItemCriteria);
        // 优先级个数 ,需要写一个group by 按优先级,后面再写
        return result;

    }

    @Override
    public RouteGroupQueryResult routeGroupDetailQuery(String routeGroupId) {
        RouteGroupQueryResult routeGroupQueryResult = null;
        RouteGroupCriteria routeGroupCriteria = new RouteGroupCriteria();
        RouteGroupCriteria.Criteria criteria = routeGroupCriteria.createCriteria();

        if (!StringUtil.isBlank(routeGroupId)) {
            criteria.andRouteGroupIdEqualTo(routeGroupId);
        }
        List<RouteGroup> routeGroupList = routeGroupMapper.selectByExample(routeGroupCriteria);
        if (!CollectionUtil.isEmpty(routeGroupList)) {
            RouteGroup routeGroup = routeGroupList.get(0);
            routeGroupQueryResult = new RouteGroupQueryResult();
            routeGroupQueryResult.setRouteGroupId(routeGroup.getRouteGroupId());
            routeGroupQueryResult.setRouteGroupName(routeGroup.getRouteGroupName());
            routeGroupQueryResult.setState(routeGroup.getState());
            // 根据routeGroupId调用库存组服务,得到库存组和子库存组的信息
            routeGroupQueryResult.setStorageGroupId("");
            routeGroupQueryResult.setStorageGroupName("");
            routeGroupQueryResult.setStostorageList(null);
            List<RouteItemVo> routeItemVoList = this.getRouteList(routeGroupId);
            routeGroupQueryResult.setRouteList(routeItemVoList);
        }
        return routeGroupQueryResult;

    }

    private List<RouteItemVo> getRouteList(String routeGroupId) {
        RouteItemCriteria routeItemCriteria = new RouteItemCriteria();
        RouteItemCriteria.Criteria criteria = routeItemCriteria.createCriteria();
        if (!StringUtil.isBlank(routeGroupId)) {
            criteria.andRouteGroupIdEqualTo(routeGroupId);
        }
        criteria.andStateEqualTo("1");
        List<RouteItemVo> routeItemVoList = new ArrayList<RouteItemVo>();
        List<RouteItem> routeItemList = routeItemMapper.selectByExample(routeItemCriteria);
        if (!CollectionUtil.isEmpty(routeItemList)) {
            for (RouteItem routeItem : routeItemList) {
                RouteItemVo vo = new RouteItemVo();
                vo.setRouteId(routeItem.getRouteId());
                vo.setRouteName(this.getRouteName(routeItem.getRouteId()));
                vo.setPriorityNum(routeItem.getPriorityNumber());
                routeItemVoList.add(vo);
            }
        }
        return routeItemVoList;
    }

    private String getRouteName(String routeId) {
        String routeName = "";
        RouteCriteria routeCriteria = new RouteCriteria();
        RouteCriteria.Criteria criteria = routeCriteria.createCriteria();
        if (!StringUtil.isBlank(routeId)) {
            criteria.andRouteIdEqualTo(routeId);
        }
        List<Route> routeList = routeMapper.selectByExample(routeCriteria);
        if (!CollectionUtil.isEmpty(routeList)) {
            routeName = routeList.get(0).getRouteName();
        }
        return routeName;
    }

    @Override
    public RouteGroupProSupplyQueryResult routeGroupProSupplyQuery(List<String> routeIdList)
            throws BusinessException {
        RouteGroupProSupplyQueryResult result = new RouteGroupProSupplyQueryResult();
        List<RouteGroupProSupplyQueryVo> routeGroupProSupplyVoList = new ArrayList<RouteGroupProSupplyQueryVo>();
        if (!CollectionUtil.isEmpty(routeIdList)) {
            ProdSupplyCriteria prodSupplyCriteria = new ProdSupplyCriteria();
            ProdSupplyCriteria.Criteria criteria = prodSupplyCriteria.createCriteria();
            criteria.andRouteIdIn(routeIdList);
            criteria.andStateEqualTo("2");
            List<ProdSupply> prodSupplys = prodSupplyMapper.selectByExample(prodSupplyCriteria);
            for (ProdSupply prodSupply : prodSupplys) {
                RouteGroupProSupplyQueryVo vo = new RouteGroupProSupplyQueryVo();
                vo.setSupplyId(prodSupply.getSupplyId());
                vo.setSupplyName(prodSupply.getSupplyName());
                vo.setTotalNum(prodSupply.getTotalNum());
                vo.setUsableNum(prodSupply.getUsableNum());
                vo.setRouteId(prodSupply.getRouteId());
                vo.setRouteName(this.getRouteName(prodSupply.getRouteId()));
                routeGroupProSupplyVoList.add(vo);
            }
            result.setRouteGroupProSupplyVoList(routeGroupProSupplyVoList);
        }
        return result;
    }

}
