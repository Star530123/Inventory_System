package com.ivymon.inventory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ManufactureExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    public ManufactureExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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
            List<java.sql.Date> dateList = new ArrayList<>();
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

        public Criteria andManuSeqIsNull() {
            addCriterion("MANU_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andManuSeqIsNotNull() {
            addCriterion("MANU_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andManuSeqEqualTo(Integer value) {
            addCriterion("MANU_SEQ =", value, "manuSeq");
            return (Criteria) this;
        }

        public Criteria andManuSeqNotEqualTo(Integer value) {
            addCriterion("MANU_SEQ <>", value, "manuSeq");
            return (Criteria) this;
        }

        public Criteria andManuSeqGreaterThan(Integer value) {
            addCriterion("MANU_SEQ >", value, "manuSeq");
            return (Criteria) this;
        }

        public Criteria andManuSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("MANU_SEQ >=", value, "manuSeq");
            return (Criteria) this;
        }

        public Criteria andManuSeqLessThan(Integer value) {
            addCriterion("MANU_SEQ <", value, "manuSeq");
            return (Criteria) this;
        }

        public Criteria andManuSeqLessThanOrEqualTo(Integer value) {
            addCriterion("MANU_SEQ <=", value, "manuSeq");
            return (Criteria) this;
        }

        public Criteria andManuSeqIn(List<Integer> values) {
            addCriterion("MANU_SEQ in", values, "manuSeq");
            return (Criteria) this;
        }

        public Criteria andManuSeqNotIn(List<Integer> values) {
            addCriterion("MANU_SEQ not in", values, "manuSeq");
            return (Criteria) this;
        }

        public Criteria andManuSeqBetween(Integer value1, Integer value2) {
            addCriterion("MANU_SEQ between", value1, value2, "manuSeq");
            return (Criteria) this;
        }

        public Criteria andManuSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("MANU_SEQ not between", value1, value2, "manuSeq");
            return (Criteria) this;
        }

        public Criteria andManuNameIsNull() {
            addCriterion("MANU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andManuNameIsNotNull() {
            addCriterion("MANU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andManuNameEqualTo(String value) {
            addCriterion("MANU_NAME =", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameNotEqualTo(String value) {
            addCriterion("MANU_NAME <>", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameGreaterThan(String value) {
            addCriterion("MANU_NAME >", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MANU_NAME >=", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameLessThan(String value) {
            addCriterion("MANU_NAME <", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameLessThanOrEqualTo(String value) {
            addCriterion("MANU_NAME <=", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameLike(String value) {
            addCriterion("MANU_NAME like", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameNotLike(String value) {
            addCriterion("MANU_NAME not like", value, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameIn(List<String> values) {
            addCriterion("MANU_NAME in", values, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameNotIn(List<String> values) {
            addCriterion("MANU_NAME not in", values, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameBetween(String value1, String value2) {
            addCriterion("MANU_NAME between", value1, value2, "manuName");
            return (Criteria) this;
        }

        public Criteria andManuNameNotBetween(String value1, String value2) {
            addCriterion("MANU_NAME not between", value1, value2, "manuName");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("CREAT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("CREAT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREAT_TIME =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREAT_TIME <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREAT_TIME >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREAT_TIME >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREAT_TIME <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREAT_TIME <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREAT_TIME in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREAT_TIME not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREAT_TIME between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREAT_TIME not between", value1, value2, "creatTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table manufacture
     *
     * @mbg.generated do_not_delete_during_merge Thu Sep 16 14:54:01 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
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