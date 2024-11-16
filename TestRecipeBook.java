//116598178 Henry Ahn HW 6
public class TestRecipeBook {
    public static void main(String[] args) {
        RecipeBook recipes = new RecipeBook("Example Recipe Book");
        CookingRecipe cake = recipes.addRecipe("Cake",
                new RecipeIngredient[] { new RecipeIngredient("Flour", "Cup", 455, (float) 2),
                        new RecipeIngredient("Sugar", "Cup", 774, (float) 1),
                        new RecipeIngredient("Egg", "Each", 72, (float) 3) });
        CookingRecipe salad = recipes.addRecipe("Salad", new RecipeIngredient[] {
                new RecipeIngredient("Lettuce", "Cup", 5, (float) 1),
                new RecipeIngredient("Tomato", "Each", 22, (float) 1),
                new RecipeIngredient("Cucumber", "Each", 8, (float) 1) });
        CookingRecipe sandwich = recipes.addRecipe("Sandwich", new RecipeIngredient[] {
                new RecipeIngredient("Bread", "Slice", 79, (float) 2),
                new RecipeIngredient("Cheese", "Slice", 113, (float) 5) });
        System.out.println("\nShould be null when adding: " + recipes.addRecipe("Salad", new RecipeIngredient[] {
                new RecipeIngredient("Lettuce", "Cup", 5, (float) 1),
                new RecipeIngredient("Spinach", "Each", 22, (float) 1),
                new RecipeIngredient("Zucchini", "Each", 8, (float) 1) }));
        System.out.println("Should give recipe for cake: " + recipes.removeRecipe("Cake"));
        System.out.println("\nRecipe Book: " + recipes + "\nFinished Recipe Book\n");
        System.out.println("\nOnly finds the recipe for Salad: " +
                recipes.findRecipes(new RecipeIngredient[] { new RecipeIngredient("Lettuce", "Cup", 5, (float) 1),
                        new RecipeIngredient("Tomato", "Each", 22, (float) 1) })[0]);
        System.out.println("\nOnly finds sandwich: " + recipes.findRecipesWithFewIngredients(2).length + " "
                + recipes.findRecipesWithFewIngredients(2)[0]);
        System.out.println("\nOnly finds salad: " + recipes.findRecipesLowCalories().length + " "
                + recipes.findRecipesLowCalories()[0]);
        System.out.println("\nGets 3: " + recipes.findRecipesLowCalories()[0].getNumberOfIngredients());
        System.out.println("\nGets the lettuce: " + salad.getRecipeIngredient("Lettuce"));
        System.out.println("\nBread doesn't exist: " + salad.getRecipeIngredient("Bread"));
        System.out.println("\nFinds cheese: " + sandwich.getRecipeIngredient(new Ingredient("Cheese", "Slice", 113)));
        System.out.println(
                "\nRemoves cucumber: "
                        + recipes.findRecipesWithFewIngredients(3)[0].removeRecipeIngredient("Cucumber"));
        System.out.println("\nRemoves tomato: " + salad.removeRecipeIngredient(new Ingredient("Tomato", "Each", 22)));
        System.out.println("\nPrints cake recipe: " + cake);
        RecipeBook recipes2 = new RecipeBook("Example Recipe Book 2");
        System.out.println("\nPrints false: " + recipes2.equals(recipes));
    }
}
