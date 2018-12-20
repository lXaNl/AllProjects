package Home.Exceptions;

public class MyError {
    //1. Создать воид метод принимающий в параметры два числа и массив чисел.
    //2. В методе разделить первое число на второе.
    //3. После этого присвоить 10 элементу массива результат деления.
    //4. В случае ошибки деления(если второе число ноль) обрабатывать ArithmeticException и
    //      выводить на экран стэктрейс и сообщение о том, что на ноль делить нельзя.
    //5. В случает ошибки записи в массив(если 10 элемента нет) обрабатывать ArrayIndexOutOfBoundsException
    //      и выводить на экран стэктрейс и сообщение о выходе за границы массива.
    //6. В main вызвать наш метод и передать в него все аргументы(Ввести с клавиатуры числа и размер массива).

    public void divide(int a, int b, int[] c) {


        int result = 0;
        try {
            result = a / b;
            c[9] = result;
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e);
        }

        System.out.println("SUCCSESS");

    }

}
