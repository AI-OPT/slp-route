package com.ai.slp.route.api.routequery.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.api.routequery.param.ProSupplyLogQueryVo;
import com.ai.slp.route.api.routequery.param.ProSupplyLogResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryVo;
import com.ai.slp.route.api.routequery.param.RouteGroupProSupplyQueryResult;
import com.ai.slp.route.api.routequery.param.RouteGroupQueryResult;
import com.ai.slp.route.api.routequery.param.RouteGroupQueryVo;
import com.ai.slp.route.api.routequery.param.RouteQueryResult;
import com.ai.slp.route.api.routequery.param.RouteQueryVo;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryResult;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryVo;

/**
 * 路由查询<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
@Path("/RouteQuery")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IRouteQuerySV {
    /**
     * 路由信息查询
     * 
     * @param vo
     *            路由基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteQuery-001
     * @RestRelativeURL RouteQuery/routeQuery
     */
	@POST
	@Path("/routeQuery")
    public PageInfo<RouteQueryResult> routeQuery(RouteQueryVo vo) throws BusinessException,
            SystemException;


    /**
     * 路由详情查询
     * 
     * @param vo
     *            路由基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteQuery-002
     * @RestRelativeURL RouteQuery/routeDetailQuery
     */
	@POST
	@Path("/routeDetailQuery")
    public RouteQueryResult routeDetailQuery(String routeId) throws BusinessException,
            SystemException;


    /**
     * 路由下商品查询
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteQuery-003
     * @RestRelativeURL RouteQuery/routeProSupplyQuery
     */
	@POST
	@Path("/routeProSupplyQuery")
    public PageInfo<ProSupplyQueryResult> routeProSupplyQuery(ProSupplyQueryVo vo)
            throws BusinessException, SystemException;


    /**
     * 查询供货记录
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteQuery-004
     * @RestRelativeURL RouteQuery/proSupplyLogQuery
     */
	@POST
	@Path("/proSupplyLogQuery")
    public ProSupplyLogResult proSupplyLogQuery(ProSupplyLogQueryVo vo) throws BusinessException,
            SystemException;


    /**
     * 路由规则查询
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteQuery-005
     * @RestRelativeURL RouteQuery/routeRuleQuery
     */
	@POST
	@Path("/routeRuleQuery")
    public PageInfo<RouteRuleQueryResult> routeRuleQuery(RouteRuleQueryVo vo)
            throws BusinessException, SystemException;


    /**
     * 路由规则详情查询
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteQuery-006
     * @RestRelativeURL RouteQuery/routeRuleDetailQuery
     */
	@POST
	@Path("/routeRuleDetailQuery")
    public RouteRuleQueryResult routeRuleDetailQuery(String routeId) throws BusinessException,
            SystemException;


    /**
     * 路由组查询
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteQuery-007
     * @RestRelativeURL RouteQuery/routeGroupQuery
     */
	@POST
	@Path("/routeGroupQuery")
    public PageInfo<RouteGroupQueryResult> routeGroupQuery(RouteGroupQueryVo vo)
            throws BusinessException, SystemException;


    /**
     * 路由组详情查询
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteQuery-008
     * @RestRelativeURL RouteQuery/routeGroupDetailQuery
     */
	@POST
	@Path("/routeGroupDetailQuery")
    public RouteGroupQueryResult routeGroupDetailQuery(String routeGroupId)
            throws BusinessException, SystemException;


    /**
     * 路由组下商品查询
     * 
     * @param routeGroupId
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteQuery-009
     * @RestRelativeURL RouteQuery/routeGroupProSupplyQuery
     */
	@POST
	@Path("/routeGroupProSupplyQuery")
    public RouteGroupProSupplyQueryResult routeGroupProSupplyQuery(List<String> routeIdList)
            throws BusinessException, SystemException;

   
}
