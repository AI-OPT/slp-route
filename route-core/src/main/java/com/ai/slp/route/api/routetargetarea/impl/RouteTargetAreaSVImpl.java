package com.ai.slp.route.api.routetargetarea.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.route.api.routetargetarea.interfaces.IRouteTargetAreaSV;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdListRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdRequest;
import com.ai.slp.route.api.routetargetarea.param.AreaQueryByRouteItemIdResponse;
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
		try{
			
			response = this.routeTargetAreaBusiSV.queryAreaListByRouteItemId(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			response.setResponseHeader(responseHeader);

		}catch(Exception e){
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
		try{
			
			response = this.routeTargetAreaBusiSV.queryAreaListByRouteItemIdList(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			response.setResponseHeader(responseHeader);

		}catch(Exception e){
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

}
