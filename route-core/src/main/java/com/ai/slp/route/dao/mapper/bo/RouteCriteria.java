package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class RouteCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public RouteCriteria() {
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

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("CONTRACT_ID like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("CONTRACT_ID not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andServIdIsNull() {
            addCriterion("SERV_ID is null");
            return (Criteria) this;
        }

        public Criteria andServIdIsNotNull() {
            addCriterion("SERV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andServIdEqualTo(Integer value) {
            addCriterion("SERV_ID =", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotEqualTo(Integer value) {
            addCriterion("SERV_ID <>", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdGreaterThan(Integer value) {
            addCriterion("SERV_ID >", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERV_ID >=", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdLessThan(Integer value) {
            addCriterion("SERV_ID <", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdLessThanOrEqualTo(Integer value) {
            addCriterion("SERV_ID <=", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdIn(List<Integer> values) {
            addCriterion("SERV_ID in", values, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotIn(List<Integer> values) {
            addCriterion("SERV_ID not in", values, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdBetween(Integer value1, Integer value2) {
            addCriterion("SERV_ID between", value1, value2, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SERV_ID not between", value1, value2, "servId");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNull() {
            addCriterion("ROUTE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNotNull() {
            addCriterion("ROUTE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRouteNameEqualTo(String value) {
            addCriterion("ROUTE_NAME =", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotEqualTo(String value) {
            addCriterion("ROUTE_NAME <>", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThan(String value) {
            addCriterion("ROUTE_NAME >", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_NAME >=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThan(String value) {
            addCriterion("ROUTE_NAME <", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_NAME <=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLike(String value) {
            addCriterion("ROUTE_NAME like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotLike(String value) {
            addCriterion("ROUTE_NAME not like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameIn(List<String> values) {
            addCriterion("ROUTE_NAME in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotIn(List<String> values) {
            addCriterion("ROUTE_NAME not in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameBetween(String value1, String value2) {
            addCriterion("ROUTE_NAME between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotBetween(String value1, String value2) {
            addCriterion("ROUTE_NAME not between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteTypeIsNull() {
            addCriterion("ROUTE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRouteTypeIsNotNull() {
            addCriterion("ROUTE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRouteTypeEqualTo(String value) {
            addCriterion("ROUTE_TYPE =", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeNotEqualTo(String value) {
            addCriterion("ROUTE_TYPE <>", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeGreaterThan(String value) {
            addCriterion("ROUTE_TYPE >", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_TYPE >=", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeLessThan(String value) {
            addCriterion("ROUTE_TYPE <", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_TYPE <=", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeLike(String value) {
            addCriterion("ROUTE_TYPE like", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeNotLike(String value) {
            addCriterion("ROUTE_TYPE not like", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeIn(List<String> values) {
            addCriterion("ROUTE_TYPE in", values, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeNotIn(List<String> values) {
            addCriterion("ROUTE_TYPE not in", values, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeBetween(String value1, String value2) {
            addCriterion("ROUTE_TYPE between", value1, value2, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeNotBetween(String value1, String value2) {
            addCriterion("ROUTE_TYPE not between", value1, value2, "routeType");
            return (Criteria) this;
        }

        public Criteria andProvCodeIsNull() {
            addCriterion("PROV_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvCodeIsNotNull() {
            addCriterion("PROV_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvCodeEqualTo(Long value) {
            addCriterion("PROV_CODE =", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotEqualTo(Long value) {
            addCriterion("PROV_CODE <>", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThan(Long value) {
            addCriterion("PROV_CODE >", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("PROV_CODE >=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThan(Long value) {
            addCriterion("PROV_CODE <", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThanOrEqualTo(Long value) {
            addCriterion("PROV_CODE <=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeIn(List<Long> values) {
            addCriterion("PROV_CODE in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotIn(List<Long> values) {
            addCriterion("PROV_CODE not in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeBetween(Long value1, Long value2) {
            addCriterion("PROV_CODE between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotBetween(Long value1, Long value2) {
            addCriterion("PROV_CODE not between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(Long value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(Long value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(Long value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(Long value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(Long value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<Long> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<Long> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(Long value1, Long value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(Long value1, Long value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Timestamp value) {
            addCriterion("BEGIN_DATE =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Timestamp value) {
            addCriterion("BEGIN_DATE <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Timestamp value) {
            addCriterion("BEGIN_DATE >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("BEGIN_DATE >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Timestamp value) {
            addCriterion("BEGIN_DATE <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("BEGIN_DATE <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Timestamp> values) {
            addCriterion("BEGIN_DATE in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Timestamp> values) {
            addCriterion("BEGIN_DATE not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BEGIN_DATE between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BEGIN_DATE not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Timestamp value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Timestamp value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Timestamp value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Timestamp value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Timestamp> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Timestamp> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
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

        public Criteria andCreateIdIsNull() {
            addCriterion("CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("CREATE_ID =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("CREATE_ID <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("CREATE_ID >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_ID >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("CREATE_ID <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_ID <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("CREATE_ID in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("CREATE_ID not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("CREATE_ID between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_ID not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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

        public Criteria andCountyCodeIsNull() {
            addCriterion("COUNTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNotNull() {
            addCriterion("COUNTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeEqualTo(Long value) {
            addCriterion("COUNTY_CODE =", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotEqualTo(Long value) {
            addCriterion("COUNTY_CODE <>", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThan(Long value) {
            addCriterion("COUNTY_CODE >", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNTY_CODE >=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThan(Long value) {
            addCriterion("COUNTY_CODE <", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThanOrEqualTo(Long value) {
            addCriterion("COUNTY_CODE <=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIn(List<Long> values) {
            addCriterion("COUNTY_CODE in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotIn(List<Long> values) {
            addCriterion("COUNTY_CODE not in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeBetween(Long value1, Long value2) {
            addCriterion("COUNTY_CODE between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotBetween(Long value1, Long value2) {
            addCriterion("COUNTY_CODE not between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
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