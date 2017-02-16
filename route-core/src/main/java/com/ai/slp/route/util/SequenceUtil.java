package com.ai.slp.route.util;

import com.ai.opt.sdk.components.sequence.util.SeqUtil;

/**
 * 
 * 定義属性标识序列工具類
 *
 */
public final class SequenceUtil {
	private SequenceUtil(){
		
	}
	/**
	 * 属性定义标识序列
	 */
	//路由标识
    private static final String ROUTE$ROUTE_ID$SEQ = "ROUTE$ROUTE_ID$SEQ";
    //增加日志id
    private static final String ROUTE_SUPPLY_ADDS_LOG$SUPPLY_ADDS_LOG_ID$SEQ = "ROUTE_SUPPLY_ADDS_LOG$SUPPLY_ADDS_LOG_ID$SEQ";
    //供应品标识
    private static final String ROUTE_PROD_SUPPLY$SUPPLY_ID$SEQ = "ROUTE_PROD_SUPPLY$SUPPLY_ID$SEQ";
    //路由组标识
    private static final String ROUTE_GROUP$ROUTE_GROUP_ID$SEQ = "ROUTE_GROUP$ROUTE_GROUP_ID$SEQ";
    //路由组组成标识
    private static final String ROUTE_ITEM$ROUTE_ITEM_ID$SEQ = "ROUTE_ITEM$ROUTE_ITEM_ID$SEQ";
    //路由区域标识
    private static final String ROUTE_TARGET_AREA$ROUTE_AREA_ID$SEQ = "ROUTE_TARGET_AREA$ROUTE_AREA_ID$SEQ";
    //创建仓库id
    public static String createRouteId() {
        return SeqUtil.getNewId(ROUTE$ROUTE_ID$SEQ, 16);
    }
    //创建供应品添加日志id
    public static String createSupplyAddsLogId() {
        return SeqUtil.getNewId(ROUTE_SUPPLY_ADDS_LOG$SUPPLY_ADDS_LOG_ID$SEQ, 16);
    }
    //创建供应品id
    public static String createSupplyId() {
        return SeqUtil.getNewId(ROUTE_PROD_SUPPLY$SUPPLY_ID$SEQ, 16);
    }
    //创建仓库组id
    public static String createRouteGroupId(){
    	return SeqUtil.getNewId(ROUTE_GROUP$ROUTE_GROUP_ID$SEQ, 16);
    }
    //创建路由组组成id
    public static String createRouteItemId(){
    	return SeqUtil.getNewId(ROUTE_ITEM$ROUTE_ITEM_ID$SEQ, 16);
    }
    //创建仓库区域id
    public static String createRouteAreaId(){
    	return SeqUtil.getNewId(ROUTE_TARGET_AREA$ROUTE_AREA_ID$SEQ, 12);
    }
}
