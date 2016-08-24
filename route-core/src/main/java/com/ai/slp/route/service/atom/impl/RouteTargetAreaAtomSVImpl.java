package com.ai.slp.route.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

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

}
