package Home.Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создать абстрактный класс Home.Inheritance.Human с полями "имя", "возраст" и абстрактным методом getDescription типа String.
        2. Унаследовать от него класс Home.Inheritance.AcademyStaff.
        3. Унаследовать от Home.Inheritance.AcademyStaff классы Home.Inheritance.Student и Home.Inheritance.Teacher. У студента добавить поле "средняя оценка" , а
            у учителя поле "зарплата".
        4. Реализовать метод getDescription в классе Home.Inheritance.AcademyStaff и переопределить его в подклассах, чтобы в
            Home.Inheritance.AcademyStaff он возвращал строку "Участник академии" а в подклассах "Учитель" и "Ученик" соответственно.
        5. В классе Home.Inheritance.AcademyStaff создать boolean метод isTeacher возвращающий false.
        6. В классе Home.Inheritance.Teacher переопределить данный метод, чтобы он возвращал true.
        7. Во всех классах переопределить метод toString и создать по два конструктора: со всеми параметрами и без параметров.
        8. Создать класс Home.Inheritance.Main и в его методе main сделать следующее:
          8.1. Ввести с клавиатуры число n
          8.2. Создать массив объектов Home.Inheritance.AcademyStaff размером n
          8.3. Заполнить весь массив отъектами Home.Inheritance.Teacher и Home.Inheritance.Student, так чтобы учеников было в 10 раз больше
                учителей(1.объекты можно не заполнять данными; 2.ничего страшного если n не будет делиться нацело)
          8.4. Посчитать количество учителей в массиве и вывести на экран(как минимум одним способом)
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : (Minimal 11) ");
        int n = sc.nextInt();
        AcademyStaff[] arrStaff = new AcademyStaff[n];
        int tCount = n / 11;
        int sCount = 10 * n / 11;
        int tmp = 0;

        for (int i = 0; i < tCount; i++) {
            arrStaff[tmp] = new Teacher();
            tmp++;
            for (int j = 0; j < (sCount / tCount); j++) {
                arrStaff[tmp] = new Student();
                tmp++;
            }
        }

//        /** Чтобы полностью заполнить массив  */
//        for (int i = 0; i < n; i++) {
//            if (arrStaff[i]==null){
//                arrStaff[i] = new Home.Inheritance.AcademyStaff();
//            }
//        }

        tmp = 0;
        for (AcademyStaff a : arrStaff ) {
            if (a != null) System.out.println(a.toString() + "/" + (++tmp));
        }

        System.out.println();

        tmp = 0;
        for (AcademyStaff a :
                arrStaff) {
            if (a != null) {
                if (a.isTeacher()) System.out.println(a + " / " + (++tmp));
            }
        }


    }
}