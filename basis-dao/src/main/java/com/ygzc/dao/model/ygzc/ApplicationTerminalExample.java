package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationTerminalExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ApplicationTerminalExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIsNull() {
            addCriterion("terminal_name is null");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIsNotNull() {
            addCriterion("terminal_name is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalNameEqualTo(String value) {
            addCriterion("terminal_name =", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotEqualTo(String value) {
            addCriterion("terminal_name <>", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameGreaterThan(String value) {
            addCriterion("terminal_name >", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_name >=", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLessThan(String value) {
            addCriterion("terminal_name <", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLessThanOrEqualTo(String value) {
            addCriterion("terminal_name <=", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLike(String value) {
            addCriterion("terminal_name like", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotLike(String value) {
            addCriterion("terminal_name not like", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIn(List<String> values) {
            addCriterion("terminal_name in", values, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotIn(List<String> values) {
            addCriterion("terminal_name not in", values, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameBetween(String value1, String value2) {
            addCriterion("terminal_name between", value1, value2, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotBetween(String value1, String value2) {
            addCriterion("terminal_name not between", value1, value2, "terminalName");
            return (Criteria) this;
        }

        public Criteria andOnPictureIsNull() {
            addCriterion("on_picture is null");
            return (Criteria) this;
        }

        public Criteria andOnPictureIsNotNull() {
            addCriterion("on_picture is not null");
            return (Criteria) this;
        }

        public Criteria andOnPictureEqualTo(String value) {
            addCriterion("on_picture =", value, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOnPictureNotEqualTo(String value) {
            addCriterion("on_picture <>", value, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOnPictureGreaterThan(String value) {
            addCriterion("on_picture >", value, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOnPictureGreaterThanOrEqualTo(String value) {
            addCriterion("on_picture >=", value, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOnPictureLessThan(String value) {
            addCriterion("on_picture <", value, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOnPictureLessThanOrEqualTo(String value) {
            addCriterion("on_picture <=", value, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOnPictureLike(String value) {
            addCriterion("on_picture like", value, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOnPictureNotLike(String value) {
            addCriterion("on_picture not like", value, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOnPictureIn(List<String> values) {
            addCriterion("on_picture in", values, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOnPictureNotIn(List<String> values) {
            addCriterion("on_picture not in", values, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOnPictureBetween(String value1, String value2) {
            addCriterion("on_picture between", value1, value2, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOnPictureNotBetween(String value1, String value2) {
            addCriterion("on_picture not between", value1, value2, "onPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureIsNull() {
            addCriterion("off_picture is null");
            return (Criteria) this;
        }

        public Criteria andOffPictureIsNotNull() {
            addCriterion("off_picture is not null");
            return (Criteria) this;
        }

        public Criteria andOffPictureEqualTo(String value) {
            addCriterion("off_picture =", value, "offPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureNotEqualTo(String value) {
            addCriterion("off_picture <>", value, "offPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureGreaterThan(String value) {
            addCriterion("off_picture >", value, "offPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureGreaterThanOrEqualTo(String value) {
            addCriterion("off_picture >=", value, "offPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureLessThan(String value) {
            addCriterion("off_picture <", value, "offPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureLessThanOrEqualTo(String value) {
            addCriterion("off_picture <=", value, "offPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureLike(String value) {
            addCriterion("off_picture like", value, "offPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureNotLike(String value) {
            addCriterion("off_picture not like", value, "offPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureIn(List<String> values) {
            addCriterion("off_picture in", values, "offPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureNotIn(List<String> values) {
            addCriterion("off_picture not in", values, "offPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureBetween(String value1, String value2) {
            addCriterion("off_picture between", value1, value2, "offPicture");
            return (Criteria) this;
        }

        public Criteria andOffPictureNotBetween(String value1, String value2) {
            addCriterion("off_picture not between", value1, value2, "offPicture");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPercentIsNull() {
            addCriterion("percent is null");
            return (Criteria) this;
        }

        public Criteria andPercentIsNotNull() {
            addCriterion("percent is not null");
            return (Criteria) this;
        }

        public Criteria andPercentEqualTo(Integer value) {
            addCriterion("percent =", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotEqualTo(Integer value) {
            addCriterion("percent <>", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThan(Integer value) {
            addCriterion("percent >", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("percent >=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThan(Integer value) {
            addCriterion("percent <", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThanOrEqualTo(Integer value) {
            addCriterion("percent <=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentIn(List<Integer> values) {
            addCriterion("percent in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotIn(List<Integer> values) {
            addCriterion("percent not in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentBetween(Integer value1, Integer value2) {
            addCriterion("percent between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("percent not between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andRgbIsNull() {
            addCriterion("rgb is null");
            return (Criteria) this;
        }

        public Criteria andRgbIsNotNull() {
            addCriterion("rgb is not null");
            return (Criteria) this;
        }

        public Criteria andRgbEqualTo(String value) {
            addCriterion("rgb =", value, "rgb");
            return (Criteria) this;
        }

        public Criteria andRgbNotEqualTo(String value) {
            addCriterion("rgb <>", value, "rgb");
            return (Criteria) this;
        }

        public Criteria andRgbGreaterThan(String value) {
            addCriterion("rgb >", value, "rgb");
            return (Criteria) this;
        }

        public Criteria andRgbGreaterThanOrEqualTo(String value) {
            addCriterion("rgb >=", value, "rgb");
            return (Criteria) this;
        }

        public Criteria andRgbLessThan(String value) {
            addCriterion("rgb <", value, "rgb");
            return (Criteria) this;
        }

        public Criteria andRgbLessThanOrEqualTo(String value) {
            addCriterion("rgb <=", value, "rgb");
            return (Criteria) this;
        }

        public Criteria andRgbLike(String value) {
            addCriterion("rgb like", value, "rgb");
            return (Criteria) this;
        }

        public Criteria andRgbNotLike(String value) {
            addCriterion("rgb not like", value, "rgb");
            return (Criteria) this;
        }

        public Criteria andRgbIn(List<String> values) {
            addCriterion("rgb in", values, "rgb");
            return (Criteria) this;
        }

        public Criteria andRgbNotIn(List<String> values) {
            addCriterion("rgb not in", values, "rgb");
            return (Criteria) this;
        }

        public Criteria andRgbBetween(String value1, String value2) {
            addCriterion("rgb between", value1, value2, "rgb");
            return (Criteria) this;
        }

        public Criteria andRgbNotBetween(String value1, String value2) {
            addCriterion("rgb not between", value1, value2, "rgb");
            return (Criteria) this;
        }

        public Criteria andIsFlagIsNull() {
            addCriterion("is_flag is null");
            return (Criteria) this;
        }

        public Criteria andIsFlagIsNotNull() {
            addCriterion("is_flag is not null");
            return (Criteria) this;
        }

        public Criteria andIsFlagEqualTo(Integer value) {
            addCriterion("is_flag =", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotEqualTo(Integer value) {
            addCriterion("is_flag <>", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagGreaterThan(Integer value) {
            addCriterion("is_flag >", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_flag >=", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagLessThan(Integer value) {
            addCriterion("is_flag <", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagLessThanOrEqualTo(Integer value) {
            addCriterion("is_flag <=", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagIn(List<Integer> values) {
            addCriterion("is_flag in", values, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotIn(List<Integer> values) {
            addCriterion("is_flag not in", values, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagBetween(Integer value1, Integer value2) {
            addCriterion("is_flag between", value1, value2, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("is_flag not between", value1, value2, "isFlag");
            return (Criteria) this;
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

        public Criteria andAllOrderIsNull() {
            addCriterion("all_order is null");
            return (Criteria) this;
        }

        public Criteria andAllOrderIsNotNull() {
            addCriterion("all_order is not null");
            return (Criteria) this;
        }

        public Criteria andAllOrderEqualTo(Integer value) {
            addCriterion("all_order =", value, "allOrder");
            return (Criteria) this;
        }

        public Criteria andAllOrderNotEqualTo(Integer value) {
            addCriterion("all_order <>", value, "allOrder");
            return (Criteria) this;
        }

        public Criteria andAllOrderGreaterThan(Integer value) {
            addCriterion("all_order >", value, "allOrder");
            return (Criteria) this;
        }

        public Criteria andAllOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_order >=", value, "allOrder");
            return (Criteria) this;
        }

        public Criteria andAllOrderLessThan(Integer value) {
            addCriterion("all_order <", value, "allOrder");
            return (Criteria) this;
        }

        public Criteria andAllOrderLessThanOrEqualTo(Integer value) {
            addCriterion("all_order <=", value, "allOrder");
            return (Criteria) this;
        }

        public Criteria andAllOrderIn(List<Integer> values) {
            addCriterion("all_order in", values, "allOrder");
            return (Criteria) this;
        }

        public Criteria andAllOrderNotIn(List<Integer> values) {
            addCriterion("all_order not in", values, "allOrder");
            return (Criteria) this;
        }

        public Criteria andAllOrderBetween(Integer value1, Integer value2) {
            addCriterion("all_order between", value1, value2, "allOrder");
            return (Criteria) this;
        }

        public Criteria andAllOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("all_order not between", value1, value2, "allOrder");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderIsNull() {
            addCriterion("place_order is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderIsNotNull() {
            addCriterion("place_order is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderEqualTo(Integer value) {
            addCriterion("place_order =", value, "placeOrder");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderNotEqualTo(Integer value) {
            addCriterion("place_order <>", value, "placeOrder");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderGreaterThan(Integer value) {
            addCriterion("place_order >", value, "placeOrder");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("place_order >=", value, "placeOrder");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderLessThan(Integer value) {
            addCriterion("place_order <", value, "placeOrder");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderLessThanOrEqualTo(Integer value) {
            addCriterion("place_order <=", value, "placeOrder");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderIn(List<Integer> values) {
            addCriterion("place_order in", values, "placeOrder");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderNotIn(List<Integer> values) {
            addCriterion("place_order not in", values, "placeOrder");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderBetween(Integer value1, Integer value2) {
            addCriterion("place_order between", value1, value2, "placeOrder");
            return (Criteria) this;
        }

        public Criteria andPlaceOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("place_order not between", value1, value2, "placeOrder");
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

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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