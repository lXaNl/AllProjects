package Class.company;

public class MainTestForComparableInInheritance {

    public static void main(String[] args) {
        Manager ali = new Manager("Ali",
                5000, 1500);

        Manager nigar = new Manager("Nigar",
                4900, 1600);

        Employee john = new Employee("John", 1500);

//        if (ali.compareTo(nigar) < 0) {
//            System.out.println("У Нигяр бонус больше чем у Али");
//        } else if (ali.compareTo(nigar) > 0) {
//            System.out.println("У Нигяр бонус меньше чем у Али");
//        }

        System.out.println(ali.compareTo(nigar));
        System.out.println(ali.compareTo(john));
    }

}
