package com.personalizedmealplangenerator;

public class Main {
    public static void main(String[] args) {
        // Creating meal types
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        // Creating meal objects
        Meal<VegetarianMeal> vegMeal = new Meal<>("Paneer Butter Masala", vegetarianMeal);
        Meal<VeganMeal> veganDish = new Meal<>("Vegan Salad", veganMeal);
        Meal<KetoMeal> ketoDish = new Meal<>("Keto Chicken", ketoMeal);
        Meal<HighProteinMeal> proteinDish = new Meal<>("Grilled Chicken", highProteinMeal);

        // Creating and managing meal plans
        MealPlanGenerator generator = new MealPlanGenerator();
        generator.addMeal(vegMeal);
        generator.addMeal(veganDish);
        generator.addMeal(ketoDish);
        generator.addMeal(proteinDish);

        // Displaying all meals
        generator.displayMeals();

        // Using generic method to generate meal plans dynamically
        MealPlanGenerator.generateMealPlan(vegetarianMeal);
        MealPlanGenerator.generateMealPlan(veganMeal);
    }
}