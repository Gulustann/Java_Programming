package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);

        list.add(10); //primitive int, wrapped into primitive Integer class. index: 0
        System.out.println(list);

        list.add(20); //add method adds elements one at a time. Index: 1
        list.add(30);//accepts int as Integer object (wrapper class) Index:2
        System.out.println(list);

        list.add(10); //accepts duplicates. Index: 3
        //list.add(5.5); // 5.5 is double, our ArrayList accepts Integer objects
        System.out.println(list);//[10, 20, 30, 10]

        list.add(1, 15); // 15 added to index 1 and 20 shifted right, index 3
        System.out.println(list); //[10, 15, 20, 30, 10]

        list.add(2, 25);
        System.out.println(list);//[10, 15, 25, 20, 30, 10]

        System.out.println("______________________________________________");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Muhammed");
        studentsList.add("Abdurasu");
        studentsList.add("Abdullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firstStudent = studentsList.get(0);
        System.out.println(firstStudent);

        String lastStudent= studentsList.get(studentsList.size()-1);
        System.out.println(lastStudent);












    }
}
