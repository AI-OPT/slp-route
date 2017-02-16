package com.ai.slp.route.util;

import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.platform.common.api.cache.interfaces.ICacheSV;
import com.ai.platform.common.api.cache.param.SysParam;
import com.ai.platform.common.api.cache.param.SysParamSingleCond;

/**
 *缓冲工具类 
 *
 */
public class CacheDic {

	private CacheDic(){
		
	}
	
	//获取appkey
    public static String getAppKey(String tenantId, String typeCode, String paramCode) {
        ICacheSV iCacheSV = DubboConsumerFactory.getService("iCacheSV");
        SysParam sysParam = iCacheSV.getSysParamSingle(
                new SysParamSingleCond(tenantId, typeCode, paramCode, "APPKEY"));
        return sysParam.getColumnDesc();
        //return "9db313541196135c37025f7a8021c4df";
    }

}
