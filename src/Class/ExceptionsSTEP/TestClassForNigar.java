package Class.ExceptionsSTEP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestClassForNigar {

    private static void test() {
        Scanner scanner = new Scanner(System.in);
        int n;
        try {
            n = scanner.nextInt();
            System.out.println(n);
        } catch (InputMismatchException e) {
            System.out.println("Формат числа " +
                    "не правильный");
//            test();
        } finally {
            scanner.close();
            System.out.println("Соединение закрыто");
        }
    }

    public static void main(String[] args) {
        test();
    }

}
