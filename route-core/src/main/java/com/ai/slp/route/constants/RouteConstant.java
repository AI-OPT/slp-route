package com.ai.slp.route.constants;

public static final class RouteConstant {
    /**
     * 新增
     */
    public static final String A = "A";

    /**
     * 修改
     */
    public static final String M = "M";

    /**
     * 商品明细添加
     */
    public static final String B = "B";

    /**
     * 状态修改
     */
    public static final String S = "S";

    public static final class Route {

        public static final class State {

            // 1新增
            public static final String NEW = "1";

            // 2正常
            public static final String NORMAL = "2";

            // 21预警
            public static final String ALARM = "21";

            // 3异常
            public static final String ABNORMITY = "3";

            // 5手动暂停
            public static final String MANUAL_PAUSED = "5";

            // 51自动暂停
            public static final String AUTO_PAUSED = "51";

            // 6废弃
            public static final String ABANDONED = "6";

        }
    }

}
