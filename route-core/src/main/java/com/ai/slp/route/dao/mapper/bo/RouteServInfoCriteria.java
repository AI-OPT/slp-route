package com.ai.slp.route.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class RouteServInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public RouteServInfoCriteria() {
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

        public Criteria andServNameIsNull() {
            addCriterion("SERV_NAME is null");
            return (Criteria) this;
        }

        public Criteria andServNameIsNotNull() {
            addCriterion("SERV_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andServNameEqualTo(String value) {
            addCriterion("SERV_NAME =", value, "servName");
            return (Criteria) this;
        }

        public Criteria andServNameNotEqualTo(String value) {
            addCriterion("SERV_NAME <>", value, "servName");
            return (Criteria) this;
        }

        public Criteria andServNameGreaterThan(String value) {
            addCriterion("SERV_NAME >", value, "servName");
            return (Criteria) this;
        }

        public Criteria andServNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERV_NAME >=", value, "servName");
            return (Criteria) this;
        }

        public Criteria andServNameLessThan(String value) {
            addCriterion("SERV_NAME <", value, "servName");
            return (Criteria) this;
        }

        public Criteria andServNameLessThanOrEqualTo(String value) {
            addCriterion("SERV_NAME <=", value, "servName");
            return (Criteria) this;
        }

        public Criteria andServNameLike(String value) {
            addCriterion("SERV_NAME like", value, "servName");
            return (Criteria) this;
        }

        public Criteria andServNameNotLike(String value) {
            addCriterion("SERV_NAME not like", value, "servName");
            return (Criteria) this;
        }

        public Criteria andServNameIn(List<String> values) {
            addCriterion("SERV_NAME in", values, "servName");
            return (Criteria) this;
        }

        public Criteria andServNameNotIn(List<String> values) {
            addCriterion("SERV_NAME not in", values, "servName");
            return (Criteria) this;
        }

        public Criteria andServNameBetween(String value1, String value2) {
            addCriterion("SERV_NAME between", value1, value2, "servName");
            return (Criteria) this;
        }

        public Criteria andServNameNotBetween(String value1, String value2) {
            addCriterion("SERV_NAME not between", value1, value2, "servName");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIsNull() {
            addCriterion("VISIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIsNotNull() {
            addCriterion("VISIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTypeEqualTo(String value) {
            addCriterion("VISIT_TYPE =", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotEqualTo(String value) {
            addCriterion("VISIT_TYPE <>", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThan(String value) {
            addCriterion("VISIT_TYPE >", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_TYPE >=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThan(String value) {
            addCriterion("VISIT_TYPE <", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThanOrEqualTo(String value) {
            addCriterion("VISIT_TYPE <=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLike(String value) {
            addCriterion("VISIT_TYPE like", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotLike(String value) {
            addCriterion("VISIT_TYPE not like", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIn(List<String> values) {
            addCriterion("VISIT_TYPE in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotIn(List<String> values) {
            addCriterion("VISIT_TYPE not in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeBetween(String value1, String value2) {
            addCriterion("VISIT_TYPE between", value1, value2, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotBetween(String value1, String value2) {
            addCriterion("VISIT_TYPE not between", value1, value2, "visitType");
            return (Criteria) this;
        }

        public Criteria andServTypeIsNull() {
            addCriterion("SERV_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andServTypeIsNotNull() {
            addCriterion("SERV_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andServTypeEqualTo(String value) {
            addCriterion("SERV_TYPE =", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeNotEqualTo(String value) {
            addCriterion("SERV_TYPE <>", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeGreaterThan(String value) {
            addCriterion("SERV_TYPE >", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SERV_TYPE >=", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeLessThan(String value) {
            addCriterion("SERV_TYPE <", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeLessThanOrEqualTo(String value) {
            addCriterion("SERV_TYPE <=", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeLike(String value) {
            addCriterion("SERV_TYPE like", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeNotLike(String value) {
            addCriterion("SERV_TYPE not like", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeIn(List<String> values) {
            addCriterion("SERV_TYPE in", values, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeNotIn(List<String> values) {
            addCriterion("SERV_TYPE not in", values, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeBetween(String value1, String value2) {
            addCriterion("SERV_TYPE between", value1, value2, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeNotBetween(String value1, String value2) {
            addCriterion("SERV_TYPE not between", value1, value2, "servType");
            return (Criteria) this;
        }

        public Criteria andServContentIsNull() {
            addCriterion("SERV_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andServContentIsNotNull() {
            addCriterion("SERV_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andServContentEqualTo(String value) {
            addCriterion("SERV_CONTENT =", value, "servContent");
            return (Criteria) this;
        }

        public Criteria andServContentNotEqualTo(String value) {
            addCriterion("SERV_CONTENT <>", value, "servContent");
            return (Criteria) this;
        }

        public Criteria andServContentGreaterThan(String value) {
            addCriterion("SERV_CONTENT >", value, "servContent");
            return (Criteria) this;
        }

        public Criteria andServContentGreaterThanOrEqualTo(String value) {
            addCriterion("SERV_CONTENT >=", value, "servContent");
            return (Criteria) this;
        }

        public Criteria andServContentLessThan(String value) {
            addCriterion("SERV_CONTENT <", value, "servContent");
            return (Criteria) this;
        }

        public Criteria andServContentLessThanOrEqualTo(String value) {
            addCriterion("SERV_CONTENT <=", value, "servContent");
            return (Criteria) this;
        }

        public Criteria andServContentLike(String value) {
            addCriterion("SERV_CONTENT like", value, "servContent");
            return (Criteria) this;
        }

        public Criteria andServContentNotLike(String value) {
            addCriterion("SERV_CONTENT not like", value, "servContent");
            return (Criteria) this;
        }

        public Criteria andServContentIn(List<String> values) {
            addCriterion("SERV_CONTENT in", values, "servContent");
            return (Criteria) this;
        }

        public Criteria andServContentNotIn(List<String> values) {
            addCriterion("SERV_CONTENT not in", values, "servContent");
            return (Criteria) this;
        }

        public Criteria andServContentBetween(String value1, String value2) {
            addCriterion("SERV_CONTENT between", value1, value2, "servContent");
            return (Criteria) this;
        }

        public Criteria andServContentNotBetween(String value1, String value2) {
            addCriterion("SERV_CONTENT not between", value1, value2, "servContent");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andRequestParamIsNull() {
            addCriterion("REQUEST_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andRequestParamIsNotNull() {
            addCriterion("REQUEST_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andRequestParamEqualTo(String value) {
            addCriterion("REQUEST_PARAM =", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamNotEqualTo(String value) {
            addCriterion("REQUEST_PARAM <>", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamGreaterThan(String value) {
            addCriterion("REQUEST_PARAM >", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_PARAM >=", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamLessThan(String value) {
            addCriterion("REQUEST_PARAM <", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_PARAM <=", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamLike(String value) {
            addCriterion("REQUEST_PARAM like", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamNotLike(String value) {
            addCriterion("REQUEST_PARAM not like", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamIn(List<String> values) {
            addCriterion("REQUEST_PARAM in", values, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamNotIn(List<String> values) {
            addCriterion("REQUEST_PARAM not in", values, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamBetween(String value1, String value2) {
            addCriterion("REQUEST_PARAM between", value1, value2, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamNotBetween(String value1, String value2) {
            addCriterion("REQUEST_PARAM not between", value1, value2, "requestParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamIsNull() {
            addCriterion("RETURN_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andReturnParamIsNotNull() {
            addCriterion("RETURN_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andReturnParamEqualTo(String value) {
            addCriterion("RETURN_PARAM =", value, "returnParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamNotEqualTo(String value) {
            addCriterion("RETURN_PARAM <>", value, "returnParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamGreaterThan(String value) {
            addCriterion("RETURN_PARAM >", value, "returnParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_PARAM >=", value, "returnParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamLessThan(String value) {
            addCriterion("RETURN_PARAM <", value, "returnParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamLessThanOrEqualTo(String value) {
            addCriterion("RETURN_PARAM <=", value, "returnParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamLike(String value) {
            addCriterion("RETURN_PARAM like", value, "returnParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamNotLike(String value) {
            addCriterion("RETURN_PARAM not like", value, "returnParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamIn(List<String> values) {
            addCriterion("RETURN_PARAM in", values, "returnParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamNotIn(List<String> values) {
            addCriterion("RETURN_PARAM not in", values, "returnParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamBetween(String value1, String value2) {
            addCriterion("RETURN_PARAM between", value1, value2, "returnParam");
            return (Criteria) this;
        }

        public Criteria andReturnParamNotBetween(String value1, String value2) {
            addCriterion("RETURN_PARAM not between", value1, value2, "returnParam");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIsNull() {
            addCriterion("CALLBACK_URL is null");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIsNotNull() {
            addCriterion("CALLBACK_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlEqualTo(String value) {
            addCriterion("CALLBACK_URL =", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotEqualTo(String value) {
            addCriterion("CALLBACK_URL <>", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlGreaterThan(String value) {
            addCriterion("CALLBACK_URL >", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CALLBACK_URL >=", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLessThan(String value) {
            addCriterion("CALLBACK_URL <", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLessThanOrEqualTo(String value) {
            addCriterion("CALLBACK_URL <=", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLike(String value) {
            addCriterion("CALLBACK_URL like", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotLike(String value) {
            addCriterion("CALLBACK_URL not like", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIn(List<String> values) {
            addCriterion("CALLBACK_URL in", values, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotIn(List<String> values) {
            addCriterion("CALLBACK_URL not in", values, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlBetween(String value1, String value2) {
            addCriterion("CALLBACK_URL between", value1, value2, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotBetween(String value1, String value2) {
            addCriterion("CALLBACK_URL not between", value1, value2, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackParamIsNull() {
            addCriterion("CALLBACK_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andCallbackParamIsNotNull() {
            addCriterion("CALLBACK_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackParamEqualTo(String value) {
            addCriterion("CALLBACK_PARAM =", value, "callbackParam");
            return (Criteria) this;
        }

        public Criteria andCallbackParamNotEqualTo(String value) {
            addCriterion("CALLBACK_PARAM <>", value, "callbackParam");
            return (Criteria) this;
        }

        public Criteria andCallbackParamGreaterThan(String value) {
            addCriterion("CALLBACK_PARAM >", value, "callbackParam");
            return (Criteria) this;
        }

        public Criteria andCallbackParamGreaterThanOrEqualTo(String value) {
            addCriterion("CALLBACK_PARAM >=", value, "callbackParam");
            return (Criteria) this;
        }

        public Criteria andCallbackParamLessThan(String value) {
            addCriterion("CALLBACK_PARAM <", value, "callbackParam");
            return (Criteria) this;
        }

        public Criteria andCallbackParamLessThanOrEqualTo(String value) {
            addCriterion("CALLBACK_PARAM <=", value, "callbackParam");
            return (Criteria) this;
        }

        public Criteria andCallbackParamLike(String value) {
            addCriterion("CALLBACK_PARAM like", value, "callbackParam");
            return (Criteria) this;
        }

        public Criteria andCallbackParamNotLike(String value) {
            addCriterion("CALLBACK_PARAM not like", value, "callbackParam");
            return (Criteria) this;
        }

        public Criteria andCallbackParamIn(List<String> values) {
            addCriterion("CALLBACK_PARAM in", values, "callbackParam");
            return (Criteria) this;
        }

        public Criteria andCallbackParamNotIn(List<String> values) {
            addCriterion("CALLBACK_PARAM not in", values, "callbackParam");
            return (Criteria) this;
        }

        public Criteria andCallbackParamBetween(String value1, String value2) {
            addCriterion("CALLBACK_PARAM between", value1, value2, "callbackParam");
            return (Criteria) this;
        }

        public Criteria andCallbackParamNotBetween(String value1, String value2) {
            addCriterion("CALLBACK_PARAM not between", value1, value2, "callbackParam");
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