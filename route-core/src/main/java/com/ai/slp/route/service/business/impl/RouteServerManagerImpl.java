package com.ai.slp.route.service.business.impl;

import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.slp.route.action.ICallServerAction;
import com.ai.slp.route.action.ServerType;
import com.ai.slp.route.api.server.params.IRouteServerRequest;
import com.ai.slp.route.constants.ExceptCodeConstant;
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

    private static final Logger logger = LoggerFactory.getLogger(RouteServerManagerImpl.class);
    @Autowired
    private RouteServInfoMapper routeServInfoMapper;

    @Autowired
    private RouteMapper routeMapper;


    @Override
    public ResponseHeader callServerByServerId(IRouteServerRequest request) {
        ResponseHeader header = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "");
        try {
            RouteServInfo routeServInfo = routeServInfoMapper.selectByPrimaryKey((int) request.getServerId());
            if (routeServInfo == null) {
                throw new RuntimeException("Cannot find the routeServer by serverID[" + request.getServerId() + "]");
            }

            ICallServerAction action = ServerType.convert(routeServInfo.getServType()).chooseCallServerAction(routeServInfo, request.getRequestData());
            header.setResultMessage(action.doCall());
        } catch (Exception e) {
            logger.error("call server action fail.",e);
            header.setIsSuccess(false);
            header.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
        }

        return header;
    }

    @Override
    public ResponseHeader callServerByRouteId(IRouteServerRequest request) throws SQLException {
        Route routeInfo = routeMapper.selectByPrimaryKey(request.getRouteId());
        if (routeInfo.getServId() == 0) {
            ResponseHeader header = new ResponseHeader(false, ExceptCodeConstant.PARAM_IS_NULL,
                    "Can not find the serviceId in RouteID[" + request.getRouteId() + "]");
            return header;
        }
        request.setServerId(routeInfo.getServId());
        return callServerByServerId(request);
    }

}
