package day25_constructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WarmUpDateTimePractice {
    public static void main(String[] args) {
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/y");

        LocalDateTime starts = LocalDateTime.of(2022, 11, 24, 13, 00);
        System.out.println(starts.format(dft));

        /*
        use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020


         */
    }
}
