package Home.Interface;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        //Интерфейсы 3(продолжение к предыдущему заданию)
        //	1. У учителя добавить поле стажа типа int.
        //	2. В методе main отсортировать массив с учителями(из предыдущего задания) с помощью передачи в метод
        //      Arrays.sort анонимного внутреннего класса, чтобы сортировка происходи по стажу.

        /**
         * На счет ритерн я знаю ) , просто так привычно было .
         * остальное вроде я исправил . наследование тоже для себя тестил забыл убрать с одного класса ))
         * остальное надеюсь все правильно . Если опять что то не так скажи плз
         */


        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher("john12",42,2000,12);
        teachers[1] = new Teacher("john4",34,500,4);
        teachers[2] = new Teacher("john20",55,5200,20);

        Arrays.sort(teachers, new Teacher().new NestedTeacher() {
            @Override
            public int compare(Object human1, Object human2) {
                return super.compare(human1, human2);
            }
        });
        System.out.println(Arrays.toString(teachers));


    }
}