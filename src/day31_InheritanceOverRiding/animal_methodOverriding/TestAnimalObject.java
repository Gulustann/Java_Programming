package day31_InheritanceOverRiding.animal_methodOverriding;

public class TestAnimalObject {
    public static void main(String[] args) {
        Cat cat= new Cat("Emily", "Bengle", 'F', 4, "Small", "Gray");
        Dog dog = new Dog("Max", "Husky", 'M', 3, "Large", "White");
        Lion lion = new Lion("Simba", "African Lion", 'M', 6, "Large", "Yellow", true);
        Eagle eagle = new Eagle("Bella", "American Eagle", 'F', 4, "Medium", "Black & White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("____________________________________________________________");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("____________________________________________________________");

        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();

        System.out.println("____________________________________________________________");


    }
}
