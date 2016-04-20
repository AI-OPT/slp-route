package com.ai.slp.route.api.serverconfig.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.serverconfig.param.ServerMaintainResult;
import com.ai.slp.route.api.serverconfig.param.ServerMaintainVo;
import com.ai.slp.route.api.serverconfig.param.ServerQueryResult;
import com.ai.slp.route.api.serverconfig.param.ServerQueryVo;

/**
 * 服务配置<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public interface IServerConfigSV {
    /**
     * 服务信息维护
     * 
     * @param vo
     *            服务基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiCode ROUTE_0011
     */
    public ServerMaintainResult ServMaintain(ServerMaintainVo vo) throws BusinessException,
            SystemException;

    @interface ServMaintain {
    }

    /**
     * 服务信息查询
     * 
     * @param vo
     *            服务基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiCode ROUTE_0012
     */
    public ServerQueryResult serverQuery(ServerQueryVo vo) throws BusinessException,
            SystemException;

    @interface serverQuery {
    }

}
