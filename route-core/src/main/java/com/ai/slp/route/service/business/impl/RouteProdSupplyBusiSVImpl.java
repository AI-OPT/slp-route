package com.ai.slp.route.service.business.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.product.api.productcat.interfaces.IProductCatSV;
import com.ai.slp.product.api.productcat.param.ProductCatInfo;
import com.ai.slp.product.api.productcat.param.ProductCatUniqueReq;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateListRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateVo;
import com.ai.slp.route.api.routeprodsupplymanage.param.ProductCatIdListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.ProductCatIdVo;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteAmountResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddListRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchVo;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyRouteIdRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdVo;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdRouteListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdRoutePageSearchResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdRouteVo;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.constants.RouteConstant;
import com.ai.slp.route.dao.mapper.bo.Route;
import com.ai.slp.route.dao.mapper.bo.RouteProdSupply;
import com.ai.slp.route.dao.mapper.bo.RouteSupplyAddsLog;
import com.ai.slp.route.service.atom.interfaces.IRouteAtomSV;
import com.ai.slp.route.service.atom.interfaces.IRouteProdSupplyAtomSV;
import com.ai.slp.route.service.atom.interfaces.IRouteSupplyAddsLogAtomSV;
import com.ai.slp.route.service.business.interfaces.IRouteProdSupplyBusiSV;
import com.ai.slp.route.util.SequenceUtil;
@Service
public class RouteProdSupplyBusiSVImpl implements IRouteProdSupplyBusiSV {

	@Autowired
	private IRouteProdSupplyAtomSV routeProdSupplyAtomSV;
	@Autowired
	private IRouteSupplyAddsLogAtomSV routeSupplyAddsLogAtomSV;
	@Autowired
	private IRouteAtomSV routeAtomSV;

	@Override
	public RouteProdSupplyPageSearchResponse queryPageSearch(RouteProdSupplyPageSearchRequest request) {
		//
		RouteProdSupplyPageSearchResponse response = new RouteProdSupplyPageSearchResponse();
		//
		Integer pageNo = request.getPageNo();
		Integer pageSize = request.getPageSize();
		String routeId = request.getRouteId();
		String standedProdId = request.getStandedProdId();
		String supplyId = request.getSupplyId();
		String supplyName = request.getSupplyName();
		String productCatId = request.getProductCatId();
		String tenantId = request.getTenantId();
		//
		RouteProdSupply routeProdSupply = new RouteProdSupply();
		//
		routeProdSupply.setTenantId(tenantId);
		routeProdSupply.setRouteId(routeId);
		routeProdSupply.setStandedProdId(standedProdId);
		routeProdSupply.setSupplyId(supplyId);
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
			vo.setStandedProdId(routeProdSupplyVo.getStandedProdId());
			//
			voList.add(vo);
		}
		voPageInfo.setResult(voList);
		//
		response.setPageInfo(voPageInfo);
		//
		return response;
	}
	@Override
	@Transactional
	public RouteProdSupplyUpdateUsableNumResponse updateUsableNum(RouteProdSupplyUpdateUsableNumRequest request){
		//
		RouteProdSupplyUpdateUsableNumResponse response = new RouteProdSupplyUpdateUsableNumResponse();
		
		//
		RouteProdSupply vo = this.routeProdSupplyAtomSV.getRouteProdSupplyByPrimaryKey(request.getSupplyId());
		
		//Long unsableNum = null == vo.getUsableNum()?0:vo.getUsableNum();
		//Long totalNum = null == vo.getTotalNum()?0:vo.getTotalNum();
		
		Long unsableNum = null;
		Long totalNum = null;
		if (vo != null) {
			unsableNum = null == vo.getUsableNum()?0:vo.getUsableNum();
			totalNum = null == vo.getTotalNum()?0:vo.getTotalNum();
			
		}
		
		Integer dbTotalNum = 0;
		if(null != vo){
			Integer requestUsableNum = Integer.parseInt(null == request.getUsableNum()?"0":request.getUsableNum().toString());
			dbTotalNum = Integer.parseInt(totalNum.toString()) + requestUsableNum;
		}
		if(dbTotalNum > 99999999){
			throw new BusinessException(ExceptCodeConstant.ERROR,"供货数量已超出99999999总量");
		}
		//
		RouteProdSupply routeProdSupply = new RouteProdSupply();
		//
		routeProdSupply.setSupplyId(request.getSupplyId());
		routeProdSupply.setUsableNum(request.getUsableNum() + unsableNum);
		routeProdSupply.setTotalNum(request.getUsableNum() + totalNum);
		//
		this.routeProdSupplyAtomSV.updateByPrimaryKeySelective(routeProdSupply);
		
		//添加仓库量
		RouteSupplyAddsLog routeSupplyAddsLog = new RouteSupplyAddsLog();
		routeSupplyAddsLog.setSupplyAddsLogId(SequenceUtil.createSupplyAddsLogId());
		routeSupplyAddsLog.setOperId(Long.valueOf(request.getOperId()));
		routeSupplyAddsLog.setOperTime(DateUtil.getSysDate());
		routeSupplyAddsLog.setSource("");
		routeSupplyAddsLog.setSupplyId(request.getSupplyId());
		routeSupplyAddsLog.setSupplyName(request.getSupplyName());
		routeSupplyAddsLog.setSupplyNum(request.getUsableNum());
		routeSupplyAddsLog.setBeforeUsableNum(unsableNum);
		//
		this.routeSupplyAddsLogAtomSV.insert(routeSupplyAddsLog);
		//
		return response;
	}
	@Override
	@Transactional
	public RouteProdSupplyAddResponse addRouteProdSupplyList(RouteProdSupplyAddListRequest request) {
		RouteProdSupplyAddResponse response = new RouteProdSupplyAddResponse();
		//
		RouteProdSupply routeProdSupply = null;
		RouteSupplyAddsLog routeSupplyAddsLog = null;
		String routeId = null;
		//
		for(RouteProdSupplyAddRequest addRequest : request.getRouteProdSupplyAddRequestList()){
			//
			routeId = addRequest.getRouteId();
			//
			routeProdSupply = new RouteProdSupply();
			//
			String supplyId = SequenceUtil.createSupplyId();
			//
			routeProdSupply.setTenantId(addRequest.getTenantId());
			routeProdSupply.setSupplyId(supplyId);
			routeProdSupply.setSupplyName(addRequest.getProdName());
			routeProdSupply.setStandedProdId(addRequest.getProdId());
			routeProdSupply.setRouteId(addRequest.getRouteId());
			routeProdSupply.setProductCatId(addRequest.getProdCatId());
			routeProdSupply.setUsableNum(addRequest.getAmount().longValue());
			routeProdSupply.setTotalNum(addRequest.getAmount().longValue());
			routeProdSupply.setOperId(Long.valueOf(addRequest.getOperId()));
			routeProdSupply.setOperTime(DateUtil.getSysDate());
			routeProdSupply.setState("1");
			//
			this.routeProdSupplyAtomSV.insert(routeProdSupply);

			//添加仓库量
			routeSupplyAddsLog = new RouteSupplyAddsLog();
			routeSupplyAddsLog.setSupplyAddsLogId(SequenceUtil.createSupplyAddsLogId());
			routeSupplyAddsLog.setOperId(Long.valueOf(addRequest.getOperId()));
			routeSupplyAddsLog.setOperTime(DateUtil.getSysDate());
			routeSupplyAddsLog.setSource("");
			routeSupplyAddsLog.setSupplyId(supplyId);
			routeSupplyAddsLog.setSupplyName(addRequest.getProdName());
			routeSupplyAddsLog.setSupplyNum(addRequest.getAmount().longValue());
			routeSupplyAddsLog.setBeforeUsableNum(0l);
			//
			this.routeSupplyAddsLogAtomSV.insert(routeSupplyAddsLog);
			
		}
		//
		if(!CollectionUtil.isEmpty(request.getRouteProdSupplyAddRequestList())){
			Route route = new Route();
			route.setRouteId(routeId);
			route.setState(RouteConstant.Route.State.NORMAL);
			this.routeAtomSV.update(route);
		}
		//
		return response;
	}
	@Override
	public StandedProdIdListResponse queryStandedProdIdList(RouteProdSupplyRouteIdRequest request) {
		StandedProdIdListResponse response = new StandedProdIdListResponse();
		//
		String routeId = request.getRouteId();
		String tenantId = request.getTenantId();
		
		List<RouteProdSupply> routeProdSupplyList = this.routeProdSupplyAtomSV.queryStandedProdIdList(routeId, tenantId);
		//
		List<StandedProdIdVo> voList = new ArrayList<StandedProdIdVo>();
		StandedProdIdVo standedProdIdVo = null;
		//
		for(RouteProdSupply routeProdSupply : routeProdSupplyList){
			standedProdIdVo = new StandedProdIdVo();
			//
			standedProdIdVo.setStandedProdId(routeProdSupply.getStandedProdId());
			//
			voList.add(standedProdIdVo);
		}
		//
		response.setList(voList);
		//
		return response;
	}
	@Override
	public RouteAmountResponse queryRouteAmount(StandedProdIdRequest request) {
		//
		RouteAmountResponse response = new RouteAmountResponse();
		
		String standedProdId = request.getStandedProdId();
		Integer routeAmount = this.routeProdSupplyAtomSV.queryRouteAmount(standedProdId);
		//
		response.setRouteAmount(routeAmount);
		//
		return response;
	}
	@Override
	public StandedProdRouteListResponse queryStandedProdRouteList(StandedProdIdRequest request) {
		StandedProdRouteListResponse response = new StandedProdRouteListResponse();
		//
		String standedProdId = request.getStandedProdId();
		List<RouteProdSupply> routeProdSupplyList = this.routeProdSupplyAtomSV.queryStandedProdRouteList(standedProdId);
		List<StandedProdRouteVo> voList = new ArrayList<StandedProdRouteVo>();
		StandedProdRouteVo vo = null;
		for(RouteProdSupply routeProdSupply : routeProdSupplyList){
			vo = new StandedProdRouteVo();
			//
			vo.setStandedProdId(standedProdId);
			vo.setRouteId(routeProdSupply.getRouteId());
			Route route = this.routeAtomSV.findRouteInfo(routeProdSupply.getRouteId());
			//
			if(null != route){
				vo.setRouteName(route.getRouteName());
			}
			vo.setUsableNum(routeProdSupply.getUsableNum());
			vo.setTotalNum(routeProdSupply.getTotalNum());
			//
			voList.add(vo);
		}
		response.setVoList(voList);
		//
		return response;
	}
	@Override
	@Transactional
	public CostPriceUpdateResponse updateCostPrice(CostPriceUpdateListRequest request) {
		CostPriceUpdateResponse response = new CostPriceUpdateResponse();
		
		List<CostPriceUpdateVo> voList = request.getVoList();
		//
		for(CostPriceUpdateVo vo : voList){
			String tenantId = vo.getTenantId();
			String routeId = vo.getRouteId();
			String standedProdId = vo.getStandedProdId();
			Long costPrice = vo.getCostPrice();
			String supplyId = vo.getSupplyId();
			//
			this.routeProdSupplyAtomSV.updateCostPrice(tenantId, routeId, standedProdId, costPrice,supplyId);
		}
		
		return response;
	}
	@Override
	public StandedProdRoutePageSearchResponse queryStandedProdRoutePageSearch(StandedProdIdPageSearchRequest request) {
		StandedProdRoutePageSearchResponse response = new StandedProdRoutePageSearchResponse();
		//
		String tenantId = request.getTenantId();
		String standedProdId = request.getStandedProdId();
		Integer pageNo = request.getPageNo();
		Integer pageSize = request.getPageSize();
		//
		PageInfo<RouteProdSupply> pageInfo = this.routeProdSupplyAtomSV.queryStandedProdRoutePageSearch(tenantId, standedProdId, pageNo, pageSize);
		PageInfo<StandedProdRouteVo> voPageInfo = new PageInfo<StandedProdRouteVo>();
		//
		voPageInfo.setCount(pageInfo.getCount());
		voPageInfo.setPageCount(pageInfo.getPageCount());
		voPageInfo.setPageNo(pageNo);
		voPageInfo.setPageSize(pageSize);
		//
		List<StandedProdRouteVo> voList = new ArrayList<StandedProdRouteVo>();
		StandedProdRouteVo vo = null;
		for(RouteProdSupply routeProdSupplyVo : pageInfo.getResult()){
			//
			vo = new StandedProdRouteVo();
			//
			vo.setRouteId(routeProdSupplyVo.getRouteId());
			Route route = this.routeAtomSV.findRouteInfo(routeProdSupplyVo.getRouteId());
			//
			if(null != route){
				vo.setRouteName(route.getRouteName());
			}
			vo.setStandedProdId(routeProdSupplyVo.getStandedProdId());
			vo.setTotalNum(routeProdSupplyVo.getTotalNum());
			vo.setUsableNum(routeProdSupplyVo.getUsableNum());
			vo.setSupplyName(routeProdSupplyVo.getSupplyName());
			vo.setSupplyId(routeProdSupplyVo.getSupplyId());
			vo.setTenantId(routeProdSupplyVo.getTenantId());
			vo.setCostPrice(routeProdSupplyVo.getCostPrice());
			//
			voList.add(vo);
		}
		voPageInfo.setResult(voList);
		response.setPageInfo(voPageInfo);
		//
		return response;
	}
	@Override
	public ProductCatIdListResponse queryProductCatList(RouteProdSupplyRouteIdRequest request) {
		//
		ProductCatIdListResponse response = new ProductCatIdListResponse();
		//
		String routeId = request.getRouteId();
		String tenantId = request.getTenantId();
		//
		List<RouteProdSupply> routeProdSupplyList = this.routeProdSupplyAtomSV.queryProductCatList(routeId, tenantId);
		List<ProductCatIdVo> voList = new ArrayList<ProductCatIdVo>();
		ProductCatIdVo vo = null;
		//
		Map<String,String> hashMap = new HashMap<String,String>();
		
		for(RouteProdSupply routeProdSupply : routeProdSupplyList){
			//
			if(!StringUtil.isBlank(routeProdSupply.getProductCatId())){
				hashMap.put(routeProdSupply.getProductCatId(), routeProdSupply.getProductCatId());
			}
		}
		//
		ProductCatInfo productCatInfo = null;
		//
		Iterator iterator = hashMap.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry entry = (Map.Entry) iterator.next();
			//
			vo = new ProductCatIdVo();
			//
			vo.setProductCatId(entry.getValue().toString());
			//
			ProductCatUniqueReq req = new ProductCatUniqueReq();
			//
			req.setProductCatId(entry.getValue().toString());
			req.setTenantId(request.getTenantId());
			//
			productCatInfo = new ProductCatInfo();
			productCatInfo = DubboConsumerFactory.getService(IProductCatSV.class).queryByCatId(req);
			vo.setProductCatName(productCatInfo.getProductCatName());
			//
			voList.add(vo);
		}
		//
		response.setVoList(voList);
		//
		return response;
		
	}
	@Override
	public RouteProdResponse addRouteProdSupply(RouteProdSupplyAddListRequest request) {
		RouteProdResponse response = new RouteProdResponse();
		//
		RouteProdSupply routeProdSupply = null;
		RouteSupplyAddsLog routeSupplyAddsLog = null;
		String routeId = null;
		//
		for(RouteProdSupplyAddRequest addRequest : request.getRouteProdSupplyAddRequestList()){
			//
			routeId = addRequest.getRouteId();
			//
			routeProdSupply = new RouteProdSupply();
			//
			String supplyId = SequenceUtil.createSupplyId();
			//
			routeProdSupply.setTenantId(addRequest.getTenantId());
			routeProdSupply.setSupplyId(supplyId);
			routeProdSupply.setSupplyName(addRequest.getProdName());
			routeProdSupply.setStandedProdId(addRequest.getProdId());
			routeProdSupply.setRouteId(addRequest.getRouteId());
			routeProdSupply.setProductCatId(addRequest.getProdCatId());
			routeProdSupply.setUsableNum(addRequest.getAmount().longValue());
			routeProdSupply.setTotalNum(addRequest.getAmount().longValue());
			routeProdSupply.setOperId(Long.valueOf(addRequest.getOperId()));
			routeProdSupply.setOperTime(DateUtil.getSysDate());
			routeProdSupply.setState("1");
			//
			this.routeProdSupplyAtomSV.insert(routeProdSupply);

			//添加仓库量
			routeSupplyAddsLog = new RouteSupplyAddsLog();
			routeSupplyAddsLog.setSupplyAddsLogId(SequenceUtil.createSupplyAddsLogId());
			routeSupplyAddsLog.setOperId(Long.valueOf(addRequest.getOperId()));
			routeSupplyAddsLog.setOperTime(DateUtil.getSysDate());
			routeSupplyAddsLog.setSource("");
			routeSupplyAddsLog.setSupplyId(supplyId);
			routeSupplyAddsLog.setSupplyName(addRequest.getProdName());
			routeSupplyAddsLog.setSupplyNum(addRequest.getAmount().longValue());
			routeSupplyAddsLog.setBeforeUsableNum(0l);
			//
			this.routeSupplyAddsLogAtomSV.insert(routeSupplyAddsLog);
			response.setSupplyId(supplyId);
		}
		//
		if(!CollectionUtil.isEmpty(request.getRouteProdSupplyAddRequestList())){
			Route route = new Route();
			route.setRouteId(routeId);
			route.setState(RouteConstant.Route.State.NORMAL);
			this.routeAtomSV.update(route);
		}
		//
		return response;
	}
}
