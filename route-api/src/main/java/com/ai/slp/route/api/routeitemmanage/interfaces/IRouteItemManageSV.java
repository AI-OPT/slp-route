package com.ai.slp.route.api.routeitemmanage.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdQueryRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemDeleteByRouteItemIdRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemDeleteByRouteItemIdResponse;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemListResponse;
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
	/**
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteItemManage-002
	 * @RestRelativeURL RouteManage/queryRouteItemList
     */
	@POST
	@Path("/queryRouteItemList")
	public RouteItemListResponse queryRouteItemList(RouteGroupIdQueryRequest request)throws BusinessException,SystemException;
	
	/**
	 * 根据routeItemId主键删除信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteItemManage-003
	 * @RestRelativeURL RouteManage/deleteByRouteItemId
     */
	@POST
	@Path("/deleteByRouteItemId")
	public RouteItemDeleteByRouteItemIdResponse deleteByRouteItemId(RouteItemDeleteByRouteItemIdRequest request)throws BusinessException,SystemException;
}
