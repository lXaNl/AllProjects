package Class.company;

public class dz {

    /**
     * 1. Создать абстрактный класс Human с полями "имя", "возраст" и абстрактным методом getDescription типа String.
     * 2. Унаследовать от него класс AcademyStaff.
     * 3. Унаследовать от AcademyStaff классы Student и Teacher. У студента добавить поле "средняя оценка" , а у учителя поле "зарплата".
     * 4. Реализовать метод getDescription в классе AcademyStaff и переопределить его в подклассах, чтобы в AcademyStaff он возвращал строку "Участник академии" а в подклассах "Учитель" и "Ученик" соответственно.
     * 5. В классе AcademyStaff создать boolean метод isTeacher возвращающий false.
     * 6. В классе Teacher переопределить данный метод, чтобы он возвращал true.
     * 7. Во всех классах переопределить метод toString и создать по два конструктора: со всеми параметрами и без параметров.
     * 8. Создать класс Main и в его методе main сделать следующее:
     *   8.1. Ввести с клавиатуры число n
     *   8.2. Создать массив объектов AcademyStaff размером n
     *   8.3. Заполнить весь массив отъектами Teacher и Student, так чтобы учеников было в 10 раз больше учителей(1.объекты можно не заполнять данными; 2.ничего страшного если n не будет делиться нацело)
     *   8.4. Посчитать количество учителей в массиве и вывести на экран(как минимум одним способом)
     */

}