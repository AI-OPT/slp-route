package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class RouteItemCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public RouteItemCriteria() {
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

        public Criteria andRouteItemIdIsNull() {
            addCriterion("ROUTE_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdIsNotNull() {
            addCriterion("ROUTE_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdEqualTo(String value) {
            addCriterion("ROUTE_ITEM_ID =", value, "routeItemId");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdNotEqualTo(String value) {
            addCriterion("ROUTE_ITEM_ID <>", value, "routeItemId");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdGreaterThan(String value) {
            addCriterion("ROUTE_ITEM_ID >", value, "routeItemId");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_ITEM_ID >=", value, "routeItemId");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdLessThan(String value) {
            addCriterion("ROUTE_ITEM_ID <", value, "routeItemId");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_ITEM_ID <=", value, "routeItemId");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdLike(String value) {
            addCriterion("ROUTE_ITEM_ID like", value, "routeItemId");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdNotLike(String value) {
            addCriterion("ROUTE_ITEM_ID not like", value, "routeItemId");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdIn(List<String> values) {
            addCriterion("ROUTE_ITEM_ID in", values, "routeItemId");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdNotIn(List<String> values) {
            addCriterion("ROUTE_ITEM_ID not in", values, "routeItemId");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdBetween(String value1, String value2) {
            addCriterion("ROUTE_ITEM_ID between", value1, value2, "routeItemId");
            return (Criteria) this;
        }

        public Criteria andRouteItemIdNotBetween(String value1, String value2) {
            addCriterion("ROUTE_ITEM_ID not between", value1, value2, "routeItemId");
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

        public Criteria andPriorityNumberIsNull() {
            addCriterion("PRIORITY_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPriorityNumberIsNotNull() {
            addCriterion("PRIORITY_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityNumberEqualTo(Short value) {
            addCriterion("PRIORITY_NUMBER =", value, "priorityNumber");
            return (Criteria) this;
        }

        public Criteria andPriorityNumberNotEqualTo(Short value) {
            addCriterion("PRIORITY_NUMBER <>", value, "priorityNumber");
            return (Criteria) this;
        }

        public Criteria andPriorityNumberGreaterThan(Short value) {
            addCriterion("PRIORITY_NUMBER >", value, "priorityNumber");
            return (Criteria) this;
        }

        public Criteria andPriorityNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("PRIORITY_NUMBER >=", value, "priorityNumber");
            return (Criteria) this;
        }

        public Criteria andPriorityNumberLessThan(Short value) {
            addCriterion("PRIORITY_NUMBER <", value, "priorityNumber");
            return (Criteria) this;
        }

        public Criteria andPriorityNumberLessThanOrEqualTo(Short value) {
            addCriterion("PRIORITY_NUMBER <=", value, "priorityNumber");
            return (Criteria) this;
        }

        public Criteria andPriorityNumberIn(List<Short> values) {
            addCriterion("PRIORITY_NUMBER in", values, "priorityNumber");
            return (Criteria) this;
        }

        public Criteria andPriorityNumberNotIn(List<Short> values) {
            addCriterion("PRIORITY_NUMBER not in", values, "priorityNumber");
            return (Criteria) this;
        }

        public Criteria andPriorityNumberBetween(Short value1, Short value2) {
            addCriterion("PRIORITY_NUMBER between", value1, value2, "priorityNumber");
            return (Criteria) this;
        }

        public Criteria andPriorityNumberNotBetween(Short value1, Short value2) {
            addCriterion("PRIORITY_NUMBER not between", value1, value2, "priorityNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("SERIAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("SERIAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(Short value) {
            addCriterion("SERIAL_NUMBER =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(Short value) {
            addCriterion("SERIAL_NUMBER <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(Short value) {
            addCriterion("SERIAL_NUMBER >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("SERIAL_NUMBER >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(Short value) {
            addCriterion("SERIAL_NUMBER <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(Short value) {
            addCriterion("SERIAL_NUMBER <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<Short> values) {
            addCriterion("SERIAL_NUMBER in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<Short> values) {
            addCriterion("SERIAL_NUMBER not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(Short value1, Short value2) {
            addCriterion("SERIAL_NUMBER between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(Short value1, Short value2) {
            addCriterion("SERIAL_NUMBER not between", value1, value2, "serialNumber");
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