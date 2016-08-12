package com.ai.slp.route.api.server.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.route.api.server.params.IRouteServerRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 路由服务的Dubbo服务<br>
 * <p>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 *
 * @author zhangxin10
 */
@Path("/RouteServer")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IRouteServer {
    /**
     * 通过路由ID调用路由服务. <br>
     *
     * @param request 路由服务请求参数
     * @return 路由服务返回结果
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxin10
     * @ApiDocMethod
     * @ApiCode RouteServer-001
     * @RestRelativeURL RouteServer/callServerByRouteId
     */
	@POST
	@Path("/callServerByRouteId")
    BaseResponse callServerByRouteId(IRouteServerRequest request);

    /**
     * 通过服务ID调用路由服务. <br>
     *
     * @param request 路由服务请求参数
     * @return 路由服务返回结果
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxin10
     * @ApiDocMethod
     * @ApiCode RouteServer-002
     * @RestRelativeURL RouteServer/callServerByServerId
     */
	@POST
	@Path("/callServerByServerId")
    BaseResponse callServerByServerId(IRouteServerRequest request);
}
