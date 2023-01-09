package day23_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5};

       array[0]=100; //reassign to update value

        System.out.println(Arrays.toString(array)); //[100, 2, 3, 4, 5]

        System.out.println("__________________set, add, remove_____________________________________");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Egges");
        groceriesList.add("Paper towel");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList); //[Egges, Paper towel, Apples, Cooking oil]

        groceriesList.set(2, "Orange"); //used set method to update value, NOT reassign

        System.out.println(groceriesList); //[Egges, Paper towel, Orange, Cooking oil]

        groceriesList.add(2, "Chicken");
        //Difference is add method increases the size, add extra element, no replacing
        System.out.println(groceriesList);

        groceriesList.remove(0);
        System.out.println(groceriesList); //[Paper towel, Chicken, Orange, Cooking oil]

        groceriesList.remove("Paper towel");
        System.out.println(groceriesList); //[Chicken, Orange, Cooking oil]


        System.out.println("__________________.remove(Integer.valueOf())_____________________________________");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20);//1
        numbers.add(30);//2
        numbers.add(40);//3
        numbers.add(50);//4

       // numbers.remove(20);
        //System.out.println(numbers); //out of bond exception bc we don't have index 20

        boolean r1 = numbers.remove(Integer.valueOf(10)); //Autoboxing
        System.out.println(numbers);//[20, 30, 40, 50] 10 removed from list
        System.out.println(r1);

        System.out.println("_____________________size__________________________________");

        numbers.clear(); //clears all data from index 0 - last index number
        System.out.println(numbers);//[]
        System.out.println(numbers.size()); //0

        System.out.println("_________________IndexOf & lastIndexOf______________________________________");


        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeyye");
        names.add("Ali");
        names.add("Sumeyye");

        System.out.println(names.indexOf("Vasyl")); //search from first to the last, 0

        System.out.println(names.lastIndexOf("Vasyl"));//1

        System.out.println(names.lastIndexOf("Sumeyye"));//4

     System.out.println("______________________CONTAINS_________________________________");

     boolean hasMuhtar = names.contains("Muhtar"); //false

     boolean hasAli =names.contains("Ali"); //ture

     System.out.println(hasMuhtar);
     System.out.println(hasAli);

     System.out.println("_____________________EQUALS__________________________________");

     ArrayList<Integer> list1 = new ArrayList<>();
     ArrayList<Integer> list2 = list1; //1 object shared by two reference variable

     list1.add(10);

     System.out.println(list1);
     System.out.println(list2);
     System.out.println(list1 == list2); //true

     ArrayList<Integer> l1 = new ArrayList<>(); //different objects
     ArrayList<Integer> l2 = new ArrayList<>();

     l1.add(10);
     l2.add(10);

     System.out.println(l1); //[10]
     System.out.println(l2); //[10]
     System.out.println(l1 == l2); //false //different objects
     System.out.println(l1.equals(l2)); //true, same characters

     System.out.println("_____________________________________________________");

     ArrayList<Integer> n1 = new ArrayList<>();
     n1.add(10);
     n1.add(20);
     n1.add(30);

     ArrayList<Integer> n2 = new ArrayList<>();
     n2.add(30);
     n2.add(10);
     n2.add(20);

     System.out.println("_____________equals____isEmpty____________________________________");

     System.out.println("n1 = " + n1);
     System.out.println("n2 = " + n2);
     System.out.println(n1.equals(n2)); //false, bc in different order even tough elements are same
                                        // need to use sort method first to make it come true

     n1.clear();
     n2.clear();

     System.out.println(n1.isEmpty()); //true
     System.out.println(n2.isEmpty()); //true









    }
}
