package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routeconfig.param.ProSupplyMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteGroupMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteItemMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteRuleMaintainVo;

public interface IRouteConfigBusiSV {

    void routeMaintain(RouteMaintainVo vo);

    void proSupplyMaintain(ProSupplyMaintainVo vo);

    void routeRuleMaintain(RouteRuleMaintainVo vo);

    void routeGroupMaintain(RouteGroupMaintainVo vo);

    void routeItemMaintain(RouteItemMaintainVo vo);

}
