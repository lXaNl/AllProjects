package Class.ExceptionsSTEP;

import java.util.Scanner;

public class StackTrace {

    public static int factorial(int n) {
        System.out.println("Factorial " + n);

        Throwable throwable = new Throwable();
        throwable.printStackTrace();

        int r;

        if (n <= 1) {
            r = 1;
        } else {
            r = n*factorial(n - 1);
        }

        System.out.println("Return " + r);
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        factorial(n);
    }

}
