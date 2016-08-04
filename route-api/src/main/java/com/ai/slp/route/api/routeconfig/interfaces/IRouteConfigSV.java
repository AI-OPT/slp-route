package com.ai.slp.route.api.routeconfig.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routeconfig.param.ProSupplyMaintainResult;
import com.ai.slp.route.api.routeconfig.param.ProSupplyMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteCreateResult;
import com.ai.slp.route.api.routeconfig.param.RouteCreateVo;
import com.ai.slp.route.api.routeconfig.param.RouteGroupMaintainResult;
import com.ai.slp.route.api.routeconfig.param.RouteGroupMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteItemMaintainResult;
import com.ai.slp.route.api.routeconfig.param.RouteItemMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteModifyResult;
import com.ai.slp.route.api.routeconfig.param.RouteModifyVo;
import com.ai.slp.route.api.routeconfig.param.RouteProSupplyAddResult;
import com.ai.slp.route.api.routeconfig.param.RouteProSupplyAddVo;
import com.ai.slp.route.api.routeconfig.param.RouteRuleMaintainResult;
import com.ai.slp.route.api.routeconfig.param.RouteRuleMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteStateChgResult;
import com.ai.slp.route.api.routeconfig.param.RouteStateChgVo;

/**
 * 路由配置<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
@Path("/RouteConfig")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IRouteConfigSV {
    /**
     * 路由新增
     * 
     * @param vo
     *            路由基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteConfig-001
     * @RestRelativeURL RouteConfig/routeCreate
     */
	@POST
	@Path("/routeCreate")
    public RouteCreateResult routeCreate(RouteCreateVo vo) throws BusinessException,
            SystemException;
    /**
     * 路由修改
     * 
     * @param vo
     *            路由基本信息和标准品信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteConfig-002
     * @RestRelativeURL RouteConfig/routeModify
     */
	@POST
	@Path("/routeModify")
    public RouteModifyResult routeModify(RouteModifyVo vo) throws BusinessException,
            SystemException;

    /**
     * 路由商品明细添加
     * 
     * @param vo
     *            路由基本信息和标准品信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteConfig-003
     * @RestRelativeURL RouteConfig/routeProSupplyAdd
     */
	@POST
	@Path("/routeProSupplyAdd")
    public RouteProSupplyAddResult routeProSupplyAdd(RouteProSupplyAddVo vo)
            throws BusinessException, SystemException;


    /**
     * 路由状态修改
     * 
     * @param vo
     *            路由基本信息和标准品信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteConfig-004
     * @RestRelativeURL RouteConfig/routeStateChg
     */
	@POST
	@Path("/routeStateChg")
    public RouteStateChgResult routeStateChg(RouteStateChgVo vo) throws BusinessException,
            SystemException;


    /**
     * 供应商品 增加供货量 、删除
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteConfig-005
     * @RestRelativeURL RouteConfig/proSupplyMaintain
     */
	@POST
	@Path("/proSupplyMaintain")
    public ProSupplyMaintainResult proSupplyMaintain(ProSupplyMaintainVo vo)
            throws BusinessException, SystemException;


    /**
     * 路由规则新增 、修改 、状态变更
     * 
     * @param vo
     *            路由规则项及阈值
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiCode RouteConfig-006
     * @RestRelativeURL RouteConfig/routeRuleMaintain
     */
	@POST
	@Path("/routeRuleMaintain")
    public RouteRuleMaintainResult routeRuleMaintain(RouteRuleMaintainVo vo)
            throws BusinessException, SystemException;

    

    /**
     * 路由组新增、修改、状态修改、路由修改
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteConfig-007
     * @RestRelativeURL RouteConfig/routeGroupMaintain
     */
	@POST
	@Path("/routeGroupMaintain")
    public RouteGroupMaintainResult routeGroupMaintain(RouteGroupMaintainVo vo)
            throws BusinessException, SystemException;


    /**
     * 路由组组成状态更改,对路由组中的路由进行启动和暂停
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode RouteConfig-008
     * @RestRelativeURL RouteConfig/routeItemMaintain
     */
	@POST
	@Path("/routeItemMaintain")
    public RouteItemMaintainResult routeItemMaintain(RouteItemMaintainVo vo)
            throws BusinessException, SystemException;


}
