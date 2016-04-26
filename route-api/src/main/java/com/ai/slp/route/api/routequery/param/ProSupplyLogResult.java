package com.ai.slp.route.api.routequery.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 供货记录查询返回参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public class ProSupplyLogResult extends BaseResponse {

    private static final long serialVersionUID = 1L;

    List<ProdSupplyAddsLogVo> prodSupplyAddsLogVos = null;

    public List<ProdSupplyAddsLogVo> getProdSupplyAddsLogVos() {
        return prodSupplyAddsLogVos;
    }

    public void setProdSupplyAddsLogVos(List<ProdSupplyAddsLogVo> prodSupplyAddsLogVos) {
        this.prodSupplyAddsLogVos = prodSupplyAddsLogVos;
    }

}
