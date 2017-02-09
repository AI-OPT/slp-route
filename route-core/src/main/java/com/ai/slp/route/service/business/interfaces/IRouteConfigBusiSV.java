package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routeconfig.param.ProSupplyMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteCreateVo;
import com.ai.slp.route.api.routeconfig.param.RouteGroupMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteItemMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteModifyVo;
import com.ai.slp.route.api.routeconfig.param.RouteProSupplyAddVo;
import com.ai.slp.route.api.routeconfig.param.RouteRuleMaintainVo;
import com.ai.slp.route.api.routeconfig.param.RouteStateChgVo;
/**
 * 对route的操作
 */
public interface IRouteConfigBusiSV {
	//创建路由
    void routeCreate(RouteCreateVo vo);
	//路由更新  
    void routeModify(RouteModifyVo vo);
	//供应商品添加
    void routeProSupplyAdd(RouteProSupplyAddVo vo);
	//根据主键更新 
    void routeStateChg(RouteStateChgVo vo);
	//供应商品的相关操作   
    void proSupplyMaintain(ProSupplyMaintainVo vo);
	//路由规则
    void routeRuleMaintain(RouteRuleMaintainVo vo);
	//路由组相关操作
    void routeGroupMaintain(RouteGroupMaintainVo vo);
	//路由组成
    void routeItemMaintain(RouteItemMaintainVo vo);
	
}
