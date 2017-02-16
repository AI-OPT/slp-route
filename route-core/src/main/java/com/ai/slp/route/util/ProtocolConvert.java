package com.ai.slp.route.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Map;

/**
 * 协议转换工具类
 * 
 *
 */
public class ProtocolConvert {
	private ProtocolConvert(){
		
	}
	
	//参数转换
    public static String convert(String template, String requestData) {
        JsonObject dataJson = (JsonObject) new JsonParser().parse(requestData);
        JsonObject templateJson = (JsonObject) new JsonParser().parse(template);
        JsonObject result = new JsonObject();

        for (Map.Entry<String, JsonElement> entry : templateJson.entrySet()) {
            JsonElement temp = dataJson.get(entry.getKey());
            if (temp == null){
                throw new RuntimeException("Cannot find the value of key[" + entry.getKey() + "]");
            }
            result.add(entry.getKey(), temp);
        }


        return result.toString();
    }
}
