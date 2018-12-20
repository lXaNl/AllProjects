package Class.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        testConstructor();



//        testTypes();

//        testPoly();

//        Manager manager = new Manager();
//        System.out.println(manager);

//        int [] array = new int[5];
//        for (int i :array) {
//            System.out.println(i);
//        }

//        System.out.println(Arrays.toString(array));

//        testArrays();

        test();
    }

    private static void testArrays() {
        int [] array = {1, 2, 3};
//        int [] array2 = array;

        int[] array3 = Arrays.copyOf(array, array.length);
        array3[0] = 5;
//        array2[0] = 5;
//        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array3));

    }

    private static void testConstructor() {
        Manager manager = new Manager("John Snow", 1000, 500);

        System.out.println(manager.hashCode());
        System.out.println(manager);
    }

    private static void testTypes() {

//        ---------Так можно----------
        Employee [] employees = new Employee[5];

        Manager manager = new Manager("Ilkin", 2000, 500);
        Employee employee = new Employee("Kamran", 500);

        employees[0] = manager;
        employees[1] = employee;

        for (Employee e : employees) {
//            System.out.println(e);
        }



        if (employees[1] instanceof Manager) {
            Manager boss = (Manager) employees[1];
            System.out.println("OK: " + boss);
        } else {
            System.out.println("NOT OK");
        }

//        ------------------

        Object o = manager;

        Object array = employees;

//        Так нельзя делать!--------------------------------

        Manager[] managers = new Manager[2];

        Employee employee1 = new Employee();

//        managers[0] = employee;

//        ---------------------
    }

//    Полиморфизм
    private static void testPoly() {
        Employee e;

//        Можем присвоить объект своего класса
        e = new Employee("Jack", 555);
//         И объект подкласса тоже
        e = new Manager("Johny", 666, 200);

//        Так делать не надо ----------------------
        Manager [] managers = new Manager[5];

        Employee [] employees = managers;

        employees[0] = new Employee("Ken", 200);

        for (Employee e1 : employees) {
            System.out.println(e1);
        }
    }


    public static void test(int...a) {
        if (a[0] == 5) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }
    }


}
