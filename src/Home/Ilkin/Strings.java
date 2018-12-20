package Home.Ilkin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Strings {
    public static void addStrings() {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        List<String> stringList = new ArrayList<>();
        stringList.add(name);
        System.out.println(stringList);
    }

    public static void main(String[] args) {
        addStrings();
    }
}
