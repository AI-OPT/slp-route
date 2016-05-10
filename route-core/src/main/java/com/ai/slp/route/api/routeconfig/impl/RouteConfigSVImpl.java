package com.ai.slp.route.api.routeconfig.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.route.api.routeconfig.interfaces.IRouteConfigSV;
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
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.service.business.interfaces.IRouteConfigBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service(validation = "true")
public class RouteConfigSVImpl implements IRouteConfigSV {
    @Autowired
    private transient IRouteConfigBusiSV iRouteConfigBusiSV;

    @Override
    public RouteCreateResult routeCreate(RouteCreateVo vo) throws BusinessException,
            SystemException {
        iRouteConfigBusiSV.routeCreate(vo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        RouteCreateResult result = new RouteCreateResult();
        result.setResponseHeader(responseHeader);
        return result;
    }

    @Override
    public RouteModifyResult routeModify(RouteModifyVo vo) throws BusinessException,
            SystemException {
        iRouteConfigBusiSV.routeModify(vo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        RouteModifyResult result = new RouteModifyResult();
        result.setResponseHeader(responseHeader);
        return result;
    }

    @Override
    public RouteProSupplyAddResult routeProSupplyAdd(RouteProSupplyAddVo vo)
            throws BusinessException, SystemException {
        iRouteConfigBusiSV.routeProSupplyAdd(vo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        RouteProSupplyAddResult result = new RouteProSupplyAddResult();
        result.setResponseHeader(responseHeader);
        return result;
    }

    @Override
    public RouteStateChgResult routeStateChg(RouteStateChgVo vo) throws BusinessException,
            SystemException {
        iRouteConfigBusiSV.routeStateChg(vo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        RouteStateChgResult result = new RouteStateChgResult();
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
