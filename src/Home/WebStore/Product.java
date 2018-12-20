package Home.WebStore;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static Home.WebStore.Main.*;

public class Product {

    private static Scanner sc = new Scanner(System.in);
    private static Integer pid = 1;
    private String name;
    private int id=pid;

    public Product(String name) {
        this.name = name;
        pid++;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }







}
