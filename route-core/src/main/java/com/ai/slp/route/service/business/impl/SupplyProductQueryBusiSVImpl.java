package com.ai.slp.route.service.business.impl;

import com.ai.slp.route.api.supplyproduct.param.SupplyProduct;
import com.ai.slp.route.api.supplyproduct.param.SupplyProductQueryVo;
import com.ai.slp.route.service.business.interfaces.ISupplyProductQueryBusiSV;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class SupplyProductQueryBusiSVImpl implements ISupplyProductQueryBusiSV {

    @Override
    public SupplyProduct updateSaleCount(SupplyProductQueryVo supplyProductQueryVo) {

    }
}
