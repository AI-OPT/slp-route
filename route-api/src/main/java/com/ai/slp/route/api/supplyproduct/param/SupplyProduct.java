package com.ai.slp.route.api.supplyproduct.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * Created by xin on 16-5-30.
 */
public class SupplyProduct extends BaseResponse {
    /**
     *供应商标识
     */
    private String sellerId;
    /**
     *供应品标识
     */
    private String supplyId;
    /**
     *成本价
     */
    private long costPrice;

    public SupplyProduct() {
    }

    public SupplyProduct(String sellerId, String supplyId, long costPrice) {
        this.sellerId = sellerId;
        this.supplyId = supplyId;
        this.costPrice = costPrice;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(String supplyId) {
        this.supplyId = supplyId;
    }

    public long getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(long costPrice) {
        this.costPrice = costPrice;
    }
}
