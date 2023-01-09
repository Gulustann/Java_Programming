package day34_abstraction_interface.animalTask;

public class Eagle extends Animal implements Flyable, Wild{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+ getName()+" is eating snake");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting mouse");
    }
}
