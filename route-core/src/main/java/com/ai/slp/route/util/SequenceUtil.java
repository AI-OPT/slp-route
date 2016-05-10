package com.ai.slp.route.util;

import com.ai.opt.sdk.components.sequence.util.SeqUtil;

public final class SequenceUtil {

    private static final String ROUTE$ROUTE_ID$SEQ = "ROUTE$ROUTE_ID$SEQ";

    public static String createRouteId() {
        return SeqUtil.getNewId(ROUTE$ROUTE_ID$SEQ, 16);
    }

}
