package com.personalizedmealplangenerator;

public class Meal<T extends MealPlan> {

    private String mealName;
    private T mealType;

    // Constructor
    public Meal(String mealName, T mealType) {
        this.mealName = mealName;
        this.mealType = mealType;
    }
    // Getter methods
    public String getMealName() {
        return mealName;
    }

    public T getMealType() {
        return mealType;
    }

    @Override
    public String toString() {
        return mealName + " (" + mealType.getMealType() + ")";
    }
}