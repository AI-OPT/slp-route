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
import com.ai.slp.route.api.routemanage.param.RouteIdParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteListRequest;
import com.ai.slp.route.api.routemanage.param.RouteListResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchRequest;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchResponse;
import com.ai.slp.route.api.routemanage.param.RouteQueryByGroupIdAndAreaRequest;
import com.ai.slp.route.api.routemanage.param.RouteQueryByGroupIdAndAreaResponse;
import com.ai.slp.route.api.routemanage.param.RouteResponse;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamResponse;
import com.ai.slp.route.api.routemanage.param.RouteUpdateStateRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateStateResponse;
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
	/**
	 * 修改路由状态
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteManage-004
     * @RestRelativeURL RouteManage/updateRouteState
     */
	@POST
	@Path("/updateRouteState")
	public RouteUpdateStateResponse updateRouteState(RouteUpdateStateRequest request)throws BusinessException,SystemException;
	/**
	 * 根据路由id查询路由信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteManage-005
     * @RestRelativeURL RouteManage/findRouteInfo
     */
	@POST
	@Path("/findRouteInfo")
	public RouteResponse findRouteInfo(RouteIdParamRequest request)throws BusinessException,SystemException;
	/**
	 * 
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteManage-006
     * @RestRelativeURL RouteManage/queryRouteList
     */
	@POST
	@Path("/queryRouteList")
	public RouteListResponse queryRouteList(RouteListRequest request)throws BusinessException,SystemException;

	/**
	 * 根据路由组编号和地区编码查询当前仓库的单条信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteManage-007
     * @RestRelativeURL RouteManage/queryRouteInfoByGroupIdAndArea
     */
	@POST
	@Path("/queryRouteInfoByGroupIdAndArea")
	public RouteQueryByGroupIdAndAreaResponse queryRouteInfoByGroupIdAndArea(RouteQueryByGroupIdAndAreaRequest request)throws BusinessException,SystemException;
}
