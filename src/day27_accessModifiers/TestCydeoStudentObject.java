package day27_accessModifiers;

public class TestCydeoStudentObject {
    public static void main(String[] args) {
        System.out.println(CydeoStudent.schoolName);

        CydeoStudent s1 = new CydeoStudent("Gulustan", 35, 'F');
        CydeoStudent s2 = new CydeoStudent("Mehmet", 42, 'M');

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);

        System.out.println(s1.secretCode);
        System.out.println(s2.secretCode);




    }
}
