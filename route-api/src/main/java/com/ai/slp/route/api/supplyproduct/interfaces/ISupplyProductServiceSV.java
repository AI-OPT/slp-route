package com.ai.slp.route.api.supplyproduct.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.supplyproduct.param.SupplyProduct;
import com.ai.slp.route.api.supplyproduct.param.SupplyProductQueryVo;

/**
 * 供应品查询<br>
 * Date: 2016年5月30日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 *
 * @author zhangxin10
 */
public interface ISupplyProductServiceSV {
    /**
     * 供应品查询
     *
     * @param supplyProductQueryVo
     *            查询条件
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxin10
     * @ApiCode ROUTE_SUPPLY_PRODUCT_001
     */
    SupplyProduct updateSupplyProductSaleCount(SupplyProductQueryVo supplyProductQueryVo);

}
