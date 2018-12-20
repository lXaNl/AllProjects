package Class.ExceptionsSTEP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyTest2 {

    public static void test() {
        Scanner scanner = new Scanner(System.in);
        int n;
        try {
            try {
                n = scanner.nextInt();
                System.out.println(n);
            } catch (InputMismatchException e) {
                System.out.println("Формат числа " +
                        "не правильный");
            }
        } finally {
            try {
                scanner.close();
            } catch (Exception e) {

            }
        }
    }

}
