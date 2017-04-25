package com.ai.slp.route.api.routegroupmanage.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.slp.route.api.routegroupmanage.interfaces.IRouteGroupManageSV;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupAddRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupAddResponse;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchResponse;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupStateRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupStateResponse;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.service.business.interfaces.IRouteGroupBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;

@Service
@Component
public class RouteGroupManageSVImpl implements IRouteGroupManageSV {

	private static final Logger logger = LoggerFactory.getLogger(RouteGroupManageSVImpl.class);
	@Autowired
	private IRouteGroupBusiSV routeGroupBusiSV;

	@Override
	public RouteGroupPageSearchResponse queryPageSearch(RouteGroupPageSearchRequest request)
			throws BusinessException, SystemException {
		RouteGroupPageSearchResponse response = new RouteGroupPageSearchResponse();
		//
		ResponseHeader responseHeader = new ResponseHeader();
		//
		if (null == request) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "请求参数不能为空");
		}
		if (null == request.getPageNo()) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "页码不能为空");
		}
		if (null == request.getPageSize()) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "页面数量不能为空");
		}
		try {
			response = this.routeGroupBusiSV.queryPageSearch(request);
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
		//
		return response;
	}

	@Override
	public RouteGroupAddResponse insertRouteGroup(RouteGroupAddRequest request)
			throws BusinessException, SystemException {
		RouteGroupAddResponse response = new RouteGroupAddResponse();
		//
		ResponseHeader responseHeader = new ResponseHeader();
		//
		if (null == request) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "请求参数不能为空");
		}
		if (StringUtil.isBlank(request.getStandedProdId())) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "标准品Id不能为空");
		}
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "租户Id不能为空");
		}
		if (StringUtil.isBlank(request.getStandedProdName())) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "标准品名称不能为空");
		}
		if (null == request.getOperId()) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "操作者编号不能为空");
		}
		//
		try {
			response = this.routeGroupBusiSV.insertRouteGroup(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			//
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {
			logger.error("操作失败" + JSON.toJSONString(e));
			if (e instanceof BusinessException) {
				responseHeader.setResultCode(((BusinessException) e).getErrorCode());
				responseHeader.setResultMessage(((BusinessException) e).getErrorMessage());
			} else {
				responseHeader.setResultCode("999999");
				responseHeader.setResultMessage("操作失败");
			}
			//
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public RouteGroupStateResponse findRouteGroupState(RouteGroupStateRequest request)
			throws BusinessException, SystemException {
		RouteGroupStateResponse response = new RouteGroupStateResponse();
		//

		//
		ResponseHeader responseHeader = new ResponseHeader();
		//
		if (null == request) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "请求参数不能为空");
		}

		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "租户Id不能为空");
		}

		if (StringUtil.isBlank(request.getRouteGroupId())) {
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL, "配货组Id不能为空");
		}
		//
		try {
			response = this.routeGroupBusiSV.findRouteGroupState(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			//
			response.setResponseHeader(responseHeader);
		} catch (BusinessException e) {
			// e.printStackTrace();
			responseHeader.setResultCode(e.getErrorCode());
			responseHeader.setResultMessage(e.getErrorMessage());
			//
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {
			// e.printStackTrace();
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			//
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

}
