package day17_customClassIntro;

public class Dog { //dog class - has 5 objects/variables: name, breed, size, age and color.
    public String name; //instance variable name
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;



    public void setInfo(String name, String breed, String size, char gender, int age, String color){
        //This method helps us to set all the information of the dog at once
        this.name= name; //this. keyword used to call instance variable name, becasue both instance variable name and
        //local variable name is same (name)
        this.breed = breed; //method arguments connected to dog instance class variables/objects
        this.gender=gender;
        this.age=age;
        this.size=size;
        this.color=color;
    }

    public void eat(){
        System.out.println(name + " is eating dog food");
    }

    public void drink() {
        System.out.println(name + " is drinking water");
    }

    public String toString() { //TO AVOID TO GETTING A HASH-CODE when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';



    }
}


