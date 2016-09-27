package com.ai.slp.route.api.server.impl;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.slp.route.api.server.interfaces.IRouteServer;
import com.ai.slp.route.api.server.params.IRouteServerRequest;
import com.ai.slp.route.service.business.interfaces.IRouteServerManager;
import com.alibaba.dubbo.config.annotation.Service;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class RouteServerImpl implements IRouteServer {

    private static final Logger logger = LogManager.getLogger(RouteServerImpl.class);

    @Autowired
    private IRouteServerManager routeServerManager;

    @Override
    public BaseResponse callServerByRouteId(IRouteServerRequest request) {
        ResponseHeader header;
        if (StringUtils.isBlank(request.getTenantId())) {
            throw new RuntimeException("TenantId can not be null");
        }

        if (StringUtils.isBlank(request.getRouteId())) {
            throw new RuntimeException("routeID can not be null");
        }

        try {
            header = routeServerManager.callServerByRouteId(request);
        } catch (Exception e) {
            logger.error("Failed to call server by route Id", e);
            header = new ResponseHeader(false, ExceptCodeConstants.Special.SYSTEM_ERROR,"");
        }
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponseHeader(header);
        return baseResponse;
    }

    @Override
    public BaseResponse callServerByServerId(IRouteServerRequest request) {
        if (StringUtils.isBlank(request.getTenantId())) {
            throw new RuntimeException("TenantId can not be null");
        }

        if (request.getServerId() == 0) {
            throw new RuntimeException("routeID can not be null");
        }
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponseHeader(routeServerManager.callServerByServerId(request));
        return baseResponse;
    }
}
