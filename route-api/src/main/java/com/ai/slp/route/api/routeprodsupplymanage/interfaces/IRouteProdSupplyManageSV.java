package com.ai.slp.route.api.routeprodsupplymanage.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * 
 *
 * Date: 2016年8月5日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author zhangzd
 */

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumResponse;
@Path("/RouteProdSupplyManage")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IRouteProdSupplyManageSV {
	/**
	 * 仓库中商品列表 分页查询
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-001
     * @RestRelativeURL RouteProdSupplyManage/queryPageSearch
     */
	@POST
	@Path("/queryPageSearch")
	public RouteProdSupplyPageSearchResponse queryPageSearch(RouteProdSupplyPageSearchRequest request)throws BusinessException,SystemException;
	/**
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-002
     * @RestRelativeURL RouteProdSupplyManage/updateUsableNum
     */
	@POST
	@Path("/updateUsableNum")
	public RouteProdSupplyUpdateUsableNumResponse updateUsableNum(RouteProdSupplyUpdateUsableNumRequest request)throws BusinessException,SystemException;
}
