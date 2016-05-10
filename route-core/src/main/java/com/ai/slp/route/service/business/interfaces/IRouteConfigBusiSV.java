package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routeconfig.param.ProSupplyMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteCreateVo;
import com.ai.slp.route.api.routeconfig.param.RouteGroupMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteItemMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteModifyVo;
import com.ai.slp.route.api.routeconfig.param.RouteProSupplyAddVo;
import com.ai.slp.route.api.routeconfig.param.RouteRuleMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteStateChgVo;

public interface IRouteConfigBusiSV {

    void routeCreate(RouteCreateVo vo);

    void routeModify(RouteModifyVo vo);

    void routeProSupplyAdd(RouteProSupplyAddVo vo);

    void routeStateChg(RouteStateChgVo vo);

    void proSupplyMaintain(ProSupplyMaintainVo vo);

    void routeRuleMaintain(RouteRuleMaintainVo vo);

    void routeGroupMaintain(RouteGroupMaintainVo vo);

    void routeItemMaintain(RouteItemMaintainVo vo);

}
