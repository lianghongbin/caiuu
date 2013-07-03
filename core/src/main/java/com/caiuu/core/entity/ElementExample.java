package com.caiuu.core.entity;

import java.util.ArrayList;
import java.util.List;

public class ElementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ElementExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCainameIsNull() {
            addCriterion("caiName is null");
            return (Criteria) this;
        }

        public Criteria andCainameIsNotNull() {
            addCriterion("caiName is not null");
            return (Criteria) this;
        }

        public Criteria andCainameEqualTo(String value) {
            addCriterion("caiName =", value, "cainame");
            return (Criteria) this;
        }

        public Criteria andCainameNotEqualTo(String value) {
            addCriterion("caiName <>", value, "cainame");
            return (Criteria) this;
        }

        public Criteria andCainameGreaterThan(String value) {
            addCriterion("caiName >", value, "cainame");
            return (Criteria) this;
        }

        public Criteria andCainameGreaterThanOrEqualTo(String value) {
            addCriterion("caiName >=", value, "cainame");
            return (Criteria) this;
        }

        public Criteria andCainameLessThan(String value) {
            addCriterion("caiName <", value, "cainame");
            return (Criteria) this;
        }

        public Criteria andCainameLessThanOrEqualTo(String value) {
            addCriterion("caiName <=", value, "cainame");
            return (Criteria) this;
        }

        public Criteria andCainameLike(String value) {
            addCriterion("caiName like", value, "cainame");
            return (Criteria) this;
        }

        public Criteria andCainameNotLike(String value) {
            addCriterion("caiName not like", value, "cainame");
            return (Criteria) this;
        }

        public Criteria andCainameIn(List<String> values) {
            addCriterion("caiName in", values, "cainame");
            return (Criteria) this;
        }

        public Criteria andCainameNotIn(List<String> values) {
            addCriterion("caiName not in", values, "cainame");
            return (Criteria) this;
        }

        public Criteria andCainameBetween(String value1, String value2) {
            addCriterion("caiName between", value1, value2, "cainame");
            return (Criteria) this;
        }

        public Criteria andCainameNotBetween(String value1, String value2) {
            addCriterion("caiName not between", value1, value2, "cainame");
            return (Criteria) this;
        }

        public Criteria andElementIsNull() {
            addCriterion("element is null");
            return (Criteria) this;
        }

        public Criteria andElementIsNotNull() {
            addCriterion("element is not null");
            return (Criteria) this;
        }

        public Criteria andElementEqualTo(String value) {
            addCriterion("element =", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotEqualTo(String value) {
            addCriterion("element <>", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementGreaterThan(String value) {
            addCriterion("element >", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementGreaterThanOrEqualTo(String value) {
            addCriterion("element >=", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementLessThan(String value) {
            addCriterion("element <", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementLessThanOrEqualTo(String value) {
            addCriterion("element <=", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementLike(String value) {
            addCriterion("element like", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotLike(String value) {
            addCriterion("element not like", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementIn(List<String> values) {
            addCriterion("element in", values, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotIn(List<String> values) {
            addCriterion("element not in", values, "element");
            return (Criteria) this;
        }

        public Criteria andElementBetween(String value1, String value2) {
            addCriterion("element between", value1, value2, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotBetween(String value1, String value2) {
            addCriterion("element not between", value1, value2, "element");
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