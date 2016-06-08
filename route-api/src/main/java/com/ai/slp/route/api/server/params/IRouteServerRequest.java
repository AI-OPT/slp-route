package com.ai.slp.route.api.server.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * Created by xin on 16-5-5.
 */
public class IRouteServerRequest extends BaseInfo {

    private String routeId;

    private long serverId;

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
