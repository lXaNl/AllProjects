package Home.CollectionsHW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1= "xa";
        Map<Integer,User> map = new HashMap<>();
//        System.out.println("Enter Password ");
//        Integer pass1 = sc.nextInt();
//        pass1=pass1.hashCode();
//        User newUser = new User(str1, pass1);
//        map.put(newUser.getId(), newUser);
//        System.out.println(map);

        Integer a = sc.nextInt();
        a=a.hashCode();
        User user = new User("xan",a);
        map.put(1,user);
        System.out.println(map);


    }
}
