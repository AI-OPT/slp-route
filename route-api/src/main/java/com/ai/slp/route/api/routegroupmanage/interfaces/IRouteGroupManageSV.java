package com.ai.slp.route.api.routegroupmanage.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupAddRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupAddResponse;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchResponse;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupStateRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupStateResponse;

@Path("/RouteGroupManage")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IRouteGroupManageSV {
	/**
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteGroupManage-001
     * @RestRelativeURL RouteGroupManage/queryPageSearch
     */
	@POST
	@Path("/queryPageSearch")
	public RouteGroupPageSearchResponse queryPageSearch(RouteGroupPageSearchRequest request) throws BusinessException,SystemException;
	/**
	 * 配货组创建
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteGroupManage-002
     * @RestRelativeURL RouteGroupManage/insertRouteGroup
     */
	@POST
	@Path("/insertRouteGroup")
	public RouteGroupAddResponse insertRouteGroup(RouteGroupAddRequest request) throws BusinessException,SystemException;
	/**
	 * 查询配货组状态
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteGroupManage-003
     * @RestRelativeURL RouteGroupManage/findRouteGroupState
     */
	@POST
	@Path("/findRouteGroupState")
	public RouteGroupStateResponse findRouteGroupState(RouteGroupStateRequest request) throws BusinessException,SystemException;
	
}
