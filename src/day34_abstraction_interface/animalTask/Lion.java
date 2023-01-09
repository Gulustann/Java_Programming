package day34_abstraction_interface.animalTask;

public class Lion extends Animal implements Wild{
    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+ getName()+" is eating buffalo");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting buffalo");
    }
}
