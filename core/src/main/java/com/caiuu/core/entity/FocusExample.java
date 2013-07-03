package com.caiuu.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FocusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FocusExample() {
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

        public Criteria andFocusidIsNull() {
            addCriterion("FocusId is null");
            return (Criteria) this;
        }

        public Criteria andFocusidIsNotNull() {
            addCriterion("FocusId is not null");
            return (Criteria) this;
        }

        public Criteria andFocusidEqualTo(Integer value) {
            addCriterion("FocusId =", value, "focusid");
            return (Criteria) this;
        }

        public Criteria andFocusidNotEqualTo(Integer value) {
            addCriterion("FocusId <>", value, "focusid");
            return (Criteria) this;
        }

        public Criteria andFocusidGreaterThan(Integer value) {
            addCriterion("FocusId >", value, "focusid");
            return (Criteria) this;
        }

        public Criteria andFocusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FocusId >=", value, "focusid");
            return (Criteria) this;
        }

        public Criteria andFocusidLessThan(Integer value) {
            addCriterion("FocusId <", value, "focusid");
            return (Criteria) this;
        }

        public Criteria andFocusidLessThanOrEqualTo(Integer value) {
            addCriterion("FocusId <=", value, "focusid");
            return (Criteria) this;
        }

        public Criteria andFocusidIn(List<Integer> values) {
            addCriterion("FocusId in", values, "focusid");
            return (Criteria) this;
        }

        public Criteria andFocusidNotIn(List<Integer> values) {
            addCriterion("FocusId not in", values, "focusid");
            return (Criteria) this;
        }

        public Criteria andFocusidBetween(Integer value1, Integer value2) {
            addCriterion("FocusId between", value1, value2, "focusid");
            return (Criteria) this;
        }

        public Criteria andFocusidNotBetween(Integer value1, Integer value2) {
            addCriterion("FocusId not between", value1, value2, "focusid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPic43IsNull() {
            addCriterion("Pic43 is null");
            return (Criteria) this;
        }

        public Criteria andPic43IsNotNull() {
            addCriterion("Pic43 is not null");
            return (Criteria) this;
        }

        public Criteria andPic43EqualTo(String value) {
            addCriterion("Pic43 =", value, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic43NotEqualTo(String value) {
            addCriterion("Pic43 <>", value, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic43GreaterThan(String value) {
            addCriterion("Pic43 >", value, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic43GreaterThanOrEqualTo(String value) {
            addCriterion("Pic43 >=", value, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic43LessThan(String value) {
            addCriterion("Pic43 <", value, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic43LessThanOrEqualTo(String value) {
            addCriterion("Pic43 <=", value, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic43Like(String value) {
            addCriterion("Pic43 like", value, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic43NotLike(String value) {
            addCriterion("Pic43 not like", value, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic43In(List<String> values) {
            addCriterion("Pic43 in", values, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic43NotIn(List<String> values) {
            addCriterion("Pic43 not in", values, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic43Between(String value1, String value2) {
            addCriterion("Pic43 between", value1, value2, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic43NotBetween(String value1, String value2) {
            addCriterion("Pic43 not between", value1, value2, "pic43");
            return (Criteria) this;
        }

        public Criteria andPic21IsNull() {
            addCriterion("Pic21 is null");
            return (Criteria) this;
        }

        public Criteria andPic21IsNotNull() {
            addCriterion("Pic21 is not null");
            return (Criteria) this;
        }

        public Criteria andPic21EqualTo(String value) {
            addCriterion("Pic21 =", value, "pic21");
            return (Criteria) this;
        }

        public Criteria andPic21NotEqualTo(String value) {
            addCriterion("Pic21 <>", value, "pic21");
            return (Criteria) this;
        }

        public Criteria andPic21GreaterThan(String value) {
            addCriterion("Pic21 >", value, "pic21");
            return (Criteria) this;
        }

        public Criteria andPic21GreaterThanOrEqualTo(String value) {
            addCriterion("Pic21 >=", value, "pic21");
            return (Criteria) this;
        }

        public Criteria andPic21LessThan(String value) {
            addCriterion("Pic21 <", value, "pic21");
            return (Criteria) this;
        }

        public Criteria andPic21LessThanOrEqualTo(String value) {
            addCriterion("Pic21 <=", value, "pic21");
            return (Criteria) this;
        }

        public Criteria andPic21Like(String value) {
            addCriterion("Pic21 like", value, "pic21");
            return (Criteria) this;
        }

        public Criteria andPic21NotLike(String value) {
            addCriterion("Pic21 not like", value, "pic21");
            return (Criteria) this;
        }

        public Criteria andPic21In(List<String> values) {
            addCriterion("Pic21 in", values, "pic21");
            return (Criteria) this;
        }

        public Criteria andPic21NotIn(List<String> values) {
            addCriterion("Pic21 not in", values, "pic21");
            return (Criteria) this;
        }

        public Criteria andPic21Between(String value1, String value2) {
            addCriterion("Pic21 between", value1, value2, "pic21");
            return (Criteria) this;
        }

        public Criteria andPic21NotBetween(String value1, String value2) {
            addCriterion("Pic21 not between", value1, value2, "pic21");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("PublishTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("PublishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Long value) {
            addCriterion("PublishTime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Long value) {
            addCriterion("PublishTime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Long value) {
            addCriterion("PublishTime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("PublishTime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Long value) {
            addCriterion("PublishTime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Long value) {
            addCriterion("PublishTime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Long> values) {
            addCriterion("PublishTime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Long> values) {
            addCriterion("PublishTime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Long value1, Long value2) {
            addCriterion("PublishTime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Long value1, Long value2) {
            addCriterion("PublishTime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
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