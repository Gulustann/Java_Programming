package day33_abstraction.employeeTask;

public class Teacher extends Employee{//compile error bc parent class has abstract method and child class have to complete that method


    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }


    public void work() {//this is a must now since this method is a abstarct method in parent class
        System.out.println(getName()+" is teaching");
    }
}
