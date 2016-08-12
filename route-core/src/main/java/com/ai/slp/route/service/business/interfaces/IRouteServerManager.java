package com.ai.slp.route.service.business.interfaces;

import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.route.api.server.params.IRouteServerRequest;

import java.sql.SQLException;

/**
 * Created by xin on 16-5-5.
 */
public interface IRouteServerManager {
    ResponseHeader callServerByServerId(IRouteServerRequest request);

    ResponseHeader callServerByRouteId(IRouteServerRequest request) throws SQLException;


}
