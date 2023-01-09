package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
public String name;
public int age;
public char gender;
public LocalDate dateOfBirth;
public boolean isMarried, isEmployed;

    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + (LocalDate.now().getYear() - dateOfBirth.getYear())+
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public String eat(String food){
       return name + " likes to eat " + food;

    }
    public void sleeping(){
        System.out.println(name + " sleeps minimum 8 hours a day");
    }
    public String drink(String drink){
        return name+" likes to drink " + drink;
    }

}





/*name, age, gender, dateOfBirth, isMarried, isEmployed
Add a constructor that can set all the fields once an object is created

toString, format date of birth MM/dd/y
eat(String food), sleeping(), drink(String drink)

Create 5 object
*/