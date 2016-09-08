package com.ai.slp.route.api.routeitemmanage.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.route.api.routeitemmanage.interfaces.IRouteItemManageSV;
import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdQueryRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteGroupIdRequest;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemListResponse;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemPageSearchResponse;
import com.ai.slp.route.api.routeitemmanage.param.RouteItemResponse;
import com.ai.slp.route.service.business.interfaces.IRouteItemBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class RouteItemManageSVImpl implements IRouteItemManageSV {
	@Autowired
	private IRouteItemBusiSV routeItemBusiSV;

	@Override
	public RouteItemPageSearchResponse queryPageInfo(RouteGroupIdRequest request) throws BusinessException, SystemException {
		RouteItemPageSearchResponse response = new RouteItemPageSearchResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			response = this.routeItemBusiSV.queryPageInfo(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			
		}catch(Exception e){
			e.printStackTrace();
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
		}
		response.setResponseHeader(responseHeader);
		
		return response;
	}

	@Override
	public RouteItemListResponse queryRouteItemList(RouteGroupIdQueryRequest request)
			throws BusinessException, SystemException {
		RouteItemListResponse response = new RouteItemListResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			response = this.routeItemBusiSV.queryRouteItemList(request);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode("000000");
			responseHeader.setResultMessage("成功");
			
		}catch(Exception e){
			e.printStackTrace();
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode("999999");
			responseHeader.setResultMessage("失败");
		}
		response.setResponseHeader(responseHeader);
		//
		return response;
	}

}
