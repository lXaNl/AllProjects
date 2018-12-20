package Home.Files;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;

        try {
            File file = new File("Text.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Hello world");
            printWriter.println("How are you");
            printWriter.close();

            bufferedReader = new BufferedReader(new FileReader("Text1.txt"));
            String line;
            while ((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
            }

        } catch (IOException exception){
            System.out.println("Error "+exception);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
