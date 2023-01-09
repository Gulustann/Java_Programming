package day26_statics;

import java.util.Arrays;

public class TestEmployeeObject {
    public static void main(String[] args) {
        Employee e1 = new Employee("Gulustan", "SDET", 125000 );
        Employee e2 = new Employee("Mehmet", "Developer", 15000);
        Employee e3 = new Employee("Sare", "DEVOPS", 255000);

        Employee[] group1 = {e1, e2, e3};
        System.out.println(Arrays.toString(group1));








    }
}
