package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OtherLoginExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OtherLoginExample() {
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

        public Criteria andTypeLoginIsNull() {
            addCriterion("type_login is null");
            return (Criteria) this;
        }

        public Criteria andTypeLoginIsNotNull() {
            addCriterion("type_login is not null");
            return (Criteria) this;
        }

        public Criteria andTypeLoginEqualTo(Integer value) {
            addCriterion("type_login =", value, "typeLogin");
            return (Criteria) this;
        }

        public Criteria andTypeLoginNotEqualTo(Integer value) {
            addCriterion("type_login <>", value, "typeLogin");
            return (Criteria) this;
        }

        public Criteria andTypeLoginGreaterThan(Integer value) {
            addCriterion("type_login >", value, "typeLogin");
            return (Criteria) this;
        }

        public Criteria andTypeLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_login >=", value, "typeLogin");
            return (Criteria) this;
        }

        public Criteria andTypeLoginLessThan(Integer value) {
            addCriterion("type_login <", value, "typeLogin");
            return (Criteria) this;
        }

        public Criteria andTypeLoginLessThanOrEqualTo(Integer value) {
            addCriterion("type_login <=", value, "typeLogin");
            return (Criteria) this;
        }

        public Criteria andTypeLoginIn(List<Integer> values) {
            addCriterion("type_login in", values, "typeLogin");
            return (Criteria) this;
        }

        public Criteria andTypeLoginNotIn(List<Integer> values) {
            addCriterion("type_login not in", values, "typeLogin");
            return (Criteria) this;
        }

        public Criteria andTypeLoginBetween(Integer value1, Integer value2) {
            addCriterion("type_login between", value1, value2, "typeLogin");
            return (Criteria) this;
        }

        public Criteria andTypeLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("type_login not between", value1, value2, "typeLogin");
            return (Criteria) this;
        }

        public Criteria andOtherNameIsNull() {
            addCriterion("other_name is null");
            return (Criteria) this;
        }

        public Criteria andOtherNameIsNotNull() {
            addCriterion("other_name is not null");
            return (Criteria) this;
        }

        public Criteria andOtherNameEqualTo(String value) {
            addCriterion("other_name =", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotEqualTo(String value) {
            addCriterion("other_name <>", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameGreaterThan(String value) {
            addCriterion("other_name >", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameGreaterThanOrEqualTo(String value) {
            addCriterion("other_name >=", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLessThan(String value) {
            addCriterion("other_name <", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLessThanOrEqualTo(String value) {
            addCriterion("other_name <=", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLike(String value) {
            addCriterion("other_name like", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotLike(String value) {
            addCriterion("other_name not like", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameIn(List<String> values) {
            addCriterion("other_name in", values, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotIn(List<String> values) {
            addCriterion("other_name not in", values, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameBetween(String value1, String value2) {
            addCriterion("other_name between", value1, value2, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotBetween(String value1, String value2) {
            addCriterion("other_name not between", value1, value2, "otherName");
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

        public Criteria andOtherAccountIsNull() {
            addCriterion("other_account is null");
            return (Criteria) this;
        }

        public Criteria andOtherAccountIsNotNull() {
            addCriterion("other_account is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAccountEqualTo(String value) {
            addCriterion("other_account =", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountNotEqualTo(String value) {
            addCriterion("other_account <>", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountGreaterThan(String value) {
            addCriterion("other_account >", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountGreaterThanOrEqualTo(String value) {
            addCriterion("other_account >=", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountLessThan(String value) {
            addCriterion("other_account <", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountLessThanOrEqualTo(String value) {
            addCriterion("other_account <=", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountLike(String value) {
            addCriterion("other_account like", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountNotLike(String value) {
            addCriterion("other_account not like", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountIn(List<String> values) {
            addCriterion("other_account in", values, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountNotIn(List<String> values) {
            addCriterion("other_account not in", values, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountBetween(String value1, String value2) {
            addCriterion("other_account between", value1, value2, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountNotBetween(String value1, String value2) {
            addCriterion("other_account not between", value1, value2, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherCityIsNull() {
            addCriterion("other_city is null");
            return (Criteria) this;
        }

        public Criteria andOtherCityIsNotNull() {
            addCriterion("other_city is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCityEqualTo(Integer value) {
            addCriterion("other_city =", value, "otherCity");
            return (Criteria) this;
        }

        public Criteria andOtherCityNotEqualTo(Integer value) {
            addCriterion("other_city <>", value, "otherCity");
            return (Criteria) this;
        }

        public Criteria andOtherCityGreaterThan(Integer value) {
            addCriterion("other_city >", value, "otherCity");
            return (Criteria) this;
        }

        public Criteria andOtherCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_city >=", value, "otherCity");
            return (Criteria) this;
        }

        public Criteria andOtherCityLessThan(Integer value) {
            addCriterion("other_city <", value, "otherCity");
            return (Criteria) this;
        }

        public Criteria andOtherCityLessThanOrEqualTo(Integer value) {
            addCriterion("other_city <=", value, "otherCity");
            return (Criteria) this;
        }

        public Criteria andOtherCityIn(List<Integer> values) {
            addCriterion("other_city in", values, "otherCity");
            return (Criteria) this;
        }

        public Criteria andOtherCityNotIn(List<Integer> values) {
            addCriterion("other_city not in", values, "otherCity");
            return (Criteria) this;
        }

        public Criteria andOtherCityBetween(Integer value1, Integer value2) {
            addCriterion("other_city between", value1, value2, "otherCity");
            return (Criteria) this;
        }

        public Criteria andOtherCityNotBetween(Integer value1, Integer value2) {
            addCriterion("other_city not between", value1, value2, "otherCity");
            return (Criteria) this;
        }

        public Criteria andOtherGenderIsNull() {
            addCriterion("other_gender is null");
            return (Criteria) this;
        }

        public Criteria andOtherGenderIsNotNull() {
            addCriterion("other_gender is not null");
            return (Criteria) this;
        }

        public Criteria andOtherGenderEqualTo(String value) {
            addCriterion("other_gender =", value, "otherGender");
            return (Criteria) this;
        }

        public Criteria andOtherGenderNotEqualTo(String value) {
            addCriterion("other_gender <>", value, "otherGender");
            return (Criteria) this;
        }

        public Criteria andOtherGenderGreaterThan(String value) {
            addCriterion("other_gender >", value, "otherGender");
            return (Criteria) this;
        }

        public Criteria andOtherGenderGreaterThanOrEqualTo(String value) {
            addCriterion("other_gender >=", value, "otherGender");
            return (Criteria) this;
        }

        public Criteria andOtherGenderLessThan(String value) {
            addCriterion("other_gender <", value, "otherGender");
            return (Criteria) this;
        }

        public Criteria andOtherGenderLessThanOrEqualTo(String value) {
            addCriterion("other_gender <=", value, "otherGender");
            return (Criteria) this;
        }

        public Criteria andOtherGenderLike(String value) {
            addCriterion("other_gender like", value, "otherGender");
            return (Criteria) this;
        }

        public Criteria andOtherGenderNotLike(String value) {
            addCriterion("other_gender not like", value, "otherGender");
            return (Criteria) this;
        }

        public Criteria andOtherGenderIn(List<String> values) {
            addCriterion("other_gender in", values, "otherGender");
            return (Criteria) this;
        }

        public Criteria andOtherGenderNotIn(List<String> values) {
            addCriterion("other_gender not in", values, "otherGender");
            return (Criteria) this;
        }

        public Criteria andOtherGenderBetween(String value1, String value2) {
            addCriterion("other_gender between", value1, value2, "otherGender");
            return (Criteria) this;
        }

        public Criteria andOtherGenderNotBetween(String value1, String value2) {
            addCriterion("other_gender not between", value1, value2, "otherGender");
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