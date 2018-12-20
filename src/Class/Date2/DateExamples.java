package Class.Date2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExamples {

    public static void examples() {
        Date date = new Date();
        Date date1 =
                new GregorianCalendar(
                        2018,
                        6,
                        22,
                        2,
                        20,
                        65).getTime();

        System.out.println(date);
        System.out.println(date1);
    }

    public static void main(String[] args) throws ParseException {
//        examples();
//        formatDate();
//        parseExample();

        minusDates();

    }

    public static void formatDate() {
        Date date = new Date();

        SimpleDateFormat formatDate =
                new SimpleDateFormat(
                        "E yyyy.MM.dd 'и время ' " +
                                "hh:mm:ss a zzz");

        SimpleDateFormat formatDate2 =
                new SimpleDateFormat(
                        "yyyy-MM-dd");

        System.out.println(formatDate.format(date));
        System.out.println(formatDate2.format(date));
    }

    public static void parseExample() throws ParseException {
        String date = "2018-07-22";

        SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyy-MM-dd");

        Date parsedDate = dateFormat.parse(date);

        System.out.println(parsedDate);
    }

    public static void minusDates() {
        String date1 = "01-03-2016";
        String date2 = "01-02-2016";

        SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyy-MM-dd");

        Date dateOne = null;
        Date dateTwo = null;

        try {
            dateOne = dateFormat.parse(date1);
            dateTwo = dateFormat.parse(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long difference =
                dateOne.getTime() - dateTwo.getTime();

        int days = (int) (difference/(24*60*60*1000));

        System.out.println(days);
    }


}
