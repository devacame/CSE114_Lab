//116598178 Henry Ahn HW 6
public class RecipeIngredient extends Ingredient {
    private float quantity;

    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
        super(name, measuringUnit, caloriesPerUnit);
        this.quantity = quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public boolean equals(Object o) {
        if (o instanceof RecipeIngredient) {
            RecipeIngredient recipeIngredient = (RecipeIngredient) o;
            return super.equals(recipeIngredient) && quantity == recipeIngredient.getQuantity();
        }
        return false;
    }

    public String toString() {
        return super.toString() + "\nquantity=" + quantity;
    }
}
