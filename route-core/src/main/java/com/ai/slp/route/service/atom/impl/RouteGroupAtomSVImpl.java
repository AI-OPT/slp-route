package com.ai.slp.route.service.atom.impl;

import org.springframework.stereotype.Component;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.route.dao.mapper.bo.RouteGroup;
import com.ai.slp.route.dao.mapper.bo.RouteGroupCriteria;
import com.ai.slp.route.dao.mapper.factory.MapperFactory;
import com.ai.slp.route.dao.mapper.interfaces.RouteGroupMapper;
import com.ai.slp.route.service.atom.interfaces.IRouteGroupAtomSV;
@Component
public class RouteGroupAtomSVImpl implements IRouteGroupAtomSV {

	@Override
	public PageInfo<RouteGroup> queryPageInfo(RouteGroup routeGroup, Integer pageNo, Integer pageSize) {
		RouteGroupCriteria example = new RouteGroupCriteria();
		//
		RouteGroupCriteria.Criteria criteria = example.createCriteria();
		//
		if(!StringUtil.isBlank(routeGroup.getTenantId())){
			criteria.andTenantIdEqualTo(routeGroup.getTenantId());
		}
		if(!StringUtil.isBlank(routeGroup.getRouteGroupId())){
			criteria.andRouteGroupIdLike(routeGroup.getRouteGroupId());
		}
		if(!StringUtil.isBlank(routeGroup.getRouteGroupName())){
			criteria.andRouteGroupNameLike(routeGroup.getRouteGroupName());
		}
		//
		if (null != pageNo  && null != pageSize) {
            example.setLimitStart((pageNo - 1) * pageSize);
            example.setLimitEnd(pageSize);
        }
		//
		PageInfo<RouteGroup> pageInfo = new PageInfo<RouteGroup>();
		RouteGroupMapper mapper = MapperFactory.getRouteGroupMapper();
		pageInfo.setResult(mapper.selectByExample(example));
        pageInfo.setCount(mapper.countByExample(example));
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
		//
		return pageInfo;
	}


}
