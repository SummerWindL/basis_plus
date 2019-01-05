package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class IntelligentHardwareExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public IntelligentHardwareExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNull() {
            addCriterion("series_id is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNotNull() {
            addCriterion("series_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdEqualTo(Integer value) {
            addCriterion("series_id =", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotEqualTo(Integer value) {
            addCriterion("series_id <>", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThan(Integer value) {
            addCriterion("series_id >", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("series_id >=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThan(Integer value) {
            addCriterion("series_id <", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThanOrEqualTo(Integer value) {
            addCriterion("series_id <=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIn(List<Integer> values) {
            addCriterion("series_id in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotIn(List<Integer> values) {
            addCriterion("series_id not in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdBetween(Integer value1, Integer value2) {
            addCriterion("series_id between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("series_id not between", value1, value2, "seriesId");
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

        public Criteria andProduceDateIsNull() {
            addCriterion("produce_date is null");
            return (Criteria) this;
        }

        public Criteria andProduceDateIsNotNull() {
            addCriterion("produce_date is not null");
            return (Criteria) this;
        }

        public Criteria andProduceDateEqualTo(Date value) {
            addCriterion("produce_date =", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotEqualTo(Date value) {
            addCriterion("produce_date <>", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateGreaterThan(Date value) {
            addCriterion("produce_date >", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("produce_date >=", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateLessThan(Date value) {
            addCriterion("produce_date <", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateLessThanOrEqualTo(Date value) {
            addCriterion("produce_date <=", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateIn(List<Date> values) {
            addCriterion("produce_date in", values, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotIn(List<Date> values) {
            addCriterion("produce_date not in", values, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateBetween(Date value1, Date value2) {
            addCriterion("produce_date between", value1, value2, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotBetween(Date value1, Date value2) {
            addCriterion("produce_date not between", value1, value2, "produceDate");
            return (Criteria) this;
        }

        public Criteria andHardwareVerIsNull() {
            addCriterion("hardware_ver is null");
            return (Criteria) this;
        }

        public Criteria andHardwareVerIsNotNull() {
            addCriterion("hardware_ver is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareVerEqualTo(String value) {
            addCriterion("hardware_ver =", value, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andHardwareVerNotEqualTo(String value) {
            addCriterion("hardware_ver <>", value, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andHardwareVerGreaterThan(String value) {
            addCriterion("hardware_ver >", value, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andHardwareVerGreaterThanOrEqualTo(String value) {
            addCriterion("hardware_ver >=", value, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andHardwareVerLessThan(String value) {
            addCriterion("hardware_ver <", value, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andHardwareVerLessThanOrEqualTo(String value) {
            addCriterion("hardware_ver <=", value, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andHardwareVerLike(String value) {
            addCriterion("hardware_ver like", value, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andHardwareVerNotLike(String value) {
            addCriterion("hardware_ver not like", value, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andHardwareVerIn(List<String> values) {
            addCriterion("hardware_ver in", values, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andHardwareVerNotIn(List<String> values) {
            addCriterion("hardware_ver not in", values, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andHardwareVerBetween(String value1, String value2) {
            addCriterion("hardware_ver between", value1, value2, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andHardwareVerNotBetween(String value1, String value2) {
            addCriterion("hardware_ver not between", value1, value2, "hardwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerIsNull() {
            addCriterion("software_ver is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerIsNotNull() {
            addCriterion("software_ver is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerEqualTo(String value) {
            addCriterion("software_ver =", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerNotEqualTo(String value) {
            addCriterion("software_ver <>", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerGreaterThan(String value) {
            addCriterion("software_ver >", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerGreaterThanOrEqualTo(String value) {
            addCriterion("software_ver >=", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerLessThan(String value) {
            addCriterion("software_ver <", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerLessThanOrEqualTo(String value) {
            addCriterion("software_ver <=", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerLike(String value) {
            addCriterion("software_ver like", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerNotLike(String value) {
            addCriterion("software_ver not like", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerIn(List<String> values) {
            addCriterion("software_ver in", values, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerNotIn(List<String> values) {
            addCriterion("software_ver not in", values, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerBetween(String value1, String value2) {
            addCriterion("software_ver between", value1, value2, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerNotBetween(String value1, String value2) {
            addCriterion("software_ver not between", value1, value2, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(String value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(String value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(String value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(String value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(String value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(String value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLike(String value) {
            addCriterion("batch like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotLike(String value) {
            addCriterion("batch not like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<String> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<String> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(String value1, String value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(String value1, String value2) {
            addCriterion("batch not between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andNetFalgIsNull() {
            addCriterion("net_falg is null");
            return (Criteria) this;
        }

        public Criteria andNetFalgIsNotNull() {
            addCriterion("net_falg is not null");
            return (Criteria) this;
        }

        public Criteria andNetFalgEqualTo(Integer value) {
            addCriterion("net_falg =", value, "netFalg");
            return (Criteria) this;
        }

        public Criteria andNetFalgNotEqualTo(Integer value) {
            addCriterion("net_falg <>", value, "netFalg");
            return (Criteria) this;
        }

        public Criteria andNetFalgGreaterThan(Integer value) {
            addCriterion("net_falg >", value, "netFalg");
            return (Criteria) this;
        }

        public Criteria andNetFalgGreaterThanOrEqualTo(Integer value) {
            addCriterion("net_falg >=", value, "netFalg");
            return (Criteria) this;
        }

        public Criteria andNetFalgLessThan(Integer value) {
            addCriterion("net_falg <", value, "netFalg");
            return (Criteria) this;
        }

        public Criteria andNetFalgLessThanOrEqualTo(Integer value) {
            addCriterion("net_falg <=", value, "netFalg");
            return (Criteria) this;
        }

        public Criteria andNetFalgIn(List<Integer> values) {
            addCriterion("net_falg in", values, "netFalg");
            return (Criteria) this;
        }

        public Criteria andNetFalgNotIn(List<Integer> values) {
            addCriterion("net_falg not in", values, "netFalg");
            return (Criteria) this;
        }

        public Criteria andNetFalgBetween(Integer value1, Integer value2) {
            addCriterion("net_falg between", value1, value2, "netFalg");
            return (Criteria) this;
        }

        public Criteria andNetFalgNotBetween(Integer value1, Integer value2) {
            addCriterion("net_falg not between", value1, value2, "netFalg");
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

        public Criteria andOnlineEqualTo(Byte value) {
            addCriterion("online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Byte value) {
            addCriterion("online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Byte value) {
            addCriterion("online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Byte value) {
            addCriterion("online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Byte value) {
            addCriterion("online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Byte value) {
            addCriterion("online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Byte> values) {
            addCriterion("online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Byte> values) {
            addCriterion("online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Byte value1, Byte value2) {
            addCriterion("online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Byte value1, Byte value2) {
            addCriterion("online not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdIsNull() {
            addCriterion("intelligent_hardware_id is null");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdIsNotNull() {
            addCriterion("intelligent_hardware_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdEqualTo(String value) {
            addCriterion("intelligent_hardware_id =", value, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdNotEqualTo(String value) {
            addCriterion("intelligent_hardware_id <>", value, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdGreaterThan(String value) {
            addCriterion("intelligent_hardware_id >", value, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdGreaterThanOrEqualTo(String value) {
            addCriterion("intelligent_hardware_id >=", value, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdLessThan(String value) {
            addCriterion("intelligent_hardware_id <", value, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdLessThanOrEqualTo(String value) {
            addCriterion("intelligent_hardware_id <=", value, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdLike(String value) {
            addCriterion("intelligent_hardware_id like", value, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdNotLike(String value) {
            addCriterion("intelligent_hardware_id not like", value, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdIn(List<String> values) {
            addCriterion("intelligent_hardware_id in", values, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdNotIn(List<String> values) {
            addCriterion("intelligent_hardware_id not in", values, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdBetween(String value1, String value2) {
            addCriterion("intelligent_hardware_id between", value1, value2, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andIntelligentHardwareIdNotBetween(String value1, String value2) {
            addCriterion("intelligent_hardware_id not between", value1, value2, "intelligentHardwareId");
            return (Criteria) this;
        }

        public Criteria andBindTimesIsNull() {
            addCriterion("bind_times is null");
            return (Criteria) this;
        }

        public Criteria andBindTimesIsNotNull() {
            addCriterion("bind_times is not null");
            return (Criteria) this;
        }

        public Criteria andBindTimesEqualTo(Integer value) {
            addCriterion("bind_times =", value, "bindTimes");
            return (Criteria) this;
        }

        public Criteria andBindTimesNotEqualTo(Integer value) {
            addCriterion("bind_times <>", value, "bindTimes");
            return (Criteria) this;
        }

        public Criteria andBindTimesGreaterThan(Integer value) {
            addCriterion("bind_times >", value, "bindTimes");
            return (Criteria) this;
        }

        public Criteria andBindTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("bind_times >=", value, "bindTimes");
            return (Criteria) this;
        }

        public Criteria andBindTimesLessThan(Integer value) {
            addCriterion("bind_times <", value, "bindTimes");
            return (Criteria) this;
        }

        public Criteria andBindTimesLessThanOrEqualTo(Integer value) {
            addCriterion("bind_times <=", value, "bindTimes");
            return (Criteria) this;
        }

        public Criteria andBindTimesIn(List<Integer> values) {
            addCriterion("bind_times in", values, "bindTimes");
            return (Criteria) this;
        }

        public Criteria andBindTimesNotIn(List<Integer> values) {
            addCriterion("bind_times not in", values, "bindTimes");
            return (Criteria) this;
        }

        public Criteria andBindTimesBetween(Integer value1, Integer value2) {
            addCriterion("bind_times between", value1, value2, "bindTimes");
            return (Criteria) this;
        }

        public Criteria andBindTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("bind_times not between", value1, value2, "bindTimes");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateIsNull() {
            addCriterion("factory_date is null");
            return (Criteria) this;
        }

        public Criteria andFactoryDateIsNotNull() {
            addCriterion("factory_date is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryDateEqualTo(Date value) {
            addCriterionForJDBCDate("factory_date =", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("factory_date <>", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("factory_date >", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("factory_date >=", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateLessThan(Date value) {
            addCriterionForJDBCDate("factory_date <", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("factory_date <=", value, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateIn(List<Date> values) {
            addCriterionForJDBCDate("factory_date in", values, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("factory_date not in", values, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("factory_date between", value1, value2, "factoryDate");
            return (Criteria) this;
        }

        public Criteria andFactoryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("factory_date not between", value1, value2, "factoryDate");
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
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
            addCriterionForJDBCDate("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date not between", value1, value2, "updateDate");
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