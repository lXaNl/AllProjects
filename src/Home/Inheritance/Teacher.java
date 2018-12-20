package Home.Inheritance;

public class Teacher extends AcademyStaff {
    private double salary;

    @Override
    String getDescription() {
        return "Home.Inheritance.Teacher";
    }

    @Override
    boolean isTeacher() {
        return true;
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Home.Inheritance.Teacher{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                " salary=" + salary +
                '}';
    }

}
