package com.just.pojo;

import java.util.ArrayList;
import java.util.List;

public class OccupationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OccupationExample() {
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

        public Criteria andClassificationIsNull() {
            addCriterion("classification is null");
            return (Criteria) this;
        }

        public Criteria andClassificationIsNotNull() {
            addCriterion("classification is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationEqualTo(String value) {
            addCriterion("classification =", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotEqualTo(String value) {
            addCriterion("classification <>", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThan(String value) {
            addCriterion("classification >", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("classification >=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThan(String value) {
            addCriterion("classification <", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThanOrEqualTo(String value) {
            addCriterion("classification <=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLike(String value) {
            addCriterion("classification like", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotLike(String value) {
            addCriterion("classification not like", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationIn(List<String> values) {
            addCriterion("classification in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotIn(List<String> values) {
            addCriterion("classification not in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationBetween(String value1, String value2) {
            addCriterion("classification between", value1, value2, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotBetween(String value1, String value2) {
            addCriterion("classification not between", value1, value2, "classification");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNull() {
            addCriterion("threshold is null");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNotNull() {
            addCriterion("threshold is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdEqualTo(String value) {
            addCriterion("threshold =", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotEqualTo(String value) {
            addCriterion("threshold <>", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThan(String value) {
            addCriterion("threshold >", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThanOrEqualTo(String value) {
            addCriterion("threshold >=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThan(String value) {
            addCriterion("threshold <", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThanOrEqualTo(String value) {
            addCriterion("threshold <=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLike(String value) {
            addCriterion("threshold like", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotLike(String value) {
            addCriterion("threshold not like", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdIn(List<String> values) {
            addCriterion("threshold in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotIn(List<String> values) {
            addCriterion("threshold not in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdBetween(String value1, String value2) {
            addCriterion("threshold between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotBetween(String value1, String value2) {
            addCriterion("threshold not between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNull() {
            addCriterion("difficulty is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNotNull() {
            addCriterion("difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyEqualTo(String value) {
            addCriterion("difficulty =", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotEqualTo(String value) {
            addCriterion("difficulty <>", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThan(String value) {
            addCriterion("difficulty >", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThanOrEqualTo(String value) {
            addCriterion("difficulty >=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThan(String value) {
            addCriterion("difficulty <", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThanOrEqualTo(String value) {
            addCriterion("difficulty <=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLike(String value) {
            addCriterion("difficulty like", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotLike(String value) {
            addCriterion("difficulty not like", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyIn(List<String> values) {
            addCriterion("difficulty in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotIn(List<String> values) {
            addCriterion("difficulty not in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyBetween(String value1, String value2) {
            addCriterion("difficulty between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotBetween(String value1, String value2) {
            addCriterion("difficulty not between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("cycle is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(String value) {
            addCriterion("cycle =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(String value) {
            addCriterion("cycle <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(String value) {
            addCriterion("cycle >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(String value) {
            addCriterion("cycle >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(String value) {
            addCriterion("cycle <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(String value) {
            addCriterion("cycle <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLike(String value) {
            addCriterion("cycle like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotLike(String value) {
            addCriterion("cycle not like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<String> values) {
            addCriterion("cycle in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<String> values) {
            addCriterion("cycle not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(String value1, String value2) {
            addCriterion("cycle between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(String value1, String value2) {
            addCriterion("cycle not between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andScarcityIsNull() {
            addCriterion("scarcity is null");
            return (Criteria) this;
        }

        public Criteria andScarcityIsNotNull() {
            addCriterion("scarcity is not null");
            return (Criteria) this;
        }

        public Criteria andScarcityEqualTo(Integer value) {
            addCriterion("scarcity =", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityNotEqualTo(Integer value) {
            addCriterion("scarcity <>", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityGreaterThan(Integer value) {
            addCriterion("scarcity >", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityGreaterThanOrEqualTo(Integer value) {
            addCriterion("scarcity >=", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityLessThan(Integer value) {
            addCriterion("scarcity <", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityLessThanOrEqualTo(Integer value) {
            addCriterion("scarcity <=", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityIn(List<Integer> values) {
            addCriterion("scarcity in", values, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityNotIn(List<Integer> values) {
            addCriterion("scarcity not in", values, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityBetween(Integer value1, Integer value2) {
            addCriterion("scarcity between", value1, value2, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityNotBetween(Integer value1, Integer value2) {
            addCriterion("scarcity not between", value1, value2, "scarcity");
            return (Criteria) this;
        }

        public Criteria andSalary1IsNull() {
            addCriterion("salary1 is null");
            return (Criteria) this;
        }

        public Criteria andSalary1IsNotNull() {
            addCriterion("salary1 is not null");
            return (Criteria) this;
        }

        public Criteria andSalary1EqualTo(String value) {
            addCriterion("salary1 =", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1NotEqualTo(String value) {
            addCriterion("salary1 <>", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1GreaterThan(String value) {
            addCriterion("salary1 >", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1GreaterThanOrEqualTo(String value) {
            addCriterion("salary1 >=", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1LessThan(String value) {
            addCriterion("salary1 <", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1LessThanOrEqualTo(String value) {
            addCriterion("salary1 <=", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1Like(String value) {
            addCriterion("salary1 like", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1NotLike(String value) {
            addCriterion("salary1 not like", value, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1In(List<String> values) {
            addCriterion("salary1 in", values, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1NotIn(List<String> values) {
            addCriterion("salary1 not in", values, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1Between(String value1, String value2) {
            addCriterion("salary1 between", value1, value2, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary1NotBetween(String value1, String value2) {
            addCriterion("salary1 not between", value1, value2, "salary1");
            return (Criteria) this;
        }

        public Criteria andSalary2IsNull() {
            addCriterion("salary2 is null");
            return (Criteria) this;
        }

        public Criteria andSalary2IsNotNull() {
            addCriterion("salary2 is not null");
            return (Criteria) this;
        }

        public Criteria andSalary2EqualTo(String value) {
            addCriterion("salary2 =", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2NotEqualTo(String value) {
            addCriterion("salary2 <>", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2GreaterThan(String value) {
            addCriterion("salary2 >", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2GreaterThanOrEqualTo(String value) {
            addCriterion("salary2 >=", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2LessThan(String value) {
            addCriterion("salary2 <", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2LessThanOrEqualTo(String value) {
            addCriterion("salary2 <=", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2Like(String value) {
            addCriterion("salary2 like", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2NotLike(String value) {
            addCriterion("salary2 not like", value, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2In(List<String> values) {
            addCriterion("salary2 in", values, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2NotIn(List<String> values) {
            addCriterion("salary2 not in", values, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2Between(String value1, String value2) {
            addCriterion("salary2 between", value1, value2, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary2NotBetween(String value1, String value2) {
            addCriterion("salary2 not between", value1, value2, "salary2");
            return (Criteria) this;
        }

        public Criteria andSalary3IsNull() {
            addCriterion("salary3 is null");
            return (Criteria) this;
        }

        public Criteria andSalary3IsNotNull() {
            addCriterion("salary3 is not null");
            return (Criteria) this;
        }

        public Criteria andSalary3EqualTo(String value) {
            addCriterion("salary3 =", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3NotEqualTo(String value) {
            addCriterion("salary3 <>", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3GreaterThan(String value) {
            addCriterion("salary3 >", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3GreaterThanOrEqualTo(String value) {
            addCriterion("salary3 >=", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3LessThan(String value) {
            addCriterion("salary3 <", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3LessThanOrEqualTo(String value) {
            addCriterion("salary3 <=", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3Like(String value) {
            addCriterion("salary3 like", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3NotLike(String value) {
            addCriterion("salary3 not like", value, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3In(List<String> values) {
            addCriterion("salary3 in", values, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3NotIn(List<String> values) {
            addCriterion("salary3 not in", values, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3Between(String value1, String value2) {
            addCriterion("salary3 between", value1, value2, "salary3");
            return (Criteria) this;
        }

        public Criteria andSalary3NotBetween(String value1, String value2) {
            addCriterion("salary3 not between", value1, value2, "salary3");
            return (Criteria) this;
        }

        public Criteria andLearnerIsNull() {
            addCriterion("learner is null");
            return (Criteria) this;
        }

        public Criteria andLearnerIsNotNull() {
            addCriterion("learner is not null");
            return (Criteria) this;
        }

        public Criteria andLearnerEqualTo(Integer value) {
            addCriterion("learner =", value, "learner");
            return (Criteria) this;
        }

        public Criteria andLearnerNotEqualTo(Integer value) {
            addCriterion("learner <>", value, "learner");
            return (Criteria) this;
        }

        public Criteria andLearnerGreaterThan(Integer value) {
            addCriterion("learner >", value, "learner");
            return (Criteria) this;
        }

        public Criteria andLearnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("learner >=", value, "learner");
            return (Criteria) this;
        }

        public Criteria andLearnerLessThan(Integer value) {
            addCriterion("learner <", value, "learner");
            return (Criteria) this;
        }

        public Criteria andLearnerLessThanOrEqualTo(Integer value) {
            addCriterion("learner <=", value, "learner");
            return (Criteria) this;
        }

        public Criteria andLearnerIn(List<Integer> values) {
            addCriterion("learner in", values, "learner");
            return (Criteria) this;
        }

        public Criteria andLearnerNotIn(List<Integer> values) {
            addCriterion("learner not in", values, "learner");
            return (Criteria) this;
        }

        public Criteria andLearnerBetween(Integer value1, Integer value2) {
            addCriterion("learner between", value1, value2, "learner");
            return (Criteria) this;
        }

        public Criteria andLearnerNotBetween(Integer value1, Integer value2) {
            addCriterion("learner not between", value1, value2, "learner");
            return (Criteria) this;
        }

        public Criteria andFoundationIsNull() {
            addCriterion("foundation is null");
            return (Criteria) this;
        }

        public Criteria andFoundationIsNotNull() {
            addCriterion("foundation is not null");
            return (Criteria) this;
        }

        public Criteria andFoundationEqualTo(String value) {
            addCriterion("foundation =", value, "foundation");
            return (Criteria) this;
        }

        public Criteria andFoundationNotEqualTo(String value) {
            addCriterion("foundation <>", value, "foundation");
            return (Criteria) this;
        }

        public Criteria andFoundationGreaterThan(String value) {
            addCriterion("foundation >", value, "foundation");
            return (Criteria) this;
        }

        public Criteria andFoundationGreaterThanOrEqualTo(String value) {
            addCriterion("foundation >=", value, "foundation");
            return (Criteria) this;
        }

        public Criteria andFoundationLessThan(String value) {
            addCriterion("foundation <", value, "foundation");
            return (Criteria) this;
        }

        public Criteria andFoundationLessThanOrEqualTo(String value) {
            addCriterion("foundation <=", value, "foundation");
            return (Criteria) this;
        }

        public Criteria andFoundationLike(String value) {
            addCriterion("foundation like", value, "foundation");
            return (Criteria) this;
        }

        public Criteria andFoundationNotLike(String value) {
            addCriterion("foundation not like", value, "foundation");
            return (Criteria) this;
        }

        public Criteria andFoundationIn(List<String> values) {
            addCriterion("foundation in", values, "foundation");
            return (Criteria) this;
        }

        public Criteria andFoundationNotIn(List<String> values) {
            addCriterion("foundation not in", values, "foundation");
            return (Criteria) this;
        }

        public Criteria andFoundationBetween(String value1, String value2) {
            addCriterion("foundation between", value1, value2, "foundation");
            return (Criteria) this;
        }

        public Criteria andFoundationNotBetween(String value1, String value2) {
            addCriterion("foundation not between", value1, value2, "foundation");
            return (Criteria) this;
        }

        public Criteria andFlipTitleIsNull() {
            addCriterion("flip_title is null");
            return (Criteria) this;
        }

        public Criteria andFlipTitleIsNotNull() {
            addCriterion("flip_title is not null");
            return (Criteria) this;
        }

        public Criteria andFlipTitleEqualTo(String value) {
            addCriterion("flip_title =", value, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTitleNotEqualTo(String value) {
            addCriterion("flip_title <>", value, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTitleGreaterThan(String value) {
            addCriterion("flip_title >", value, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTitleGreaterThanOrEqualTo(String value) {
            addCriterion("flip_title >=", value, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTitleLessThan(String value) {
            addCriterion("flip_title <", value, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTitleLessThanOrEqualTo(String value) {
            addCriterion("flip_title <=", value, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTitleLike(String value) {
            addCriterion("flip_title like", value, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTitleNotLike(String value) {
            addCriterion("flip_title not like", value, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTitleIn(List<String> values) {
            addCriterion("flip_title in", values, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTitleNotIn(List<String> values) {
            addCriterion("flip_title not in", values, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTitleBetween(String value1, String value2) {
            addCriterion("flip_title between", value1, value2, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTitleNotBetween(String value1, String value2) {
            addCriterion("flip_title not between", value1, value2, "flipTitle");
            return (Criteria) this;
        }

        public Criteria andFlipTextIsNull() {
            addCriterion("flip_text is null");
            return (Criteria) this;
        }

        public Criteria andFlipTextIsNotNull() {
            addCriterion("flip_text is not null");
            return (Criteria) this;
        }

        public Criteria andFlipTextEqualTo(String value) {
            addCriterion("flip_text =", value, "flipText");
            return (Criteria) this;
        }

        public Criteria andFlipTextNotEqualTo(String value) {
            addCriterion("flip_text <>", value, "flipText");
            return (Criteria) this;
        }

        public Criteria andFlipTextGreaterThan(String value) {
            addCriterion("flip_text >", value, "flipText");
            return (Criteria) this;
        }

        public Criteria andFlipTextGreaterThanOrEqualTo(String value) {
            addCriterion("flip_text >=", value, "flipText");
            return (Criteria) this;
        }

        public Criteria andFlipTextLessThan(String value) {
            addCriterion("flip_text <", value, "flipText");
            return (Criteria) this;
        }

        public Criteria andFlipTextLessThanOrEqualTo(String value) {
            addCriterion("flip_text <=", value, "flipText");
            return (Criteria) this;
        }

        public Criteria andFlipTextLike(String value) {
            addCriterion("flip_text like", value, "flipText");
            return (Criteria) this;
        }

        public Criteria andFlipTextNotLike(String value) {
            addCriterion("flip_text not like", value, "flipText");
            return (Criteria) this;
        }

        public Criteria andFlipTextIn(List<String> values) {
            addCriterion("flip_text in", values, "flipText");
            return (Criteria) this;
        }

        public Criteria andFlipTextNotIn(List<String> values) {
            addCriterion("flip_text not in", values, "flipText");
            return (Criteria) this;
        }

        public Criteria andFlipTextBetween(String value1, String value2) {
            addCriterion("flip_text between", value1, value2, "flipText");
            return (Criteria) this;
        }

        public Criteria andFlipTextNotBetween(String value1, String value2) {
            addCriterion("flip_text not between", value1, value2, "flipText");
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