package com.ai.slp.route.action;

import com.ai.slp.route.dao.mapper.bo.RouteServInfo;
import com.ai.slp.route.util.CacheDic;
import com.ai.slp.route.util.HttpUtil;
import com.ai.slp.route.util.ProtocolConvert;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Date;

/**
 *
 * Created by xin on 16-5-6.
 */
public class O2PCallServerAction implements ICallServerAction {

    private static final Logger logger = LogManager.getLogger(O2PCallServerAction.class);

    private String requestUrl;
    private String requestTemplate;
    private String responseTemplate;
    private String requestData;
    private String tenantId;

    public O2PCallServerAction(RouteServInfo routeServInfo, String requestDate) {
        this.requestUrl = routeServInfo.getUrl();
        this.requestTemplate = routeServInfo.getRequestParam();
        this.responseTemplate = routeServInfo.getReturnParam();
        this.tenantId = routeServInfo.getTenantId();
        JsonObject requestValueJson = (JsonObject) new JsonParser().parse(requestDate);
        //追加两个公共参数
        requestValueJson.addProperty("appkey", CacheDic.getAppKey(tenantId, "O2P", "APPKEY"));
        requestValueJson.addProperty("transTime", new Date().getTime());
        this.requestData = requestValueJson.toString();
    }

    @Override
    public String doCall() throws IOException {
        String requestValue = ProtocolConvert.convert(requestTemplate, requestData);
        logger.info("Request Template : {} ", requestTemplate);
        logger.info("Request Data : {} ", requestData);
        logger.info("Request Value : {} ", requestValue);
        logger.info("Response Template : {} ", responseTemplate);
        String responseData = HttpUtil.doPostRequest(requestUrl, requestValue);
        logger.info("Response Data : {} ", responseData);
        String responseValue = ProtocolConvert.convert(responseTemplate, responseData);
        logger.info("Response Value : {} ", responseValue);
        return responseData;
    }
}
