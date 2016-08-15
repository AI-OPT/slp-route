package com.ai.slp.route.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchVo;
import com.ai.slp.route.dao.mapper.bo.RouteProdSupply;
import com.ai.slp.route.service.atom.interfaces.IRouteProdSupplyAtomSV;
import com.ai.slp.route.service.business.interfaces.IRouteProdSupplyBusiSV;
@Service
public class RouteProdSupplyBusiSVImpl implements IRouteProdSupplyBusiSV {

	@Autowired
	private IRouteProdSupplyAtomSV routeProdSupplyAtomSV;

	@Override
	public RouteProdSupplyPageSearchResponse queryPageSearch(RouteProdSupplyPageSearchRequest request) {
		//
		RouteProdSupplyPageSearchResponse response = new RouteProdSupplyPageSearchResponse();
		//
		Integer pageNo = request.getPageNo();
		Integer pageSize = request.getPageSize();
		String routeId = request.getRouteId();
		String standedProdId = request.getStandedProdId();
		String supplyName = request.getSupplyName();
		String productCatId = request.getProductCatId();
		String tenantId = request.getTenantId();
		//
		RouteProdSupply routeProdSupply = new RouteProdSupply();
		//
		routeProdSupply.setTenantId(tenantId);
		routeProdSupply.setRouteId(routeId);
		routeProdSupply.setStandedProdId(standedProdId);
		routeProdSupply.setSupplyName(supplyName);
		routeProdSupply.setProductCatId(productCatId);
		//
		PageInfo<RouteProdSupply> pageInfo = this.routeProdSupplyAtomSV.queryRouteProdSupplyPageInfo(routeProdSupply, pageNo, pageSize);
		PageInfo<RouteProdSupplyPageSearchVo> voPageInfo = new PageInfo<RouteProdSupplyPageSearchVo>();
		voPageInfo.setCount(pageInfo.getCount());
		voPageInfo.setPageCount(pageInfo.getPageCount());
		voPageInfo.setPageNo(pageNo);
		voPageInfo.setPageSize(pageSize);
		//
		List<RouteProdSupplyPageSearchVo> voList = new ArrayList<RouteProdSupplyPageSearchVo>();
		RouteProdSupplyPageSearchVo vo = null;
		//
		int index = 0;
		for(RouteProdSupply routeProdSupplyVo : pageInfo.getResult()){
			index++;
			
			vo = new RouteProdSupplyPageSearchVo();
			//
			vo.setIndex((pageNo - 1) * pageSize + index);
			vo.setRouteId(routeProdSupplyVo.getRouteId());
			vo.setTenantId(routeProdSupplyVo.getTenantId());
			vo.setSupplyId(routeProdSupplyVo.getSupplyId());
			vo.setSupplyName(routeProdSupplyVo.getSupplyName());
			vo.setTotalNum(routeProdSupplyVo.getTotalNum());
			vo.setUsableNum(routeProdSupplyVo.getUsableNum());
			vo.setUsedNum(routeProdSupplyVo.getUsedNum());
			//
			voList.add(vo);
		}
		voPageInfo.setResult(voList);
		//
		response.setPageInfo(voPageInfo);
		//
		return response;
	}
}
