package com.ai.slp.route.api.serverconfig.param;

import java.io.Serializable;

/**
 * 服务信息维护请求参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ServerMaintainVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 变更状态
     */
    private String chgFlag;

    /**
     * 服务名称
     */
    private String servName;

    /**
     * 服务类型
     */
    private String servType;

    /**
     * 服务内容
     */
    private String servContent;

    public String getChgFlag() {
        return chgFlag;
    }

    public String getServName() {
        return servName;
    }

    public String getServType() {
        return servType;
    }

    public String getServContent() {
        return servContent;
    }

    public void setChgFlag(String chgFlag) {
        this.chgFlag = chgFlag;
    }

    public void setServName(String servName) {
        this.servName = servName;
    }

    public void setServType(String servType) {
        this.servType = servType;
    }

    public void setServContent(String servContent) {
        this.servContent = servContent;
    }

}
