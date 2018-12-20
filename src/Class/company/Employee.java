package Class.company;

import java.util.Objects;

public class Employee extends Human{

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    String getDescription() {
        return "This is Employee";
    }

    public Employee() {
        System.out.println("Employee");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salary=" + salary +
                '}';
    }

}
