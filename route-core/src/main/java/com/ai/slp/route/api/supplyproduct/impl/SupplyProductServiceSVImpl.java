package com.ai.slp.route.api.supplyproduct.impl;

import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.route.api.supplyproduct.interfaces.ISupplyProductServiceSV;
import com.ai.slp.route.api.supplyproduct.param.SupplyProduct;
import com.ai.slp.route.api.supplyproduct.param.SupplyProductQueryVo;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.service.business.interfaces.ISupplyProductQueryBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class SupplyProductServiceSVImpl implements ISupplyProductServiceSV {

    @Autowired
    private ISupplyProductQueryBusiSV supplyProductQueryBusiSV;

    @Override
    public SupplyProduct updateSupplyProductSaleCount(SupplyProductQueryVo supplyProductQueryVo) {
        SupplyProduct supplyProduct = supplyProductQueryBusiSV.updateSaleCount(supplyProductQueryVo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        supplyProduct.setResponseHeader(responseHeader);
        return supplyProduct;
    }
}
