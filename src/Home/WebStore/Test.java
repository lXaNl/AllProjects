package Home.WebStore;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void minus() {
        LocalDate localDate =
                LocalDate.of(2018, 7, 22);
        LocalDate weekLater =
                LocalDate.of(2016, 5, 21);
        Period period =
                Period.between(weekLater, localDate);
        Integer daysElapsed = period.getDays();
        Integer months = period.getMonths();
        Integer years = period.getYears();
//        IsoChronology chronology = period.getChronology();

        System.out.println(daysElapsed);
        System.out.println(months);
        System.out.println(years);
//        System.out.println(chronology);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str1 = "xa";
//        Map<Integer, User> map = new HashMap<>();
//
//        Integer a = 1000;
//        Integer b = 1000;
//
//        //1
//        if (a.equals(b)) System.out.println(true);
//        else System.out.println(false);
//
//        //2
//        if (a.getClass() == b.getClass()) System.out.println(true);
//        else System.out.println(false);
//
//        //3
//        if (a == b) System.out.println(true);
//        else System.out.println(false);
//
//        System.out.println(a + " " + b);
//
//        //4
//        if (a == b) System.out.println(true);
//        else System.out.println(false);
//
//        int c = (int) a;
//        int d = (int) b;
//
//        //5
//        if (c == d) System.out.println(true);
//        else System.out.println(false);
//
//
//        System.out.println(a.equals(b));
//
//        System.out.println("Enter Password ");
//        Integer pass1 = sc.nextInt();
//        pass1=pass1.hashCode();
//        User newUser = new User(str1, pass1);
//        map.put(newUser.getId(), newUser);
//        System.out.println(map);

        int b = 0 / 5;
        System.out.println(b);
        Double a = -5d;

        a = Math.sqrt(a);

        System.out.println(Double.isNaN(a));

        System.out.println(a);

        int q = 5;
        int w = 6;
        q = q > 1? q + 1 : q-1;

        System.out.println(q);

//        minus();

    }
}
