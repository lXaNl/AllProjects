package Home.Exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Не знаю правильно ли я понял задание но в любом случае сделал главное ))
         */

        MyError myError = new MyError();
        int a, b, c;
        System.out.println("Enter 1st num ");
        a = sc.nextInt();
        System.out.println("Enter 2nd num ");
        b = sc.nextInt();
        System.out.println("Enter Array length ");
        c = sc.nextInt();
        myError.divide(a, b, new int[c]);

    }
}
