package com.ai.slp.route.service.business.interfaces;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.api.serverconfig.param.ServerCreateVo;
import com.ai.slp.route.api.serverconfig.param.ServerModifyVo;
import com.ai.slp.route.api.serverconfig.param.ServerQueryResult;
import com.ai.slp.route.api.serverconfig.param.ServerQueryVo;

public interface IServerConfigBusiSV {

    void servCreate(ServerCreateVo vo);

    void servModify(ServerModifyVo vo);

    PageInfo<ServerQueryResult> serverQuery(ServerQueryVo vo);

    ServerQueryResult serverDetailQuery(ServerQueryVo vo);

}
