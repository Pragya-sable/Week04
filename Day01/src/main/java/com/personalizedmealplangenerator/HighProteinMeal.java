package com.personalizedmealplangenerator;
// HighProteinMeal implement the MealPlan
public class HighProteinMeal implements MealPlan{
    @Override
    public String getMealType() {
        return "High-Protein Meal";
    }
    @Override
    public boolean isValidMeal() {
        return true;
    }
}
