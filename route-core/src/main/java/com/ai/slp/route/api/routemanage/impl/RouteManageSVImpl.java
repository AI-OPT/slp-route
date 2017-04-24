package com.ai.slp.route.api.routemanage.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.route.api.routemanage.interfaces.IRouteManageSV;
import com.ai.slp.route.api.routemanage.param.RouteAddParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteAddParamResponse;
import com.ai.slp.route.api.routemanage.param.RouteIdParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteListRequest;
import com.ai.slp.route.api.routemanage.param.RouteListResponse;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchRequest;
import com.ai.slp.route.api.routemanage.param.RoutePageSearchResponse;
import com.ai.slp.route.api.routemanage.param.RouteQueryByGroupIdAndAreaRequest;
import com.ai.slp.route.api.routemanage.param.RouteQueryByGroupIdAndAreaResponse;
import com.ai.slp.route.api.routemanage.param.RouteResponse;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateParamResponse;
import com.ai.slp.route.api.routemanage.param.RouteUpdateStateRequest;
import com.ai.slp.route.api.routemanage.param.RouteUpdateStateResponse;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.service.business.interfaces.IRouteBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;

import sun.util.logging.resources.logging;
@Service
@Component
public class RouteManageSVImpl implements IRouteManageSV {

	private static final Logger logger = LoggerFactory.getLogger(RouteManageSVImpl.class);
	
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
	@Override
	public RouteUpdateParamResponse updateRoute(RouteUpdateParamRequest request)
			throws BusinessException, SystemException {
		//
		RouteUpdateParamResponse response = new RouteUpdateParamResponse();
		ResponseHeader responseHeader =new ResponseHeader();
		if(null == request){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"请求参数不能为空");
		}
		
		//
		try{
		
			response = this.routeBusiSV.updateRoute(request);
			
		}catch(Exception e){
			
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("仓库创建失败");
			//
			response.setResponseHeader(responseHeader);
		}
		//
		return response;
	}
	@Override
	public RouteUpdateStateResponse updateRouteState(RouteUpdateStateRequest request)
			throws BusinessException, SystemException {
		RouteUpdateStateResponse response = new RouteUpdateStateResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		//
		try{
			response = this.routeBusiSV.updateRouteState(request);
		}catch(Exception e){
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("仓库状态修改失败");
			//
			response.setResponseHeader(responseHeader);
		}
		//
		return response;
	}
	@Override
	public RouteResponse findRouteInfo(RouteIdParamRequest request) throws BusinessException, SystemException {
		RouteResponse response = new RouteResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			response = this.routeBusiSV.findRouteInfo(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("查询成功");
			response.setResponseHeader(responseHeader);
		}catch(Exception e){
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("查询失败");
			response.setResponseHeader(responseHeader);
		}
		
		return response;
	}
	@Override
	public RouteListResponse queryRouteList(RouteListRequest request) throws BusinessException, SystemException {
		RouteListResponse response = new RouteListResponse();
		//
		ResponseHeader responseHeader = new ResponseHeader();
		//
		if(null == request){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"请求参数不能为空");
		}
		if(StringUtil.isBlank(request.getTenantId())){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"租户id不能为空");
		}
		try{
			response = this.routeBusiSV.queryRouteList(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("查询成功");
			response.setResponseHeader(responseHeader);
		}catch(Exception e){
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("查询失败");
			response.setResponseHeader(responseHeader);
		}
		//
		return response;
	}
	@Override
	public RouteQueryByGroupIdAndAreaResponse queryRouteInfoByGroupIdAndArea(RouteQueryByGroupIdAndAreaRequest request)
			throws BusinessException, SystemException {
		RouteQueryByGroupIdAndAreaResponse response  = new RouteQueryByGroupIdAndAreaResponse();
		//
		ResponseHeader responseHeader = new ResponseHeader();
		//
		if(null == request){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"请求参数不能为空");
		}
		if(StringUtil.isBlank(request.getTenantId())){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"租户id不能为空");
		}
		if(StringUtil.isBlank(request.getRouteGroupId())){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"配货组id不能为空");
		}
		if(StringUtil.isBlank(request.getProvinceCode())){
			throw new BusinessException(ExceptCodeConstant.PARAM_IS_NULL,"省份编码不能为空");
		}
		
		try{
			response = this.routeBusiSV.queryRouteInfoByGroupIdAndArea(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("查询成功");
			response.setResponseHeader(responseHeader);
		}catch(BusinessException e){
			responseHeader.setResultCode(e.getErrorCode());
			responseHeader.setResultMessage(e.getErrorMessage());
			response.setResponseHeader(responseHeader);
		}catch(Exception e){
			logger.error("查询失败了:原因:"+JSON.toJSONString(e));
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("查询失败");
			response.setResponseHeader(responseHeader);
		}
		//
		return response;
	}
	
	

}
