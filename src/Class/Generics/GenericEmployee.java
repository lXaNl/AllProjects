package Class.Generics;
//T , S , U // E // K & V
public class GenericEmployee <T,U> {
    private T id;
    private T salary;
    private U name;
    private U surname;

    public GenericEmployee(T id, T salary) {
        this.id = id;
        this.salary = salary;
    }

    public GenericEmployee(T id, T salary, U name, U surname) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.surname = surname;

    }

    public void setId(T id) {
        this.id = id;
    }

    public void setSalary(T salary) {
        this.salary = salary;
    }

    public T getId() {
        return id;
    }

    public T getSalary() {
        return salary;
    }

    public static <T extends Comparable> void min(T[] arr){

    }

    @Override
    public String toString() {
        return "GenericEmployee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name=" + name +
                ", surname=" + surname +
                '}';
    }
}
