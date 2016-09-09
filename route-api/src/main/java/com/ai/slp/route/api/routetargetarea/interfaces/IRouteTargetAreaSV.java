package com.ai.slp.route.api.routetargetarea.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routetargetarea.param.AreaAddListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaAddListResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteAreaIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteAreaIdResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdResponse;
/**
 * 
 *
 * Date: 2016年9月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author zhangzd
 */
@Path("/RouteTargetArea")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IRouteTargetAreaSV {
	/**
	 * 根据编号查询配货区域
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteTargetArea-001
     * @RestRelativeURL RouteTargetArea/queryAreaListByRouteItemId
     */
	@POST
	@Path("/queryAreaListByRouteItemId")
	public AreaQueryByRouteItemIdResponse queryAreaListByRouteItemId(AreaQueryByRouteItemIdRequest request) throws BusinessException, SystemException;
	/**
	 * 通过routeItemId列表信息查询区域列表
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteTargetArea-002
     * @RestRelativeURL RouteTargetArea/queryAreaListByRouteItemIdList
     */
	@POST
	@Path("/queryAreaListByRouteItemIdList")
	public AreaQueryByRouteItemIdResponse queryAreaListByRouteItemIdList(AreaQueryByRouteItemIdListRequest request) throws BusinessException, SystemException;
	/**
	 * 批量分配区域信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteTargetArea-003
     * @RestRelativeURL RouteTargetArea/addTargetAreaToList
     */
	@POST
	@Path("/addTargetAreaToList")
	public AreaAddListResponse addTargetAreaToList(AreaAddListRequest request) throws BusinessException, SystemException;
	/**
	 * 通过routeItemId删除区域信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteTargetArea-004
     * @RestRelativeURL RouteTargetArea/deleteByRouteItemId
     */
	@POST
	@Path("/deleteByRouteItemId")
	public AreaDeleteResponse deleteByRouteItemId(AreaDeleteByRouteItemIdRequest request) throws BusinessException, SystemException;
	/**
	 * 通过区域主键删除区域信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteTargetArea-005
     * @RestRelativeURL RouteTargetArea/deleteByRouteAreaId
     */
	@POST
	@Path("/deleteByRouteAreaId")
	public AreaDeleteByRouteAreaIdResponse deleteByRouteAreaId(AreaDeleteByRouteAreaIdRequest request) throws BusinessException, SystemException;
}
