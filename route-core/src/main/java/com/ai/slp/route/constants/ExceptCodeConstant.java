package com.ai.slp.route.constants;

public class ExceptCodeConstant {
	private ExceptCodeConstant(){
		
	}
    /**
     * 成功
     */
    public static final String SUCCESS = "000000";

    /**
     * 参数为空
     */
    public static final String PARAM_IS_NULL = "888888";

    /**
     * 查询无记录
     */
    public static final String NO_RESULT = "000001";

    /**
     * 参数类型不正确
     */
    public static final String PARAM_TYPE_NOT_RIGHT = "000002";

    /**
     * 未配置系统参数或未刷新缓存
     */
    public static final String NO_DATA_OR_CACAE_ERROR = "000003";
    /**
     * 失败返回码
     */
    public static final String ERROR = "999999";
}
