package Lab23;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }

    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public static void main(String[] args) {
        GeometricObject[] squares = new GeometricObject[5];
        squares[0] = new Square(1);
        squares[1] = new Square(2);
        squares[2] = new Square(3);
        squares[3] = new Square(4);
        for (GeometricObject square : squares) {
            if (square instanceof Colorable) {
                ((Colorable) square).howToColor();
            }
        }
    }
}
