package Class.ExceptionsSTEP;

import java.util.Scanner;

public class OwnExceptionClass {

    public static void main(String[] args)
    throws OwnException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0) {
            throw new OwnException("IT IS OUR EXCEPTION");
        }

    }

}
