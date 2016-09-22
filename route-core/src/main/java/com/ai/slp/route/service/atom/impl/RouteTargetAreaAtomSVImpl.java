package com.ai.slp.route.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.slp.route.dao.mapper.bo.RouteTargetArea;
import com.ai.slp.route.dao.mapper.bo.RouteTargetAreaCriteria;
import com.ai.slp.route.dao.mapper.factory.MapperFactory;
import com.ai.slp.route.service.atom.interfaces.IRouteTargetAreaAtomSV;
@Component
public class RouteTargetAreaAtomSVImpl implements IRouteTargetAreaAtomSV {


	@Override
	public void deleteByRouteItemId(String routeItemId) {
		RouteTargetAreaCriteria example = new RouteTargetAreaCriteria();
		RouteTargetAreaCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andRouteItemIdEqualTo(routeItemId);
		//
		MapperFactory.getRouteTargetAreaMapper().deleteByExample(example);
		//
		
	}

	@Override
	public List<RouteTargetArea> queryAreaListForRouteItemId(String routeItemId) {
		RouteTargetAreaCriteria example = new RouteTargetAreaCriteria();
		RouteTargetAreaCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andRouteItemIdEqualTo(routeItemId);
		//
		return MapperFactory.getRouteTargetAreaMapper().selectByExample(example);
	}

	@Override
	public List<RouteTargetArea> queryAreaListForRouteItemId(String tenantId, String routeItemId) {
		RouteTargetAreaCriteria example = new RouteTargetAreaCriteria();
		RouteTargetAreaCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andTenantIdEqualTo(tenantId);
		criteria.andRouteItemIdEqualTo(routeItemId);
		//
		return MapperFactory.getRouteTargetAreaMapper().selectByExample(example);
	}

	@Override
	public List<RouteTargetArea> queryAreaListByRouteItemIdList(String tenantId, List<String> routeItemIds) {
		RouteTargetAreaCriteria example = new RouteTargetAreaCriteria();
		RouteTargetAreaCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andTenantIdEqualTo(tenantId);
		criteria.andRouteItemIdIn(routeItemIds);
		//
		return MapperFactory.getRouteTargetAreaMapper().selectByExample(example);
	}

	@Override
	public void insertSelective(RouteTargetArea routeTargetArea) {
		MapperFactory.getRouteTargetAreaMapper().insertSelective(routeTargetArea);
		
	}

	@Override
	public void delete(String tenantId, String routeItemId) {
		RouteTargetAreaCriteria example = new RouteTargetAreaCriteria();
		RouteTargetAreaCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andTenantIdEqualTo(tenantId);
		criteria.andRouteItemIdEqualTo(routeItemId);
		//
		MapperFactory.getRouteTargetAreaMapper().deleteByExample(example);
	}

	@Override
	public void deleteByRouteAreaId(String tenantId, String routeAreaId) {

		RouteTargetAreaCriteria example = new RouteTargetAreaCriteria();
		RouteTargetAreaCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andTenantIdEqualTo(tenantId);
		criteria.andRouteAreaIdEqualTo(routeAreaId);
		//
		MapperFactory.getRouteTargetAreaMapper().deleteByExample(example);
	}

	@Override
	public RouteTargetArea queryTargetAreaByItemIdListAndAreaCode(List<String> routeItemIdList, String provinceCode,String tenantId) {
		RouteTargetAreaCriteria example = new RouteTargetAreaCriteria();
		//
		RouteTargetAreaCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andTenantIdEqualTo(tenantId);
		//
		criteria.andRouteItemIdIn(routeItemIdList);
		//
		criteria.andProvCodeEqualTo(Integer.parseInt(provinceCode));
		//
		List<RouteTargetArea> routeTargetAreaList = MapperFactory.getRouteTargetAreaMapper().selectByExample(example);
		RouteTargetArea routeTargetArea = null;
		if(!CollectionUtil.isEmpty(routeTargetAreaList)){
			routeTargetArea = routeTargetAreaList.get(0);
		}
		return routeTargetArea;
	}

}
