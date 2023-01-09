package day29_OOP_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
      Dog dog = new Dog();
      Cat cat = new Cat();
      Tiger tiger = new Tiger();

  dog.setInfo("Max", "Husky", 'M', 4, "Large", "White");
  cat.setInfo("Felicia", "stray", 'F', 3, "Medium", "Black");
  tiger.setInfo("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");



        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("_______________________________________________________");

        dog.eat();//Methods come from dog class, inherited from Animal class but Dog class contains these methods now
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        System.out.println("_______________________________________________________");

        dog.bark();

        cat.meow();
        cat.scratch();

        tiger.hunt();
        System.out.println("_______________________________________________________");

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.getGender();

        dog.setGender('F');
        dog.setAge(8);




    }
}
