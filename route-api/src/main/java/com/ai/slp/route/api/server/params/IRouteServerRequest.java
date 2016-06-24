package com.ai.slp.route.api.server.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * Created by xin on 16-5-5.
 */
public class IRouteServerRequest extends BaseInfo {
    /**
     * 路由标识
     */
    private String routeId;
    /**
     * 服务标识
     */
    private long serverId;
    /**
     * 请求信息,json格式 模板参考route_serv_info表
     */
    private String requestData;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public long getServerId() {
        return serverId;
    }

    public void setServerId(long serverId) {
        this.serverId = serverId;
    }

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }
}
