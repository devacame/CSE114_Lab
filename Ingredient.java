// 116598178 Henry Ahn HW 6
public class Ingredient {
    private String name, measuringUnit;
    private int caloriesPerUnit;

    public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
        this.name = name;
        this.measuringUnit = measuringUnit;
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public String getName() {
        return name;
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public int getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeasuringUnit(String measuringUnit) {
        this.measuringUnit = measuringUnit;
    }

    public void setCaloriesPerUnit(int caloriesPerUnit) {
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public boolean equals(Object o) {
        if (o instanceof Ingredient) {
            Ingredient ingredient = (Ingredient) o;
            return name.equals(ingredient.getName()) && measuringUnit.equals(ingredient.getMeasuringUnit())
                    && caloriesPerUnit == ingredient.getCaloriesPerUnit();
        }
        return false;
    }

    public String toString() {
        return "Ingredient\n" + "name=" + name + "\nmeasuringUnit=" + measuringUnit + "\ncaloriesPerUnit="
                + caloriesPerUnit;
    }
}
