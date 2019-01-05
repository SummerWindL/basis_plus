package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserNodeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public UserNodeExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdIsNull() {
            addCriterion("application_node_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdIsNotNull() {
            addCriterion("application_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdEqualTo(String value) {
            addCriterion("application_node_id =", value, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdNotEqualTo(String value) {
            addCriterion("application_node_id <>", value, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdGreaterThan(String value) {
            addCriterion("application_node_id >", value, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("application_node_id >=", value, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdLessThan(String value) {
            addCriterion("application_node_id <", value, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdLessThanOrEqualTo(String value) {
            addCriterion("application_node_id <=", value, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdLike(String value) {
            addCriterion("application_node_id like", value, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdNotLike(String value) {
            addCriterion("application_node_id not like", value, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdIn(List<String> values) {
            addCriterion("application_node_id in", values, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdNotIn(List<String> values) {
            addCriterion("application_node_id not in", values, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdBetween(String value1, String value2) {
            addCriterion("application_node_id between", value1, value2, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationNodeIdNotBetween(String value1, String value2) {
            addCriterion("application_node_id not between", value1, value2, "applicationNodeId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNull() {
            addCriterion("application_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("application_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(String value) {
            addCriterion("application_id =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(String value) {
            addCriterion("application_id <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(String value) {
            addCriterion("application_id >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(String value) {
            addCriterion("application_id >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(String value) {
            addCriterion("application_id <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(String value) {
            addCriterion("application_id <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLike(String value) {
            addCriterion("application_id like", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotLike(String value) {
            addCriterion("application_id not like", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<String> values) {
            addCriterion("application_id in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<String> values) {
            addCriterion("application_id not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(String value1, String value2) {
            addCriterion("application_id between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(String value1, String value2) {
            addCriterion("application_id not between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdIsNull() {
            addCriterion("application_gateway_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdIsNotNull() {
            addCriterion("application_gateway_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdEqualTo(String value) {
            addCriterion("application_gateway_id =", value, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdNotEqualTo(String value) {
            addCriterion("application_gateway_id <>", value, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdGreaterThan(String value) {
            addCriterion("application_gateway_id >", value, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdGreaterThanOrEqualTo(String value) {
            addCriterion("application_gateway_id >=", value, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdLessThan(String value) {
            addCriterion("application_gateway_id <", value, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdLessThanOrEqualTo(String value) {
            addCriterion("application_gateway_id <=", value, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdLike(String value) {
            addCriterion("application_gateway_id like", value, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdNotLike(String value) {
            addCriterion("application_gateway_id not like", value, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdIn(List<String> values) {
            addCriterion("application_gateway_id in", values, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdNotIn(List<String> values) {
            addCriterion("application_gateway_id not in", values, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdBetween(String value1, String value2) {
            addCriterion("application_gateway_id between", value1, value2, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationGatewayIdNotBetween(String value1, String value2) {
            addCriterion("application_gateway_id not between", value1, value2, "applicationGatewayId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdIsNull() {
            addCriterion("application_place_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdIsNotNull() {
            addCriterion("application_place_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdEqualTo(String value) {
            addCriterion("application_place_id =", value, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdNotEqualTo(String value) {
            addCriterion("application_place_id <>", value, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdGreaterThan(String value) {
            addCriterion("application_place_id >", value, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("application_place_id >=", value, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdLessThan(String value) {
            addCriterion("application_place_id <", value, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdLessThanOrEqualTo(String value) {
            addCriterion("application_place_id <=", value, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdLike(String value) {
            addCriterion("application_place_id like", value, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdNotLike(String value) {
            addCriterion("application_place_id not like", value, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdIn(List<String> values) {
            addCriterion("application_place_id in", values, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdNotIn(List<String> values) {
            addCriterion("application_place_id not in", values, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdBetween(String value1, String value2) {
            addCriterion("application_place_id between", value1, value2, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andApplicationPlaceIdNotBetween(String value1, String value2) {
            addCriterion("application_place_id not between", value1, value2, "applicationPlaceId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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