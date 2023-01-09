package day28_OOP_Encapsulation.encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        if(name == null){
            System.err.println("Unknown");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if(name.isBlank() || name.isEmpty() || name==null){
            System.err.println("Name cannot be blank, empty or null");
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>120){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender != 'f' && gender !='m' && gender!='F' && gender!='M'){
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Invalid date of birth: " + dateOfBirth);
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth().format(DateTimeFormatter.ofPattern("MMM dd, YYYY")) +
                '}';
    }

    /*
    Variables: name age gender dateOfBirth
    name: Wrtite: cannot be null, empty or blank
          Read: If name is not set, return "unknown"
    age: Write: age cannot be less than 0 or greater than 120

    gender: Write: gender can only be 'M' of 'F'

    dateOfBirth write: cannot be after today's date

    add constructor to set all the fields

    att toString method
        */

}
