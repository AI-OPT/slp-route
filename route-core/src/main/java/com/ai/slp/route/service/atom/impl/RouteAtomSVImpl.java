package com.ai.slp.route.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.route.constants.RouteConstant;
import com.ai.slp.route.dao.mapper.bo.Route;
import com.ai.slp.route.dao.mapper.bo.RouteCriteria;
import com.ai.slp.route.dao.mapper.factory.MapperFactory;
import com.ai.slp.route.dao.mapper.interfaces.RouteMapper;
import com.ai.slp.route.service.atom.interfaces.IRouteAtomSV;
@Component
public class RouteAtomSVImpl implements IRouteAtomSV {

	@Override
	public void insert(Route route) {
		
		MapperFactory.getRouteMapper().insert(route);
		
	}

	@Override
	public PageInfo<Route> queryRouteListPageInfo(String tenantId,String routeId,String routeName,List<String> states,Integer pageNo,Integer pageSize) {
		RouteCriteria example = new RouteCriteria();
		//
		RouteCriteria.Criteria criteria = example.createCriteria();
		//
		if(!StringUtil.isBlank(tenantId)){
			criteria.andTenantIdEqualTo(tenantId);
		}
		if(!StringUtil.isBlank(routeId)){
			criteria.andRouteIdLike(routeId);
		}
		if(!StringUtil.isBlank(routeName)){
			criteria.andRouteNameLike("%"+routeName+"%");
		}
		if(!CollectionUtil.isEmpty(states)){
			criteria.andStateIn(states);
		}
		//如果仓库废弃就不显示 必传条件
		criteria.andStateNotEqualTo(RouteConstant.Route.State.ABANDONED);
		example.setOrderByClause(" create_time desc ");
		if (null != pageNo  && null != pageSize) {
            example.setLimitStart((pageNo - 1) * pageSize);
            example.setLimitEnd(pageSize);
        }
		//
		PageInfo<Route> pageInfo = new PageInfo<Route>();
		RouteMapper mapper = MapperFactory.getRouteMapper();
		pageInfo.setResult(mapper.selectByExample(example));
        pageInfo.setCount(mapper.countByExample(example));
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
		//
		return pageInfo;
	}

	@Override
	public void update(Route route) {
		
		MapperFactory.getRouteMapper().updateByPrimaryKeySelective(route);
		
	}

	@Override
	public Route findRouteInfo(String routeId) {
		return (Route)MapperFactory.getRouteMapper().selectByPrimaryKey(routeId);
	}

	@Override
	public List<Route> queryRouteList(String tenantId) {
		RouteCriteria example = new RouteCriteria();
		//
		RouteCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId);
		criteria.andStateNotEqualTo(RouteConstant.Route.State.ABANDONED);
		example.setOrderByClause(" create_time desc ");
		//
		return MapperFactory.getRouteMapper().selectByExample(example);
	}
	
}
