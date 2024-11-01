package Lab17;

public class Student extends Person {
    private String className;

    Student(String name, String address, String phoneNumber, String email, int age, String className) {
        super(name, address, phoneNumber, email, age);
        this.className = className;
    }

    public String toString() {
        return super.toString() + "\nClass Status: " + className;
    }
}
