package Lab18;

public class Food {
    protected String description;
    protected double calories;

    Food() {
        this.description = "Food";
        this.calories = 0;
    }

    Food(String description, double calories) {
        this.description = description;
        this.calories = calories;
    }

    public String getDescription() {
        return this.description;
    }

    public double getCalories() {
        return this.calories;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String toString() {
        return "Description: " + this.description + "\nCalories: " + this.calories;
    }

    public boolean equals(Food food) {
        return this.description.equals(food.description) && this.calories == food.calories;
    }

    public static void main(String[] args) {
        Food food = new Food();
        System.out.println(food);
        food.setDescription("Pizza");
        food.setCalories(300);
        System.out.println(food);
        Food food2 = new Food("Burger", 500);
        System.out.println(food2);
        System.out.println(food.equals(food2));
        LiquidFood liquidFood = new LiquidFood();
        System.out.println(liquidFood);
        liquidFood.setDescription("Water");
        liquidFood.setCalories(0);
        liquidFood.setViscosity(0.1);
        System.out.println(liquidFood);
        LiquidFood liquidFood2 = new LiquidFood("Milk", 100, 0.2);
        System.out.println(liquidFood2);
        System.out.println(liquidFood.equals(liquidFood2));
        Fruit fruit = new Fruit();
        System.out.println(fruit);
        fruit.setDescription("Apple");
        fruit.setCalories(50);
        fruit.setSeason("Winter");
        System.out.println(fruit);
        Fruit fruit2 = new Fruit("Banana", 100, "Summer");
        System.out.println(fruit2);
        System.out.println(fruit.equals(fruit2));
    }
}
