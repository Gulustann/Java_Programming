package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1,5));
        System.out.println(person);
        person.breath();


        Employee employee = new Employee("Gulustan", 'F', LocalDate.of(1987, 02,18), "Developer", 500000);
        System.out.println(employee);
        employee.breath();


        System.out.println("___________________________");

        Student student = new Student("Sare", 'F', LocalDate.of(2000, 06,11), 'A', "A123");
        System.out.println(student);
        student.getAge();



    }
}
