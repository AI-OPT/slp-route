package com.ai.slp.route.api.routemanage.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.route.api.routemanage.interfaces.IRouteManageSV;
import com.ai.slp.route.api.routemanage.param.RouteAddParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteAddParamResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchRequest;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchResponse;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.service.business.interfaces.IRouteBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
@Service
@Component
public class RouteManageSVImpl implements IRouteManageSV {

	@Autowired
	private IRouteBusiSV routeBusiSV;
	
	@Override
	public RouteAddParamResponse addRoute(RouteAddParamRequest request) throws BusinessException, SystemException {
		//
		RouteAddParamResponse response = new RouteAddParamResponse();
		ResponseHeader responseHeader =new ResponseHeader();
		if(null == request){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"请求参数不能为空");
		}
		
		//
		try{
		
			response = this.routeBusiSV.addRoute(request);
			
		}catch(Exception e){
			
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("仓库创建失败");
			//
			response.setResponseHeader(responseHeader);
		}
		//
		return response;
	}
	/**
	 * 分页查询
	 */
	@Override
	public RoutePageSearchResponse queryPageSearch(RoutePageSearchRequest request)
			throws BusinessException, SystemException {
		//
		RoutePageSearchResponse response = new RoutePageSearchResponse();
		ResponseHeader responseHeader =new ResponseHeader();
		
		//
		if(null == request){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"请求参数不能为空");
		}
		if(StringUtil.isBlank(request.getTenantId())){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"租户id不能为空");
		}
		if(null == request.getPageNo()){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"页码不能为空");
		}
		if(null == request.getPageSize()){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"页面数量不能为空");
		}
		//
		try{
			response = this.routeBusiSV.queryPageSearch(request);
		}catch(BusinessException |SystemException e){
			
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
