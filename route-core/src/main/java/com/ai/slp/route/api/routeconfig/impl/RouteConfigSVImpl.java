package com.ai.slp.route.api.routeconfig.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.route.api.routeconfig.interfaces.IRouteConfigSV;
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
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.service.business.interfaces.IRouteConfigBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service(validation = "true")
public class RouteConfigSVImpl implements IRouteConfigSV {
    @Autowired
    private transient IRouteConfigBusiSV iRouteConfigBusiSV;

    @Override
    public RouteMaintainResult routeMaintain(RouteMaintainVo vo) throws BusinessException,
            SystemException {
        iRouteConfigBusiSV.routeMaintain(vo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        RouteMaintainResult result = new RouteMaintainResult();
        result.setResponseHeader(responseHeader);
        return result;
    }

    @Override
    public ProSupplyMaintainResult proSupplyMaintain(ProSupplyMaintainVo vo)
            throws BusinessException, SystemException {
        iRouteConfigBusiSV.proSupplyMaintain(vo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        ProSupplyMaintainResult result = new ProSupplyMaintainResult();
        result.setResponseHeader(responseHeader);
        return result;
    }

    @Override
    public RouteRuleMaintainResult routeRuleMaintain(RouteRuleMaintainVo vo)
            throws BusinessException, SystemException {
        iRouteConfigBusiSV.routeRuleMaintain(vo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        RouteRuleMaintainResult result = new RouteRuleMaintainResult();
        result.setResponseHeader(responseHeader);
        return result;
    }

    @Override
    public RouteGroupMaintainResult routeGroupMaintain(RouteGroupMaintainVo vo)
            throws BusinessException, SystemException {
        iRouteConfigBusiSV.routeGroupMaintain(vo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        RouteGroupMaintainResult result = new RouteGroupMaintainResult();
        result.setResponseHeader(responseHeader);
        return result;
    }

    @Override
    public RouteItemMaintainResult routeItemMaintain(RouteItemMaintainVo vo)
            throws BusinessException, SystemException {
        iRouteConfigBusiSV.routeItemMaintain(vo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        RouteItemMaintainResult result = new RouteItemMaintainResult();
        result.setResponseHeader(responseHeader);
        return result;
    }

}
