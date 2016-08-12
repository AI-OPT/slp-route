package com.ai.slp.route.api.routemanage.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routemanage.param.RouteAddParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteAddParamResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchRequest;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchResponse;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamResponse;
/**
 * 
 *
 * Date: 2016年8月5日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author zhangzd
 */
@Path("/RouteManage")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IRouteManageSV {
	/**
	 * 添加仓库信息
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteManage-001
     * @RestRelativeURL RouteManage/addRoute
     */
	@POST
	@Path("/addRoute")
	public RouteAddParamResponse addRoute(RouteAddParamRequest request)throws BusinessException,SystemException;
	/**
	 * 分页查询仓库信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteManage-002
     * @RestRelativeURL RouteManage/queryPageSearch
     */
	@POST
	@Path("/queryPageSearch")
	public RoutePageSearchResponse queryPageSearch(RoutePageSearchRequest request)throws BusinessException,SystemException;
	/**
	 * 修改仓库信息
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteManage-003
     * @RestRelativeURL RouteManage/updateRoute
     */
	@POST
	@Path("/updateRoute")
	public RouteUpdateParamResponse updateRoute(RouteUpdateParamRequest request)throws BusinessException,SystemException;
	
}
