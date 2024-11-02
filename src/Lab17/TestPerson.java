package Lab17;

import java.util.Date;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("John Smith", "Stony Brook", "0000000000", "jsmith@example.com", 20);
        Student s = new Student("Jane Smith", "Stony Brook", "0000000001", "jasmith@example.com", 20, "freshman");
        Employee e = new Employee("Jack Brown", "Stony Brook", "000-000-0002", "jbrown@example.com", 40, 1_000_000_000,
                new Date());
        Faculty f = new Faculty("Jennifer Brown", "Stony Brook", "000-000-0003", "jebrown@example.com", 40,
                1_000_000_001, new Date(), "Mondays and Wednesdays 8:30-10am", 5);
        Staff st = new Staff("Rn Nm", "Rm Add", "000-000-0004", "rnnm@exmaple.com", 100, 1_000_000_000, new Date(),
                "History");
        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
}
