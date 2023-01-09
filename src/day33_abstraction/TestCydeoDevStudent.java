package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudent {
    public static void main(String[] args) {
       CydeoDevStudent student = new CydeoDevStudent("Gulustan", 'F', LocalDate.of(1987, 02,18), "A123", "zero to hero", 28);

        System.out.println(student);

        student.eat();
        student.drink();
        student.sleep();
        student.breath();


    }
}
