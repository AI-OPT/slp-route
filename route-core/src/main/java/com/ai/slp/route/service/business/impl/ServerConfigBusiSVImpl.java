package com.ai.slp.route.service.business.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.slp.route.api.serverconfig.param.ServerCreateVo;
import com.ai.slp.route.api.serverconfig.param.ServerModifyVo;
import com.ai.slp.route.api.serverconfig.param.ServerQueryResult;
import com.ai.slp.route.api.serverconfig.param.ServerQueryVo;
import com.ai.slp.route.dao.mapper.bo.RouteServInfo;
import com.ai.slp.route.dao.mapper.interfaces.RouteServInfoMapper;
import com.ai.slp.route.service.business.interfaces.IServerConfigBusiSV;

@Component
@Transactional
public class ServerConfigBusiSVImpl implements IServerConfigBusiSV {
    @Autowired
    private transient RouteServInfoMapper servInfoMapper;

    @Override
    public void servCreate(ServerCreateVo vo) {
        // 保存服务表
        Timestamp sysdate = DateUtil.getSysDate();
        long operId = vo.getOperId();
        int servId = 1;
        RouteServInfo servInfo = new RouteServInfo();
        BeanUtils.copyVO(servInfo, vo);
        servInfo.setTenantId(vo.getTenantId());
        servInfo.setServId(servId);
        servInfo.setState("2");
        servInfo.setOperId(operId);
        servInfo.setOperTime(sysdate);
        servInfoMapper.insert(servInfo);

    }

    @Override
    public void servModify(ServerModifyVo vo) {
        // 保存服务表
        Timestamp sysdate = DateUtil.getSysDate();
        long operId = vo.getOperId();
        RouteServInfo servInfo = new RouteServInfo();
        BeanUtils.copyVO(servInfo, vo);
        servInfo.setServId(vo.getServId());
        servInfo.setTenantId(vo.getTenantId());
        servInfo.setState("2");
        servInfo.setOperId(operId);
        servInfo.setOperTime(sysdate);
        servInfoMapper.updateByPrimaryKeySelective(servInfo);

    }

    @Override
    public PageInfo<ServerQueryResult> serverQuery(ServerQueryVo vo) {
        return null;
    }

    @Override
    public ServerQueryResult serverDetailQuery(ServerQueryVo vo) {
        return null;
    }

}
