package com.ai.slp.route.api.routeprodsupplymanage.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.slp.route.api.routeprodsupplymanage.interfaces.IRouteProdSupplyManageSV;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateListRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteAmountResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddListRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyRouteIdRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdRouteListResponse;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.service.business.interfaces.IRouteProdSupplyBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class RouteProdSupplyManageSVImpl implements IRouteProdSupplyManageSV {

	@Autowired
	private IRouteProdSupplyBusiSV routeProdSupplyBusiSV;

	@Override
	public RouteProdSupplyPageSearchResponse queryPageSearch(RouteProdSupplyPageSearchRequest request)
			throws BusinessException, SystemException {
		RouteProdSupplyPageSearchResponse response = new RouteProdSupplyPageSearchResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		//
		if (null == request) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "请求参数不能为空");
		}
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "租户Id不能为空");
		}
		if (null == request.getPageNo()) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "页码不能为空");
		}
		if (null == request.getPageSize()) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "页面数量不能为空");
		}
		//
		try {
			response = this.routeProdSupplyBusiSV.queryPageSearch(request);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			//
			response.setResponseHeader(responseHeader);
		} catch (BusinessException e) {

			responseHeader.setResultCode(e.getErrorCode());
			responseHeader.setResultMessage(e.getErrorMessage());
			//
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {

			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			//
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public RouteProdSupplyUpdateUsableNumResponse updateUsableNum(RouteProdSupplyUpdateUsableNumRequest request)
			throws BusinessException, SystemException {
		RouteProdSupplyUpdateUsableNumResponse response = new RouteProdSupplyUpdateUsableNumResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		//
		try {
			response = this.routeProdSupplyBusiSV.updateUsableNum(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			//
			response.setResponseHeader(responseHeader);
		} catch (BusinessException e) {

			responseHeader.setResultCode(e.getErrorCode());
			responseHeader.setResultMessage(e.getErrorMessage());
			//
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {

			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			//
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public RouteProdSupplyAddResponse addRouteProdSupplyList(RouteProdSupplyAddListRequest request)
			throws BusinessException, SystemException {
		//
		RouteProdSupplyAddResponse response = new RouteProdSupplyAddResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		//
		try {
			response = this.routeProdSupplyBusiSV.addRouteProdSupplyList(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			//
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {
			e.printStackTrace();
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			//
			response.setResponseHeader(responseHeader);
		}
		//
		return response;
	}

	@Override
	public StandedProdIdListResponse queryStandedProdIdList(RouteProdSupplyRouteIdRequest request)
			throws BusinessException, SystemException {
		if (null == request) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "请求参数不能为空");
		}
		if (StringUtil.isBlank(request.getRouteId())) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "仓库id不能为空");
		}
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "租户id不能为空");
		}
		//
		StandedProdIdListResponse response = new StandedProdIdListResponse();

		ResponseHeader responseHeader = new ResponseHeader();
		//
		try {
			response = this.routeProdSupplyBusiSV.queryStandedProdIdList(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			//
			response.setResponseHeader(responseHeader);
		} catch (BusinessException e) {

			responseHeader.setResultCode(e.getErrorCode());
			responseHeader.setResultMessage(e.getErrorMessage());
			//
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			//
			response.setResponseHeader(responseHeader);
		}
		//
		return response;
	}

	@Override
	public RouteAmountResponse queryRouteAmount(StandedProdIdRequest request)
			throws BusinessException, SystemException {
		RouteAmountResponse response = new RouteAmountResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		if(null == request){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "请求参数不能为空");
		}
		if(StringUtil.isBlank(request.getStandedProdId())){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "商品id不能为空");
		}
		//
		try {

			response = this.routeProdSupplyBusiSV.queryRouteAmount(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			//
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			//
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public StandedProdRouteListResponse queryStandedProdRouteList(StandedProdIdRequest request)
			throws BusinessException, SystemException {
		StandedProdRouteListResponse response = new StandedProdRouteListResponse();
		
		ResponseHeader responseHeader = new ResponseHeader();
		if(null == request){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "请求参数不能为空");
		}
		if(StringUtil.isBlank(request.getStandedProdId())){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "商品id不能为空");
		}
		//
		try {
			response = this.routeProdSupplyBusiSV.queryStandedProdRouteList(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			//
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			//
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public CostPriceUpdateResponse updateCostPrice(CostPriceUpdateListRequest request)
			throws BusinessException, SystemException {
		CostPriceUpdateResponse response = new CostPriceUpdateResponse();
		

		ResponseHeader responseHeader = new ResponseHeader();
		if(null == request){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "请求参数不能为空");
		}
		if(CollectionUtil.isEmpty(request.getVoList())){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "请求参数集合不能为空");
		}
		//
		try {
			response = this.routeProdSupplyBusiSV.updateCostPrice(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			//
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			//
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

}
