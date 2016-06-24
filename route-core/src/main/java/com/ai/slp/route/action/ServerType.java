package com.ai.slp.route.action;

import com.ai.slp.route.dao.mapper.bo.RouteServInfo;

public enum ServerType {
    //http模式  重定向模式:返回重定向地址
    HTTP, REDIRECT;

    public static ServerType convert(String value) {
        switch (value) {
            case "H":
                return HTTP;
            case "R":
                return REDIRECT;
            default:
                throw new RuntimeException("Can not conver the serverType value[" + value + "]");
        }
    }


    public ICallServerAction chooseCallServerAction(RouteServInfo routeServInfo, String requestDate) {
        switch (this) {
            case HTTP: {
                return new O2PCallServerAction(routeServInfo, requestDate);
            }
            case REDIRECT:
                return new RedirectCallServerAction();
            default:
                throw new RuntimeException("Can not conver the serverType value[" + this + "]");
        }
    }
}
