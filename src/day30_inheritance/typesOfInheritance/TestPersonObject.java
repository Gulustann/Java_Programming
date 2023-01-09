package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[]args) {
        Student student = new Student("Gulustan", 'F', LocalDate.of(1990, 05, 12), 'A', "A01");

        President president = new President("Danie", 'F', LocalDate.of(1987, 02, 18), LocalDate.of(2020, 04, 07));

        Teacher teacher = new Teacher("Muhtar", 'M', LocalDate.of(1985, 7, 8), "Developer", "A0123", 150000);


        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        System.out.println("________________________________________________");

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("________________________________________________");

        student.eat("Baklava");
        teacher.eat("Kebab");
        president.eat("Donut");


        student.drink("milk");
        teacher.drink("tea");
        president.drink("Coffee");


    }

}
