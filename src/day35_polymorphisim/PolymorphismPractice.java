package day35_polymorphisim;

import day34_abstraction_interface.animalTask.*;
import day35_polymorphisim.transportationTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {


    Animal tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Yellow");
    //tiger referencing tiger==> no polymorphism

        tiger.eat();
        tiger.sleep();
        tiger.drink();
      //  tiger.hunt(); does not exist in Animal class--> error, if reference typ was Tiger, then it would work


        Animal animal = new Eagle("John", "American", 'M', 3, "Small", "B;ack&White");
       // animal.fly(); //ERROR
        animal.sleep();
        animal.drink();
        animal.eat();


        Flyable obj = new Eagle("John", "American", 'M', 3, "Small", "B;ack&White");
       // obj.eat();
       // obj.drink();
       // obj.drink();
        obj.fly();
        System.out.println(obj.canFly);

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin=null;

        Shark shark=null;

        Eagle eagle=null;

        Duck duck=null;

        Dog dog=null;

        Cat cat=null;

        CydeoCar cydeoCar = null;

        //I want ot create an Array that includes only birds
        Flyable[] birds = {parrot, eagle, duck};//cannot include shark, dolphin. Only is a relationship ones can be included

        Swimmable[] fish = {shark, dolphin, duck, cydeoCar};//cannot include parrot or eagle

        Playable[] friendlyAnimals= {dog, cat, dolphin, duck};

        boolean isAnimal = dog instanceof Animal;
        System.out.println(isAnimal);

        System.out.println("______________________________________________________");

        Car car = new Tesla("Tesla", "Model Y", "Black", 2023, 75000);

        boolean isTesla= car instanceof Tesla;
        boolean isAudi = car instanceof Audi;
        boolean isElectricCar= car instanceof Electric;
        boolean isAutoPark = car instanceof AutoPark;
        boolean isAutoPilot = car instanceof AutoPilot;

        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("isAutoPark = " + isAutoPark); //true autoPilot extended to autoPark);
        System.out.println("isAutoPilot = " + isAutoPilot);


    }

}
