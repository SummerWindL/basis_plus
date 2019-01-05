package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CharacterExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CharacterExample() {
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

        public Criteria andCharIdIsNull() {
            addCriterion("char_id is null");
            return (Criteria) this;
        }

        public Criteria andCharIdIsNotNull() {
            addCriterion("char_id is not null");
            return (Criteria) this;
        }

        public Criteria andCharIdEqualTo(Integer value) {
            addCriterion("char_id =", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdNotEqualTo(Integer value) {
            addCriterion("char_id <>", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdGreaterThan(Integer value) {
            addCriterion("char_id >", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("char_id >=", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdLessThan(Integer value) {
            addCriterion("char_id <", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdLessThanOrEqualTo(Integer value) {
            addCriterion("char_id <=", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdIn(List<Integer> values) {
            addCriterion("char_id in", values, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdNotIn(List<Integer> values) {
            addCriterion("char_id not in", values, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdBetween(Integer value1, Integer value2) {
            addCriterion("char_id between", value1, value2, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdNotBetween(Integer value1, Integer value2) {
            addCriterion("char_id not between", value1, value2, "charId");
            return (Criteria) this;
        }

        public Criteria andCharaIsNull() {
            addCriterion("chara is null");
            return (Criteria) this;
        }

        public Criteria andCharaIsNotNull() {
            addCriterion("chara is not null");
            return (Criteria) this;
        }

        public Criteria andCharaEqualTo(String value) {
            addCriterion("chara =", value, "chara");
            return (Criteria) this;
        }

        public Criteria andCharaNotEqualTo(String value) {
            addCriterion("chara <>", value, "chara");
            return (Criteria) this;
        }

        public Criteria andCharaGreaterThan(String value) {
            addCriterion("chara >", value, "chara");
            return (Criteria) this;
        }

        public Criteria andCharaGreaterThanOrEqualTo(String value) {
            addCriterion("chara >=", value, "chara");
            return (Criteria) this;
        }

        public Criteria andCharaLessThan(String value) {
            addCriterion("chara <", value, "chara");
            return (Criteria) this;
        }

        public Criteria andCharaLessThanOrEqualTo(String value) {
            addCriterion("chara <=", value, "chara");
            return (Criteria) this;
        }

        public Criteria andCharaLike(String value) {
            addCriterion("chara like", value, "chara");
            return (Criteria) this;
        }

        public Criteria andCharaNotLike(String value) {
            addCriterion("chara not like", value, "chara");
            return (Criteria) this;
        }

        public Criteria andCharaIn(List<String> values) {
            addCriterion("chara in", values, "chara");
            return (Criteria) this;
        }

        public Criteria andCharaNotIn(List<String> values) {
            addCriterion("chara not in", values, "chara");
            return (Criteria) this;
        }

        public Criteria andCharaBetween(String value1, String value2) {
            addCriterion("chara between", value1, value2, "chara");
            return (Criteria) this;
        }

        public Criteria andCharaNotBetween(String value1, String value2) {
            addCriterion("chara not between", value1, value2, "chara");
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