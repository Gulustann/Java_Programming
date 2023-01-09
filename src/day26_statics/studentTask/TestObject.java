package day26_statics.studentTask;

import java.util.ArrayList;

public class TestObject {
    public static void main(String[] args) {
        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        Student[] students = {student1, student2, student3, student4, student5};

        StudentGroup group1 = new StudentGroup("Java", 1);
        group1.addStudent(students);

        group1.addStudent("Khashayar", 34, 'M', "F35");

        System.out.println(group1); //StudentGroup{groupName='Java', groupId=1, number of students=6}

        group1.removeStudent("D43");
        System.out.println(group1); //StudentGroup{groupName='Java', groupId=1, number of students=5}

        group1.removeStudent("E27");
        System.out.println(group1); //StudentGroup{groupName='Java', groupId=1, number of students=4}

        for (Student each : group1.students) {
            System.out.println(each.name + " : " + each.id);
            /*
            Yusuf : A16
            Glenio : B34
            Sumeyye : C56
            Khashayar : F35   */
            System.out.println("_________________________________________________________");

            StudentGroup group2 = new StudentGroup("Tahmisoglu", 2);
            Student tahmis1 = new Student("Sare", 7, 'F', "A3");
            Student tahmis2 = new Student("Almina", 5, 'F', "A4");
            Student tahmis3 = new Student("Gulustan", 35, 'F', "A2");
            Student tahmis4 = new Student("Mehmet", 43, 'M', "A1");

            Student[] tahmisoglu = {tahmis1, tahmis2, tahmis3, tahmis4}; //all tahmisoglus added to tahmisoglu array
            group2.addStudent(tahmisoglu); //tahmisoglu array added to group2


            StudentGroup group3 = new StudentGroup("Java Turtles", 2);
            Student coskan1 = new Student("Yaman", 5, 'M', "B3");
            Student coskan2 = new Student("Efe", 1, 'M', "B4");
            Student coskan3 = new Student("Semih", 38, 'M', "B1");
            Student coskan4 = new Student("Burcu", 35, 'F', "B2");
            Student[] coskan = { coskan1, coskan2, coskan3, coskan4};
            group3.addStudent(coskan);

            StudentGroup group4 = new StudentGroup("Java Turtles", 2);
            Student aydemir1 = new Student("Zeynep", 10, 'F', "C3");
            Student aydemir2 = new Student("Mehmet", 8, 'M', "C4");
            Student aydemir3 = new Student("Halil", 50, 'M', "C1");
            Student aydemir4 = new Student("Elif", 45, 'F', "C2");

            group4.addStudent(aydemir1);
            group4.addStudent(aydemir2);
            group4.addStudent(aydemir3);
            group4.addStudent(aydemir4);


            StudentGroup[] groups = {group1, group2, group3, group4};

            for (StudentGroup group: groups) {
                for (Student student : group.students) {
                    System.out.println(student.name+ " : " + student.id);//display each name and id

                }
            }

//Display all the students name
        }






/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list




 */
    }
}
