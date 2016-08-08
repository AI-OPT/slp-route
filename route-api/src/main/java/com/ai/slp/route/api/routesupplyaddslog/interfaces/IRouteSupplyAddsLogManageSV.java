package com.ai.slp.route.api.routesupplyaddslog.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routesupplyaddslog.param.RouteSupplyAddsLogPageSearchRequest;
import com.ai.slp.route.api.routesupplyaddslog.param.RouteSupplyAddsLogPageSearchResponse;
/**
 * 仓储量更改记录接口
 *
 * Date: 2016年8月8日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author zhangzd
 */
@Path("/RouteSupplyAddsLogManage")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IRouteSupplyAddsLogManageSV {
	/**
	 * 仓储量查询
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteSupplyAddsLogManage-001
     * @RestRelativeURL RouteSupplyAddsLogManage/queryPageSearch
     */
	@POST
	@Path("/queryPageSearch")
	public RouteSupplyAddsLogPageSearchResponse queryPageSearch(RouteSupplyAddsLogPageSearchRequest request)throws BusinessException,SystemException;
}
