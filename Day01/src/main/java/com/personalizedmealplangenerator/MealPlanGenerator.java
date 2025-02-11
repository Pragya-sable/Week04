package com.personalizedmealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class MealPlanGenerator {
    // List to store the meal plans
    private List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();

    // Method to add a meal to the mealPlans list
    public void addMeal(Meal<? extends MealPlan> meal) {
        // Check if the meal is valid before adding it to the mealPlans list
        if (meal.getMealType().isValidMeal()) {
            mealPlans.add(meal);
            System.out.println("Added: " + meal);
        } else {
            // If the meal is invalid
            System.out.println("Invalid meal: " + meal);
        }
    }
    // Method to display all the meal plans in the mealPlans list
    public void displayMeals() {
        System.out.println("\nGenerated Meal Plan:");
        for (Meal<? extends MealPlan> meal : mealPlans) {
            System.out.println(meal);
        }
    }
    // Method to return the list of all meals
    public List<Meal<? extends MealPlan>> getMeals() {
        return mealPlans;
    }

    // Generic method to generate a meal plan dynamically
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("\nGenerating a personalized meal plan...");
        if (meal.isValidMeal()) {
            System.out.println(" Valid meal plan: " + meal.getMealType());
        } else {
            System.out.println("Invalid meal plan!");
        }
    }
}