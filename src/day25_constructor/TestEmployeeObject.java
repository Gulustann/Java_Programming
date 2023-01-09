package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObject {
    public static void main(String[] args) {
     Employee e1 = new Employee("Gulustan", 35, 'F', "Software Developer", 150000, LocalDate.of(2022,12,2));
Employee e2 = new Employee("Muhammed", 31, 'M', "Project Manager", 120000, LocalDate.of(2021,02,18));

        System.out.println(e1);
        System.out.println(e2);




    }
}
