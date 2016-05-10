package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class RouteRuleCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public RouteRuleCriteria() {
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

        public Criteria andRouteRuleIdIsNull() {
            addCriterion("ROUTE_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdIsNotNull() {
            addCriterion("ROUTE_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdEqualTo(String value) {
            addCriterion("ROUTE_RULE_ID =", value, "routeRuleId");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdNotEqualTo(String value) {
            addCriterion("ROUTE_RULE_ID <>", value, "routeRuleId");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdGreaterThan(String value) {
            addCriterion("ROUTE_RULE_ID >", value, "routeRuleId");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_RULE_ID >=", value, "routeRuleId");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdLessThan(String value) {
            addCriterion("ROUTE_RULE_ID <", value, "routeRuleId");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_RULE_ID <=", value, "routeRuleId");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdLike(String value) {
            addCriterion("ROUTE_RULE_ID like", value, "routeRuleId");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdNotLike(String value) {
            addCriterion("ROUTE_RULE_ID not like", value, "routeRuleId");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdIn(List<String> values) {
            addCriterion("ROUTE_RULE_ID in", values, "routeRuleId");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdNotIn(List<String> values) {
            addCriterion("ROUTE_RULE_ID not in", values, "routeRuleId");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdBetween(String value1, String value2) {
            addCriterion("ROUTE_RULE_ID between", value1, value2, "routeRuleId");
            return (Criteria) this;
        }

        public Criteria andRouteRuleIdNotBetween(String value1, String value2) {
            addCriterion("ROUTE_RULE_ID not between", value1, value2, "routeRuleId");
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

        public Criteria andRouteRuleTypeIsNull() {
            addCriterion("ROUTE_RULE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeIsNotNull() {
            addCriterion("ROUTE_RULE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeEqualTo(String value) {
            addCriterion("ROUTE_RULE_TYPE =", value, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeNotEqualTo(String value) {
            addCriterion("ROUTE_RULE_TYPE <>", value, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeGreaterThan(String value) {
            addCriterion("ROUTE_RULE_TYPE >", value, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_RULE_TYPE >=", value, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeLessThan(String value) {
            addCriterion("ROUTE_RULE_TYPE <", value, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_RULE_TYPE <=", value, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeLike(String value) {
            addCriterion("ROUTE_RULE_TYPE like", value, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeNotLike(String value) {
            addCriterion("ROUTE_RULE_TYPE not like", value, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeIn(List<String> values) {
            addCriterion("ROUTE_RULE_TYPE in", values, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeNotIn(List<String> values) {
            addCriterion("ROUTE_RULE_TYPE not in", values, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeBetween(String value1, String value2) {
            addCriterion("ROUTE_RULE_TYPE between", value1, value2, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleTypeNotBetween(String value1, String value2) {
            addCriterion("ROUTE_RULE_TYPE not between", value1, value2, "routeRuleType");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemIsNull() {
            addCriterion("ROUTE_RULE_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemIsNotNull() {
            addCriterion("ROUTE_RULE_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemEqualTo(String value) {
            addCriterion("ROUTE_RULE_ITEM =", value, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemNotEqualTo(String value) {
            addCriterion("ROUTE_RULE_ITEM <>", value, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemGreaterThan(String value) {
            addCriterion("ROUTE_RULE_ITEM >", value, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTE_RULE_ITEM >=", value, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemLessThan(String value) {
            addCriterion("ROUTE_RULE_ITEM <", value, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemLessThanOrEqualTo(String value) {
            addCriterion("ROUTE_RULE_ITEM <=", value, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemLike(String value) {
            addCriterion("ROUTE_RULE_ITEM like", value, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemNotLike(String value) {
            addCriterion("ROUTE_RULE_ITEM not like", value, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemIn(List<String> values) {
            addCriterion("ROUTE_RULE_ITEM in", values, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemNotIn(List<String> values) {
            addCriterion("ROUTE_RULE_ITEM not in", values, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemBetween(String value1, String value2) {
            addCriterion("ROUTE_RULE_ITEM between", value1, value2, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andRouteRuleItemNotBetween(String value1, String value2) {
            addCriterion("ROUTE_RULE_ITEM not between", value1, value2, "routeRuleItem");
            return (Criteria) this;
        }

        public Criteria andWarningValueIsNull() {
            addCriterion("WARNING_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andWarningValueIsNotNull() {
            addCriterion("WARNING_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWarningValueEqualTo(Long value) {
            addCriterion("WARNING_VALUE =", value, "warningValue");
            return (Criteria) this;
        }

        public Criteria andWarningValueNotEqualTo(Long value) {
            addCriterion("WARNING_VALUE <>", value, "warningValue");
            return (Criteria) this;
        }

        public Criteria andWarningValueGreaterThan(Long value) {
            addCriterion("WARNING_VALUE >", value, "warningValue");
            return (Criteria) this;
        }

        public Criteria andWarningValueGreaterThanOrEqualTo(Long value) {
            addCriterion("WARNING_VALUE >=", value, "warningValue");
            return (Criteria) this;
        }

        public Criteria andWarningValueLessThan(Long value) {
            addCriterion("WARNING_VALUE <", value, "warningValue");
            return (Criteria) this;
        }

        public Criteria andWarningValueLessThanOrEqualTo(Long value) {
            addCriterion("WARNING_VALUE <=", value, "warningValue");
            return (Criteria) this;
        }

        public Criteria andWarningValueIn(List<Long> values) {
            addCriterion("WARNING_VALUE in", values, "warningValue");
            return (Criteria) this;
        }

        public Criteria andWarningValueNotIn(List<Long> values) {
            addCriterion("WARNING_VALUE not in", values, "warningValue");
            return (Criteria) this;
        }

        public Criteria andWarningValueBetween(Long value1, Long value2) {
            addCriterion("WARNING_VALUE between", value1, value2, "warningValue");
            return (Criteria) this;
        }

        public Criteria andWarningValueNotBetween(Long value1, Long value2) {
            addCriterion("WARNING_VALUE not between", value1, value2, "warningValue");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNull() {
            addCriterion("TIME_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNotNull() {
            addCriterion("TIME_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeEqualTo(String value) {
            addCriterion("TIME_TYPE =", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotEqualTo(String value) {
            addCriterion("TIME_TYPE <>", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThan(String value) {
            addCriterion("TIME_TYPE >", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_TYPE >=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThan(String value) {
            addCriterion("TIME_TYPE <", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThanOrEqualTo(String value) {
            addCriterion("TIME_TYPE <=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLike(String value) {
            addCriterion("TIME_TYPE like", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotLike(String value) {
            addCriterion("TIME_TYPE not like", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIn(List<String> values) {
            addCriterion("TIME_TYPE in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotIn(List<String> values) {
            addCriterion("TIME_TYPE not in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeBetween(String value1, String value2) {
            addCriterion("TIME_TYPE between", value1, value2, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotBetween(String value1, String value2) {
            addCriterion("TIME_TYPE not between", value1, value2, "timeType");
            return (Criteria) this;
        }

        public Criteria andCycleValueIsNull() {
            addCriterion("CYCLE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCycleValueIsNotNull() {
            addCriterion("CYCLE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCycleValueEqualTo(String value) {
            addCriterion("CYCLE_VALUE =", value, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleValueNotEqualTo(String value) {
            addCriterion("CYCLE_VALUE <>", value, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleValueGreaterThan(String value) {
            addCriterion("CYCLE_VALUE >", value, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleValueGreaterThanOrEqualTo(String value) {
            addCriterion("CYCLE_VALUE >=", value, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleValueLessThan(String value) {
            addCriterion("CYCLE_VALUE <", value, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleValueLessThanOrEqualTo(String value) {
            addCriterion("CYCLE_VALUE <=", value, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleValueLike(String value) {
            addCriterion("CYCLE_VALUE like", value, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleValueNotLike(String value) {
            addCriterion("CYCLE_VALUE not like", value, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleValueIn(List<String> values) {
            addCriterion("CYCLE_VALUE in", values, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleValueNotIn(List<String> values) {
            addCriterion("CYCLE_VALUE not in", values, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleValueBetween(String value1, String value2) {
            addCriterion("CYCLE_VALUE between", value1, value2, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleValueNotBetween(String value1, String value2) {
            addCriterion("CYCLE_VALUE not between", value1, value2, "cycleValue");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIsNull() {
            addCriterion("CYCLE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIsNotNull() {
            addCriterion("CYCLE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCycleUnitEqualTo(String value) {
            addCriterion("CYCLE_UNIT =", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotEqualTo(String value) {
            addCriterion("CYCLE_UNIT <>", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitGreaterThan(String value) {
            addCriterion("CYCLE_UNIT >", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitGreaterThanOrEqualTo(String value) {
            addCriterion("CYCLE_UNIT >=", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLessThan(String value) {
            addCriterion("CYCLE_UNIT <", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLessThanOrEqualTo(String value) {
            addCriterion("CYCLE_UNIT <=", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLike(String value) {
            addCriterion("CYCLE_UNIT like", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotLike(String value) {
            addCriterion("CYCLE_UNIT not like", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIn(List<String> values) {
            addCriterion("CYCLE_UNIT in", values, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotIn(List<String> values) {
            addCriterion("CYCLE_UNIT not in", values, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitBetween(String value1, String value2) {
            addCriterion("CYCLE_UNIT between", value1, value2, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotBetween(String value1, String value2) {
            addCriterion("CYCLE_UNIT not between", value1, value2, "cycleUnit");
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