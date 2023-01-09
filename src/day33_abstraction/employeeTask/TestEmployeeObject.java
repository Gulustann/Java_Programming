package day33_abstraction.employeeTask;

public class TestEmployeeObject {
    public static void main(String[] args) {
        //Employee employee = new Employee("Daniel", 54, 'M', "A1", "SDET", 95000);
//Error creating Employee object bc it is an abstract class. Object MUST be created from a concrete class

        Teacher teacher = new Teacher("James", 45, 'M', "A23", "Teacher", 75000);

        Developer developer = new Developer("Lucy", 30, 'F', "D1", "Developer", 150000, "Java");

        Driver driver = new Driver("Ismail", 65, 'M', "A123", "Driver", 500000);

        Tester tester = new Tester("Gulustan", 35, 'F', "A147", "SDET", 250000);


        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(driver);

        System.out.println("__________________________________________________________________________");

        teacher.work();
        developer.work();
        tester.work();
        driver.work();




    }
}
