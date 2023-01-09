package day36_polymorphisim;

import day29_OOP_Inheritance.animalTask.Animal;
import day29_OOP_Inheritance.animalTask.Cat;
import day29_OOP_Inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphisim.transportationTask.AutoPilot;
import day35_polymorphisim.transportationTask.Electric;
import day35_polymorphisim.transportationTask.Tesla;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        //Dog dog = new Dog(); error

        //Cat cat = new Dog(); error

        Animal animal = (Animal) new Dog(); //upcasting implicitly,  polymorphism, dog referencing parent (Animal)-
        //upcasting done implicitly no need to type (Animal)

        System.out.println("_______________________________________");

        Animal animal1 = new Dog();
        animal1.setInfo("Max", "Husky", 'M', 4,"Large", "White");


        animal1.eat();
        animal1.drink();
        animal1.sleep();

        ((Dog) animal1).bark(); //down casting-one time use only

        Dog dog1 = (Dog) animal1; //down casting
        dog1.bark();
        System.out.println("_______________________________________");

       // animal1.scracth(); //error animal1 does not have scracth() method, downcast

        //((Cat) animal1).scratch(); //class cast exception. Reason- animal1 is Dog object and Dog obj does not have relationship with Cat
        //Dog cannot be converted to Cat, no IS A relationship==> class cast exception
        System.out.println("_______________________________________");


        Phone phone = new Nokia("CYT", "Small", "Black", 350);
phone.call(911);
phone.text(123456);
        ((Nokia)phone).selfDefence();

        //((IPhone)phone).faceTime(123456);//no IS A relationship between Nokia and IPhone, bc phone is referencing Nokia
        //Nokia cannot be converted to IPhone
        System.out.println("_______________________________________");

        Employee employee= new Developer("Lucy", 36, 'F', "A123", "SDET", 150000, "Java");

        employee.work();

        System.out.println(((Developer)employee).getProgrammingLanguage());

        //Tester tester = (Tester)employee;//super type cannot be directly assigned to sub type
        //NOT working bc employee already referencing develeoper and no IS A relationship between Developer and Tester
        //So cannot be converted to each other
        System.out.println("_______________________________________");

        Electric electric = new Tesla("Tesla", "Model S", "White", 2020, 65000);
        //upcasting - implicitly

        electric.charge();

        ((Tesla)electric).selfDrive();

        ((AutoPilot)electric).selfDrive();//IS A relationship between AutoPilot and Tesla

        System.out.println("_______________________________________");

        Employee employee1 = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Employee employee4 = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();




    }


}
