package com.ai.slp.route.api.serverconfig.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.route.api.serverconfig.interfaces.IServerConfigSV;
import com.ai.slp.route.api.serverconfig.param.ServerCreateResult;
import com.ai.slp.route.api.serverconfig.param.ServerCreateVo;
import com.ai.slp.route.api.serverconfig.param.ServerModifyResult;
import com.ai.slp.route.api.serverconfig.param.ServerModifyVo;
import com.ai.slp.route.api.serverconfig.param.ServerQueryResult;
import com.ai.slp.route.api.serverconfig.param.ServerQueryVo;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.service.business.interfaces.IServerConfigBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service(validation = "true")
public class ServerConfigSVImpl implements IServerConfigSV {
    @Autowired
    private transient IServerConfigBusiSV iServerConfigBusiSV;

    @Override
    public ServerCreateResult servCreate(ServerCreateVo vo) throws BusinessException,
            SystemException {
        iServerConfigBusiSV.servCreate(vo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        ServerCreateResult result = new ServerCreateResult();
        result.setResponseHeader(responseHeader);
        return result;
    }
    @Override
    public ServerModifyResult servModify(ServerModifyVo vo) throws BusinessException,
            SystemException {
        iServerConfigBusiSV.servModify(vo);

        ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
        ServerModifyResult result = new ServerModifyResult();
        result.setResponseHeader(responseHeader);
        return result;
    }

    @Override
    public PageInfo<ServerQueryResult> serverQuery(ServerQueryVo vo) throws BusinessException,
            SystemException {
        return iServerConfigBusiSV.serverQuery(vo);
    }

    @Override
    public ServerQueryResult serverDetailQuery(ServerQueryVo vo) throws BusinessException,
            SystemException {
        return iServerConfigBusiSV.serverDetailQuery(vo);
    }

}
