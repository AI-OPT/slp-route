package com.ai.slp.route.api.supplyproduct.param;

import com.ai.opt.base.vo.BaseInfo;

/**
 * Created by xin on 16-5-30.
 */
public class SupplyProductQueryVo extends BaseInfo {
    private String routeId;
    private String standardProductId;
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
