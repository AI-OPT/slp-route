package com.ai.slp.route.api.serverconfig.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
@Path("/ServerConfig")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
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
     * @ApiDocMethod
     * @ApiCode ServerConfig-001
     * @RestRelativeURL ServerConfig/servCreate
     */
	@POST
	@Path("/servCreate")
    public ServerCreateResult servCreate(ServerCreateVo vo) throws BusinessException,
            SystemException;


    /**
     * 服务信息修改
     * 
     * @param vo
     *            服务基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode ServerConfig-002
     * @RestRelativeURL ServerConfig/servModify
     */
	@POST
	@Path("/servModify")
    public ServerModifyResult servModify(ServerModifyVo vo) throws BusinessException,
            SystemException;

   

    /**
     * 服务信息分页查询
     * 
     * @param vo
     *            服务基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode ServerConfig-003
     * @RestRelativeURL ServerConfig/serverQuery
     */
	@POST
	@Path("/serverQuery")
    public PageInfo<ServerQueryResult> serverQuery(ServerQueryVo vo) throws BusinessException,
            SystemException;


    /**
     * 服务信息详情查询
     * 
     * @param vo
     *            服务基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode ServerConfig-004
     * @RestRelativeURL ServerConfig/serverDetailQuery
     */
	@POST
	@Path("/serverDetailQuery")
    public ServerQueryResult serverDetailQuery(ServerQueryVo vo) throws BusinessException,
            SystemException;

    

}
