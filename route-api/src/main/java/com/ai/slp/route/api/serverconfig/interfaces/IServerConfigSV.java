package com.ai.slp.route.api.serverconfig.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.api.serverconfig.param.ServerCreateResult;
import com.ai.slp.route.api.serverconfig.param.ServerCreateVo;
import com.ai.slp.route.api.serverconfig.param.ServerModifyResult;
import com.ai.slp.route.api.serverconfig.param.ServerModifyVo;
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
     * 服务信息新增
     * 
     * @param vo
     *            服务基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiCode ROUTE_0011
     */
    public ServerCreateResult servCreate(ServerCreateVo vo) throws BusinessException,
            SystemException;

    @interface servCreate {
    }

    /**
     * 服务信息修改
     * 
     * @param vo
     *            服务基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiCode ROUTE_0011
     */
    public ServerModifyResult servModify(ServerModifyVo vo) throws BusinessException,
            SystemException;

    @interface servModify {
    }

    /**
     * 服务信息分页查询
     * 
     * @param vo
     *            服务基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiCode ROUTE_0012
     */
    public PageInfo<ServerQueryResult> serverQuery(ServerQueryVo vo) throws BusinessException,
            SystemException;

    @interface serverQuery {
    }

    /**
     * 服务信息详情查询
     * 
     * @param vo
     *            服务基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiCode ROUTE_0012
     */
    public ServerQueryResult serverDetailQuery(ServerQueryVo vo) throws BusinessException,
            SystemException;

    @interface serverDetailQuery {
    }

}
