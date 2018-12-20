package Home.WebStore;

import java.time.LocalDate;
import java.util.*;

import static Home.WebStore.Main.*;

public class User {
    private String login;
    private Integer pass;
    private Integer id;
    private static Integer nextId;
    private LocalDate birthdayDate;
    private static String birthdayStr;
    private static Scanner sc = new Scanner(System.in);

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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public User(String login, Integer pass,String birthdayStr) {
        this.login = login;
        this.pass = pass;
        this.birthdayDate = LocalDate.parse(birthdayStr);
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
