package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class RouteGroupCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public RouteGroupCriteria() {
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

        public Criteria andRouteGroupIdIsNull() {
            addCriterion("ROUTE_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdIsNotNull() {
            addCriterion("ROUTE_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdEqualTo(String value) {
            addCriterion("ROUTE_GROUP_ID =", value, "routeGroupId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdNotEqualTo(String value) {
            addCriterion("ROUTE_GROUP_ID <>", value, "routeGroupId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdGreaterThan(String value) {
            addCriterion("ROUTE_GROUP_ID >", value, "routeGroupId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_GROUP_ID >=", value, "routeGroupId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdLessThan(String value) {
            addCriterion("ROUTE_GROUP_ID <", value, "routeGroupId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_GROUP_ID <=", value, "routeGroupId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdLike(String value) {
            addCriterion("ROUTE_GROUP_ID like", value, "routeGroupId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdNotLike(String value) {
            addCriterion("ROUTE_GROUP_ID not like", value, "routeGroupId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdIn(List<String> values) {
            addCriterion("ROUTE_GROUP_ID in", values, "routeGroupId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdNotIn(List<String> values) {
            addCriterion("ROUTE_GROUP_ID not in", values, "routeGroupId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdBetween(String value1, String value2) {
            addCriterion("ROUTE_GROUP_ID between", value1, value2, "routeGroupId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupIdNotBetween(String value1, String value2) {
            addCriterion("ROUTE_GROUP_ID not between", value1, value2, "routeGroupId");
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

        public Criteria andRouteGroupNameIsNull() {
            addCriterion("ROUTE_GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameIsNotNull() {
            addCriterion("ROUTE_GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameEqualTo(String value) {
            addCriterion("ROUTE_GROUP_NAME =", value, "routeGroupName");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameNotEqualTo(String value) {
            addCriterion("ROUTE_GROUP_NAME <>", value, "routeGroupName");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameGreaterThan(String value) {
            addCriterion("ROUTE_GROUP_NAME >", value, "routeGroupName");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_GROUP_NAME >=", value, "routeGroupName");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameLessThan(String value) {
            addCriterion("ROUTE_GROUP_NAME <", value, "routeGroupName");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_GROUP_NAME <=", value, "routeGroupName");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameLike(String value) {
            addCriterion("ROUTE_GROUP_NAME like", value, "routeGroupName");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameNotLike(String value) {
            addCriterion("ROUTE_GROUP_NAME not like", value, "routeGroupName");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameIn(List<String> values) {
            addCriterion("ROUTE_GROUP_NAME in", values, "routeGroupName");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameNotIn(List<String> values) {
            addCriterion("ROUTE_GROUP_NAME not in", values, "routeGroupName");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameBetween(String value1, String value2) {
            addCriterion("ROUTE_GROUP_NAME between", value1, value2, "routeGroupName");
            return (Criteria) this;
        }

        public Criteria andRouteGroupNameNotBetween(String value1, String value2) {
            addCriterion("ROUTE_GROUP_NAME not between", value1, value2, "routeGroupName");
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("SUPPLIER_ID =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("SUPPLIER_ID <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("SUPPLIER_ID >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ID >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("SUPPLIER_ID <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ID <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("SUPPLIER_ID like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("SUPPLIER_ID not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("SUPPLIER_ID in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("SUPPLIER_ID not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ID between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ID not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeIsNull() {
            addCriterion("ROUTE_GROUP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeIsNotNull() {
            addCriterion("ROUTE_GROUP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeEqualTo(String value) {
            addCriterion("ROUTE_GROUP_TYPE =", value, "routeGroupType");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeNotEqualTo(String value) {
            addCriterion("ROUTE_GROUP_TYPE <>", value, "routeGroupType");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeGreaterThan(String value) {
            addCriterion("ROUTE_GROUP_TYPE >", value, "routeGroupType");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_GROUP_TYPE >=", value, "routeGroupType");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeLessThan(String value) {
            addCriterion("ROUTE_GROUP_TYPE <", value, "routeGroupType");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_GROUP_TYPE <=", value, "routeGroupType");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeLike(String value) {
            addCriterion("ROUTE_GROUP_TYPE like", value, "routeGroupType");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeNotLike(String value) {
            addCriterion("ROUTE_GROUP_TYPE not like", value, "routeGroupType");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeIn(List<String> values) {
            addCriterion("ROUTE_GROUP_TYPE in", values, "routeGroupType");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeNotIn(List<String> values) {
            addCriterion("ROUTE_GROUP_TYPE not in", values, "routeGroupType");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeBetween(String value1, String value2) {
            addCriterion("ROUTE_GROUP_TYPE between", value1, value2, "routeGroupType");
            return (Criteria) this;
        }

        public Criteria andRouteGroupTypeNotBetween(String value1, String value2) {
            addCriterion("ROUTE_GROUP_TYPE not between", value1, value2, "routeGroupType");
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