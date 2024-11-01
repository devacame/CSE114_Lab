package Lab17;

public class Person {
    protected String name, address, phoneNumber, email;
    protected int age;

    Person() {

    }

    Person(String name, String address, String phoneNumber, String email, int age) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return String.format("Name: %s\nAddress: %s\nPhone Number: %s\nE-Mail: %s\nAge: %d", name, address, phoneNumber, email, age);
    }
}
