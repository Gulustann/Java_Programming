package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentGroup {//StudentGroup HAS A Student - HAS relationship
    public String groupName;
    public int groupId;
    public ArrayList<Student> students; //=new ArrayList<>(); or when generating constructor


    public StudentGroup(String groupName, int groupId) {//creates the StudentGroup obj by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>(); //in order to create arrayList object ArrayList has to be instantiated
        //either in here or above. Size ==0
    }

    public void addStudent(Student student) { //it takes one student obj and adds it to the arrayList of students
        students.add(student);
    }

    public void addStudent(Student[] students) { //overloaded addStudent. Takes one array of students and adds it to the ArrayList of students
        this.students.addAll(Arrays.asList(students));
    }

    public void addStudent(String name, int age, char gender, String id) {//takes name, age, gender and id info,
        // creates student obj by given info, then adds the student obj to the ArrayList of students
        // Student student = new Student(name, age, gender, id);
        students.add(new Student(name, age, gender, id));
    }

    public void removeStudent(String id) {//takes id and removes the student from arrayList of students
        students.removeIf(p -> p.id.equals(id));
    }

    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
