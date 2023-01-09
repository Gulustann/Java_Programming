package day25_constructor;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {
      Person p1 = new Person("Gulustan", 35, 'F', LocalDate.of(1987, 02,18), true, false);
      Person p2= new Person("Mehmet", 25, 'M', LocalDate.of(1979,05,01), true, true );
      Person p3 = new Person("Almina", 5, 'F', LocalDate.of(2017, 12,12), false, false);
      Person p4 = new Person("Sare", 10, 'F', LocalDate.of(2015, 06,11), false, true);
      Person p5 = new Person("Mert", 25, 'M', LocalDate.of(2000, 02,25), true, true);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);





    }
}
