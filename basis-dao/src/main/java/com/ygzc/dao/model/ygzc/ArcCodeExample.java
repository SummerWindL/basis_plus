package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArcCodeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ArcCodeExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTidIdIsNull() {
            addCriterion("tid_id is null");
            return (Criteria) this;
        }

        public Criteria andTidIdIsNotNull() {
            addCriterion("tid_id is not null");
            return (Criteria) this;
        }

        public Criteria andTidIdEqualTo(Integer value) {
            addCriterion("tid_id =", value, "tidId");
            return (Criteria) this;
        }

        public Criteria andTidIdNotEqualTo(Integer value) {
            addCriterion("tid_id <>", value, "tidId");
            return (Criteria) this;
        }

        public Criteria andTidIdGreaterThan(Integer value) {
            addCriterion("tid_id >", value, "tidId");
            return (Criteria) this;
        }

        public Criteria andTidIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid_id >=", value, "tidId");
            return (Criteria) this;
        }

        public Criteria andTidIdLessThan(Integer value) {
            addCriterion("tid_id <", value, "tidId");
            return (Criteria) this;
        }

        public Criteria andTidIdLessThanOrEqualTo(Integer value) {
            addCriterion("tid_id <=", value, "tidId");
            return (Criteria) this;
        }

        public Criteria andTidIdIn(List<Integer> values) {
            addCriterion("tid_id in", values, "tidId");
            return (Criteria) this;
        }

        public Criteria andTidIdNotIn(List<Integer> values) {
            addCriterion("tid_id not in", values, "tidId");
            return (Criteria) this;
        }

        public Criteria andTidIdBetween(Integer value1, Integer value2) {
            addCriterion("tid_id between", value1, value2, "tidId");
            return (Criteria) this;
        }

        public Criteria andTidIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tid_id not between", value1, value2, "tidId");
            return (Criteria) this;
        }

        public Criteria andTerperIsNull() {
            addCriterion("terper is null");
            return (Criteria) this;
        }

        public Criteria andTerperIsNotNull() {
            addCriterion("terper is not null");
            return (Criteria) this;
        }

        public Criteria andTerperEqualTo(String value) {
            addCriterion("terper =", value, "terper");
            return (Criteria) this;
        }

        public Criteria andTerperNotEqualTo(String value) {
            addCriterion("terper <>", value, "terper");
            return (Criteria) this;
        }

        public Criteria andTerperGreaterThan(String value) {
            addCriterion("terper >", value, "terper");
            return (Criteria) this;
        }

        public Criteria andTerperGreaterThanOrEqualTo(String value) {
            addCriterion("terper >=", value, "terper");
            return (Criteria) this;
        }

        public Criteria andTerperLessThan(String value) {
            addCriterion("terper <", value, "terper");
            return (Criteria) this;
        }

        public Criteria andTerperLessThanOrEqualTo(String value) {
            addCriterion("terper <=", value, "terper");
            return (Criteria) this;
        }

        public Criteria andTerperLike(String value) {
            addCriterion("terper like", value, "terper");
            return (Criteria) this;
        }

        public Criteria andTerperNotLike(String value) {
            addCriterion("terper not like", value, "terper");
            return (Criteria) this;
        }

        public Criteria andTerperIn(List<String> values) {
            addCriterion("terper in", values, "terper");
            return (Criteria) this;
        }

        public Criteria andTerperNotIn(List<String> values) {
            addCriterion("terper not in", values, "terper");
            return (Criteria) this;
        }

        public Criteria andTerperBetween(String value1, String value2) {
            addCriterion("terper between", value1, value2, "terper");
            return (Criteria) this;
        }

        public Criteria andTerperNotBetween(String value1, String value2) {
            addCriterion("terper not between", value1, value2, "terper");
            return (Criteria) this;
        }

        public Criteria andWindIsNull() {
            addCriterion("wind is null");
            return (Criteria) this;
        }

        public Criteria andWindIsNotNull() {
            addCriterion("wind is not null");
            return (Criteria) this;
        }

        public Criteria andWindEqualTo(String value) {
            addCriterion("wind =", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindNotEqualTo(String value) {
            addCriterion("wind <>", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindGreaterThan(String value) {
            addCriterion("wind >", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindGreaterThanOrEqualTo(String value) {
            addCriterion("wind >=", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindLessThan(String value) {
            addCriterion("wind <", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindLessThanOrEqualTo(String value) {
            addCriterion("wind <=", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindLike(String value) {
            addCriterion("wind like", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindNotLike(String value) {
            addCriterion("wind not like", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindIn(List<String> values) {
            addCriterion("wind in", values, "wind");
            return (Criteria) this;
        }

        public Criteria andWindNotIn(List<String> values) {
            addCriterion("wind not in", values, "wind");
            return (Criteria) this;
        }

        public Criteria andWindBetween(String value1, String value2) {
            addCriterion("wind between", value1, value2, "wind");
            return (Criteria) this;
        }

        public Criteria andWindNotBetween(String value1, String value2) {
            addCriterion("wind not between", value1, value2, "wind");
            return (Criteria) this;
        }

        public Criteria andHandWindIsNull() {
            addCriterion("hand_wind is null");
            return (Criteria) this;
        }

        public Criteria andHandWindIsNotNull() {
            addCriterion("hand_wind is not null");
            return (Criteria) this;
        }

        public Criteria andHandWindEqualTo(String value) {
            addCriterion("hand_wind =", value, "handWind");
            return (Criteria) this;
        }

        public Criteria andHandWindNotEqualTo(String value) {
            addCriterion("hand_wind <>", value, "handWind");
            return (Criteria) this;
        }

        public Criteria andHandWindGreaterThan(String value) {
            addCriterion("hand_wind >", value, "handWind");
            return (Criteria) this;
        }

        public Criteria andHandWindGreaterThanOrEqualTo(String value) {
            addCriterion("hand_wind >=", value, "handWind");
            return (Criteria) this;
        }

        public Criteria andHandWindLessThan(String value) {
            addCriterion("hand_wind <", value, "handWind");
            return (Criteria) this;
        }

        public Criteria andHandWindLessThanOrEqualTo(String value) {
            addCriterion("hand_wind <=", value, "handWind");
            return (Criteria) this;
        }

        public Criteria andHandWindLike(String value) {
            addCriterion("hand_wind like", value, "handWind");
            return (Criteria) this;
        }

        public Criteria andHandWindNotLike(String value) {
            addCriterion("hand_wind not like", value, "handWind");
            return (Criteria) this;
        }

        public Criteria andHandWindIn(List<String> values) {
            addCriterion("hand_wind in", values, "handWind");
            return (Criteria) this;
        }

        public Criteria andHandWindNotIn(List<String> values) {
            addCriterion("hand_wind not in", values, "handWind");
            return (Criteria) this;
        }

        public Criteria andHandWindBetween(String value1, String value2) {
            addCriterion("hand_wind between", value1, value2, "handWind");
            return (Criteria) this;
        }

        public Criteria andHandWindNotBetween(String value1, String value2) {
            addCriterion("hand_wind not between", value1, value2, "handWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindIsNull() {
            addCriterion("auto_wind is null");
            return (Criteria) this;
        }

        public Criteria andAutoWindIsNotNull() {
            addCriterion("auto_wind is not null");
            return (Criteria) this;
        }

        public Criteria andAutoWindEqualTo(String value) {
            addCriterion("auto_wind =", value, "autoWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindNotEqualTo(String value) {
            addCriterion("auto_wind <>", value, "autoWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindGreaterThan(String value) {
            addCriterion("auto_wind >", value, "autoWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindGreaterThanOrEqualTo(String value) {
            addCriterion("auto_wind >=", value, "autoWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindLessThan(String value) {
            addCriterion("auto_wind <", value, "autoWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindLessThanOrEqualTo(String value) {
            addCriterion("auto_wind <=", value, "autoWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindLike(String value) {
            addCriterion("auto_wind like", value, "autoWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindNotLike(String value) {
            addCriterion("auto_wind not like", value, "autoWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindIn(List<String> values) {
            addCriterion("auto_wind in", values, "autoWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindNotIn(List<String> values) {
            addCriterion("auto_wind not in", values, "autoWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindBetween(String value1, String value2) {
            addCriterion("auto_wind between", value1, value2, "autoWind");
            return (Criteria) this;
        }

        public Criteria andAutoWindNotBetween(String value1, String value2) {
            addCriterion("auto_wind not between", value1, value2, "autoWind");
            return (Criteria) this;
        }

        public Criteria andOnOffIsNull() {
            addCriterion("on_off is null");
            return (Criteria) this;
        }

        public Criteria andOnOffIsNotNull() {
            addCriterion("on_off is not null");
            return (Criteria) this;
        }

        public Criteria andOnOffEqualTo(String value) {
            addCriterion("on_off =", value, "onOff");
            return (Criteria) this;
        }

        public Criteria andOnOffNotEqualTo(String value) {
            addCriterion("on_off <>", value, "onOff");
            return (Criteria) this;
        }

        public Criteria andOnOffGreaterThan(String value) {
            addCriterion("on_off >", value, "onOff");
            return (Criteria) this;
        }

        public Criteria andOnOffGreaterThanOrEqualTo(String value) {
            addCriterion("on_off >=", value, "onOff");
            return (Criteria) this;
        }

        public Criteria andOnOffLessThan(String value) {
            addCriterion("on_off <", value, "onOff");
            return (Criteria) this;
        }

        public Criteria andOnOffLessThanOrEqualTo(String value) {
            addCriterion("on_off <=", value, "onOff");
            return (Criteria) this;
        }

        public Criteria andOnOffLike(String value) {
            addCriterion("on_off like", value, "onOff");
            return (Criteria) this;
        }

        public Criteria andOnOffNotLike(String value) {
            addCriterion("on_off not like", value, "onOff");
            return (Criteria) this;
        }

        public Criteria andOnOffIn(List<String> values) {
            addCriterion("on_off in", values, "onOff");
            return (Criteria) this;
        }

        public Criteria andOnOffNotIn(List<String> values) {
            addCriterion("on_off not in", values, "onOff");
            return (Criteria) this;
        }

        public Criteria andOnOffBetween(String value1, String value2) {
            addCriterion("on_off between", value1, value2, "onOff");
            return (Criteria) this;
        }

        public Criteria andOnOffNotBetween(String value1, String value2) {
            addCriterion("on_off not between", value1, value2, "onOff");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
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