package com.ai.slp.route.service.atom.impl;

import org.springframework.stereotype.Component;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.route.dao.mapper.bo.RouteSupplyAddsLog;
import com.ai.slp.route.dao.mapper.bo.RouteSupplyAddsLogCriteria;
import com.ai.slp.route.dao.mapper.factory.MapperFactory;
import com.ai.slp.route.dao.mapper.interfaces.RouteSupplyAddsLogMapper;
import com.ai.slp.route.service.atom.interfaces.IRouteSupplyAddsLogAtomSV;
@Component
public class RouteSupplyAddsLogAtomSVImpl implements IRouteSupplyAddsLogAtomSV {

	@Override
	public PageInfo<RouteSupplyAddsLog> queryPageInfo(RouteSupplyAddsLog routeSupplyAddsLog,Integer pageNo,Integer pageSize) {
		RouteSupplyAddsLogCriteria example = new RouteSupplyAddsLogCriteria();
		//
		RouteSupplyAddsLogCriteria.Criteria criteria = example.createCriteria();
		if(!StringUtil.isBlank(routeSupplyAddsLog.getSupplyId())){
			criteria.andSupplyIdLike("%"+routeSupplyAddsLog.getSupplyId()+"%");
		}
		if(!StringUtil.isBlank(routeSupplyAddsLog.getSupplyName())){
			criteria.andSupplyNameLike("%"+routeSupplyAddsLog.getSupplyName()+"%");
		}
		example.setOrderByClause(" oper_time desc ");
		if (null != pageNo  && null != pageSize) {
            example.setLimitStart((pageNo - 1) * pageSize);
            example.setLimitEnd(pageSize);
        }
		//
		PageInfo<RouteSupplyAddsLog> pageInfo = new PageInfo<RouteSupplyAddsLog>();
		RouteSupplyAddsLogMapper mapper = MapperFactory.getRouteSupplyAddsLogMapper();
		pageInfo.setResult(mapper.selectByExample(example));
        pageInfo.setCount(mapper.countByExample(example));
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
        //
		return pageInfo;
	}

	@Override
	public void insert(RouteSupplyAddsLog routeSupplyAddsLog) {
		MapperFactory.getRouteSupplyAddsLogMapper().insert(routeSupplyAddsLog);
		
	}

	
}
