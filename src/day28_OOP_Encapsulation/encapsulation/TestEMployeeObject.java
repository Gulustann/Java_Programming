package day28_OOP_Encapsulation.encapsulation;

public class TestEMployeeObject {
    public static void main(String[] args) {
       /*Employee employee1 = new Employee();
        // employee1.salary = -200000;
        employee1.setSalary(200000);
        System.out.println(employee1.getSalary());


       // employee1.setName("    "); //Employee name cannot be empty or blank
        System.out.println(employee1.getName());*/


        Employee employee1 = new Employee("Ayse", 30, "SDET", 120000);
        System.out.println(employee1);

    }
}
