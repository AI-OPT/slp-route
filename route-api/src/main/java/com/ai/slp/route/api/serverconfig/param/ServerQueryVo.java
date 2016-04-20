package com.ai.slp.route.api.serverconfig.param;

import java.io.Serializable;

/**
 * 服务配置查询请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ServerQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务名称
     */
    private String servName;

    /**
     * 服务类型
     */
    private String servType;

    public String getServName() {
        return servName;
    }

    public String getServType() {
        return servType;
    }

    public void setServName(String servName) {
        this.servName = servName;
    }

    public void setServType(String servType) {
        this.servType = servType;
    }

}
