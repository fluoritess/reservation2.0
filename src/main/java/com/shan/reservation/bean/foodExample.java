package com.shan.reservation.bean;

import java.util.ArrayList;
import java.util.List;

public class foodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public foodExample() {
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

        public Criteria andFoodIdIsNull() {
            addCriterion("food_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("food_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Integer value) {
            addCriterion("food_id =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Integer value) {
            addCriterion("food_id <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Integer value) {
            addCriterion("food_id >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_id >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Integer value) {
            addCriterion("food_id <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("food_id <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Integer> values) {
            addCriterion("food_id in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Integer> values) {
            addCriterion("food_id not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Integer value1, Integer value2) {
            addCriterion("food_id between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("food_id not between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdIsNull() {
            addCriterion("restaurant_id is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdIsNotNull() {
            addCriterion("restaurant_id is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdEqualTo(Integer value) {
            addCriterion("restaurant_id =", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotEqualTo(Integer value) {
            addCriterion("restaurant_id <>", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdGreaterThan(Integer value) {
            addCriterion("restaurant_id >", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurant_id >=", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdLessThan(Integer value) {
            addCriterion("restaurant_id <", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdLessThanOrEqualTo(Integer value) {
            addCriterion("restaurant_id <=", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdIn(List<Integer> values) {
            addCriterion("restaurant_id in", values, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotIn(List<Integer> values) {
            addCriterion("restaurant_id not in", values, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_id between", value1, value2, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_id not between", value1, value2, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNull() {
            addCriterion("food_price is null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNotNull() {
            addCriterion("food_price is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceEqualTo(Double value) {
            addCriterion("food_price =", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotEqualTo(Double value) {
            addCriterion("food_price <>", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThan(Double value) {
            addCriterion("food_price >", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("food_price >=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThan(Double value) {
            addCriterion("food_price <", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThanOrEqualTo(Double value) {
            addCriterion("food_price <=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIn(List<Double> values) {
            addCriterion("food_price in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotIn(List<Double> values) {
            addCriterion("food_price not in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceBetween(Double value1, Double value2) {
            addCriterion("food_price between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotBetween(Double value1, Double value2) {
            addCriterion("food_price not between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodBargainIsNull() {
            addCriterion("food_bargain is null");
            return (Criteria) this;
        }

        public Criteria andFoodBargainIsNotNull() {
            addCriterion("food_bargain is not null");
            return (Criteria) this;
        }

        public Criteria andFoodBargainEqualTo(Double value) {
            addCriterion("food_bargain =", value, "foodBargain");
            return (Criteria) this;
        }

        public Criteria andFoodBargainNotEqualTo(Double value) {
            addCriterion("food_bargain <>", value, "foodBargain");
            return (Criteria) this;
        }

        public Criteria andFoodBargainGreaterThan(Double value) {
            addCriterion("food_bargain >", value, "foodBargain");
            return (Criteria) this;
        }

        public Criteria andFoodBargainGreaterThanOrEqualTo(Double value) {
            addCriterion("food_bargain >=", value, "foodBargain");
            return (Criteria) this;
        }

        public Criteria andFoodBargainLessThan(Double value) {
            addCriterion("food_bargain <", value, "foodBargain");
            return (Criteria) this;
        }

        public Criteria andFoodBargainLessThanOrEqualTo(Double value) {
            addCriterion("food_bargain <=", value, "foodBargain");
            return (Criteria) this;
        }

        public Criteria andFoodBargainIn(List<Double> values) {
            addCriterion("food_bargain in", values, "foodBargain");
            return (Criteria) this;
        }

        public Criteria andFoodBargainNotIn(List<Double> values) {
            addCriterion("food_bargain not in", values, "foodBargain");
            return (Criteria) this;
        }

        public Criteria andFoodBargainBetween(Double value1, Double value2) {
            addCriterion("food_bargain between", value1, value2, "foodBargain");
            return (Criteria) this;
        }

        public Criteria andFoodBargainNotBetween(Double value1, Double value2) {
            addCriterion("food_bargain not between", value1, value2, "foodBargain");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNull() {
            addCriterion("food_name is null");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNotNull() {
            addCriterion("food_name is not null");
            return (Criteria) this;
        }

        public Criteria andFoodNameEqualTo(String value) {
            addCriterion("food_name =", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotEqualTo(String value) {
            addCriterion("food_name <>", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThan(String value) {
            addCriterion("food_name >", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("food_name >=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThan(String value) {
            addCriterion("food_name <", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThanOrEqualTo(String value) {
            addCriterion("food_name <=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLike(String value) {
            addCriterion("food_name like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotLike(String value) {
            addCriterion("food_name not like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameIn(List<String> values) {
            addCriterion("food_name in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotIn(List<String> values) {
            addCriterion("food_name not in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameBetween(String value1, String value2) {
            addCriterion("food_name between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotBetween(String value1, String value2) {
            addCriterion("food_name not between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeIsNull() {
            addCriterion("food_describe is null");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeIsNotNull() {
            addCriterion("food_describe is not null");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeEqualTo(String value) {
            addCriterion("food_describe =", value, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeNotEqualTo(String value) {
            addCriterion("food_describe <>", value, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeGreaterThan(String value) {
            addCriterion("food_describe >", value, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("food_describe >=", value, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeLessThan(String value) {
            addCriterion("food_describe <", value, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeLessThanOrEqualTo(String value) {
            addCriterion("food_describe <=", value, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeLike(String value) {
            addCriterion("food_describe like", value, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeNotLike(String value) {
            addCriterion("food_describe not like", value, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeIn(List<String> values) {
            addCriterion("food_describe in", values, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeNotIn(List<String> values) {
            addCriterion("food_describe not in", values, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeBetween(String value1, String value2) {
            addCriterion("food_describe between", value1, value2, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andFoodDescribeNotBetween(String value1, String value2) {
            addCriterion("food_describe not between", value1, value2, "foodDescribe");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Integer value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Integer value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Integer value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Integer value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Integer value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Integer> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Integer> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Integer value1, Integer value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andFoodImageIsNull() {
            addCriterion("food_image is null");
            return (Criteria) this;
        }

        public Criteria andFoodImageIsNotNull() {
            addCriterion("food_image is not null");
            return (Criteria) this;
        }

        public Criteria andFoodImageEqualTo(String value) {
            addCriterion("food_image =", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageNotEqualTo(String value) {
            addCriterion("food_image <>", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageGreaterThan(String value) {
            addCriterion("food_image >", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageGreaterThanOrEqualTo(String value) {
            addCriterion("food_image >=", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageLessThan(String value) {
            addCriterion("food_image <", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageLessThanOrEqualTo(String value) {
            addCriterion("food_image <=", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageLike(String value) {
            addCriterion("food_image like", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageNotLike(String value) {
            addCriterion("food_image not like", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageIn(List<String> values) {
            addCriterion("food_image in", values, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageNotIn(List<String> values) {
            addCriterion("food_image not in", values, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageBetween(String value1, String value2) {
            addCriterion("food_image between", value1, value2, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageNotBetween(String value1, String value2) {
            addCriterion("food_image not between", value1, value2, "foodImage");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationIsNull() {
            addCriterion("cumulative_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationIsNotNull() {
            addCriterion("cumulative_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationEqualTo(Integer value) {
            addCriterion("cumulative_evaluation =", value, "cumulativeEvaluation");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationNotEqualTo(Integer value) {
            addCriterion("cumulative_evaluation <>", value, "cumulativeEvaluation");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationGreaterThan(Integer value) {
            addCriterion("cumulative_evaluation >", value, "cumulativeEvaluation");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationGreaterThanOrEqualTo(Integer value) {
            addCriterion("cumulative_evaluation >=", value, "cumulativeEvaluation");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationLessThan(Integer value) {
            addCriterion("cumulative_evaluation <", value, "cumulativeEvaluation");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationLessThanOrEqualTo(Integer value) {
            addCriterion("cumulative_evaluation <=", value, "cumulativeEvaluation");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationIn(List<Integer> values) {
            addCriterion("cumulative_evaluation in", values, "cumulativeEvaluation");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationNotIn(List<Integer> values) {
            addCriterion("cumulative_evaluation not in", values, "cumulativeEvaluation");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_evaluation between", value1, value2, "cumulativeEvaluation");
            return (Criteria) this;
        }

        public Criteria andCumulativeEvaluationNotBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_evaluation not between", value1, value2, "cumulativeEvaluation");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andFoodStateIsNull() {
            addCriterion("food_state is null");
            return (Criteria) this;
        }

        public Criteria andFoodStateIsNotNull() {
            addCriterion("food_state is not null");
            return (Criteria) this;
        }

        public Criteria andFoodStateEqualTo(Integer value) {
            addCriterion("food_state =", value, "foodState");
            return (Criteria) this;
        }

        public Criteria andFoodStateNotEqualTo(Integer value) {
            addCriterion("food_state <>", value, "foodState");
            return (Criteria) this;
        }

        public Criteria andFoodStateGreaterThan(Integer value) {
            addCriterion("food_state >", value, "foodState");
            return (Criteria) this;
        }

        public Criteria andFoodStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_state >=", value, "foodState");
            return (Criteria) this;
        }

        public Criteria andFoodStateLessThan(Integer value) {
            addCriterion("food_state <", value, "foodState");
            return (Criteria) this;
        }

        public Criteria andFoodStateLessThanOrEqualTo(Integer value) {
            addCriterion("food_state <=", value, "foodState");
            return (Criteria) this;
        }

        public Criteria andFoodStateIn(List<Integer> values) {
            addCriterion("food_state in", values, "foodState");
            return (Criteria) this;
        }

        public Criteria andFoodStateNotIn(List<Integer> values) {
            addCriterion("food_state not in", values, "foodState");
            return (Criteria) this;
        }

        public Criteria andFoodStateBetween(Integer value1, Integer value2) {
            addCriterion("food_state between", value1, value2, "foodState");
            return (Criteria) this;
        }

        public Criteria andFoodStateNotBetween(Integer value1, Integer value2) {
            addCriterion("food_state not between", value1, value2, "foodState");
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