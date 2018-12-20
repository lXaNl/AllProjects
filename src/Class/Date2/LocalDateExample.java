package Class.Date2;

import java.time.*;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class LocalDateExample {

    public static void examples() {
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(localTime);
    }

    public static void main(String[] args) {
//        formatExample();
//        parseExample();
//        minusPeriod();
//        minus();
        snippets();


    }

    public static void formatExample() {
        LocalDate date = LocalDate.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(date);
        System.out.println(formatter.format(date));
    }

    public static void parseExample() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String date = "22-07-2018";

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);
    }

    public static void parseDefault() {
        String date = "2018-05-12";

        LocalDate localDate = LocalDate.parse(date);

        System.out.println(localDate);
    }

    public static void minusPeriod() {
        LocalDate date1 =
                LocalDate.of(2018, 7, 22);

        LocalDate date2 = date1.minus(Period.ofDays(100));


        System.out.println(date2);
    }

    public static void minus() {
        LocalDate localDate =
                LocalDate.of(2018, 7, 22);
        LocalDate weekLater =
                LocalDate.of(2018, 5, 21);
        Period period =
                Period.between (weekLater, localDate);
        Integer daysElapsed = period.getDays();
        Integer months = period.getMonths();
//        IsoChronology chronology = period.getChronology();

        System.out.println(daysElapsed);
        System.out.println(months);
//        System.out.println(chronology);
    }

    public static void toLocalDate() {
        Date date = new Date();
        LocalDate localDate =
                date.toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();
    }

    public static void snippets() {
        LocalDate lastDayOfCurrentMonth =
                LocalDate.now()
                        .with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(lastDayOfCurrentMonth);
        System.out.println(lastDayOfCurrentMonth.getDayOfWeek());


    }

}
