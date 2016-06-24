package com.ai.slp.route.api.supplyproduct.param;

import com.ai.opt.base.vo.BaseInfo;

/**
 * Created by xin on 16-5-30.
 */
public class SupplyProductQueryVo extends BaseInfo {
    /**
     * 路由标识
     */
    private String routeId;
    /**
     * 标准品标识
     */
    private String standardProductId;
    /**
     * 购买量
     */
    private int saleCount;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStandardProductId() {
        return standardProductId;
    }

    public void setStandardProductId(String standardProductId) {
        this.standardProductId = standardProductId;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }
}
