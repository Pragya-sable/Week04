package com.personalizedmealplangenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class MealPlanGeneratorTest {

    // Declare the MealPlanGenerator instance and meal types
    private MealPlanGenerator generator;
    private VegetarianMeal vegetarianMeal;
    private VeganMeal veganMeal;
    private KetoMeal ketoMeal;
    private HighProteinMeal highProteinMeal;

    // This method runs before each test, initializing the objects to be used in tests
    @BeforeEach
    void setUp() {
        generator = new MealPlanGenerator();
        vegetarianMeal = new VegetarianMeal();
        veganMeal = new VeganMeal();
        ketoMeal = new KetoMeal();
        highProteinMeal = new HighProteinMeal();
    }
    // Test adding valid meals and ensuring they are correctly added to the generator
    @Test
    void testAddValidMeals() {
        // Create Meal objects of specific meal types (VegetarianMeal, VeganMeal)
        Meal<VegetarianMeal> vegMeal = new Meal<>("Paneer Tikka", vegetarianMeal);
        Meal<VeganMeal> veganSalad = new Meal<>("Vegan Salad", veganMeal);

        // Add meals to the generator
        generator.addMeal(vegMeal);
        generator.addMeal(veganSalad);

        // Retrieve and assert the meals stored in the generator
        List<Meal<? extends MealPlan>> meals = generator.getMeals();
        assertEquals(2, meals.size());
        assertEquals("Paneer Tikka", meals.get(0).getMealName());
        assertEquals("Vegan Salad", meals.get(1).getMealName());
    }

    // Test generating a meal plan for a valid meal
    @Test
    void testGenerateMealPlan_ValidMeal() {
        generator.generateMealPlan(vegetarianMeal);
        assertTrue(vegetarianMeal.isValidMeal(), "Meal should be valid");
    }

    // Test generating a meal plan for an invalid meal
    @Test
    void testGenerateMealPlan_InvalidMeal() {
        MealPlan invalidMeal = new MealPlan() {
            @Override
            public boolean isValidMeal() {
                return false;
            }

            @Override
            public String getMealType() {
                return "Invalid Meal";
            }
        };
        // Generate a personalized meal plan for the invalid meal
        generator.generateMealPlan(invalidMeal);
        // Assert that the invalid meal is indeed invalid
        assertFalse(invalidMeal.isValidMeal(), "Meal should be invalid");
    }
}