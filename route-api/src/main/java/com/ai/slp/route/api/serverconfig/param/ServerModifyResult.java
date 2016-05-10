package com.ai.slp.route.api.serverconfig.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 服务配置维护返回参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ServerModifyResult extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 服务ID
     */
    private String splServId;

    public String getSplServId() {
        return splServId;
    }

    public void setSplServId(String splServId) {
        this.splServId = splServId;
    }

}
