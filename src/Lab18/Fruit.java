package Lab18;

public class Fruit extends Food {
    private String season;

    Fruit() {
        super();
        this.season = "Unknown";
    }

    Fruit(String description, double calories, String season) {
        super(description, calories);
        this.season = season;
    }

    public String getSeason() {
        return this.season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String toString() {
        return super.toString() + "\nSeason: " + this.season;
    }

    public boolean equals(Fruit fruit) {
        return super.equals(fruit) && this.season.equals(fruit.season);
    }
}
