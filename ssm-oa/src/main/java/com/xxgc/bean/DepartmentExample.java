package com.xxgc.bean;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andDeidIsNull() {
            addCriterion("deid is null");
            return (Criteria) this;
        }

        public Criteria andDeidIsNotNull() {
            addCriterion("deid is not null");
            return (Criteria) this;
        }

        public Criteria andDeidEqualTo(Integer value) {
            addCriterion("deid =", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidNotEqualTo(Integer value) {
            addCriterion("deid <>", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidGreaterThan(Integer value) {
            addCriterion("deid >", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deid >=", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidLessThan(Integer value) {
            addCriterion("deid <", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidLessThanOrEqualTo(Integer value) {
            addCriterion("deid <=", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidIn(List<Integer> values) {
            addCriterion("deid in", values, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidNotIn(List<Integer> values) {
            addCriterion("deid not in", values, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidBetween(Integer value1, Integer value2) {
            addCriterion("deid between", value1, value2, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidNotBetween(Integer value1, Integer value2) {
            addCriterion("deid not between", value1, value2, "deid");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentname is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentname is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentname =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentname <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentname >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentname >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentname <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentname <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentname like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentname not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentname in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentname not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentname between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentname not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDdescIsNull() {
            addCriterion("ddesc is null");
            return (Criteria) this;
        }

        public Criteria andDdescIsNotNull() {
            addCriterion("ddesc is not null");
            return (Criteria) this;
        }

        public Criteria andDdescEqualTo(String value) {
            addCriterion("ddesc =", value, "ddesc");
            return (Criteria) this;
        }

        public Criteria andDdescNotEqualTo(String value) {
            addCriterion("ddesc <>", value, "ddesc");
            return (Criteria) this;
        }

        public Criteria andDdescGreaterThan(String value) {
            addCriterion("ddesc >", value, "ddesc");
            return (Criteria) this;
        }

        public Criteria andDdescGreaterThanOrEqualTo(String value) {
            addCriterion("ddesc >=", value, "ddesc");
            return (Criteria) this;
        }

        public Criteria andDdescLessThan(String value) {
            addCriterion("ddesc <", value, "ddesc");
            return (Criteria) this;
        }

        public Criteria andDdescLessThanOrEqualTo(String value) {
            addCriterion("ddesc <=", value, "ddesc");
            return (Criteria) this;
        }

        public Criteria andDdescLike(String value) {
            addCriterion("ddesc like", value, "ddesc");
            return (Criteria) this;
        }

        public Criteria andDdescNotLike(String value) {
            addCriterion("ddesc not like", value, "ddesc");
            return (Criteria) this;
        }

        public Criteria andDdescIn(List<String> values) {
            addCriterion("ddesc in", values, "ddesc");
            return (Criteria) this;
        }

        public Criteria andDdescNotIn(List<String> values) {
            addCriterion("ddesc not in", values, "ddesc");
            return (Criteria) this;
        }

        public Criteria andDdescBetween(String value1, String value2) {
            addCriterion("ddesc between", value1, value2, "ddesc");
            return (Criteria) this;
        }

        public Criteria andDdescNotBetween(String value1, String value2) {
            addCriterion("ddesc not between", value1, value2, "ddesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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