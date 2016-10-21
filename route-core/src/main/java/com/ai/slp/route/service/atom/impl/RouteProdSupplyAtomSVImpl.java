package com.ai.slp.route.service.atom.impl;

import java.util.List;

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
			criteria.andStandedProdIdLike("%"+routeProdSupply.getStandedProdId()+"%");
		}
		if(!StringUtil.isBlank(routeProdSupply.getSupplyId())){
			criteria.andSupplyIdLike("%"+routeProdSupply.getSupplyId()+"%");
		}
		if(!StringUtil.isBlank(routeProdSupply.getSupplyName())){
			criteria.andSupplyNameLike("%"+routeProdSupply.getSupplyName()+"%");
		}
		if(!StringUtil.isBlank(routeProdSupply.getProductCatId())){
			criteria.andProductCatIdEqualTo(routeProdSupply.getProductCatId());
		}
		example.setOrderByClause(" oper_time desc ");
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

	@Override
	public void updateByPrimaryKeySelective(RouteProdSupply routeProdSupply) {
		MapperFactory.getRouteProdSupplyMapper().updateByPrimaryKeySelective(routeProdSupply);
	}

	@Override
	public RouteProdSupply getRouteProdSupplyByPrimaryKey(String supplyId) {
		return MapperFactory.getRouteProdSupplyMapper().selectByPrimaryKey(supplyId);
	}

	@Override
	public void insert(RouteProdSupply routeProdSupply) {
		MapperFactory.getRouteProdSupplyMapper().insert(routeProdSupply);
		
	}

	@Override
	public List<RouteProdSupply> queryStandedProdIdList(String routeId, String tenantId) {
		RouteProdSupplyCriteria example = new RouteProdSupplyCriteria();
		RouteProdSupplyCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andTenantIdEqualTo(tenantId);
		//
		criteria.andRouteIdEqualTo(routeId);
		//
		return MapperFactory.getRouteProdSupplyMapper().selectByExample(example);
	}

	@Override
	public Integer queryRouteAmount(String standedProdId) {
		RouteProdSupplyCriteria example = new RouteProdSupplyCriteria();
		RouteProdSupplyCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andStandedProdIdEqualTo(standedProdId);
		//
		return MapperFactory.getRouteProdSupplyMapper().countByExample(example);
	}

	@Override
	public List<RouteProdSupply> queryStandedProdRouteList(String standedProdId) {
		RouteProdSupplyCriteria example = new RouteProdSupplyCriteria();
		RouteProdSupplyCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andStandedProdIdEqualTo(standedProdId);
		//
		return MapperFactory.getRouteProdSupplyMapper().selectByExample(example);
	}

	@Override
	public void updateCostPrice(String tenantId, String routeId, String standedProdId, Long costPrice,String supplyId) {
		//
		RouteProdSupply record = new RouteProdSupply();
		record.setCostPrice(costPrice);
		//
		RouteProdSupplyCriteria example = new RouteProdSupplyCriteria();
		RouteProdSupplyCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId);
		criteria.andRouteIdEqualTo(routeId);
		criteria.andStandedProdIdEqualTo(standedProdId);
		criteria.andSupplyIdEqualTo(supplyId);
		//
		MapperFactory.getRouteProdSupplyMapper().updateByExampleSelective(record, example);
	}

	@Override
	public PageInfo<RouteProdSupply> queryStandedProdRoutePageSearch(String tenantId, String standedProdId,Integer pageNo,Integer pageSize) {
		RouteProdSupplyCriteria example = new RouteProdSupplyCriteria();
		RouteProdSupplyCriteria.Criteria criteria = example.createCriteria();
		//
		criteria.andTenantIdEqualTo(tenantId);
		criteria.andStandedProdIdEqualTo(standedProdId);
		criteria.andStateNotEqualTo("0");
		if(null != pageNo && null != pageSize){
			 example.setLimitStart((pageNo - 1) * pageSize);
	         example.setLimitEnd(pageSize);
		}
		PageInfo<RouteProdSupply> pageInfo = new PageInfo<RouteProdSupply>();
		RouteProdSupplyMapper mapper = MapperFactory.getRouteProdSupplyMapper();
		pageInfo.setResult(mapper.selectByExample(example));
        pageInfo.setCount(mapper.countByExample(example));
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
		//
		return pageInfo;
	
	}

	@Override
	public List<RouteProdSupply> queryProductCatList(String routeId, String tenantId) {
		RouteProdSupplyCriteria example = new RouteProdSupplyCriteria();
		RouteProdSupplyCriteria.Criteria criteria = example.createCriteria();
		//
		
		criteria.andTenantIdEqualTo(tenantId);
		//
		criteria.andRouteIdEqualTo(routeId);
		example.isDistinct();
		//
		return MapperFactory.getRouteProdSupplyMapper().selectByExample(example);
	}

	@Override
	public void updateState(String routeId, String tenantId,String state) {
		
		//
		RouteProdSupply record = new RouteProdSupply();
		record.setState(state);
		//
		RouteProdSupplyCriteria example = new RouteProdSupplyCriteria();
		RouteProdSupplyCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId);
		criteria.andRouteIdEqualTo(routeId);
		//
		MapperFactory.getRouteProdSupplyMapper().updateByExampleSelective(record, example);
	
	}


}
