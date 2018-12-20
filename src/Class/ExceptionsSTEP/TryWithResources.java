package Class.ExceptionsSTEP;

import java.util.Scanner;

public class TryWithResources {

    public void test() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextInt());
            }
        }
    }

    public static void main(String[] args) {
        TryWithResources resources =
                new TryWithResources();

        resources.test();
    }

}
