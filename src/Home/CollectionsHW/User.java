package Home.CollectionsHW;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class User {
    private String login;
    private Integer pass;
    private Integer id;
    private static Integer nextId;

    static {
        //static initial case - zapuskaetsa pri sozdanii pervoqo elzemplara klassa
        nextId = 1;
    }

    {
        // initial case - zapuskaetsa pri kajdoy sozdanii ekzemplara klassa
        id = nextId;
        nextId++;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public Integer getPass() {
        return pass;
    }

    public static void scAdd() {
        List<String> strings = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        strings.add(sc.next());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public User(String login, Integer pass) {
        this.login = login;
        this.pass = pass;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass=" + pass +
                '}';
    }
}
