package day28_OOP_Encapsulation.encapsulation;

public class Test {
    public static void main(String[] args) {
    Student student = new Student();
  //  student.age = -200;// no access if instance variable is private

        //System.out.println(student.age); no direct access since it is private data
        //System.out.println(student.getAge()); //now accessible through getters method (reads data)

        //student.setAge(-200);
       student.setAge(25);
        System.out.println(student.getAge());

        System.out.println("Test Completed");//when age<1, programme terminated and this is not executed

        //student.name = "Aeron"; //not public, no access
        student.setName("Aeron");
        System.out.println(student.getName());//Aeron

    }
}
