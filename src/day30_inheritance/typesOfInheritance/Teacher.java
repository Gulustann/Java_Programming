package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee{//grandchild class person--> Employee--> Teacher


    public Teacher(String name, char gender, LocalDate DOB, String jobTitle, String employeeID, double salary) {
        super(name, gender, DOB, jobTitle, employeeID, salary);
    }

    public void teach(){
        System.out.println(getName() + " is teaching");
    }



}
