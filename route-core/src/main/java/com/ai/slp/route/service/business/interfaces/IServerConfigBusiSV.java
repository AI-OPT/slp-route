package com.ai.slp.route.service.business.interfaces;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.api.serverconfig.param.ServerCreateVo;
import com.ai.slp.route.api.serverconfig.param.ServerModifyVo;
import com.ai.slp.route.api.serverconfig.param.ServerQueryResult;
import com.ai.slp.route.api.serverconfig.param.ServerQueryVo;

public interface IServerConfigBusiSV {
	/**
	 * 服务信息的添加
	 */
    void servCreate(ServerCreateVo vo);
    /**
	 * 更新服务信息
	 */
    void servModify(ServerModifyVo vo);
    /**
	 * 分页查询
	 */
    PageInfo<ServerQueryResult> serverQuery(ServerQueryVo vo);
    /**
	 * 暂未使用
	 */
    ServerQueryResult serverDetailQuery(ServerQueryVo vo);

}
