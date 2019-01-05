package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationGatewayExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ApplicationGatewayExample() {
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

        public Criteria andHardGatewayIdIsNull() {
            addCriterion("hard_gateway_id is null");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdIsNotNull() {
            addCriterion("hard_gateway_id is not null");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdEqualTo(String value) {
            addCriterion("hard_gateway_id =", value, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdNotEqualTo(String value) {
            addCriterion("hard_gateway_id <>", value, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdGreaterThan(String value) {
            addCriterion("hard_gateway_id >", value, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdGreaterThanOrEqualTo(String value) {
            addCriterion("hard_gateway_id >=", value, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdLessThan(String value) {
            addCriterion("hard_gateway_id <", value, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdLessThanOrEqualTo(String value) {
            addCriterion("hard_gateway_id <=", value, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdLike(String value) {
            addCriterion("hard_gateway_id like", value, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdNotLike(String value) {
            addCriterion("hard_gateway_id not like", value, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdIn(List<String> values) {
            addCriterion("hard_gateway_id in", values, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdNotIn(List<String> values) {
            addCriterion("hard_gateway_id not in", values, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdBetween(String value1, String value2) {
            addCriterion("hard_gateway_id between", value1, value2, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andHardGatewayIdNotBetween(String value1, String value2) {
            addCriterion("hard_gateway_id not between", value1, value2, "hardGatewayId");
            return (Criteria) this;
        }

        public Criteria andUniqIdIsNull() {
            addCriterion("uniq_id is null");
            return (Criteria) this;
        }

        public Criteria andUniqIdIsNotNull() {
            addCriterion("uniq_id is not null");
            return (Criteria) this;
        }

        public Criteria andUniqIdEqualTo(String value) {
            addCriterion("uniq_id =", value, "uniqId");
            return (Criteria) this;
        }

        public Criteria andUniqIdNotEqualTo(String value) {
            addCriterion("uniq_id <>", value, "uniqId");
            return (Criteria) this;
        }

        public Criteria andUniqIdGreaterThan(String value) {
            addCriterion("uniq_id >", value, "uniqId");
            return (Criteria) this;
        }

        public Criteria andUniqIdGreaterThanOrEqualTo(String value) {
            addCriterion("uniq_id >=", value, "uniqId");
            return (Criteria) this;
        }

        public Criteria andUniqIdLessThan(String value) {
            addCriterion("uniq_id <", value, "uniqId");
            return (Criteria) this;
        }

        public Criteria andUniqIdLessThanOrEqualTo(String value) {
            addCriterion("uniq_id <=", value, "uniqId");
            return (Criteria) this;
        }

        public Criteria andUniqIdLike(String value) {
            addCriterion("uniq_id like", value, "uniqId");
            return (Criteria) this;
        }

        public Criteria andUniqIdNotLike(String value) {
            addCriterion("uniq_id not like", value, "uniqId");
            return (Criteria) this;
        }

        public Criteria andUniqIdIn(List<String> values) {
            addCriterion("uniq_id in", values, "uniqId");
            return (Criteria) this;
        }

        public Criteria andUniqIdNotIn(List<String> values) {
            addCriterion("uniq_id not in", values, "uniqId");
            return (Criteria) this;
        }

        public Criteria andUniqIdBetween(String value1, String value2) {
            addCriterion("uniq_id between", value1, value2, "uniqId");
            return (Criteria) this;
        }

        public Criteria andUniqIdNotBetween(String value1, String value2) {
            addCriterion("uniq_id not between", value1, value2, "uniqId");
            return (Criteria) this;
        }

        public Criteria andGatewayNameIsNull() {
            addCriterion("gateway_name is null");
            return (Criteria) this;
        }

        public Criteria andGatewayNameIsNotNull() {
            addCriterion("gateway_name is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayNameEqualTo(String value) {
            addCriterion("gateway_name =", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotEqualTo(String value) {
            addCriterion("gateway_name <>", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameGreaterThan(String value) {
            addCriterion("gateway_name >", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_name >=", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameLessThan(String value) {
            addCriterion("gateway_name <", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameLessThanOrEqualTo(String value) {
            addCriterion("gateway_name <=", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameLike(String value) {
            addCriterion("gateway_name like", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotLike(String value) {
            addCriterion("gateway_name not like", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameIn(List<String> values) {
            addCriterion("gateway_name in", values, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotIn(List<String> values) {
            addCriterion("gateway_name not in", values, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameBetween(String value1, String value2) {
            addCriterion("gateway_name between", value1, value2, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotBetween(String value1, String value2) {
            addCriterion("gateway_name not between", value1, value2, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("online is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("online is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(Integer value) {
            addCriterion("online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Integer value) {
            addCriterion("online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Integer value) {
            addCriterion("online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Integer value) {
            addCriterion("online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Integer> values) {
            addCriterion("online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Integer> values) {
            addCriterion("online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Integer value1, Integer value2) {
            addCriterion("online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("online not between", value1, value2, "online");
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