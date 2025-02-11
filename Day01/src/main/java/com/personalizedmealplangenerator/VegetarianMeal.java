package com.personalizedmealplangenerator;
// VegetarianMeal class implements MealPlan
public class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian Meal";
    }

    @Override
    public boolean isValidMeal() {
        return true;
    }
}