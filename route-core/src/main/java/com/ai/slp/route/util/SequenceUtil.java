package com.ai.slp.route.util;

import com.ai.opt.sdk.components.sequence.util.SeqUtil;

public final class SequenceUtil {

    private static final String ROUTE$ROUTE_ID$SEQ = "ROUTE$ROUTE_ID$SEQ";
    private static final String ROUTE_SUPPLY_ADDS_LOG$SUPPLY_ADDS_LOG_ID$SEQ = "ROUTE_SUPPLY_ADDS_LOG$SUPPLY_ADDS_LOG_ID$SEQ";

    public static String createRouteId() {
        return SeqUtil.getNewId(ROUTE$ROUTE_ID$SEQ, 16);
    }
    public static String createSupplyAddsLogId() {
        return SeqUtil.getNewId(ROUTE_SUPPLY_ADDS_LOG$SUPPLY_ADDS_LOG_ID$SEQ, 16);
    }
}
