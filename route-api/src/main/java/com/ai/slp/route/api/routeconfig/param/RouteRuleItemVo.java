package com.ai.slp.route.api.routeconfig.param;

import java.io.Serializable;

/**
 * 路由规则项目 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class RouteRuleItemVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由规则项
     */
    private String routeRuleItem;

    /**
     * 阈值
     */
    private long warningValue;

    /**
     * 路由类型
     */
    private String routeRuleType;

    /**
     * 时段类型
     */
    private String timeType;

    /**
     * 周期值
     */
    private String cycleValue;

    /**
     * 周期单位
     */
    private String cycleUnit;

    /**
     * 自定义开始时间
     */
    private String beginDate;

    /**
     * 自定义结束时间
     */
    private String endDate;

    public String getRouteRuleItem() {
        return routeRuleItem;
    }

    public void setRouteRuleItem(String routeRuleItem) {
        this.routeRuleItem = routeRuleItem;
    }

    public long getWarningValue() {
        return warningValue;
    }

    public void setWarningValue(long warningValue) {
        this.warningValue = warningValue;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public String getCycleValue() {
        return cycleValue;
    }

    public void setCycleValue(String cycleValue) {
        this.cycleValue = cycleValue;
    }

    public String getCycleUnit() {
        return cycleUnit;
    }

    public void setCycleUnit(String cycleUnit) {
        this.cycleUnit = cycleUnit;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRouteRuleType() {
        return routeRuleType;
    }

    public void setRouteRuleType(String routeRuleType) {
        this.routeRuleType = routeRuleType;
    }

}
