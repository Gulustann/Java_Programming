package day28_OOP_Encapsulation.encapsulation;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {
    Person p1 = new Person("Mehmet", 35, 'M', LocalDate.of(1987, 02,18)) ;

        System.out.println(p1);



    }
}
