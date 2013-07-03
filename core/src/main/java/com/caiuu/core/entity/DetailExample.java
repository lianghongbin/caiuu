package com.caiuu.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailExample() {
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

        public Criteria andCaipuidIsNull() {
            addCriterion("caipuid is null");
            return (Criteria) this;
        }

        public Criteria andCaipuidIsNotNull() {
            addCriterion("caipuid is not null");
            return (Criteria) this;
        }

        public Criteria andCaipuidEqualTo(Integer value) {
            addCriterion("caipuid =", value, "caipuid");
            return (Criteria) this;
        }

        public Criteria andCaipuidNotEqualTo(Integer value) {
            addCriterion("caipuid <>", value, "caipuid");
            return (Criteria) this;
        }

        public Criteria andCaipuidGreaterThan(Integer value) {
            addCriterion("caipuid >", value, "caipuid");
            return (Criteria) this;
        }

        public Criteria andCaipuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("caipuid >=", value, "caipuid");
            return (Criteria) this;
        }

        public Criteria andCaipuidLessThan(Integer value) {
            addCriterion("caipuid <", value, "caipuid");
            return (Criteria) this;
        }

        public Criteria andCaipuidLessThanOrEqualTo(Integer value) {
            addCriterion("caipuid <=", value, "caipuid");
            return (Criteria) this;
        }

        public Criteria andCaipuidIn(List<Integer> values) {
            addCriterion("caipuid in", values, "caipuid");
            return (Criteria) this;
        }

        public Criteria andCaipuidNotIn(List<Integer> values) {
            addCriterion("caipuid not in", values, "caipuid");
            return (Criteria) this;
        }

        public Criteria andCaipuidBetween(Integer value1, Integer value2) {
            addCriterion("caipuid between", value1, value2, "caipuid");
            return (Criteria) this;
        }

        public Criteria andCaipuidNotBetween(Integer value1, Integer value2) {
            addCriterion("caipuid not between", value1, value2, "caipuid");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andBlendingIsNull() {
            addCriterion("blending is null");
            return (Criteria) this;
        }

        public Criteria andBlendingIsNotNull() {
            addCriterion("blending is not null");
            return (Criteria) this;
        }

        public Criteria andBlendingEqualTo(String value) {
            addCriterion("blending =", value, "blending");
            return (Criteria) this;
        }

        public Criteria andBlendingNotEqualTo(String value) {
            addCriterion("blending <>", value, "blending");
            return (Criteria) this;
        }

        public Criteria andBlendingGreaterThan(String value) {
            addCriterion("blending >", value, "blending");
            return (Criteria) this;
        }

        public Criteria andBlendingGreaterThanOrEqualTo(String value) {
            addCriterion("blending >=", value, "blending");
            return (Criteria) this;
        }

        public Criteria andBlendingLessThan(String value) {
            addCriterion("blending <", value, "blending");
            return (Criteria) this;
        }

        public Criteria andBlendingLessThanOrEqualTo(String value) {
            addCriterion("blending <=", value, "blending");
            return (Criteria) this;
        }

        public Criteria andBlendingLike(String value) {
            addCriterion("blending like", value, "blending");
            return (Criteria) this;
        }

        public Criteria andBlendingNotLike(String value) {
            addCriterion("blending not like", value, "blending");
            return (Criteria) this;
        }

        public Criteria andBlendingIn(List<String> values) {
            addCriterion("blending in", values, "blending");
            return (Criteria) this;
        }

        public Criteria andBlendingNotIn(List<String> values) {
            addCriterion("blending not in", values, "blending");
            return (Criteria) this;
        }

        public Criteria andBlendingBetween(String value1, String value2) {
            addCriterion("blending between", value1, value2, "blending");
            return (Criteria) this;
        }

        public Criteria andBlendingNotBetween(String value1, String value2) {
            addCriterion("blending not between", value1, value2, "blending");
            return (Criteria) this;
        }

        public Criteria andFixingIsNull() {
            addCriterion("fixing is null");
            return (Criteria) this;
        }

        public Criteria andFixingIsNotNull() {
            addCriterion("fixing is not null");
            return (Criteria) this;
        }

        public Criteria andFixingEqualTo(String value) {
            addCriterion("fixing =", value, "fixing");
            return (Criteria) this;
        }

        public Criteria andFixingNotEqualTo(String value) {
            addCriterion("fixing <>", value, "fixing");
            return (Criteria) this;
        }

        public Criteria andFixingGreaterThan(String value) {
            addCriterion("fixing >", value, "fixing");
            return (Criteria) this;
        }

        public Criteria andFixingGreaterThanOrEqualTo(String value) {
            addCriterion("fixing >=", value, "fixing");
            return (Criteria) this;
        }

        public Criteria andFixingLessThan(String value) {
            addCriterion("fixing <", value, "fixing");
            return (Criteria) this;
        }

        public Criteria andFixingLessThanOrEqualTo(String value) {
            addCriterion("fixing <=", value, "fixing");
            return (Criteria) this;
        }

        public Criteria andFixingLike(String value) {
            addCriterion("fixing like", value, "fixing");
            return (Criteria) this;
        }

        public Criteria andFixingNotLike(String value) {
            addCriterion("fixing not like", value, "fixing");
            return (Criteria) this;
        }

        public Criteria andFixingIn(List<String> values) {
            addCriterion("fixing in", values, "fixing");
            return (Criteria) this;
        }

        public Criteria andFixingNotIn(List<String> values) {
            addCriterion("fixing not in", values, "fixing");
            return (Criteria) this;
        }

        public Criteria andFixingBetween(String value1, String value2) {
            addCriterion("fixing between", value1, value2, "fixing");
            return (Criteria) this;
        }

        public Criteria andFixingNotBetween(String value1, String value2) {
            addCriterion("fixing not between", value1, value2, "fixing");
            return (Criteria) this;
        }

        public Criteria andFireIsNull() {
            addCriterion("fire is null");
            return (Criteria) this;
        }

        public Criteria andFireIsNotNull() {
            addCriterion("fire is not null");
            return (Criteria) this;
        }

        public Criteria andFireEqualTo(String value) {
            addCriterion("fire =", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireNotEqualTo(String value) {
            addCriterion("fire <>", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireGreaterThan(String value) {
            addCriterion("fire >", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireGreaterThanOrEqualTo(String value) {
            addCriterion("fire >=", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireLessThan(String value) {
            addCriterion("fire <", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireLessThanOrEqualTo(String value) {
            addCriterion("fire <=", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireLike(String value) {
            addCriterion("fire like", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireNotLike(String value) {
            addCriterion("fire not like", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireIn(List<String> values) {
            addCriterion("fire in", values, "fire");
            return (Criteria) this;
        }

        public Criteria andFireNotIn(List<String> values) {
            addCriterion("fire not in", values, "fire");
            return (Criteria) this;
        }

        public Criteria andFireBetween(String value1, String value2) {
            addCriterion("fire between", value1, value2, "fire");
            return (Criteria) this;
        }

        public Criteria andFireNotBetween(String value1, String value2) {
            addCriterion("fire not between", value1, value2, "fire");
            return (Criteria) this;
        }

        public Criteria andOkrenIsNull() {
            addCriterion("okren is null");
            return (Criteria) this;
        }

        public Criteria andOkrenIsNotNull() {
            addCriterion("okren is not null");
            return (Criteria) this;
        }

        public Criteria andOkrenEqualTo(String value) {
            addCriterion("okren =", value, "okren");
            return (Criteria) this;
        }

        public Criteria andOkrenNotEqualTo(String value) {
            addCriterion("okren <>", value, "okren");
            return (Criteria) this;
        }

        public Criteria andOkrenGreaterThan(String value) {
            addCriterion("okren >", value, "okren");
            return (Criteria) this;
        }

        public Criteria andOkrenGreaterThanOrEqualTo(String value) {
            addCriterion("okren >=", value, "okren");
            return (Criteria) this;
        }

        public Criteria andOkrenLessThan(String value) {
            addCriterion("okren <", value, "okren");
            return (Criteria) this;
        }

        public Criteria andOkrenLessThanOrEqualTo(String value) {
            addCriterion("okren <=", value, "okren");
            return (Criteria) this;
        }

        public Criteria andOkrenLike(String value) {
            addCriterion("okren like", value, "okren");
            return (Criteria) this;
        }

        public Criteria andOkrenNotLike(String value) {
            addCriterion("okren not like", value, "okren");
            return (Criteria) this;
        }

        public Criteria andOkrenIn(List<String> values) {
            addCriterion("okren in", values, "okren");
            return (Criteria) this;
        }

        public Criteria andOkrenNotIn(List<String> values) {
            addCriterion("okren not in", values, "okren");
            return (Criteria) this;
        }

        public Criteria andOkrenBetween(String value1, String value2) {
            addCriterion("okren between", value1, value2, "okren");
            return (Criteria) this;
        }

        public Criteria andOkrenNotBetween(String value1, String value2) {
            addCriterion("okren not between", value1, value2, "okren");
            return (Criteria) this;
        }

        public Criteria andNorenIsNull() {
            addCriterion("noren is null");
            return (Criteria) this;
        }

        public Criteria andNorenIsNotNull() {
            addCriterion("noren is not null");
            return (Criteria) this;
        }

        public Criteria andNorenEqualTo(String value) {
            addCriterion("noren =", value, "noren");
            return (Criteria) this;
        }

        public Criteria andNorenNotEqualTo(String value) {
            addCriterion("noren <>", value, "noren");
            return (Criteria) this;
        }

        public Criteria andNorenGreaterThan(String value) {
            addCriterion("noren >", value, "noren");
            return (Criteria) this;
        }

        public Criteria andNorenGreaterThanOrEqualTo(String value) {
            addCriterion("noren >=", value, "noren");
            return (Criteria) this;
        }

        public Criteria andNorenLessThan(String value) {
            addCriterion("noren <", value, "noren");
            return (Criteria) this;
        }

        public Criteria andNorenLessThanOrEqualTo(String value) {
            addCriterion("noren <=", value, "noren");
            return (Criteria) this;
        }

        public Criteria andNorenLike(String value) {
            addCriterion("noren like", value, "noren");
            return (Criteria) this;
        }

        public Criteria andNorenNotLike(String value) {
            addCriterion("noren not like", value, "noren");
            return (Criteria) this;
        }

        public Criteria andNorenIn(List<String> values) {
            addCriterion("noren in", values, "noren");
            return (Criteria) this;
        }

        public Criteria andNorenNotIn(List<String> values) {
            addCriterion("noren not in", values, "noren");
            return (Criteria) this;
        }

        public Criteria andNorenBetween(String value1, String value2) {
            addCriterion("noren between", value1, value2, "noren");
            return (Criteria) this;
        }

        public Criteria andNorenNotBetween(String value1, String value2) {
            addCriterion("noren not between", value1, value2, "noren");
            return (Criteria) this;
        }

        public Criteria andPkeyIsNull() {
            addCriterion("pkey is null");
            return (Criteria) this;
        }

        public Criteria andPkeyIsNotNull() {
            addCriterion("pkey is not null");
            return (Criteria) this;
        }

        public Criteria andPkeyEqualTo(String value) {
            addCriterion("pkey =", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyNotEqualTo(String value) {
            addCriterion("pkey <>", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyGreaterThan(String value) {
            addCriterion("pkey >", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyGreaterThanOrEqualTo(String value) {
            addCriterion("pkey >=", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyLessThan(String value) {
            addCriterion("pkey <", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyLessThanOrEqualTo(String value) {
            addCriterion("pkey <=", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyLike(String value) {
            addCriterion("pkey like", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyNotLike(String value) {
            addCriterion("pkey not like", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyIn(List<String> values) {
            addCriterion("pkey in", values, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyNotIn(List<String> values) {
            addCriterion("pkey not in", values, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyBetween(String value1, String value2) {
            addCriterion("pkey between", value1, value2, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyNotBetween(String value1, String value2) {
            addCriterion("pkey not between", value1, value2, "pkey");
            return (Criteria) this;
        }

        public Criteria andCkeyIsNull() {
            addCriterion("ckey is null");
            return (Criteria) this;
        }

        public Criteria andCkeyIsNotNull() {
            addCriterion("ckey is not null");
            return (Criteria) this;
        }

        public Criteria andCkeyEqualTo(String value) {
            addCriterion("ckey =", value, "ckey");
            return (Criteria) this;
        }

        public Criteria andCkeyNotEqualTo(String value) {
            addCriterion("ckey <>", value, "ckey");
            return (Criteria) this;
        }

        public Criteria andCkeyGreaterThan(String value) {
            addCriterion("ckey >", value, "ckey");
            return (Criteria) this;
        }

        public Criteria andCkeyGreaterThanOrEqualTo(String value) {
            addCriterion("ckey >=", value, "ckey");
            return (Criteria) this;
        }

        public Criteria andCkeyLessThan(String value) {
            addCriterion("ckey <", value, "ckey");
            return (Criteria) this;
        }

        public Criteria andCkeyLessThanOrEqualTo(String value) {
            addCriterion("ckey <=", value, "ckey");
            return (Criteria) this;
        }

        public Criteria andCkeyLike(String value) {
            addCriterion("ckey like", value, "ckey");
            return (Criteria) this;
        }

        public Criteria andCkeyNotLike(String value) {
            addCriterion("ckey not like", value, "ckey");
            return (Criteria) this;
        }

        public Criteria andCkeyIn(List<String> values) {
            addCriterion("ckey in", values, "ckey");
            return (Criteria) this;
        }

        public Criteria andCkeyNotIn(List<String> values) {
            addCriterion("ckey not in", values, "ckey");
            return (Criteria) this;
        }

        public Criteria andCkeyBetween(String value1, String value2) {
            addCriterion("ckey between", value1, value2, "ckey");
            return (Criteria) this;
        }

        public Criteria andCkeyNotBetween(String value1, String value2) {
            addCriterion("ckey not between", value1, value2, "ckey");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGoodIsNull() {
            addCriterion("good is null");
            return (Criteria) this;
        }

        public Criteria andGoodIsNotNull() {
            addCriterion("good is not null");
            return (Criteria) this;
        }

        public Criteria andGoodEqualTo(Integer value) {
            addCriterion("good =", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotEqualTo(Integer value) {
            addCriterion("good <>", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodGreaterThan(Integer value) {
            addCriterion("good >", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("good >=", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodLessThan(Integer value) {
            addCriterion("good <", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodLessThanOrEqualTo(Integer value) {
            addCriterion("good <=", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodIn(List<Integer> values) {
            addCriterion("good in", values, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotIn(List<Integer> values) {
            addCriterion("good not in", values, "good");
            return (Criteria) this;
        }

        public Criteria andGoodBetween(Integer value1, Integer value2) {
            addCriterion("good between", value1, value2, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotBetween(Integer value1, Integer value2) {
            addCriterion("good not between", value1, value2, "good");
            return (Criteria) this;
        }

        public Criteria andBadIsNull() {
            addCriterion("bad is null");
            return (Criteria) this;
        }

        public Criteria andBadIsNotNull() {
            addCriterion("bad is not null");
            return (Criteria) this;
        }

        public Criteria andBadEqualTo(Integer value) {
            addCriterion("bad =", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadNotEqualTo(Integer value) {
            addCriterion("bad <>", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadGreaterThan(Integer value) {
            addCriterion("bad >", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadGreaterThanOrEqualTo(Integer value) {
            addCriterion("bad >=", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadLessThan(Integer value) {
            addCriterion("bad <", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadLessThanOrEqualTo(Integer value) {
            addCriterion("bad <=", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadIn(List<Integer> values) {
            addCriterion("bad in", values, "bad");
            return (Criteria) this;
        }

        public Criteria andBadNotIn(List<Integer> values) {
            addCriterion("bad not in", values, "bad");
            return (Criteria) this;
        }

        public Criteria andBadBetween(Integer value1, Integer value2) {
            addCriterion("bad between", value1, value2, "bad");
            return (Criteria) this;
        }

        public Criteria andBadNotBetween(Integer value1, Integer value2) {
            addCriterion("bad not between", value1, value2, "bad");
            return (Criteria) this;
        }

        public Criteria andHitIsNull() {
            addCriterion("hit is null");
            return (Criteria) this;
        }

        public Criteria andHitIsNotNull() {
            addCriterion("hit is not null");
            return (Criteria) this;
        }

        public Criteria andHitEqualTo(Integer value) {
            addCriterion("hit =", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitNotEqualTo(Integer value) {
            addCriterion("hit <>", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitGreaterThan(Integer value) {
            addCriterion("hit >", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitGreaterThanOrEqualTo(Integer value) {
            addCriterion("hit >=", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitLessThan(Integer value) {
            addCriterion("hit <", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitLessThanOrEqualTo(Integer value) {
            addCriterion("hit <=", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitIn(List<Integer> values) {
            addCriterion("hit in", values, "hit");
            return (Criteria) this;
        }

        public Criteria andHitNotIn(List<Integer> values) {
            addCriterion("hit not in", values, "hit");
            return (Criteria) this;
        }

        public Criteria andHitBetween(Integer value1, Integer value2) {
            addCriterion("hit between", value1, value2, "hit");
            return (Criteria) this;
        }

        public Criteria andHitNotBetween(Integer value1, Integer value2) {
            addCriterion("hit not between", value1, value2, "hit");
            return (Criteria) this;
        }

        public Criteria andHitlastweekIsNull() {
            addCriterion("hitlastweek is null");
            return (Criteria) this;
        }

        public Criteria andHitlastweekIsNotNull() {
            addCriterion("hitlastweek is not null");
            return (Criteria) this;
        }

        public Criteria andHitlastweekEqualTo(Integer value) {
            addCriterion("hitlastweek =", value, "hitlastweek");
            return (Criteria) this;
        }

        public Criteria andHitlastweekNotEqualTo(Integer value) {
            addCriterion("hitlastweek <>", value, "hitlastweek");
            return (Criteria) this;
        }

        public Criteria andHitlastweekGreaterThan(Integer value) {
            addCriterion("hitlastweek >", value, "hitlastweek");
            return (Criteria) this;
        }

        public Criteria andHitlastweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("hitlastweek >=", value, "hitlastweek");
            return (Criteria) this;
        }

        public Criteria andHitlastweekLessThan(Integer value) {
            addCriterion("hitlastweek <", value, "hitlastweek");
            return (Criteria) this;
        }

        public Criteria andHitlastweekLessThanOrEqualTo(Integer value) {
            addCriterion("hitlastweek <=", value, "hitlastweek");
            return (Criteria) this;
        }

        public Criteria andHitlastweekIn(List<Integer> values) {
            addCriterion("hitlastweek in", values, "hitlastweek");
            return (Criteria) this;
        }

        public Criteria andHitlastweekNotIn(List<Integer> values) {
            addCriterion("hitlastweek not in", values, "hitlastweek");
            return (Criteria) this;
        }

        public Criteria andHitlastweekBetween(Integer value1, Integer value2) {
            addCriterion("hitlastweek between", value1, value2, "hitlastweek");
            return (Criteria) this;
        }

        public Criteria andHitlastweekNotBetween(Integer value1, Integer value2) {
            addCriterion("hitlastweek not between", value1, value2, "hitlastweek");
            return (Criteria) this;
        }

        public Criteria andPubdateIsNull() {
            addCriterion("pubdate is null");
            return (Criteria) this;
        }

        public Criteria andPubdateIsNotNull() {
            addCriterion("pubdate is not null");
            return (Criteria) this;
        }

        public Criteria andPubdateEqualTo(Date value) {
            addCriterion("pubdate =", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotEqualTo(Date value) {
            addCriterion("pubdate <>", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateGreaterThan(Date value) {
            addCriterion("pubdate >", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateGreaterThanOrEqualTo(Date value) {
            addCriterion("pubdate >=", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateLessThan(Date value) {
            addCriterion("pubdate <", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateLessThanOrEqualTo(Date value) {
            addCriterion("pubdate <=", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateIn(List<Date> values) {
            addCriterion("pubdate in", values, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotIn(List<Date> values) {
            addCriterion("pubdate not in", values, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateBetween(Date value1, Date value2) {
            addCriterion("pubdate between", value1, value2, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotBetween(Date value1, Date value2) {
            addCriterion("pubdate not between", value1, value2, "pubdate");
            return (Criteria) this;
        }

        public Criteria andEdateIsNull() {
            addCriterion("edate is null");
            return (Criteria) this;
        }

        public Criteria andEdateIsNotNull() {
            addCriterion("edate is not null");
            return (Criteria) this;
        }

        public Criteria andEdateEqualTo(Date value) {
            addCriterion("edate =", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateNotEqualTo(Date value) {
            addCriterion("edate <>", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateGreaterThan(Date value) {
            addCriterion("edate >", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateGreaterThanOrEqualTo(Date value) {
            addCriterion("edate >=", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateLessThan(Date value) {
            addCriterion("edate <", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateLessThanOrEqualTo(Date value) {
            addCriterion("edate <=", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateIn(List<Date> values) {
            addCriterion("edate in", values, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateNotIn(List<Date> values) {
            addCriterion("edate not in", values, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateBetween(Date value1, Date value2) {
            addCriterion("edate between", value1, value2, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateNotBetween(Date value1, Date value2) {
            addCriterion("edate not between", value1, value2, "edate");
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