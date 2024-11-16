
//116598178 Hrnry Ahn HW 6
import java.util.ArrayList;

public class RecipeBook {
    private String bookName;
    private ArrayList<CookingRecipe> recipes = new ArrayList<CookingRecipe>();

    public RecipeBook(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
        if (recipes.stream().anyMatch(r -> r.getName().equals(name)))
            return null;
        CookingRecipe newRecipe = new CookingRecipe(name);
        for (RecipeIngredient ingredient : ingredients) {
            newRecipe.addOrUpdateRecipeIngredient(ingredient, ingredient.getQuantity());
        }
        recipes.add(newRecipe);
        return newRecipe;
    }

    public CookingRecipe removeRecipe(String name) {
        CookingRecipe recipe = recipes.stream()
                .filter(r -> r.getName().equals(name))
                .findFirst()
                .orElse(null);
        if (recipe != null)
            recipes.remove(recipe);
        return recipe;
    }

    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
        ArrayList<CookingRecipe> matches = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            boolean allMatch = true;
            for (RecipeIngredient ingredient : ingredients) {
                if (recipe.getRecipeIngredient(ingredient) == null) {
                    allMatch = false;
                    break;
                }
            }
            if (allMatch)
                matches.add(recipe);
        }
        return matches.toArray(new CookingRecipe[0]);
    }

    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
        ArrayList<CookingRecipe> matches = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.getNumberOfIngredients() <= numberOfIngredients) {
                matches.add(recipe);
            }
        }
        return matches.toArray(new CookingRecipe[0]);
    }

    public CookingRecipe[] findRecipesLowCalories() {
        float minCalories = (float) recipes.stream()
                .mapToDouble(CookingRecipe::calculateCalories)
                .min()
                .orElse(0);
        ArrayList<CookingRecipe> matches = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.calculateCalories() == minCalories) {
                matches.add(recipe);
            }
        }
        return matches.toArray(new CookingRecipe[0]);
    }

    public boolean equals(Object o) {
        if (o instanceof RecipeBook) {
            RecipeBook recipeBook = (RecipeBook) o;
            return bookName.equals(recipeBook.getBookName()) && recipes.equals(recipeBook.recipes);
        }
        return false;
    }

    public String toString() {
        String str = "RecipeBook\n" + "bookName=" + bookName + "\nrecipes=[";
        for (CookingRecipe recipe : recipes) {
            str += "\n" + recipe.toString();
        }
        str += "]\n";
        return str;
    }
}
