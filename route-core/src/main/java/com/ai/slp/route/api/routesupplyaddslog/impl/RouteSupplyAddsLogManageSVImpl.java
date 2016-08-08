package com.ai.slp.route.api.routesupplyaddslog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.slp.route.api.routesupplyaddslog.interfaces.IRouteSupplyAddsLogManageSV;
import com.ai.slp.route.api.routesupplyaddslog.param.RouteSupplyAddsLogPageSearchRequest;
import com.ai.slp.route.api.routesupplyaddslog.param.RouteSupplyAddsLogPageSearchResponse;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.service.business.interfaces.IRouteSupplyAddsLogBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
@Service
@Component
public class RouteSupplyAddsLogManageSVImpl implements IRouteSupplyAddsLogManageSV {

	@Autowired
	private IRouteSupplyAddsLogBusiSV routeSupplyAddsLogBusiSV;

	@Override
	public RouteSupplyAddsLogPageSearchResponse queryPageSearch(RouteSupplyAddsLogPageSearchRequest request)
			throws BusinessException, SystemException {
		RouteSupplyAddsLogPageSearchResponse response = new RouteSupplyAddsLogPageSearchResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		//
		if(null == request){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"请求参数不能为空");
		}
		
		if(null == request.getPageNo()){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"页码不能为空");
		}
		if(null == request.getPageSize()){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"页面数量不能为空");
		}
		try{
			response = this.routeSupplyAddsLogBusiSV.queryPageSearch(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			//
			response.setResponseHeader(responseHeader);
		}catch(BusinessException e){
			
			responseHeader.setResultCode(e.getErrorCode());
			responseHeader.setResultMessage(e.getErrorMessage());
			//
			response.setResponseHeader(responseHeader);
		}catch(Exception e){
			
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			//
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

}
