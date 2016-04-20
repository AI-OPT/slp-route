package com.ai.slp.route.api.serverconfig.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 服务配置查询返回参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ServerQueryResult extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 服务ID
     */
    private String splServId;

    /**
     * 服务名称
     */
    private String servName;

    /**
     * 访问类型
     */
    private String visitType;

    /**
     * 服务类型
     */
    private String servType;

    /**
     * 服务内容
     */
    private String servContent;

    /**
     * 状态
     */
    private String state;

    /**
     * 操作人
     */
    private long operId;

    /**
     * 操作时间
     */
    private String operTime;

    public String getSplServId() {
        return splServId;
    }

    public String getServName() {
        return servName;
    }

    public String getVisitType() {
        return visitType;
    }

    public String getServType() {
        return servType;
    }

    public String getServContent() {
        return servContent;
    }

    public String getState() {
        return state;
    }

    public long getOperId() {
        return operId;
    }

    public String getOperTime() {
        return operTime;
    }

    public void setSplServId(String splServId) {
        this.splServId = splServId;
    }

    public void setServName(String servName) {
        this.servName = servName;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public void setServType(String servType) {
        this.servType = servType;
    }

    public void setServContent(String servContent) {
        this.servContent = servContent;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setOperId(long operId) {
        this.operId = operId;
    }

    public void setOperTime(String operTime) {
        this.operTime = operTime;
    }

}
