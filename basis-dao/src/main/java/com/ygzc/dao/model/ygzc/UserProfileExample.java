package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserProfileExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public UserProfileExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
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

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andVocationIsNull() {
            addCriterion("vocation is null");
            return (Criteria) this;
        }

        public Criteria andVocationIsNotNull() {
            addCriterion("vocation is not null");
            return (Criteria) this;
        }

        public Criteria andVocationEqualTo(String value) {
            addCriterion("vocation =", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationNotEqualTo(String value) {
            addCriterion("vocation <>", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationGreaterThan(String value) {
            addCriterion("vocation >", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationGreaterThanOrEqualTo(String value) {
            addCriterion("vocation >=", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationLessThan(String value) {
            addCriterion("vocation <", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationLessThanOrEqualTo(String value) {
            addCriterion("vocation <=", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationLike(String value) {
            addCriterion("vocation like", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationNotLike(String value) {
            addCriterion("vocation not like", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationIn(List<String> values) {
            addCriterion("vocation in", values, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationNotIn(List<String> values) {
            addCriterion("vocation not in", values, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationBetween(String value1, String value2) {
            addCriterion("vocation between", value1, value2, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationNotBetween(String value1, String value2) {
            addCriterion("vocation not between", value1, value2, "vocation");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Float value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Float value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Float value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Float value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Float value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Float> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Float> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Float value1, Float value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Float value1, Float value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Float value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Float value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Float value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Float value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Float value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Float> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Float> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Float value1, Float value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Float value1, Float value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNull() {
            addCriterion("identity_type is null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNotNull() {
            addCriterion("identity_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeEqualTo(String value) {
            addCriterion("identity_type =", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotEqualTo(String value) {
            addCriterion("identity_type <>", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThan(String value) {
            addCriterion("identity_type >", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("identity_type >=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThan(String value) {
            addCriterion("identity_type <", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThanOrEqualTo(String value) {
            addCriterion("identity_type <=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLike(String value) {
            addCriterion("identity_type like", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotLike(String value) {
            addCriterion("identity_type not like", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIn(List<String> values) {
            addCriterion("identity_type in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotIn(List<String> values) {
            addCriterion("identity_type not in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeBetween(String value1, String value2) {
            addCriterion("identity_type between", value1, value2, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotBetween(String value1, String value2) {
            addCriterion("identity_type not between", value1, value2, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeIsNull() {
            addCriterion("identity_code is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeIsNotNull() {
            addCriterion("identity_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeEqualTo(String value) {
            addCriterion("identity_code =", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotEqualTo(String value) {
            addCriterion("identity_code <>", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeGreaterThan(String value) {
            addCriterion("identity_code >", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("identity_code >=", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLessThan(String value) {
            addCriterion("identity_code <", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLessThanOrEqualTo(String value) {
            addCriterion("identity_code <=", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLike(String value) {
            addCriterion("identity_code like", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotLike(String value) {
            addCriterion("identity_code not like", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeIn(List<String> values) {
            addCriterion("identity_code in", values, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotIn(List<String> values) {
            addCriterion("identity_code not in", values, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeBetween(String value1, String value2) {
            addCriterion("identity_code between", value1, value2, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotBetween(String value1, String value2) {
            addCriterion("identity_code not between", value1, value2, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontIsNull() {
            addCriterion("identity_image_front is null");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontIsNotNull() {
            addCriterion("identity_image_front is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontEqualTo(String value) {
            addCriterion("identity_image_front =", value, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontNotEqualTo(String value) {
            addCriterion("identity_image_front <>", value, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontGreaterThan(String value) {
            addCriterion("identity_image_front >", value, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontGreaterThanOrEqualTo(String value) {
            addCriterion("identity_image_front >=", value, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontLessThan(String value) {
            addCriterion("identity_image_front <", value, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontLessThanOrEqualTo(String value) {
            addCriterion("identity_image_front <=", value, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontLike(String value) {
            addCriterion("identity_image_front like", value, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontNotLike(String value) {
            addCriterion("identity_image_front not like", value, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontIn(List<String> values) {
            addCriterion("identity_image_front in", values, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontNotIn(List<String> values) {
            addCriterion("identity_image_front not in", values, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontBetween(String value1, String value2) {
            addCriterion("identity_image_front between", value1, value2, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImageFrontNotBetween(String value1, String value2) {
            addCriterion("identity_image_front not between", value1, value2, "identityImageFront");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlIsNull() {
            addCriterion("identity_img_front_url is null");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlIsNotNull() {
            addCriterion("identity_img_front_url is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlEqualTo(String value) {
            addCriterion("identity_img_front_url =", value, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlNotEqualTo(String value) {
            addCriterion("identity_img_front_url <>", value, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlGreaterThan(String value) {
            addCriterion("identity_img_front_url >", value, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlGreaterThanOrEqualTo(String value) {
            addCriterion("identity_img_front_url >=", value, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlLessThan(String value) {
            addCriterion("identity_img_front_url <", value, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlLessThanOrEqualTo(String value) {
            addCriterion("identity_img_front_url <=", value, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlLike(String value) {
            addCriterion("identity_img_front_url like", value, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlNotLike(String value) {
            addCriterion("identity_img_front_url not like", value, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlIn(List<String> values) {
            addCriterion("identity_img_front_url in", values, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlNotIn(List<String> values) {
            addCriterion("identity_img_front_url not in", values, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlBetween(String value1, String value2) {
            addCriterion("identity_img_front_url between", value1, value2, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgFrontUrlNotBetween(String value1, String value2) {
            addCriterion("identity_img_front_url not between", value1, value2, "identityImgFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackIsNull() {
            addCriterion("identity_image_back is null");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackIsNotNull() {
            addCriterion("identity_image_back is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackEqualTo(String value) {
            addCriterion("identity_image_back =", value, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackNotEqualTo(String value) {
            addCriterion("identity_image_back <>", value, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackGreaterThan(String value) {
            addCriterion("identity_image_back >", value, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackGreaterThanOrEqualTo(String value) {
            addCriterion("identity_image_back >=", value, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackLessThan(String value) {
            addCriterion("identity_image_back <", value, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackLessThanOrEqualTo(String value) {
            addCriterion("identity_image_back <=", value, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackLike(String value) {
            addCriterion("identity_image_back like", value, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackNotLike(String value) {
            addCriterion("identity_image_back not like", value, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackIn(List<String> values) {
            addCriterion("identity_image_back in", values, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackNotIn(List<String> values) {
            addCriterion("identity_image_back not in", values, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackBetween(String value1, String value2) {
            addCriterion("identity_image_back between", value1, value2, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImageBackNotBetween(String value1, String value2) {
            addCriterion("identity_image_back not between", value1, value2, "identityImageBack");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlIsNull() {
            addCriterion("identity_img_back_url is null");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlIsNotNull() {
            addCriterion("identity_img_back_url is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlEqualTo(String value) {
            addCriterion("identity_img_back_url =", value, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlNotEqualTo(String value) {
            addCriterion("identity_img_back_url <>", value, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlGreaterThan(String value) {
            addCriterion("identity_img_back_url >", value, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("identity_img_back_url >=", value, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlLessThan(String value) {
            addCriterion("identity_img_back_url <", value, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlLessThanOrEqualTo(String value) {
            addCriterion("identity_img_back_url <=", value, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlLike(String value) {
            addCriterion("identity_img_back_url like", value, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlNotLike(String value) {
            addCriterion("identity_img_back_url not like", value, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlIn(List<String> values) {
            addCriterion("identity_img_back_url in", values, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlNotIn(List<String> values) {
            addCriterion("identity_img_back_url not in", values, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlBetween(String value1, String value2) {
            addCriterion("identity_img_back_url between", value1, value2, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityImgBackUrlNotBetween(String value1, String value2) {
            addCriterion("identity_img_back_url not between", value1, value2, "identityImgBackUrl");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNull() {
            addCriterion("check_state is null");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNotNull() {
            addCriterion("check_state is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStateEqualTo(Integer value) {
            addCriterion("check_state =", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotEqualTo(Integer value) {
            addCriterion("check_state <>", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThan(Integer value) {
            addCriterion("check_state >", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_state >=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThan(Integer value) {
            addCriterion("check_state <", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThanOrEqualTo(Integer value) {
            addCriterion("check_state <=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateIn(List<Integer> values) {
            addCriterion("check_state in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotIn(List<Integer> values) {
            addCriterion("check_state not in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateBetween(Integer value1, Integer value2) {
            addCriterion("check_state between", value1, value2, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotBetween(Integer value1, Integer value2) {
            addCriterion("check_state not between", value1, value2, "checkState");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
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