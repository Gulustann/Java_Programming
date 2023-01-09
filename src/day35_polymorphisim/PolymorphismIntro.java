package day35_polymorphisim;

import day31_InheritanceOverRiding.shape.Circle;
import day33_abstraction.employeeTask.*;
import day34_abstraction_interface.animalTask.*;
import day35_polymorphisim.transportationTask.Car;
import day35_polymorphisim.transportationTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        Cat cat = new Cat("Max", "Huskey", 'M', 4, "Small", "White");
        Tiger tiger = null;
        Eagle eagle = null;
        Lion lion = null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;

        Animal animal = new Dog("Bonjuk", "Husky", 'M', 4, "Small", "White");
        animal.eat();
        animal.drink();
        animal.sleep();

//animal.bark();//ERROR


        //Dog[] animals= {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};
        //no relationship between cat, tiger, lion..., duck between Dog[]==> error but those objects relation with animal

        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};


        //Animal animal = new Tesla("Tesla", "Model Y", "Blue", 2022, 60000); //==> error- no 'is a' relationship
        System.out.println("_________________________________________________________________");

        String str = "Java";
        Integer n=100;
        Boolean r= false;

        Double d = 10.5;

        Circle circle = new Circle(5);

        Car tesla = new Tesla("Tesla", "Model Y", "Blue", 2022, 65000);

        Teacher teacher = new Teacher("James", 45, 'M', "A23", "Teacher", 75000);

        Developer developer = new Developer("Lucy", 30, 'F', "D1", "Developer", 150000, "Java");

        Driver driver = new Driver("Ismail", 65, 'M', "A123", "Driver", 500000);

        Tester tester = new Tester("Gulustan", 35, 'F', "A147", "SDET", 250000);


        Object[] objects={str, n, r, d, circle, tesla, teacher, developer, driver, tester };

        System.out.println(Arrays.toString(objects));

        Employee[] employees= {teacher, developer, driver,tester};



        Employee obj = new Teacher("James", 45, 'M', "A23", "Teacher", 75000);
       obj.work();//work method in Employee class
        //Lucy is teaching

        Employee obj1 = new Driver("Lucy", 30, 'F', "D1", "Driver", 75000);
        obj1.work();//Lucy is driving me crazy:)

        Tesla car1 = new Tesla("Tesla", "Model Y", "Blue", 2022, 60000);
        car1.start();
        car1.autoPark();




    }
}
