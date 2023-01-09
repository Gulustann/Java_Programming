package day28_OOP_Encapsulation;

public class TestPersonObject {
    public static void main(String[] args) {
 Person person1 = new Person("Muhammed");
 Person person2 = new Person("Abdullah", 'M');
 Person person3 = new Person("Hasan", 30);
 Person person4 = new Person("Daniel", "English");
 Person person5 = new Person("Tatiana", 25, 'F');
 Person person6 = new Person("Lucy", 31, 'F', "English");

 person4.name = "James";
 //person1.planet = "Mars";
        Person.planet = "Mars"; //call static variable by class name, not by object

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

Person.printPlanetName();

person1.eat("baklava");

person2.drink("water");

person5.drink("tea");
person6.drink("coffee");



    }
}
