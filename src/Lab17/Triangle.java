package Lab17;

public class Triangle extends GeometricObject {
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    Triangle() {

    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    public double getSide1() {
        return side1;
    }
    
    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1+side2+side3) / 2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public double getPerimeter() {
        return side1+side2+side3;
    }

    public String toString() {
        return super.toString() + " side1: " + side1 + " side2: " + side2 + " side3: " + side3 + " area: " + getArea() + " perimeter: " + getPerimeter();
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(1, 1.5, 1, "yellow", true); 
        System.out.println(t.toString());
    }
}
