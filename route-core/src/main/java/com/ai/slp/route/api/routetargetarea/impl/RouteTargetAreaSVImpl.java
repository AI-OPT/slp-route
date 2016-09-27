package com.ai.slp.route.api.routetargetarea.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.slp.route.api.routetargetarea.interfaces.IRouteTargetAreaSV;
import com.ai.slp.route.api.routetargetarea.param.AreaAddListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaAddListResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteAreaIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteAreaIdResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaDeleteResponse;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdResponse;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.service.business.interfaces.IRouteTargetAreaBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class RouteTargetAreaSVImpl implements IRouteTargetAreaSV {

	@Autowired
	private IRouteTargetAreaBusiSV routeTargetAreaBusiSV;

	@Override
	public AreaQueryByRouteItemIdResponse queryAreaListByRouteItemId(AreaQueryByRouteItemIdRequest request)
			throws BusinessException, SystemException {
		AreaQueryByRouteItemIdResponse response = new AreaQueryByRouteItemIdResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {

			response = this.routeTargetAreaBusiSV.queryAreaListByRouteItemId(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			response.setResponseHeader(responseHeader);

		} catch (Exception e) {
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public AreaQueryByRouteItemIdResponse queryAreaListByRouteItemIdList(AreaQueryByRouteItemIdListRequest request)
			throws BusinessException, SystemException {
		AreaQueryByRouteItemIdResponse response = new AreaQueryByRouteItemIdResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {

			response = this.routeTargetAreaBusiSV.queryAreaListByRouteItemIdList(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			response.setResponseHeader(responseHeader);

		} catch (Exception e) {
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public AreaAddListResponse addTargetAreaToList(AreaAddListRequest request)
			throws BusinessException, SystemException {
		AreaAddListResponse response = new AreaAddListResponse();
		ResponseHeader responseHeader = new ResponseHeader();

		try {

			response = this.routeTargetAreaBusiSV.addTargetAreaToList(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			response.setResponseHeader(responseHeader);

		} catch (Exception e) {
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public AreaDeleteResponse deleteByRouteItemId(AreaDeleteByRouteItemIdRequest request)
			throws BusinessException, SystemException {
		AreaDeleteResponse response = new AreaDeleteResponse();

		ResponseHeader responseHeader = new ResponseHeader();

		try {

			response = this.routeTargetAreaBusiSV.deleteByRouteItemId(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			response.setResponseHeader(responseHeader);

		} catch (Exception e) {
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public AreaDeleteByRouteAreaIdResponse deleteByRouteAreaId(AreaDeleteByRouteAreaIdRequest request)
			throws BusinessException, SystemException {
		
		AreaDeleteByRouteAreaIdResponse response = new AreaDeleteByRouteAreaIdResponse();
		//
		ResponseHeader responseHeader = new ResponseHeader();
		if(null == request){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"请求参数不能为空");
		}
		if(StringUtil.isBlank(request.getTenantId())){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"租户Id不能为空");
		}
		if(StringUtil.isBlank(request.getRouteAreaId())){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"区域主键编号不能为空");
		}
		
		try {

			response = this.routeTargetAreaBusiSV.deleteByRouteAreaId(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			response.setResponseHeader(responseHeader);

		}catch (BusinessException e) {
			
			responseHeader.setResultCode(e.getErrorCode());
			responseHeader.setResultMessage(e.getErrorMessage());
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

}
