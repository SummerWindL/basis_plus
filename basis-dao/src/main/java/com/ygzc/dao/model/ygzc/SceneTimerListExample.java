package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SceneTimerListExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SceneTimerListExample() {
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

        public Criteria andSceneTimerIdIsNull() {
            addCriterion("scene_timer_id is null");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdIsNotNull() {
            addCriterion("scene_timer_id is not null");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdEqualTo(String value) {
            addCriterion("scene_timer_id =", value, "sceneTimerId");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdNotEqualTo(String value) {
            addCriterion("scene_timer_id <>", value, "sceneTimerId");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdGreaterThan(String value) {
            addCriterion("scene_timer_id >", value, "sceneTimerId");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdGreaterThanOrEqualTo(String value) {
            addCriterion("scene_timer_id >=", value, "sceneTimerId");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdLessThan(String value) {
            addCriterion("scene_timer_id <", value, "sceneTimerId");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdLessThanOrEqualTo(String value) {
            addCriterion("scene_timer_id <=", value, "sceneTimerId");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdLike(String value) {
            addCriterion("scene_timer_id like", value, "sceneTimerId");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdNotLike(String value) {
            addCriterion("scene_timer_id not like", value, "sceneTimerId");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdIn(List<String> values) {
            addCriterion("scene_timer_id in", values, "sceneTimerId");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdNotIn(List<String> values) {
            addCriterion("scene_timer_id not in", values, "sceneTimerId");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdBetween(String value1, String value2) {
            addCriterion("scene_timer_id between", value1, value2, "sceneTimerId");
            return (Criteria) this;
        }

        public Criteria andSceneTimerIdNotBetween(String value1, String value2) {
            addCriterion("scene_timer_id not between", value1, value2, "sceneTimerId");
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

        public Criteria andWeekIdIsNull() {
            addCriterion("week_id is null");
            return (Criteria) this;
        }

        public Criteria andWeekIdIsNotNull() {
            addCriterion("week_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeekIdEqualTo(Integer value) {
            addCriterion("week_id =", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdNotEqualTo(Integer value) {
            addCriterion("week_id <>", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdGreaterThan(Integer value) {
            addCriterion("week_id >", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("week_id >=", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdLessThan(Integer value) {
            addCriterion("week_id <", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdLessThanOrEqualTo(Integer value) {
            addCriterion("week_id <=", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdIn(List<Integer> values) {
            addCriterion("week_id in", values, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdNotIn(List<Integer> values) {
            addCriterion("week_id not in", values, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdBetween(Integer value1, Integer value2) {
            addCriterion("week_id between", value1, value2, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdNotBetween(Integer value1, Integer value2) {
            addCriterion("week_id not between", value1, value2, "weekId");
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