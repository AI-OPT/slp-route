package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class RouteSupplyAddsLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public RouteSupplyAddsLogCriteria() {
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

        public Criteria andSupplyAddsLogIdIsNull() {
            addCriterion("SUPPLY_ADDS_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdIsNotNull() {
            addCriterion("SUPPLY_ADDS_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdEqualTo(String value) {
            addCriterion("SUPPLY_ADDS_LOG_ID =", value, "supplyAddsLogId");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdNotEqualTo(String value) {
            addCriterion("SUPPLY_ADDS_LOG_ID <>", value, "supplyAddsLogId");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdGreaterThan(String value) {
            addCriterion("SUPPLY_ADDS_LOG_ID >", value, "supplyAddsLogId");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLY_ADDS_LOG_ID >=", value, "supplyAddsLogId");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdLessThan(String value) {
            addCriterion("SUPPLY_ADDS_LOG_ID <", value, "supplyAddsLogId");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLY_ADDS_LOG_ID <=", value, "supplyAddsLogId");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdLike(String value) {
            addCriterion("SUPPLY_ADDS_LOG_ID like", value, "supplyAddsLogId");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdNotLike(String value) {
            addCriterion("SUPPLY_ADDS_LOG_ID not like", value, "supplyAddsLogId");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdIn(List<String> values) {
            addCriterion("SUPPLY_ADDS_LOG_ID in", values, "supplyAddsLogId");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdNotIn(List<String> values) {
            addCriterion("SUPPLY_ADDS_LOG_ID not in", values, "supplyAddsLogId");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdBetween(String value1, String value2) {
            addCriterion("SUPPLY_ADDS_LOG_ID between", value1, value2, "supplyAddsLogId");
            return (Criteria) this;
        }

        public Criteria andSupplyAddsLogIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLY_ADDS_LOG_ID not between", value1, value2, "supplyAddsLogId");
            return (Criteria) this;
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

        public Criteria andBeforeUsableNumIsNull() {
            addCriterion("BEFORE_USABLE__NUM is null");
            return (Criteria) this;
        }

        public Criteria andBeforeUsableNumIsNotNull() {
            addCriterion("BEFORE_USABLE__NUM is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeUsableNumEqualTo(Long value) {
            addCriterion("BEFORE_USABLE__NUM =", value, "beforeUsableNum");
            return (Criteria) this;
        }

        public Criteria andBeforeUsableNumNotEqualTo(Long value) {
            addCriterion("BEFORE_USABLE__NUM <>", value, "beforeUsableNum");
            return (Criteria) this;
        }

        public Criteria andBeforeUsableNumGreaterThan(Long value) {
            addCriterion("BEFORE_USABLE__NUM >", value, "beforeUsableNum");
            return (Criteria) this;
        }

        public Criteria andBeforeUsableNumGreaterThanOrEqualTo(Long value) {
            addCriterion("BEFORE_USABLE__NUM >=", value, "beforeUsableNum");
            return (Criteria) this;
        }

        public Criteria andBeforeUsableNumLessThan(Long value) {
            addCriterion("BEFORE_USABLE__NUM <", value, "beforeUsableNum");
            return (Criteria) this;
        }

        public Criteria andBeforeUsableNumLessThanOrEqualTo(Long value) {
            addCriterion("BEFORE_USABLE__NUM <=", value, "beforeUsableNum");
            return (Criteria) this;
        }

        public Criteria andBeforeUsableNumIn(List<Long> values) {
            addCriterion("BEFORE_USABLE__NUM in", values, "beforeUsableNum");
            return (Criteria) this;
        }

        public Criteria andBeforeUsableNumNotIn(List<Long> values) {
            addCriterion("BEFORE_USABLE__NUM not in", values, "beforeUsableNum");
            return (Criteria) this;
        }

        public Criteria andBeforeUsableNumBetween(Long value1, Long value2) {
            addCriterion("BEFORE_USABLE__NUM between", value1, value2, "beforeUsableNum");
            return (Criteria) this;
        }

        public Criteria andBeforeUsableNumNotBetween(Long value1, Long value2) {
            addCriterion("BEFORE_USABLE__NUM not between", value1, value2, "beforeUsableNum");
            return (Criteria) this;
        }

        public Criteria andSupplyNumIsNull() {
            addCriterion("SUPPLY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSupplyNumIsNotNull() {
            addCriterion("SUPPLY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyNumEqualTo(Long value) {
            addCriterion("SUPPLY_NUM =", value, "supplyNum");
            return (Criteria) this;
        }

        public Criteria andSupplyNumNotEqualTo(Long value) {
            addCriterion("SUPPLY_NUM <>", value, "supplyNum");
            return (Criteria) this;
        }

        public Criteria andSupplyNumGreaterThan(Long value) {
            addCriterion("SUPPLY_NUM >", value, "supplyNum");
            return (Criteria) this;
        }

        public Criteria andSupplyNumGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPPLY_NUM >=", value, "supplyNum");
            return (Criteria) this;
        }

        public Criteria andSupplyNumLessThan(Long value) {
            addCriterion("SUPPLY_NUM <", value, "supplyNum");
            return (Criteria) this;
        }

        public Criteria andSupplyNumLessThanOrEqualTo(Long value) {
            addCriterion("SUPPLY_NUM <=", value, "supplyNum");
            return (Criteria) this;
        }

        public Criteria andSupplyNumIn(List<Long> values) {
            addCriterion("SUPPLY_NUM in", values, "supplyNum");
            return (Criteria) this;
        }

        public Criteria andSupplyNumNotIn(List<Long> values) {
            addCriterion("SUPPLY_NUM not in", values, "supplyNum");
            return (Criteria) this;
        }

        public Criteria andSupplyNumBetween(Long value1, Long value2) {
            addCriterion("SUPPLY_NUM between", value1, value2, "supplyNum");
            return (Criteria) this;
        }

        public Criteria andSupplyNumNotBetween(Long value1, Long value2) {
            addCriterion("SUPPLY_NUM not between", value1, value2, "supplyNum");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
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