package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class RouteProdSupplyCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public RouteProdSupplyCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSupplyIdIsNull() {
            addCriterion("SUPPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplyIdIsNotNull() {
            addCriterion("SUPPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyIdEqualTo(String value) {
            addCriterion("SUPPLY_ID =", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdNotEqualTo(String value) {
            addCriterion("SUPPLY_ID <>", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdGreaterThan(String value) {
            addCriterion("SUPPLY_ID >", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLY_ID >=", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdLessThan(String value) {
            addCriterion("SUPPLY_ID <", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLY_ID <=", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdLike(String value) {
            addCriterion("SUPPLY_ID like", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdNotLike(String value) {
            addCriterion("SUPPLY_ID not like", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdIn(List<String> values) {
            addCriterion("SUPPLY_ID in", values, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdNotIn(List<String> values) {
            addCriterion("SUPPLY_ID not in", values, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdBetween(String value1, String value2) {
            addCriterion("SUPPLY_ID between", value1, value2, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLY_ID not between", value1, value2, "supplyId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andSupplyNameIsNull() {
            addCriterion("SUPPLY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplyNameIsNotNull() {
            addCriterion("SUPPLY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyNameEqualTo(String value) {
            addCriterion("SUPPLY_NAME =", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotEqualTo(String value) {
            addCriterion("SUPPLY_NAME <>", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameGreaterThan(String value) {
            addCriterion("SUPPLY_NAME >", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLY_NAME >=", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameLessThan(String value) {
            addCriterion("SUPPLY_NAME <", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLY_NAME <=", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameLike(String value) {
            addCriterion("SUPPLY_NAME like", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotLike(String value) {
            addCriterion("SUPPLY_NAME not like", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameIn(List<String> values) {
            addCriterion("SUPPLY_NAME in", values, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotIn(List<String> values) {
            addCriterion("SUPPLY_NAME not in", values, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameBetween(String value1, String value2) {
            addCriterion("SUPPLY_NAME between", value1, value2, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotBetween(String value1, String value2) {
            addCriterion("SUPPLY_NAME not between", value1, value2, "supplyName");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNull() {
            addCriterion("ROUTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("ROUTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(String value) {
            addCriterion("ROUTE_ID =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(String value) {
            addCriterion("ROUTE_ID <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(String value) {
            addCriterion("ROUTE_ID >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_ID >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(String value) {
            addCriterion("ROUTE_ID <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_ID <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLike(String value) {
            addCriterion("ROUTE_ID like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotLike(String value) {
            addCriterion("ROUTE_ID not like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<String> values) {
            addCriterion("ROUTE_ID in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<String> values) {
            addCriterion("ROUTE_ID not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(String value1, String value2) {
            addCriterion("ROUTE_ID between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(String value1, String value2) {
            addCriterion("ROUTE_ID not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("SELLER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("SELLER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("SELLER_ID =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("SELLER_ID <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("SELLER_ID >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_ID >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(String value) {
            addCriterion("SELLER_ID <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("SELLER_ID <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("SELLER_ID like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("SELLER_ID not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<String> values) {
            addCriterion("SELLER_ID in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("SELLER_ID not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("SELLER_ID between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("SELLER_ID not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdIsNull() {
            addCriterion("CONTRACT_CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractCustIdIsNotNull() {
            addCriterion("CONTRACT_CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractCustIdEqualTo(String value) {
            addCriterion("CONTRACT_CUST_ID =", value, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdNotEqualTo(String value) {
            addCriterion("CONTRACT_CUST_ID <>", value, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdGreaterThan(String value) {
            addCriterion("CONTRACT_CUST_ID >", value, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CUST_ID >=", value, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdLessThan(String value) {
            addCriterion("CONTRACT_CUST_ID <", value, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CUST_ID <=", value, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdLike(String value) {
            addCriterion("CONTRACT_CUST_ID like", value, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdNotLike(String value) {
            addCriterion("CONTRACT_CUST_ID not like", value, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdIn(List<String> values) {
            addCriterion("CONTRACT_CUST_ID in", values, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdNotIn(List<String> values) {
            addCriterion("CONTRACT_CUST_ID not in", values, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_CUST_ID between", value1, value2, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andContractCustIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_CUST_ID not between", value1, value2, "contractCustId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdIsNull() {
            addCriterion("PRODUCT_CAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductCatIdIsNotNull() {
            addCriterion("PRODUCT_CAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductCatIdEqualTo(String value) {
            addCriterion("PRODUCT_CAT_ID =", value, "productCatId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdNotEqualTo(String value) {
            addCriterion("PRODUCT_CAT_ID <>", value, "productCatId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdGreaterThan(String value) {
            addCriterion("PRODUCT_CAT_ID >", value, "productCatId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CAT_ID >=", value, "productCatId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdLessThan(String value) {
            addCriterion("PRODUCT_CAT_ID <", value, "productCatId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CAT_ID <=", value, "productCatId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdLike(String value) {
            addCriterion("PRODUCT_CAT_ID like", value, "productCatId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdNotLike(String value) {
            addCriterion("PRODUCT_CAT_ID not like", value, "productCatId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdIn(List<String> values) {
            addCriterion("PRODUCT_CAT_ID in", values, "productCatId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdNotIn(List<String> values) {
            addCriterion("PRODUCT_CAT_ID not in", values, "productCatId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_CAT_ID between", value1, value2, "productCatId");
            return (Criteria) this;
        }

        public Criteria andProductCatIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CAT_ID not between", value1, value2, "productCatId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdIsNull() {
            addCriterion("STANDED_PROD_ID is null");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdIsNotNull() {
            addCriterion("STANDED_PROD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdEqualTo(String value) {
            addCriterion("STANDED_PROD_ID =", value, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdNotEqualTo(String value) {
            addCriterion("STANDED_PROD_ID <>", value, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdGreaterThan(String value) {
            addCriterion("STANDED_PROD_ID >", value, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdGreaterThanOrEqualTo(String value) {
            addCriterion("STANDED_PROD_ID >=", value, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdLessThan(String value) {
            addCriterion("STANDED_PROD_ID <", value, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdLessThanOrEqualTo(String value) {
            addCriterion("STANDED_PROD_ID <=", value, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdLike(String value) {
            addCriterion("STANDED_PROD_ID like", value, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdNotLike(String value) {
            addCriterion("STANDED_PROD_ID not like", value, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdIn(List<String> values) {
            addCriterion("STANDED_PROD_ID in", values, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdNotIn(List<String> values) {
            addCriterion("STANDED_PROD_ID not in", values, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdBetween(String value1, String value2) {
            addCriterion("STANDED_PROD_ID between", value1, value2, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andStandedProdIdNotBetween(String value1, String value2) {
            addCriterion("STANDED_PROD_ID not between", value1, value2, "standedProdId");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("COST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("COST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Long value) {
            addCriterion("COST_PRICE =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Long value) {
            addCriterion("COST_PRICE <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Long value) {
            addCriterion("COST_PRICE >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("COST_PRICE >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Long value) {
            addCriterion("COST_PRICE <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Long value) {
            addCriterion("COST_PRICE <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Long> values) {
            addCriterion("COST_PRICE in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Long> values) {
            addCriterion("COST_PRICE not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Long value1, Long value2) {
            addCriterion("COST_PRICE between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Long value1, Long value2) {
            addCriterion("COST_PRICE not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("TOTAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("TOTAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Long value) {
            addCriterion("TOTAL_NUM =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Long value) {
            addCriterion("TOTAL_NUM <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Long value) {
            addCriterion("TOTAL_NUM >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_NUM >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Long value) {
            addCriterion("TOTAL_NUM <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_NUM <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Long> values) {
            addCriterion("TOTAL_NUM in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Long> values) {
            addCriterion("TOTAL_NUM not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Long value1, Long value2) {
            addCriterion("TOTAL_NUM between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_NUM not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andUsableNumIsNull() {
            addCriterion("USABLE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andUsableNumIsNotNull() {
            addCriterion("USABLE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andUsableNumEqualTo(Long value) {
            addCriterion("USABLE_NUM =", value, "usableNum");
            return (Criteria) this;
        }

        public Criteria andUsableNumNotEqualTo(Long value) {
            addCriterion("USABLE_NUM <>", value, "usableNum");
            return (Criteria) this;
        }

        public Criteria andUsableNumGreaterThan(Long value) {
            addCriterion("USABLE_NUM >", value, "usableNum");
            return (Criteria) this;
        }

        public Criteria andUsableNumGreaterThanOrEqualTo(Long value) {
            addCriterion("USABLE_NUM >=", value, "usableNum");
            return (Criteria) this;
        }

        public Criteria andUsableNumLessThan(Long value) {
            addCriterion("USABLE_NUM <", value, "usableNum");
            return (Criteria) this;
        }

        public Criteria andUsableNumLessThanOrEqualTo(Long value) {
            addCriterion("USABLE_NUM <=", value, "usableNum");
            return (Criteria) this;
        }

        public Criteria andUsableNumIn(List<Long> values) {
            addCriterion("USABLE_NUM in", values, "usableNum");
            return (Criteria) this;
        }

        public Criteria andUsableNumNotIn(List<Long> values) {
            addCriterion("USABLE_NUM not in", values, "usableNum");
            return (Criteria) this;
        }

        public Criteria andUsableNumBetween(Long value1, Long value2) {
            addCriterion("USABLE_NUM between", value1, value2, "usableNum");
            return (Criteria) this;
        }

        public Criteria andUsableNumNotBetween(Long value1, Long value2) {
            addCriterion("USABLE_NUM not between", value1, value2, "usableNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumIsNull() {
            addCriterion("USED_NUM is null");
            return (Criteria) this;
        }

        public Criteria andUsedNumIsNotNull() {
            addCriterion("USED_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andUsedNumEqualTo(Long value) {
            addCriterion("USED_NUM =", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotEqualTo(Long value) {
            addCriterion("USED_NUM <>", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumGreaterThan(Long value) {
            addCriterion("USED_NUM >", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumGreaterThanOrEqualTo(Long value) {
            addCriterion("USED_NUM >=", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumLessThan(Long value) {
            addCriterion("USED_NUM <", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumLessThanOrEqualTo(Long value) {
            addCriterion("USED_NUM <=", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumIn(List<Long> values) {
            addCriterion("USED_NUM in", values, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotIn(List<Long> values) {
            addCriterion("USED_NUM not in", values, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumBetween(Long value1, Long value2) {
            addCriterion("USED_NUM between", value1, value2, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotBetween(Long value1, Long value2) {
            addCriterion("USED_NUM not between", value1, value2, "usedNum");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNull() {
            addCriterion("OPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNotNull() {
            addCriterion("OPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperIdEqualTo(Long value) {
            addCriterion("OPER_ID =", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotEqualTo(Long value) {
            addCriterion("OPER_ID <>", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThan(Long value) {
            addCriterion("OPER_ID >", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPER_ID >=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThan(Long value) {
            addCriterion("OPER_ID <", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThanOrEqualTo(Long value) {
            addCriterion("OPER_ID <=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdIn(List<Long> values) {
            addCriterion("OPER_ID in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotIn(List<Long> values) {
            addCriterion("OPER_ID not in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdBetween(Long value1, Long value2) {
            addCriterion("OPER_ID between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotBetween(Long value1, Long value2) {
            addCriterion("OPER_ID not between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNull() {
            addCriterion("OPER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNotNull() {
            addCriterion("OPER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperTimeEqualTo(Timestamp value) {
            addCriterion("OPER_TIME =", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotEqualTo(Timestamp value) {
            addCriterion("OPER_TIME <>", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThan(Timestamp value) {
            addCriterion("OPER_TIME >", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("OPER_TIME >=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThan(Timestamp value) {
            addCriterion("OPER_TIME <", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("OPER_TIME <=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeIn(List<Timestamp> values) {
            addCriterion("OPER_TIME in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotIn(List<Timestamp> values) {
            addCriterion("OPER_TIME not in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPER_TIME between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("OPER_TIME not between", value1, value2, "operTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}