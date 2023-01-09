package day29_OOP_Inheritance.animalTask;

public class Dog extends Animal { //"extends Animal" added manually after Dog, IS A relationship:Dog is An Animal
//        Child         Parent

    /*public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();
        eat();
        drink();
        sleep();
        toString();
    }*/
    public void bark() {
        System.out.println(getName() + " is barking");
    }

}
/*
1. Dog
			attributes:


			methods:
					 bark()

 */