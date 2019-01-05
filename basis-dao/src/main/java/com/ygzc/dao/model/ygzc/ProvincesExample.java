package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProvincesExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ProvincesExample() {
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

        public Criteria andProvincesIdIsNull() {
            addCriterion("provinces_id is null");
            return (Criteria) this;
        }

        public Criteria andProvincesIdIsNotNull() {
            addCriterion("provinces_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvincesIdEqualTo(Integer value) {
            addCriterion("provinces_id =", value, "provincesId");
            return (Criteria) this;
        }

        public Criteria andProvincesIdNotEqualTo(Integer value) {
            addCriterion("provinces_id <>", value, "provincesId");
            return (Criteria) this;
        }

        public Criteria andProvincesIdGreaterThan(Integer value) {
            addCriterion("provinces_id >", value, "provincesId");
            return (Criteria) this;
        }

        public Criteria andProvincesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("provinces_id >=", value, "provincesId");
            return (Criteria) this;
        }

        public Criteria andProvincesIdLessThan(Integer value) {
            addCriterion("provinces_id <", value, "provincesId");
            return (Criteria) this;
        }

        public Criteria andProvincesIdLessThanOrEqualTo(Integer value) {
            addCriterion("provinces_id <=", value, "provincesId");
            return (Criteria) this;
        }

        public Criteria andProvincesIdIn(List<Integer> values) {
            addCriterion("provinces_id in", values, "provincesId");
            return (Criteria) this;
        }

        public Criteria andProvincesIdNotIn(List<Integer> values) {
            addCriterion("provinces_id not in", values, "provincesId");
            return (Criteria) this;
        }

        public Criteria andProvincesIdBetween(Integer value1, Integer value2) {
            addCriterion("provinces_id between", value1, value2, "provincesId");
            return (Criteria) this;
        }

        public Criteria andProvincesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("provinces_id not between", value1, value2, "provincesId");
            return (Criteria) this;
        }

        public Criteria andNationIdIsNull() {
            addCriterion("nation_id is null");
            return (Criteria) this;
        }

        public Criteria andNationIdIsNotNull() {
            addCriterion("nation_id is not null");
            return (Criteria) this;
        }

        public Criteria andNationIdEqualTo(Integer value) {
            addCriterion("nation_id =", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotEqualTo(Integer value) {
            addCriterion("nation_id <>", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThan(Integer value) {
            addCriterion("nation_id >", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nation_id >=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThan(Integer value) {
            addCriterion("nation_id <", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThanOrEqualTo(Integer value) {
            addCriterion("nation_id <=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdIn(List<Integer> values) {
            addCriterion("nation_id in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotIn(List<Integer> values) {
            addCriterion("nation_id not in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdBetween(Integer value1, Integer value2) {
            addCriterion("nation_id between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nation_id not between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeIsNull() {
            addCriterion("provinces_code is null");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeIsNotNull() {
            addCriterion("provinces_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeEqualTo(String value) {
            addCriterion("provinces_code =", value, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeNotEqualTo(String value) {
            addCriterion("provinces_code <>", value, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeGreaterThan(String value) {
            addCriterion("provinces_code >", value, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("provinces_code >=", value, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeLessThan(String value) {
            addCriterion("provinces_code <", value, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeLessThanOrEqualTo(String value) {
            addCriterion("provinces_code <=", value, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeLike(String value) {
            addCriterion("provinces_code like", value, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeNotLike(String value) {
            addCriterion("provinces_code not like", value, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeIn(List<String> values) {
            addCriterion("provinces_code in", values, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeNotIn(List<String> values) {
            addCriterion("provinces_code not in", values, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeBetween(String value1, String value2) {
            addCriterion("provinces_code between", value1, value2, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesCodeNotBetween(String value1, String value2) {
            addCriterion("provinces_code not between", value1, value2, "provincesCode");
            return (Criteria) this;
        }

        public Criteria andProvincesNameIsNull() {
            addCriterion("provinces_name is null");
            return (Criteria) this;
        }

        public Criteria andProvincesNameIsNotNull() {
            addCriterion("provinces_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvincesNameEqualTo(String value) {
            addCriterion("provinces_name =", value, "provincesName");
            return (Criteria) this;
        }

        public Criteria andProvincesNameNotEqualTo(String value) {
            addCriterion("provinces_name <>", value, "provincesName");
            return (Criteria) this;
        }

        public Criteria andProvincesNameGreaterThan(String value) {
            addCriterion("provinces_name >", value, "provincesName");
            return (Criteria) this;
        }

        public Criteria andProvincesNameGreaterThanOrEqualTo(String value) {
            addCriterion("provinces_name >=", value, "provincesName");
            return (Criteria) this;
        }

        public Criteria andProvincesNameLessThan(String value) {
            addCriterion("provinces_name <", value, "provincesName");
            return (Criteria) this;
        }

        public Criteria andProvincesNameLessThanOrEqualTo(String value) {
            addCriterion("provinces_name <=", value, "provincesName");
            return (Criteria) this;
        }

        public Criteria andProvincesNameLike(String value) {
            addCriterion("provinces_name like", value, "provincesName");
            return (Criteria) this;
        }

        public Criteria andProvincesNameNotLike(String value) {
            addCriterion("provinces_name not like", value, "provincesName");
            return (Criteria) this;
        }

        public Criteria andProvincesNameIn(List<String> values) {
            addCriterion("provinces_name in", values, "provincesName");
            return (Criteria) this;
        }

        public Criteria andProvincesNameNotIn(List<String> values) {
            addCriterion("provinces_name not in", values, "provincesName");
            return (Criteria) this;
        }

        public Criteria andProvincesNameBetween(String value1, String value2) {
            addCriterion("provinces_name between", value1, value2, "provincesName");
            return (Criteria) this;
        }

        public Criteria andProvincesNameNotBetween(String value1, String value2) {
            addCriterion("provinces_name not between", value1, value2, "provincesName");
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