package com.ai.slp.route.service.business.impl;

import com.ai.opt.base.exception.BusinessException;
import com.ai.slp.route.api.supplyproduct.param.SupplyProduct;
import com.ai.slp.route.api.supplyproduct.param.SupplyProductQueryVo;
import com.ai.slp.route.constants.CommonSatesConstants;
import com.ai.slp.route.dao.mapper.bo.RouteProdSupply;
import com.ai.slp.route.dao.mapper.bo.RouteProdSupplyCriteria;
import com.ai.slp.route.dao.mapper.interfaces.RouteProdSupplyMapper;
import com.ai.slp.route.service.business.interfaces.ISupplyProductQueryBusiSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class SupplyProductQueryBusiSVImpl implements ISupplyProductQueryBusiSV {

    @Autowired
    private RouteProdSupplyMapper routeProdSupplyMapper;

    @Override
    public SupplyProduct updateSaleCount(SupplyProductQueryVo supplyProductQueryVo) {
        // 查询
        RouteProdSupplyCriteria criteria = new RouteProdSupplyCriteria();
        criteria.createCriteria().andTenantIdEqualTo(supplyProductQueryVo.getTenantId())
                .andRouteIdEqualTo(supplyProductQueryVo.getRouteId())
                .andStandedProdIdEqualTo(supplyProductQueryVo.getStandardProductId())
                .andStateEqualTo(CommonSatesConstants.STATE_ACTIVE);
        List<RouteProdSupply> routeProdSupplies = routeProdSupplyMapper.selectByExample(criteria);
        if (routeProdSupplies == null || routeProdSupplies.size() != 1) {
            throw new BusinessException("999999", "TenantId : " + supplyProductQueryVo.getTenantId()
                    + " RouteId: " + supplyProductQueryVo.getRouteId()
                    + " StandProductId : " + supplyProductQueryVo.getStandardProductId()
                    + " 不能找到相关的供应商, 查询供应商结果：" +  (routeProdSupplies != null ?  routeProdSupplies.size(): 0));
        }
        // 更新
        RouteProdSupply routeProdSupply = routeProdSupplies.get(0);
        // 任娟说的
        routeProdSupply.setUsableNum(routeProdSupply.getUsableNum() - supplyProductQueryVo.getSaleCount());
        routeProdSupply.setUsedNum(routeProdSupply.getUsedNum() + supplyProductQueryVo.getSaleCount());

        routeProdSupplyMapper.updateByExampleSelective(routeProdSupply, criteria);
        //返回

        SupplyProduct supplyProduct = new SupplyProduct(routeProdSupply.getSellerId(),
                routeProdSupply.getSupplyId(), routeProdSupply.getCostPrice());
        return supplyProduct;
    }
}
