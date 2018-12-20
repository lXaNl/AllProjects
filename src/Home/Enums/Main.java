package Home.Enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        WeekDay [] weekDays = new WeekDay[7];
        weekDays[0] = WeekDay.SUNDAY;
        weekDays[1] = WeekDay.MONDAY;
        weekDays[2] = WeekDay.TUESDAY;
        weekDays[3] = WeekDay.WEDNESDAY;
        weekDays[4] = WeekDay.THURSDAY;
        weekDays[5] = WeekDay.FRIDAY;
        weekDays[6] = WeekDay.SATURDAY;

        System.out.println(Arrays.toString(weekDays));


    }
}
