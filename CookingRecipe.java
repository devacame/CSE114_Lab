
// 116598178 Henry Ahn HW 6
import java.util.ArrayList;

public class CookingRecipe {
    private String name;
    private ArrayList<RecipeIngredient> recipeIngredients = new ArrayList<>();

    public CookingRecipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
        for (RecipeIngredient recipeIngredient : recipeIngredients) {
            if (ingredient.equals(recipeIngredient)) {
                recipeIngredient.setQuantity(quantity);
                return;
            }
        }
        recipeIngredients.add(new RecipeIngredient(
                ingredient.getName(), ingredient.getMeasuringUnit(),
                ingredient.getCaloriesPerUnit(), quantity));
    }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
        return recipeIngredients.stream()
                .filter(ri -> ingredient.equals(ri))
                .findFirst()
                .orElse(null);
    }

    public RecipeIngredient getRecipeIngredient(String ingredientName) {
        return recipeIngredients.stream()
                .filter(ri -> ri.getName().equals(ingredientName))
                .findFirst()
                .orElse(null);
    }

    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
        boolean isRemoved = false;
        RecipeIngredient toRemove = getRecipeIngredient(ingredient);
        if (toRemove != null)
            isRemoved = recipeIngredients.remove(toRemove);
        return isRemoved ? toRemove : null;
    }

    public RecipeIngredient removeRecipeIngredient(String ingredientName) {
        boolean isRemoved = false;
        RecipeIngredient toRemove = getRecipeIngredient(ingredientName);
        if (toRemove != null)
            isRemoved = recipeIngredients.remove(toRemove);
        return isRemoved ? toRemove : null;
    }

    public float calculateCalories() {
        return (float) recipeIngredients.stream()
                .mapToDouble(ri -> ri.getCaloriesPerUnit() * ri.getQuantity())
                .sum();
    }

    public int getNumberOfIngredients() {
        return recipeIngredients.size();
    }

    public boolean equals(Object o) {
        if (o instanceof CookingRecipe) {
            CookingRecipe cookingRecipe = (CookingRecipe) o;
            return name.equals(cookingRecipe.getName())
                    && recipeIngredients.equals(cookingRecipe.recipeIngredients);
        }
        return false;
    }

    public String toString() {
        String str = "Cooking Recipe\n" + "name=" + name + "\n";
        for (RecipeIngredient recipeIngredient : recipeIngredients) {
            str += recipeIngredient.toString() + "\n";
        }
        return str;
    }
}
