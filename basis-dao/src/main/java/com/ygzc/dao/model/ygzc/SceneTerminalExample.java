package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SceneTerminalExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SceneTerminalExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andApplicationSceneIdIsNull() {
            addCriterion("application_scene_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdIsNotNull() {
            addCriterion("application_scene_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdEqualTo(String value) {
            addCriterion("application_scene_id =", value, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdNotEqualTo(String value) {
            addCriterion("application_scene_id <>", value, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdGreaterThan(String value) {
            addCriterion("application_scene_id >", value, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdGreaterThanOrEqualTo(String value) {
            addCriterion("application_scene_id >=", value, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdLessThan(String value) {
            addCriterion("application_scene_id <", value, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdLessThanOrEqualTo(String value) {
            addCriterion("application_scene_id <=", value, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdLike(String value) {
            addCriterion("application_scene_id like", value, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdNotLike(String value) {
            addCriterion("application_scene_id not like", value, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdIn(List<String> values) {
            addCriterion("application_scene_id in", values, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdNotIn(List<String> values) {
            addCriterion("application_scene_id not in", values, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdBetween(String value1, String value2) {
            addCriterion("application_scene_id between", value1, value2, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andApplicationSceneIdNotBetween(String value1, String value2) {
            addCriterion("application_scene_id not between", value1, value2, "applicationSceneId");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdIsNull() {
            addCriterion("gateway_uniq_id is null");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdIsNotNull() {
            addCriterion("gateway_uniq_id is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdEqualTo(String value) {
            addCriterion("gateway_uniq_id =", value, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdNotEqualTo(String value) {
            addCriterion("gateway_uniq_id <>", value, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdGreaterThan(String value) {
            addCriterion("gateway_uniq_id >", value, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_uniq_id >=", value, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdLessThan(String value) {
            addCriterion("gateway_uniq_id <", value, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdLessThanOrEqualTo(String value) {
            addCriterion("gateway_uniq_id <=", value, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdLike(String value) {
            addCriterion("gateway_uniq_id like", value, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdNotLike(String value) {
            addCriterion("gateway_uniq_id not like", value, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdIn(List<String> values) {
            addCriterion("gateway_uniq_id in", values, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdNotIn(List<String> values) {
            addCriterion("gateway_uniq_id not in", values, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdBetween(String value1, String value2) {
            addCriterion("gateway_uniq_id between", value1, value2, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayUniqIdNotBetween(String value1, String value2) {
            addCriterion("gateway_uniq_id not between", value1, value2, "gatewayUniqId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdIsNull() {
            addCriterion("application_terminal_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdIsNotNull() {
            addCriterion("application_terminal_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdEqualTo(String value) {
            addCriterion("application_terminal_id =", value, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdNotEqualTo(String value) {
            addCriterion("application_terminal_id <>", value, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdGreaterThan(String value) {
            addCriterion("application_terminal_id >", value, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdGreaterThanOrEqualTo(String value) {
            addCriterion("application_terminal_id >=", value, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdLessThan(String value) {
            addCriterion("application_terminal_id <", value, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdLessThanOrEqualTo(String value) {
            addCriterion("application_terminal_id <=", value, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdLike(String value) {
            addCriterion("application_terminal_id like", value, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdNotLike(String value) {
            addCriterion("application_terminal_id not like", value, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdIn(List<String> values) {
            addCriterion("application_terminal_id in", values, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdNotIn(List<String> values) {
            addCriterion("application_terminal_id not in", values, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdBetween(String value1, String value2) {
            addCriterion("application_terminal_id between", value1, value2, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andApplicationTerminalIdNotBetween(String value1, String value2) {
            addCriterion("application_terminal_id not between", value1, value2, "applicationTerminalId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdIsNull() {
            addCriterion("node_uniq_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdIsNotNull() {
            addCriterion("node_uniq_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdEqualTo(String value) {
            addCriterion("node_uniq_id =", value, "nodeUniqId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdNotEqualTo(String value) {
            addCriterion("node_uniq_id <>", value, "nodeUniqId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdGreaterThan(String value) {
            addCriterion("node_uniq_id >", value, "nodeUniqId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdGreaterThanOrEqualTo(String value) {
            addCriterion("node_uniq_id >=", value, "nodeUniqId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdLessThan(String value) {
            addCriterion("node_uniq_id <", value, "nodeUniqId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdLessThanOrEqualTo(String value) {
            addCriterion("node_uniq_id <=", value, "nodeUniqId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdLike(String value) {
            addCriterion("node_uniq_id like", value, "nodeUniqId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdNotLike(String value) {
            addCriterion("node_uniq_id not like", value, "nodeUniqId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdIn(List<String> values) {
            addCriterion("node_uniq_id in", values, "nodeUniqId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdNotIn(List<String> values) {
            addCriterion("node_uniq_id not in", values, "nodeUniqId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdBetween(String value1, String value2) {
            addCriterion("node_uniq_id between", value1, value2, "nodeUniqId");
            return (Criteria) this;
        }

        public Criteria andNodeUniqIdNotBetween(String value1, String value2) {
            addCriterion("node_uniq_id not between", value1, value2, "nodeUniqId");
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

        public Criteria andCommandIsNull() {
            addCriterion("command is null");
            return (Criteria) this;
        }

        public Criteria andCommandIsNotNull() {
            addCriterion("command is not null");
            return (Criteria) this;
        }

        public Criteria andCommandEqualTo(String value) {
            addCriterion("command =", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotEqualTo(String value) {
            addCriterion("command <>", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThan(String value) {
            addCriterion("command >", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThanOrEqualTo(String value) {
            addCriterion("command >=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThan(String value) {
            addCriterion("command <", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThanOrEqualTo(String value) {
            addCriterion("command <=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLike(String value) {
            addCriterion("command like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotLike(String value) {
            addCriterion("command not like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandIn(List<String> values) {
            addCriterion("command in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotIn(List<String> values) {
            addCriterion("command not in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandBetween(String value1, String value2) {
            addCriterion("command between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotBetween(String value1, String value2) {
            addCriterion("command not between", value1, value2, "command");
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

        public Criteria andExecuteTimeIsNull() {
            addCriterion("execute_time is null");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIsNotNull() {
            addCriterion("execute_time is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeEqualTo(String value) {
            addCriterion("execute_time =", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotEqualTo(String value) {
            addCriterion("execute_time <>", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeGreaterThan(String value) {
            addCriterion("execute_time >", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("execute_time >=", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLessThan(String value) {
            addCriterion("execute_time <", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLessThanOrEqualTo(String value) {
            addCriterion("execute_time <=", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLike(String value) {
            addCriterion("execute_time like", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotLike(String value) {
            addCriterion("execute_time not like", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIn(List<String> values) {
            addCriterion("execute_time in", values, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotIn(List<String> values) {
            addCriterion("execute_time not in", values, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeBetween(String value1, String value2) {
            addCriterion("execute_time between", value1, value2, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotBetween(String value1, String value2) {
            addCriterion("execute_time not between", value1, value2, "executeTime");
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
            addCriterionForJDBCTime("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCTime("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCTime("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCTime("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCTime("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCTime("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("update_date not between", value1, value2, "updateDate");
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
            addCriterionForJDBCTime("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCTime("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCTime("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCTime("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCTime("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCTime("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("create_date not between", value1, value2, "createDate");
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