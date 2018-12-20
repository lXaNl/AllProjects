package Home.CollectionsHW;

public class Product {

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
