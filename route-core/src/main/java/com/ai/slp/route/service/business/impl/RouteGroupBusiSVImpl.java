package com.ai.slp.route.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.slp.product.api.product.interfaces.IProductServerSV;
import com.ai.slp.product.api.product.param.RouteGroupSet;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupAddRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupAddResponse;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchResponse;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchVo;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupStateRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupStateResponse;
import com.ai.slp.route.constants.ExceptCodeConstant;
import com.ai.slp.route.dao.mapper.bo.RouteGroup;
import com.ai.slp.route.dao.mapper.bo.RouteItem;
import com.ai.slp.route.dao.mapper.bo.RouteProdSupply;
import com.ai.slp.route.service.atom.interfaces.IRouteGroupAtomSV;
import com.ai.slp.route.service.atom.interfaces.IRouteItemAtomSV;
import com.ai.slp.route.service.atom.interfaces.IRouteProdSupplyAtomSV;
import com.ai.slp.route.service.business.interfaces.IRouteGroupBusiSV;
import com.ai.slp.route.util.SequenceUtil;

@Service
public class RouteGroupBusiSVImpl implements IRouteGroupBusiSV {

	@Autowired
	private IRouteGroupAtomSV routeGroupAtomSV;
	@Autowired
	private IRouteItemAtomSV routeItemAtomSV;
	@Autowired
	private IRouteProdSupplyAtomSV routeProdSupplyAtomSV;

	@Override
	public RouteGroupPageSearchResponse queryPageSearch(RouteGroupPageSearchRequest request) {
		RouteGroupPageSearchResponse response = new RouteGroupPageSearchResponse();
		//
		RouteGroup routeGroup = new RouteGroup();
		//
		routeGroup.setTenantId(request.getTenantId());
		routeGroup.setRouteGroupId(request.getRouteGroupId());
		routeGroup.setRouteGroupName(request.getRouteGroupName());
		//
		Integer pageNo = request.getPageNo();
		Integer pageSize = request.getPageSize();
		//
		PageInfo<RouteGroup> pageInfo = this.routeGroupAtomSV.queryPageInfo(routeGroup, pageNo, pageSize);
		PageInfo<RouteGroupPageSearchVo> voPageInfo = new PageInfo<RouteGroupPageSearchVo>();
		voPageInfo.setCount(pageInfo.getCount());
		voPageInfo.setPageCount(pageInfo.getPageCount());
		voPageInfo.setPageNo(pageNo);
		voPageInfo.setPageSize(pageSize);
		//
		List<RouteGroupPageSearchVo> voList = new ArrayList<RouteGroupPageSearchVo>();
		RouteGroupPageSearchVo vo = null;
		//
		for (RouteGroup routeGroupVo : pageInfo.getResult()) {
			vo = new RouteGroupPageSearchVo();
			//
			vo.setTenantId(routeGroupVo.getTenantId());
			vo.setRouteGroupId(routeGroupVo.getRouteGroupId());
			vo.setRouteGroupName(routeGroupVo.getRouteGroupName());
			vo.setOperId(String.valueOf(routeGroupVo.getOperId()));
			vo.setOperTime(routeGroupVo.getOperTime());
			vo.setState(routeGroupVo.getState());
			//
			voList.add(vo);
		}
		voPageInfo.setResult(voList);
		//
		response.setPageInfo(voPageInfo);
		//
		return response;
	}

	@Transactional
	public RouteGroupAddResponse insertRouteGroup(RouteGroupAddRequest request) {
		//
		RouteGroupAddResponse response = new RouteGroupAddResponse();
		//
		String routeGroupId = request.getRouteGroupId();// SequenceUtil.createRouteGroupId();
		String routeGroupName = request.getStandedProdName() + "-配货组";
		Long operId = request.getOperId();
		//
		RouteGroup routeGroupDb = this.routeGroupAtomSV.findRouteGroup(routeGroupId);
		//
		if (null == routeGroupDb) {
			RouteGroup routeGroup = new RouteGroup();
			//
			routeGroupId = SequenceUtil.createRouteGroupId();
			//
			routeGroup.setTenantId(request.getTenantId());
			routeGroup.setRouteGroupId(routeGroupId);
			routeGroup.setRouteGroupName(routeGroupName);
			routeGroup.setOperId(operId);
			routeGroup.setOperTime(DateUtil.getSysDate());
			routeGroup.setRouteGroupType("C");
			routeGroup.setState("1");
			routeGroup.setSupplierId("-1");
			//
			this.routeGroupAtomSV.insert(routeGroup);
		}

		//
		String standedProdId = request.getStandedProdId();
		List<RouteProdSupply> routeProdSupplyList = this.routeProdSupplyAtomSV.queryStandedProdRouteList(standedProdId);
		if(CollectionUtil.isEmpty(routeProdSupplyList)){
			throw new BusinessException("999999","此商品下没有可供选择的仓库信息，请您将此商品添加到相应的仓库中");
		}
		RouteItem routeItem = null;
		String routeItemId = null;
		//
		List<String> routeItems = new ArrayList<>();
		List<RouteItem> routeItemList = this.routeItemAtomSV.findRouteItemByRouteGroupId(routeGroupId);
		//
		for (RouteProdSupply routeProdSupply : routeProdSupplyList) {
			boolean flag = this.routeIdInList(routeProdSupply.getRouteId(), routeItemList);
			if (!flag) {
				//
				routeItemId = SequenceUtil.createRouteItemId();
				//
				routeItem = new RouteItem();
				routeItem.setOperId(operId);
				routeItem.setOperTime(DateUtil.getSysDate());
				routeItem.setRouteGroupId(routeGroupId);
				routeItem.setRouteId(routeProdSupply.getRouteId());
				routeItem.setState("1");
				routeItem.setRouteItemId(routeItemId);
				//
				routeItems.add(routeItemId);
				this.routeItemAtomSV.insert(routeItem);
			}else{
				for (RouteItem routeItem2 : routeItemList) {
					routeItems.add(routeItem2.getRouteItemId());
				}
			}
		}
		//
		RouteGroupSet routeGroupSet = new RouteGroupSet();
		routeGroupSet.setOperId(operId);
		routeGroupSet.setProdId(request.getProductId());
		routeGroupSet.setRouteGroupId(routeGroupId);
		routeGroupSet.setSupplierId("-1");
		routeGroupSet.setTenantId(request.getTenantId());
		//
		DubboConsumerFactory.getService(IProductServerSV.class).changeRouteGroup(routeGroupSet);
		//
		response.setRouteGroupId(routeGroupId);
		response.setRouteItemIds(routeItems);
		//如果routeItem表数据不为空，那么就将路由组状态修改为2
		//if(!CollectionUtil.isEmpty(routeItemList)){
			this.routeGroupAtomSV.updateState("2", routeGroupId);
		//}
		//
		return response;
	}
	
    
	public boolean routeIdInList(String routeId, List<RouteItem> routeItemList) {
		boolean flag = false;
		for (RouteItem routeItem : routeItemList) {
			if (routeId == routeItem.getRouteId() || routeId.equals(routeItem.getRouteId())) {
				flag = true;
				break;
			}
		}
		//
		return flag;
	}

	@Override
	public RouteGroupStateResponse findRouteGroupState(RouteGroupStateRequest request) {
		RouteGroupStateResponse response = new RouteGroupStateResponse();
		//
		String tenantId = request.getTenantId();
		String routeGroupId = request.getRouteGroupId();
		//
		RouteGroup routeGroup = this.routeGroupAtomSV.findRouteGroup(tenantId, routeGroupId);
		if(null != routeGroup){
			response.setState(routeGroup.getState());
		}else{
			throw new BusinessException(ExceptCodeConstant.ERROR,"未查询到相关配货组信息");
		}
		return response;
	}
}
