package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Person {
    private String name;
    private final char gender;
    private final int age;
    private final LocalDate DOB;

    public static final int numberOfHeads;

    static {
        numberOfHeads = 4;
    }

    public Person(String name, char gender, LocalDate DOB) {
        setName(name);
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;

        this.DOB = DOB;

        this.age = LocalDate.now().getYear() - DOB.getYear();

    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public final void breath(){//to make sure that this implimentation does not change for any sub class
        System.out.println(name+" is breathing");
    }

  /*  public void setGender(char gender){ //ERROR - final instance variable only generate getter, not setter
    this.gender=gender;
    }*/

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", DOB=" + DOB +
                '}';
    }
}
/*
Variables: name, gender, age, DOB,
numberOfHead (static)

Methods: eat(), drink(), sleep()
breath()
 */