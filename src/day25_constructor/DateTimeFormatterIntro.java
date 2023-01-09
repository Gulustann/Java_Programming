package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df= DateTimeFormatter.ofPattern("EEEE, MM/dd/y");

        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);
        System.out.println(date1.format(df)); //2022/July/1

        //how can I get Jul-01-22 ==>  df  reformat to "MMM-dd-yy"
        System.out.println("_____________________LocalTime formatter___________________________________");

DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(17,15); //05:15 PM
        System.out.println(time1.format(tf));

        System.out.println("_____________________LocalDateTime formatter___________________________________");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE,  MMM/dd/y hh:mm a");
        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf)); //11/20/2022 08:13 PM, OR Sunday,  Nov/20/2022 08:15 PM




    }
}
