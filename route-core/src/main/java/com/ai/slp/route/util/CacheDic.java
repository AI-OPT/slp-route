package com.ai.slp.route.util;

import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.slp.common.api.cache.interfaces.ICacheSV;
import com.ai.slp.common.api.cache.param.SysParam;

public class CacheDic {


    public static String getAppKey(String tenantId, String typeCode, String paramCode) {
        ICacheSV iCacheSV = DubboConsumerFactory.getService("iCacheSV");
        SysParam sysParam = iCacheSV.getSysParam(tenantId, typeCode, paramCode, "APPKEY");
        return sysParam.getColumnDesc();
        //return "9db313541196135c37025f7a8021c4df";
    }

}
