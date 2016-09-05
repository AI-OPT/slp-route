package com.ai.slp.route.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.route.dao.mapper.bo.RouteItem;
import com.ai.slp.route.dao.mapper.bo.RouteItemCriteria;
import com.ai.slp.route.dao.mapper.factory.MapperFactory;
import com.ai.slp.route.dao.mapper.interfaces.RouteItemMapper;
import com.ai.slp.route.service.atom.interfaces.IRouteItemAtomSV;

@Component
public class RouteItemAtomSVImpl implements IRouteItemAtomSV {

	@Override
	public PageInfo<RouteItem> queryPageSearch(RouteItem routeItem, Integer pageNo, Integer pageSize) {
		RouteItemCriteria example = new RouteItemCriteria();
		RouteItemCriteria.Criteria criteria = example.createCriteria();
		//
		if (null != routeItem.getRouteGroupId()) {
			criteria.andRouteGroupIdEqualTo(routeItem.getRouteGroupId());
		}
		//
		if (null != pageNo && null != pageSize) {
			example.setLimitStart((pageNo - 1) * pageSize);
			example.setLimitEnd(pageSize);
		}
		//
		RouteItemMapper mapper = MapperFactory.getRouteItemMapper();
		PageInfo<RouteItem> pageInfo = new PageInfo<RouteItem>();
		//
		pageInfo.setCount(mapper.countByExample(example));
		pageInfo.setPageNo(pageNo);
		pageInfo.setPageSize(pageSize);
		pageInfo.setResult(mapper.selectByExample(example));
		//
		return pageInfo;
	}

	@Override
	public void deleteByPrimaryKey(String routeItemId) {
		MapperFactory.getRouteItemMapper().deleteByPrimaryKey(routeItemId);
	}

	@Override
	public void insert(RouteItem routeItem) {
		MapperFactory.getRouteItemMapper().insertSelective(routeItem);
		
	}

	@Override
	public List<RouteItem> findRouteItemByRouteGroupId(String routeGroupId) {
		RouteItemCriteria example = new RouteItemCriteria();
		RouteItemCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andRouteGroupIdEqualTo(routeGroupId);
		//
		return MapperFactory.getRouteItemMapper().selectByExample(example);
		
	}

}
