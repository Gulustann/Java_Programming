package day34_abstraction_interface.animalTask;

public class Duck extends Animal implements Playable, Flyable, Swimmable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+ getName()+" is eating worm");
    }

    @Override
    public void play() {
        System.out.println(getName()+" like to play hide and seek");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" can swim");
    }
}
