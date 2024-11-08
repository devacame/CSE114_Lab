package Lab19;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    Triangle() throws IllegalTriangleException {
        this(1.0, 1.0, 1.0);
    }

    Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        double maxSide = Math.max(side1, Math.max(side2, side3)); 
        if (maxSide >= side1 + side2 + side3 - maxSide) {
            throw new IllegalTriangleException("Invalid sides: " + side1 + ", " + side2 + ", " + side3);
        }
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(1, 3, 1);
            System.out.println(t.getPerimeter());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
