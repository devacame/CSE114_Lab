package Lab16;

public class Fan {
    final static int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan() {

    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int spd) {
        speed = spd;
    }

    public void setOn(boolean s) {
        on = s;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setColor(String c) {
        color = c;
    }

    public String toString() {
        return (on ? speed + " " : "") + color + " " + radius + (on ? "" : " fan is off");
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(Fan.FAST);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);
        Fan f2 = new Fan();
        f2.setSpeed(Fan.FAST);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);
        System.out.println("Fan 1: " + f1.toString());
        System.out.println("Fan 2: " + f2.toString());
    }
}

// public class FanTest {
// public static void main(String[] args) {
// Fan f1 = new Fan();
// f1.setSpeed(Fan.FAST);
// f1.setRadius(10);
// f1.setColor("yellow");
// f1.setOn(true);
// Fan f2 = new Fan();
// f2.setSpeed(Fan.FAST);
// f2.setRadius(5);
// f2.setColor("blue");
// f2.setOn(false);
// System.out.println("Fan 1: " + f1.toString());
// System.out.println("Fan 2: " + f2.toString());
// }
// }
