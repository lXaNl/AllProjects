package Class.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.SimpleFormatter;

public class DateExamples {

    public static int  summ(int a,int b){
        return a + b;
    }

    public static void main(String[] args) {

        Date date = new Date();// real date

        System.out.println(date);

        Date date1 = new GregorianCalendar(2018,
                7,
                21,
                7,
                21,
                13).getTime();

        System.out.println(date1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E yyyy.MM.dd 'and time' hh:mm:ss a zzz ");

        System.out.println(simpleDateFormat.format(date1));

        String dateStr = "2018-07-11";

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date parsedate = simpleDateFormat1.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2018,7,21);

        LocalDate localDate2;
        Period period;

        System.out.println(localDate);


    }
}
