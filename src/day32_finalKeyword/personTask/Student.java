package day32_finalKeyword.personTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public final class Student extends Person{
    private char grade;
    private final String studentID;

    public Student(String name, char gender, LocalDate DOB, char grade, String studentID) {
        super(name, gender, DOB);
        setGrade(grade);
        if(studentID.startsWith("0")){
            System.err.println("Invalid student ID: "+ studentID);
            System.exit(1);
        }
        this.studentID = studentID;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        ArrayList<Character> grades = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D','F'));
        if(!grades.contains(grade)){
            System.err.println("Invalid grade: "+ grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }
}
