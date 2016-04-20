package com.ai.slp.route.api.routeconfig.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routeconfig.param.ProSupplyMaintainResult;
import com.ai.slp.route.api.routeconfig.param.ProSupplyMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteGroupMaintainResult;
import com.ai.slp.route.api.routeconfig.param.RouteGroupMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteItemMaintainResult;
import com.ai.slp.route.api.routeconfig.param.RouteItemMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteMaintainResult;
import com.ai.slp.route.api.routeconfig.param.RouteMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteRuleMaintainResult;
import com.ai.slp.route.api.routeconfig.param.RouteRuleMaintainVo;

/**
 * 路由配置<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public interface IRouteConfigSV {
    /**
     * 路由新增 、修改、商品明细添加 、状态修改
     * 
     * @param vo
     *            路由基本信息和标准品信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiCode ROUTE_0001
     */
    public RouteMaintainResult routeMaintain(RouteMaintainVo vo) throws BusinessException,
            SystemException;

    @interface routeMaintain {
    }

    /**
     * 供应商品 增加供货量 、删除
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode ROUTE_0002
     */
    public ProSupplyMaintainResult proSupplyMaintain(ProSupplyMaintainVo vo)
            throws BusinessException, SystemException;

    @interface proSupplyMaintain {
    }

    /**
     * 路由规则新增 、修改 、状态变更
     * 
     * @param vo
     *            路由规则项及阈值
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode ROUTE_0003
     */
    public RouteRuleMaintainResult routeRuleMaintain(RouteRuleMaintainVo vo)
            throws BusinessException, SystemException;

    @interface routeRuleMaintain {
    }

    /**
     * 路由组新增、修改、状态修改、路由修改
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode ROUTE_0004
     */
    public RouteGroupMaintainResult routeGroupMaintain(RouteGroupMaintainVo vo)
            throws BusinessException, SystemException;

    @interface routeGroupMaintain {
    }

    /**
     * 路由组组成状态更改,对路由组中的路由进行启动和暂停
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode ROUTE_0005
     */
    public RouteItemMaintainResult routeItemMaintain(RouteItemMaintainVo vo)
            throws BusinessException, SystemException;

    @interface routeItemMaintain {
    }

}
