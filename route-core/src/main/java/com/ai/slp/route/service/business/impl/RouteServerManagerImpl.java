package com.ai.slp.route.service.business.impl;

import com.ai.slp.route.action.ICallServerAction;
import com.ai.slp.route.action.ServerType;
import com.ai.slp.route.api.server.params.IRouteServerRequest;
import com.ai.slp.route.api.server.params.RouteServerResponse;
import com.ai.slp.route.dao.mapper.bo.Route;
import com.ai.slp.route.dao.mapper.bo.RouteServInfo;
import com.ai.slp.route.dao.mapper.interfaces.RouteMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteServInfoMapper;
import com.ai.slp.route.service.business.interfaces.IRouteServerManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class RouteServerManagerImpl implements IRouteServerManager {

    private static Logger logger = LoggerFactory.getLogger(RouteServerManagerImpl.class);
    @Autowired
    private RouteServInfoMapper routeServInfoMapper;

    @Autowired
    private RouteMapper routeMapper;


    @Override
    public RouteServerResponse callServerByServerId(IRouteServerRequest request) {
        RouteServerResponse routeServerResponse = new RouteServerResponse("000000");
        try {
            RouteServInfo routeServInfo = routeServInfoMapper.selectByPrimaryKey((int) request.getServerId());
            if (routeServInfo == null) {
                throw new RuntimeException("Cannot find the routeServer by serverID[" + request.getServerId() + "]");
            }

            ICallServerAction action = ServerType.convert(routeServInfo.getServType()).chooseCallServerAction(routeServInfo, request.getRequestData());
            routeServerResponse.setResponseData(action.doCall());
        } catch (Exception e) {
            logger.error("call server action fail.",e);
            routeServerResponse.setResponseCode("999999");
        }

        return routeServerResponse;
    }

    @Override
    public RouteServerResponse callServerByRouteId(IRouteServerRequest request) throws SQLException {
        Route routeInfo = routeMapper.selectByPrimaryKey(request.getRouteId());
        if (routeInfo.getServId() == 0) {
            RouteServerResponse response = new RouteServerResponse("999999");
            response.setResponseMessage("Can not find the serviceId in RouteID[" + request.getRouteId() + "]");
            return response;
        }
        request.setServerId(routeInfo.getServId());
        return callServerByServerId(request);
    }

}
