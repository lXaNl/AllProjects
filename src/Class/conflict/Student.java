package Class.conflict;

public class Student extends Human implements Person, Named {

    @Override
    public String getName() {
        return Person.super.getName();
    }

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.getName());
    }

}
