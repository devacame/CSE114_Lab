// 116598178 Henry Ahn

public class Circle2D {
    private double x, y, radius;

    Circle2D() {

    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    private static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public boolean contains(double x, double y) {
        return Circle2D.getDistance(this.x, this.y, x, y) <= this.radius;
    }

    public boolean contains(Circle2D circle) {
        return Circle2D.getDistance(this.x, this.y, circle.getX(), circle.getY()) + circle.getRadius() <= this.radius;
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println(c1.getArea() + " " + c1.getPerimeter());
        System.out.println(c1.contains(3, 3) + " " + c1.contains(new Circle2D(4, 5, 10.5)));
    }
}