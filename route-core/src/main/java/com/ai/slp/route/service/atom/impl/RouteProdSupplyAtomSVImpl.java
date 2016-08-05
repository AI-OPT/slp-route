package com.ai.slp.route.service.atom.impl;

import org.springframework.stereotype.Component;

import com.ai.opt.base.vo.PageInfo;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.slp.route.dao.mapper.bo.RouteProdSupply;
import com.ai.slp.route.dao.mapper.bo.RouteProdSupplyCriteria;
import com.ai.slp.route.dao.mapper.factory.MapperFactory;
import com.ai.slp.route.dao.mapper.interfaces.RouteProdSupplyMapper;
import com.ai.slp.route.service.atom.interfaces.IRouteProdSupplyAtomSV;

@Component
public class RouteProdSupplyAtomSVImpl implements IRouteProdSupplyAtomSV {

	@Override
	public PageInfo<RouteProdSupply> queryRouteProdSupplyPageInfo(RouteProdSupply routeProdSupply, Integer pageNo,
			Integer pageSize) {
		RouteProdSupplyCriteria example = new RouteProdSupplyCriteria();
		//
		RouteProdSupplyCriteria.Criteria criteria = example.createCriteria();
		//
		if(!StringUtil.isBlank(routeProdSupply.getTenantId())){
			criteria.andTenantIdEqualTo(routeProdSupply.getTenantId());
		}
		if(!StringUtil.isBlank(routeProdSupply.getRouteId())){
			criteria.andRouteIdEqualTo(routeProdSupply.getRouteId());
		}
		if(!StringUtil.isBlank(routeProdSupply.getStandedProdId())){
			criteria.andStandedProdIdLike(routeProdSupply.getStandedProdId());
		}
		if (null != pageNo  && null != pageSize) {
            example.setLimitStart((pageNo - 1) * pageSize);
            example.setLimitEnd(pageSize);
        }
		//
		PageInfo<RouteProdSupply> pageInfo = new PageInfo<RouteProdSupply>();
		RouteProdSupplyMapper mapper = MapperFactory.getRouteProdSupplyMapper();
		pageInfo.setResult(mapper.selectByExample(example));
        pageInfo.setCount(mapper.countByExample(example));
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
		//
        return pageInfo;
	}


}
