package com.ai.slp.route.service.business.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.route.api.routeconfig.param.ProSupplyMaintainVo;
import com.ai.slp.route.api.routeconfig.param.ProSupplyVo;
import com.ai.slp.route.api.routeconfig.param.RouteCreateVo;
import com.ai.slp.route.api.routeconfig.param.RouteGroupMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteItemMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteItemVo;
import com.ai.slp.route.api.routeconfig.param.RouteModifyVo;
import com.ai.slp.route.api.routeconfig.param.RouteProSupplyAddVo;
import com.ai.slp.route.api.routeconfig.param.RouteRuleItemVo;
import com.ai.slp.route.api.routeconfig.param.RouteRuleMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteStateChgVo;
import com.ai.slp.route.dao.mapper.bo.ProdSupply;
import com.ai.slp.route.dao.mapper.bo.ProdSupplyAddsLog;
import com.ai.slp.route.dao.mapper.bo.Route;
import com.ai.slp.route.dao.mapper.bo.RouteGroup;
import com.ai.slp.route.dao.mapper.bo.RouteItem;
import com.ai.slp.route.dao.mapper.bo.RouteItemCriteria;
import com.ai.slp.route.dao.mapper.bo.RouteRule;
import com.ai.slp.route.dao.mapper.interfaces.ProdSupplyMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteGroupMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteItemMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteRuleMapper;
import com.ai.slp.route.service.business.interfaces.IRouteConfigBusiSV;

@Component
@Transactional
public class RouteConfigBusiSVImpl implements IRouteConfigBusiSV {
    @Autowired
    private transient RouteMapper routeMapper;

    @Autowired
    private transient ProdSupplyMapper prodSupplyMapper;

    @Autowired
    private transient RouteRuleMapper routeRuleMapper;

    @Autowired
    private transient RouteGroupMapper routeGroupMapper;

    @Autowired
    private transient RouteItemMapper routeItemMapper;

    @Override
    public void routeCreate(RouteCreateVo vo) {
        // 保存路由主表
        Timestamp sysdate = DateUtil.getSysDate();
        long operId = vo.getOperId();
        String routeId = "";
        Route route = new Route();
        BeanUtils.copyVO(route, vo);
        route.setTenantId("");
        route.setRouteId(routeId);
        // String userLoginName = vo.getUserLoginName();根据这个得到userId
        long userId = 0;
        route.setSellerId(String.valueOf(userId));
        // String contractCode = vo.getContractCode();根据供货商得到合同编号,得到合同客户ID和合同ID
        String contractId = "";
        String contractCustId = "";
        route.setContractId(contractId);
        route.setContractCustId(contractCustId);
        route.setState("1");
        route.setCreateId(operId);
        route.setCreateTime(sysdate);
        route.setOperId(operId);
        route.setOperTime(sysdate);
        routeMapper.insert(route);

    }

    @Override
    public void routeModify(RouteModifyVo vo) {
        // 保存路由主表
        Timestamp sysdate = DateUtil.getSysDate();
        long operId = vo.getOperId();
        Route route = new Route();
        BeanUtils.copyVO(route, vo);
        // String userLoginName = vo.getUserLoginName();根据这个得到userId
        long userId = 0;
        route.setSellerId(String.valueOf(userId));
        // String contractCode = vo.getContractCode();根据供货商得到合同编号,得到合同客户ID和合同ID
        String contractId = "";
        String contractCustId = "";
        route.setContractId(contractId);
        route.setContractCustId(contractCustId);
        route.setOperId(operId);
        route.setOperTime(sysdate);
        routeMapper.updateByPrimaryKey(route);
    }

    @Override
    public void routeProSupplyAdd(RouteProSupplyAddVo vo) {

        Timestamp sysdate = DateUtil.getSysDate();
        long operId = vo.getOperId();
        String routeId = vo.getRouteId();
        // String userId="根据routeId去路由表查到对应的userId"
        // 保存供应商品表
        List<ProSupplyVo> proSupplyList = vo.getProSupplyList();
        for (ProSupplyVo proSupplyVo : proSupplyList) {
            String supplyId = "";
            ProdSupply prodSupply = new ProdSupply();
            prodSupply.setSupplyId(supplyId);
            prodSupply.setSupplyName(proSupplyVo.getStandedProductName());
            prodSupply.setRouteId(routeId);
            // prodSupply.setSellerId(userId);
            prodSupply.setProductCatId(proSupplyVo.getProductCatId());
            prodSupply.setStandedProdId(proSupplyVo.getStandedProdId());
            prodSupply.setTotalNum(proSupplyVo.getTotalNum());
            prodSupply.setUsableNum(proSupplyVo.getTotalNum());
            prodSupply.setUsedNum(0l);
            prodSupply.setState("1");
            prodSupply.setOperId(operId);
            prodSupply.setOperTime(sysdate);
            prodSupplyMapper.insert(prodSupply);
        }

    }

    @Override
    public void routeStateChg(RouteStateChgVo vo) {
        Timestamp sysdate = DateUtil.getSysDate();
        long operId = vo.getOperId();
        String routeId = vo.getRouteId();
        Route route = new Route();
        route.setRouteId(routeId);
        route.setState(vo.getState());
        route.setOperId(operId);
        route.setOperTime(sysdate);
        routeMapper.updateByPrimaryKey(route);
    }

    @Override
    public void proSupplyMaintain(ProSupplyMaintainVo vo) {
        // 增加供货量
        if ("A".equals(vo.getChgFlag())) {
            Timestamp sysdate = DateUtil.getSysDate();
            long operId = vo.getOperId();
            String supplyId = vo.getSupplyId();
            // 根据supplyId查询出 prodSupply;
            ProdSupply prodSupply = new ProdSupply();// 这个是查出来的
            prodSupply.setSupplyId(supplyId);
            prodSupply.setTotalNum(prodSupply.getTotalNum() + vo.getSupplyNum());
            prodSupply.setUsableNum(prodSupply.getUsableNum() + vo.getSupplyNum());
            prodSupply.setOperId(operId);
            prodSupply.setOperTime(sysdate);
            prodSupplyMapper.updateByPrimaryKey(prodSupply);
            // 记录供应量添加日志
            ProdSupplyAddsLog prodSupplyAddsLog = new ProdSupplyAddsLog();
            prodSupplyAddsLog.setSupplyAddsLogId("");
            prodSupplyAddsLog.setSupplyId(supplyId);
            prodSupplyAddsLog.setSupplyName(prodSupply.getSupplyName());
            prodSupplyAddsLog.setBeforeUsableNum(prodSupply.getUsableNum());
            prodSupplyAddsLog.setSupplyNum(vo.getSupplyNum());
            prodSupplyAddsLog.setSource("");
            prodSupplyAddsLog.setOperId(vo.getOperId());
            prodSupplyAddsLog.setOperTime(sysdate);
            // 供货商品删除
        } else if ("D".equals(vo.getChgFlag())) {
            Timestamp sysdate = DateUtil.getSysDate();
            long operId = vo.getOperId();
            ProdSupply prodSupply = new ProdSupply();
            prodSupply.setSupplyId(vo.getSupplyId());
            prodSupply.setState("0");
            prodSupply.setOperId(operId);
            prodSupply.setOperTime(sysdate);
            prodSupplyMapper.updateByPrimaryKey(prodSupply);
        }
    }

    @Override
    public void routeRuleMaintain(RouteRuleMaintainVo vo) {
        // 增加路由规则
        if ("A".equals(vo.getChgFlag())) {
            Timestamp sysdate = DateUtil.getSysDate();
            String routeId = vo.getRouteId();
            long operId = vo.getOperId();
            List<RouteRuleItemVo> proSupplyList = vo.getProSupplyList();
            for (RouteRuleItemVo routeRuleItemVo : proSupplyList) {
                String routeRuleId = "";// 取序列
                RouteRule routeRule = new RouteRule();
                routeRule.setRouteRuleId(routeRuleId);
                routeRule.setRouteId(routeId);
                routeRule.setRouteRuleType(routeRuleItemVo.getRouteRuleType());
                routeRule.setRouteRuleItem(routeRuleItemVo.getRouteRuleItem());
                routeRule.setWarningValue(routeRuleItemVo.getWarningValue());
                if ("S".equals(routeRuleItemVo.getTimeType())) {
                    routeRule.setCycleValue(routeRuleItemVo.getCycleValue());
                    routeRule.setCycleUnit(routeRuleItemVo.getCycleUnit());
                } else if ("U".equals(routeRuleItemVo.getTimeType())) {
                    routeRule.setBeginDate(DateUtil.getTimestamp(routeRuleItemVo.getBeginDate()));
                    routeRule.setEndDate(DateUtil.getTimestamp(routeRuleItemVo.getEndDate()));
                }
                routeRule.setState("1");
                routeRule.setOperId(operId);
                routeRule.setOperTime(sysdate);
                routeRuleMapper.insertSelective(routeRule);
            }
            // 修改路由规则
        } else if ("M".equals(vo.getChgFlag())) {
            Timestamp sysdate = DateUtil.getSysDate();
            String routeId = vo.getRouteId();
            long operId = vo.getOperId();
            List<RouteRuleItemVo> proSupplyList = vo.getProSupplyList();
            for (RouteRuleItemVo routeRuleItemVo : proSupplyList) {
                String routeRuleId = "";// 取序列
                RouteRule routeRule = new RouteRule();
                routeRule.setRouteRuleId(routeRuleId);
                routeRule.setRouteId(routeId);
                routeRule.setRouteRuleType(routeRuleItemVo.getRouteRuleType());
                routeRule.setRouteRuleItem(routeRuleItemVo.getRouteRuleItem());
                routeRule.setWarningValue(routeRuleItemVo.getWarningValue());
                if ("S".equals(routeRuleItemVo.getTimeType())) {
                    routeRule.setCycleValue(routeRuleItemVo.getCycleValue());
                    routeRule.setCycleUnit(routeRuleItemVo.getCycleUnit());
                } else if ("U".equals(routeRuleItemVo.getTimeType())) {
                    routeRule.setBeginDate(DateUtil.getTimestamp(routeRuleItemVo.getBeginDate()));
                    routeRule.setEndDate(DateUtil.getTimestamp(routeRuleItemVo.getEndDate()));
                }
                routeRule.setState("1");
                routeRule.setOperId(operId);
                routeRule.setOperTime(sysdate);
                routeRuleMapper.insertSelective(routeRule);
            }

        }
    }

    @Override
    public void routeGroupMaintain(RouteGroupMaintainVo vo) {
        // 增加路由组
        if ("A".equals(vo.getChgFlag())) {
            Timestamp sysdate = DateUtil.getSysDate();
            String routeGroupId = "";
            long operId = vo.getOperId();
            RouteGroup routeGroup = new RouteGroup();
            routeGroup.setRouteGroupId(routeGroupId);
            routeGroup.setRouteGroupName(vo.getRouteGroupName());
            routeGroup.setState("1");
            routeGroup.setOperId(vo.getOperId());
            routeGroup.setOperTime(sysdate);
            routeGroupMapper.insert(routeGroup);
            // 增加路由组组成
            List<RouteItemVo> routeItemVoList = vo.getRouteItemVoList();
            for (RouteItemVo routeItemVo : routeItemVoList) {
                RouteItem routeItem = new RouteItem();
                String routeItemId = "";
                routeItem.setRouteItemId(routeItemId);
                routeItem.setRouteId(routeItemVo.getRouteId());
                // routeItem.setRouteGroupId(routeGroupId);
                routeItem.setPriorityNumber((short) routeItemVo.getPriorityNum());
                routeItem.setSerialNumber((short) 0);
                routeItem.setState("1");
                routeItem.setOperId(operId);
                routeItem.setOperTime(sysdate);
                routeItemMapper.insertSelective(routeItem);
            }
        } else if ("S".equals(vo.getChgFlag())) {
            Timestamp sysdate = DateUtil.getSysDate();
            long operId = vo.getOperId();
            RouteGroup routeGroup = new RouteGroup();
            routeGroup.setRouteGroupId(vo.getRouteGroupId());
            routeGroup.setState(vo.getState());
            routeGroup.setOperId(operId);
            routeGroup.setOperTime(sysdate);
            routeGroupMapper.updateByPrimaryKeySelective(routeGroup);
        }

    }

    @Override
    public void routeItemMaintain(RouteItemMaintainVo vo) {
        Timestamp sysdate = DateUtil.getSysDate();
        long operId = vo.getOperId();
        RouteItemCriteria routeItemCriteria = new RouteItemCriteria();
        RouteItemCriteria.Criteria criteria = routeItemCriteria.createCriteria();
        // if (!StringUtil.isBlank(vo.getRouteGroupId())) {
        // criteria.andRouteGroupIdEqualTo(vo.getRouteGroupId());
        // }
        if (!StringUtil.isBlank(vo.getRouteId())) {
            criteria.andRouteIdEqualTo(vo.getRouteId());
        }
        criteria.andStateEqualTo("1");
        List<RouteItem> routeItems = routeItemMapper.selectByExample(routeItemCriteria);
        if (!CollectionUtil.isEmpty(routeItems)) {
            RouteItem routeItem = routeItems.get(0);
            routeItem.setState(vo.getState());
            routeItem.setOperId(operId);
            routeItem.setOperTime(sysdate);
            routeItemMapper.updateByPrimaryKey(routeItem);
        }
    }

}
