package Lab22;

import java.util.Arrays;
import java.util.List;

public class Company {

    private Employee[] empList;

    private int retireAge; // minimum age to retire

    private int retireYears; // minimum years on job to retire

    private double retireSalary; // minimum salary to retire

    private double salaryBudget; // total salary of all employees

    public Company(int retireAge, int retireYears, double retireSalary, double salaryBudget) {

        this.retireAge = retireAge;

        this.retireYears = retireYears;

        this.retireSalary = retireSalary;

        this.salaryBudget = salaryBudget;

    }

    public Employee[] getEmpList() {

        return empList;

    }

    public void setEmpList(Employee[] empList) {

        this.empList = empList;

    }

    public double getSalaryBudget() {

        return salaryBudget;

    }

    public void processRetirements() {
        List<Employee> empListTmp = Arrays.asList(empList);
        for (Employee emp : empList) {
            if (employeeIsEligible(emp)) {
                empListTmp.remove(emp);
            }
        }
        empListTmp.sort((emp1, emp2) -> emp1.getID() - emp2.getID());
        this.empList = empListTmp.toArray(new Employee[0]);
    }

    private boolean employeeIsEligible(Employee emp) {
        return emp.getAge() >= retireAge && emp.getYearsOnJob() >= retireYears && emp.getSalary() >= retireSalary;
    }
}
