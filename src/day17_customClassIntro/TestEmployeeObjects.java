package day17_customClassIntro;

public class TestEmployeeObjects {
    public static void main(String[] args) {
     Employee employee1 = new Employee();
     employee1.setInfo("Sumeye", 28, 'F', "Java Developer", 150000, "A12");

     Employee employee2 = new Employee();
     employee2.setInfo("Gulustan", 35, 'F', "Java SDET", 160000, "A10");

        System.out.println(employee1);
        System.out.println(employee2);

employee2.work();
    }
}
