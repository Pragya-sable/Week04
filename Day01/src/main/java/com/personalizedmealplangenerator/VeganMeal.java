package com.personalizedmealplangenerator;
// VeganMeal class implements MealPlan
public class VeganMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan Meal";
    }

    @Override
    public boolean isValidMeal() {
        return true;
    }
}