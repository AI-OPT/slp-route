package com.ai.slp.route.service.atom.interfaces;

import java.util.List;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.dao.mapper.bo.RouteProdSupply;

public interface IRouteProdSupplyAtomSV {
	public PageInfo<RouteProdSupply> queryRouteProdSupplyPageInfo(RouteProdSupply routeProdSupply,Integer pageNo,Integer pageSize);
	public void updateByPrimaryKeySelective(RouteProdSupply routeProdSupply);
	public RouteProdSupply getRouteProdSupplyByPrimaryKey(String supplyId);
	public void insert(RouteProdSupply routeProdSupply);
	
	public List<RouteProdSupply> queryStandedProdIdList(String routeId,String tenantId);
	
	public Integer queryRouteAmount(String standedProdId);
	public List<RouteProdSupply> queryStandedProdRouteList(String standedProdId);
}
