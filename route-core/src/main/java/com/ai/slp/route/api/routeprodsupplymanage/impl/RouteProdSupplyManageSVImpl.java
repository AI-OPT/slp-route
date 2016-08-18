package com.ai.slp.route.api.routeprodsupplymanage.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.slp.route.api.routeprodsupplymanage.interfaces.IRouteProdSupplyManageSV;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumResponse;
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

}
