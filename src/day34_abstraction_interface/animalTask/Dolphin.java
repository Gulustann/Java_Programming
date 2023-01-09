package day34_abstraction_interface.animalTask;

public class Dolphin extends Animal implements Playable, Swimmable{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin "+ getName()+" is eating fish");
    }

    @Override
    public void play() {
        System.out.println(getName()+" likes to play with human");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" can swim");
    }
}
