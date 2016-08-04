package com.ai.slp.route.api.supplyproduct.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
@Path("/SupplyProductService")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
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
     * @ApiDocMethod
     * @ApiCode SupplyProductService-001
     * @RestRelativeURL SupplyProductService/updateSupplyProductSaleCount
     */
	@POST
	@Path("/updateSupplyProductSaleCount")
    SupplyProduct updateSupplyProductSaleCount(SupplyProductQueryVo supplyProductQueryVo);

}
