package day24_arrayListContJavaDateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println("_________________________________________________________");

        LocalDate birthday = LocalDate.of(1987, 2, 18);
        System.out.println(birthday);

        System.out.println("_________________________________________________________");
        System.out.println(today.getYear()); //2022

        System.out.println(today.getMonth()); //NOVEMBER

        System.out.println(today.getMonthValue()); //11

        System.out.println(today.getDayOfWeek()); //TUESDAY

        System.out.println(today.getDayOfMonth()); //15

        System.out.println(today.getDayOfYear()); //319

        System.out.println("_________________________________________________");

        System.out.println(today.plusYears(2)); //2024-11-15

        System.out.println(today.plusMonths(3)); //2023-02-15

        System.out.println(today.plusWeeks(4)); //2022-12-13

        System.out.println("_________________________________________________");

        today = today.plusYears(1);  //2023-11-16 reassigned
        System.out.println(today);

        System.out.println("_________________________________________________");

        LocalDate graduationDate = LocalDate.of(2025, 6,4);

        graduationDate.plusYears(2);//2027-6-4 but not reassigned

        System.out.println(graduationDate);//2025-06-04 because not reassigned

        graduationDate = graduationDate.plusMonths(7); //adds 7 months

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate);

        System.out.println("_________________________________________________");

        LocalDate yourBirthday = LocalDate.of(2005, 4, 1);
        LocalDate brother = yourBirthday.minusYears(2).minusMonths(3);

        System.out.println(yourBirthday);
        System.out.println(brother);

        System.out.println("_________________________________________________");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1994, 7, 7);

        boolean r1 = birthday1.isEqual(birthday2);
        System.out.println(r1);

        System.out.println("_________________________________________________");

        LocalDate graduation = LocalDate.of(2023, 1,1);
        System.out.println(graduation.isBefore(LocalDate.of(2022, 12, 31)));
        System.out.println(graduation.isAfter(LocalDate.of(2022, 12, 31)));

        System.out.println("_________________________________________________");

        System.out.println(LocalDate.of(2024, 11,16).isLeapYear());











    }
}
