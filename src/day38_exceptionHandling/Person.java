package day38_exceptionHandling;

import java.util.InputMismatchException;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if(!(gender=='F' || gender=='M')){//if gender is invalid
            throw new RuntimeException("Gender is not valid: "+ gender);//throws the runtime exception during run time to crash the programme
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age==0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>150){//if the given age is invalid
            throw new RuntimeException("");//throw run time exception and crush the program
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
