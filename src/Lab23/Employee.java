package Lab23;

public class Employee {
    private String name, id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + " (" + id + ")";
    }
}
