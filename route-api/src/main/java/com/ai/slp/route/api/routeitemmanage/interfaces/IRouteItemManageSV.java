package com.ai.slp.route.api.routeitemmanage.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemPageSearchResponse;
/**
 * 
 *
 * Date: 2016年8月24日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author zhangzd
 */
@Path("/RouteItemManage")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IRouteItemManageSV {
	/**
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteItemManage-001
	 * @RestRelativeURL RouteManage/queryPageInfo
     */
	@POST
	@Path("/queryPageInfo")
	public RouteItemPageSearchResponse queryPageInfo(RouteGroupIdRequest request)throws BusinessException,SystemException;
}
