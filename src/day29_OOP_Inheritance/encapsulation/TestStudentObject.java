package day29_OOP_Inheritance.encapsulation;

public class TestStudentObject {
    public static void main(String[] args) {

Student student1 = new Student("Ayse", 25, 'F', 'A', "Cydeo");
        System.out.println(student1);

        student1.setSchoolName("Harvard");
        System.out.println(student1.getSchoolName());


    }
}
