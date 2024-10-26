package Lab15;

public class Rectangle {
    private double width = 1, height = 1;
    private String color = "white";

    Rectangle() {

    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setColor(String c) {
        color = c;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle();
        r2.setWidth(3.5);
        r2.setHeight(35.9);
        r1.setColor("red");
        r2.setColor("red");
        System.out.printf("R1 width %f height %f color %s with area %f and perimeter %f\n", r1.getWidth(),
                r1.getHeight(), r1.getColor(), r1.getArea(), r1.getPerimeter());
        System.out.printf("R2 width %f height %f color %s with area %f and perimeter %f\n", r2.getWidth(),
                r2.getHeight(), r2.getColor(), r2.getArea(), r2.getPerimeter());
    }
}