package com.ai.slp.route.util;

import com.ai.opt.sdk.components.sequence.util.SeqUtil;

public final class SequenceUtil {
	private SequenceUtil(){
		
	}
    private static final String ROUTE$ROUTE_ID$SEQ = "ROUTE$ROUTE_ID$SEQ";
    private static final String ROUTE_SUPPLY_ADDS_LOG$SUPPLY_ADDS_LOG_ID$SEQ = "ROUTE_SUPPLY_ADDS_LOG$SUPPLY_ADDS_LOG_ID$SEQ";
    private static final String ROUTE_PROD_SUPPLY$SUPPLY_ID$SEQ = "ROUTE_PROD_SUPPLY$SUPPLY_ID$SEQ";
    
    private static final String ROUTE_GROUP$ROUTE_GROUP_ID$SEQ = "ROUTE_GROUP$ROUTE_GROUP_ID$SEQ";
    private static final String ROUTE_ITEM$ROUTE_ITEM_ID$SEQ = "ROUTE_ITEM$ROUTE_ITEM_ID$SEQ";
    
    private static final String ROUTE_TARGET_AREA$ROUTE_AREA_ID$SEQ = "ROUTE_TARGET_AREA$ROUTE_AREA_ID$SEQ";
    
    public static String createRouteId() {
        return SeqUtil.getNewId(ROUTE$ROUTE_ID$SEQ, 16);
    }
    public static String createSupplyAddsLogId() {
        return SeqUtil.getNewId(ROUTE_SUPPLY_ADDS_LOG$SUPPLY_ADDS_LOG_ID$SEQ, 16);
    }
    public static String createSupplyId() {
        return SeqUtil.getNewId(ROUTE_PROD_SUPPLY$SUPPLY_ID$SEQ, 16);
    }
    public static String createRouteGroupId(){
    	return SeqUtil.getNewId(ROUTE_GROUP$ROUTE_GROUP_ID$SEQ, 16);
    }
    public static String createRouteItemId(){
    	return SeqUtil.getNewId(ROUTE_ITEM$ROUTE_ITEM_ID$SEQ, 16);
    }
    
    public static String createRouteAreaId(){
    	return SeqUtil.getNewId(ROUTE_TARGET_AREA$ROUTE_AREA_ID$SEQ, 12);
    }
}
