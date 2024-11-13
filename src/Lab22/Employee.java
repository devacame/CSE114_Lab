package Lab22;

public class Employee {

    private int age, years, salary, id;

    public Employee(int age, int years, int salary, int id) {

        this.age = age;

        this.years = years;

        this.salary = salary;

        this.id = id;

    }

    public int getAge() {

        return age;

    }

    public int getYearsOnJob() {

        return years;

    }

    public double getSalary() {

        return salary;

    }

    public int getID() {

        return id;

    }

    public String toString() {

        return "Age: " + age + " | Years: " + years + " | Salary: " + salary + " | ID: " + id;

    }

}
