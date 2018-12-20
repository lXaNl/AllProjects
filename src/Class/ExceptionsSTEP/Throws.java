package Class.ExceptionsSTEP;

import java.io.File;

public class Throws {

    public static void connectFile(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
//        connectFile(file);
        try {
            connectFile(file);
        } catch (IllegalArgumentException e) {
            System.out.println("Обработка и " +
                    "сключения " + e);

            e.printStackTrace();
        }

        System.out.println("AAA");
    }

}
