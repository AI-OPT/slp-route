package com.ai.slp.route.api.supplyproduct.impl;

import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.route.api.supplyproduct.interfaces.ISupplyProductServiceSV;
import com.ai.slp.route.api.supplyproduct.param.SupplyProduct;
import com.ai.slp.route.api.supplyproduct.param.SupplyProductQueryVo;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.service.business.interfaces.ISupplyProductQueryBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Service
@Component
public class SupplyProductServiceSVImpl implements ISupplyProductServiceSV {

    @Autowired
    private ISupplyProductQueryBusiSV supplyProductQueryBusiSV;

    @Override
    public SupplyProduct updateSupplyProductSaleCount(SupplyProductQueryVo supplyProductQueryVo) {
        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        //检查入参完整
        if (StringUtil.isBlank(supplyProductQueryVo.getTenantId()) ||
                StringUtil.isBlank(supplyProductQueryVo.getRouteId()) ||
                StringUtil.isBlank(supplyProductQueryVo.getStandardProductId())) {
            SupplyProduct supplyProduct = new SupplyProduct();
            responseHeader = new ResponseHeader(false, ExceptCodeConstant.PARAM_IS_NULL, "失败");
            supplyProduct.setResponseHeader(responseHeader);
            return supplyProduct;
        }

        SupplyProduct supplyProduct = supplyProductQueryBusiSV.updateSaleCount(supplyProductQueryVo);
        supplyProduct.setResponseHeader(responseHeader);

        return supplyProduct;
    }
}
