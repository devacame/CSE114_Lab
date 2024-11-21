package Lab23;

public abstract class GeometricObject implements Comparable<GeometricObject>, Cloneable {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "color: " + color + ", filled: " + filled
                + ", created on " + dateCreated + "Size: " + getArea();
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) > 0 ? o1 : o2;
    }

    public static void main(String[] args) {
        GeometricObject[] gos = new GeometricObject[10];
        gos[0] = new Square(1);
        gos[1] = new Square(2);
        gos[2] = new Square(3);
        gos[3] = new Square(4);
        gos[4] = new Square(5);
        gos[5] = new Circle(1);
        gos[6] = new Circle(2);
        gos[7] = new Circle(3);
        gos[8] = new Circle(4);
        gos[9] = new Circle(5);
        GeometricObject max = gos[0];
        for (GeometricObject go : gos) {
            max = GeometricObject.max(max, go);
        }
        System.out.println(max);
    }
}
