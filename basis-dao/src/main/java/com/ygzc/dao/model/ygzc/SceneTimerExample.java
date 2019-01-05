package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SceneTimerExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SceneTimerExample() {
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

        public Criteria andBindApplicationIsNull() {
            addCriterion("bind_application is null");
            return (Criteria) this;
        }

        public Criteria andBindApplicationIsNotNull() {
            addCriterion("bind_application is not null");
            return (Criteria) this;
        }

        public Criteria andBindApplicationEqualTo(String value) {
            addCriterion("bind_application =", value, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationNotEqualTo(String value) {
            addCriterion("bind_application <>", value, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationGreaterThan(String value) {
            addCriterion("bind_application >", value, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("bind_application >=", value, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationLessThan(String value) {
            addCriterion("bind_application <", value, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationLessThanOrEqualTo(String value) {
            addCriterion("bind_application <=", value, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationLike(String value) {
            addCriterion("bind_application like", value, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationNotLike(String value) {
            addCriterion("bind_application not like", value, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationIn(List<String> values) {
            addCriterion("bind_application in", values, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationNotIn(List<String> values) {
            addCriterion("bind_application not in", values, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationBetween(String value1, String value2) {
            addCriterion("bind_application between", value1, value2, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationNotBetween(String value1, String value2) {
            addCriterion("bind_application not between", value1, value2, "bindApplication");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneIsNull() {
            addCriterion("bind_application_scene is null");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneIsNotNull() {
            addCriterion("bind_application_scene is not null");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneEqualTo(String value) {
            addCriterion("bind_application_scene =", value, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneNotEqualTo(String value) {
            addCriterion("bind_application_scene <>", value, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneGreaterThan(String value) {
            addCriterion("bind_application_scene >", value, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneGreaterThanOrEqualTo(String value) {
            addCriterion("bind_application_scene >=", value, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneLessThan(String value) {
            addCriterion("bind_application_scene <", value, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneLessThanOrEqualTo(String value) {
            addCriterion("bind_application_scene <=", value, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneLike(String value) {
            addCriterion("bind_application_scene like", value, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneNotLike(String value) {
            addCriterion("bind_application_scene not like", value, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneIn(List<String> values) {
            addCriterion("bind_application_scene in", values, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneNotIn(List<String> values) {
            addCriterion("bind_application_scene not in", values, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneBetween(String value1, String value2) {
            addCriterion("bind_application_scene between", value1, value2, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindApplicationSceneNotBetween(String value1, String value2) {
            addCriterion("bind_application_scene not between", value1, value2, "bindApplicationScene");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalIsNull() {
            addCriterion("bind_scene_terminal is null");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalIsNotNull() {
            addCriterion("bind_scene_terminal is not null");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalEqualTo(String value) {
            addCriterion("bind_scene_terminal =", value, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalNotEqualTo(String value) {
            addCriterion("bind_scene_terminal <>", value, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalGreaterThan(String value) {
            addCriterion("bind_scene_terminal >", value, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalGreaterThanOrEqualTo(String value) {
            addCriterion("bind_scene_terminal >=", value, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalLessThan(String value) {
            addCriterion("bind_scene_terminal <", value, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalLessThanOrEqualTo(String value) {
            addCriterion("bind_scene_terminal <=", value, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalLike(String value) {
            addCriterion("bind_scene_terminal like", value, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalNotLike(String value) {
            addCriterion("bind_scene_terminal not like", value, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalIn(List<String> values) {
            addCriterion("bind_scene_terminal in", values, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalNotIn(List<String> values) {
            addCriterion("bind_scene_terminal not in", values, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalBetween(String value1, String value2) {
            addCriterion("bind_scene_terminal between", value1, value2, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andBindSceneTerminalNotBetween(String value1, String value2) {
            addCriterion("bind_scene_terminal not between", value1, value2, "bindSceneTerminal");
            return (Criteria) this;
        }

        public Criteria andTimeNameIsNull() {
            addCriterion("time_name is null");
            return (Criteria) this;
        }

        public Criteria andTimeNameIsNotNull() {
            addCriterion("time_name is not null");
            return (Criteria) this;
        }

        public Criteria andTimeNameEqualTo(String value) {
            addCriterion("time_name =", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameNotEqualTo(String value) {
            addCriterion("time_name <>", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameGreaterThan(String value) {
            addCriterion("time_name >", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameGreaterThanOrEqualTo(String value) {
            addCriterion("time_name >=", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameLessThan(String value) {
            addCriterion("time_name <", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameLessThanOrEqualTo(String value) {
            addCriterion("time_name <=", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameLike(String value) {
            addCriterion("time_name like", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameNotLike(String value) {
            addCriterion("time_name not like", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameIn(List<String> values) {
            addCriterion("time_name in", values, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameNotIn(List<String> values) {
            addCriterion("time_name not in", values, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameBetween(String value1, String value2) {
            addCriterion("time_name between", value1, value2, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameNotBetween(String value1, String value2) {
            addCriterion("time_name not between", value1, value2, "timeName");
            return (Criteria) this;
        }

        public Criteria andRepeatIsNull() {
            addCriterion("repeat is null");
            return (Criteria) this;
        }

        public Criteria andRepeatIsNotNull() {
            addCriterion("repeat is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatEqualTo(Integer value) {
            addCriterion("repeat =", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatNotEqualTo(Integer value) {
            addCriterion("repeat <>", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatGreaterThan(Integer value) {
            addCriterion("repeat >", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeat >=", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatLessThan(Integer value) {
            addCriterion("repeat <", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatLessThanOrEqualTo(Integer value) {
            addCriterion("repeat <=", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatIn(List<Integer> values) {
            addCriterion("repeat in", values, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatNotIn(List<Integer> values) {
            addCriterion("repeat not in", values, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatBetween(Integer value1, Integer value2) {
            addCriterion("repeat between", value1, value2, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatNotBetween(Integer value1, Integer value2) {
            addCriterion("repeat not between", value1, value2, "repeat");
            return (Criteria) this;
        }

        public Criteria andIsRunIsNull() {
            addCriterion("is_run is null");
            return (Criteria) this;
        }

        public Criteria andIsRunIsNotNull() {
            addCriterion("is_run is not null");
            return (Criteria) this;
        }

        public Criteria andIsRunEqualTo(Integer value) {
            addCriterion("is_run =", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunNotEqualTo(Integer value) {
            addCriterion("is_run <>", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunGreaterThan(Integer value) {
            addCriterion("is_run >", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_run >=", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunLessThan(Integer value) {
            addCriterion("is_run <", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunLessThanOrEqualTo(Integer value) {
            addCriterion("is_run <=", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunIn(List<Integer> values) {
            addCriterion("is_run in", values, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunNotIn(List<Integer> values) {
            addCriterion("is_run not in", values, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunBetween(Integer value1, Integer value2) {
            addCriterion("is_run between", value1, value2, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunNotBetween(Integer value1, Integer value2) {
            addCriterion("is_run not between", value1, value2, "isRun");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeIsNull() {
            addCriterion("execution_time is null");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeIsNotNull() {
            addCriterion("execution_time is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeEqualTo(String value) {
            addCriterion("execution_time =", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeNotEqualTo(String value) {
            addCriterion("execution_time <>", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeGreaterThan(String value) {
            addCriterion("execution_time >", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("execution_time >=", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeLessThan(String value) {
            addCriterion("execution_time <", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeLessThanOrEqualTo(String value) {
            addCriterion("execution_time <=", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeLike(String value) {
            addCriterion("execution_time like", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeNotLike(String value) {
            addCriterion("execution_time not like", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeIn(List<String> values) {
            addCriterion("execution_time in", values, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeNotIn(List<String> values) {
            addCriterion("execution_time not in", values, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeBetween(String value1, String value2) {
            addCriterion("execution_time between", value1, value2, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeNotBetween(String value1, String value2) {
            addCriterion("execution_time not between", value1, value2, "executionTime");
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