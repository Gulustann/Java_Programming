package day41_maps;

import day33_abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        // List<Employee> list; //can be custom class
       // List<List<Integer>> list = new ArrayList<>();//nested list OR list of list

       // List<Set<Integer>> list = new ArrayList<>();//list of Set

        //List<Queue<Integer>> list = new ArrayList<>();//list of Queue

        //List<int[]> list = new ArrayList<>();//list of Array
        //list.add(10);//ERROR, should be array type

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11));


        List<List<Integer>> lists = new ArrayList<>();
        //lists.addAll(Arrays.asList(list1, list2));
        lists.add(list1);
        lists.add(list2);

        System.out.println(lists);//[[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11]]

        //get 10

        System.out.println(lists.get(1).get(3));//10

        for (List<Integer> eachList : lists) {
            for (Integer eachElement : eachList) {
                System.out.print(eachElement+" ");//1 2 3 4 5 6 7 8 9 10 11
            }
        }
        System.out.println();

        System.out.println("_____________________________________________________________");

        //List<int[][]> l = new ArrayList<>(); //list of 2D array, can store multiple 2D array

        List<Set<Integer>> listOfSet = new ArrayList<>();
        listOfSet.add(new LinkedHashSet<>());
        listOfSet.add(new LinkedHashSet<>());
        listOfSet.add(new LinkedHashSet<>());
        listOfSet.add(new LinkedHashSet<>());

        System.out.println(listOfSet);//[[], [], [], []]
        System.out.println(listOfSet.size());//4

        //{10,5,20}

        listOfSet.get(0).addAll(Arrays.asList(10,5,20,10,5,20));//duplicates are not allowed in LinkedHashSet

        System.out.println(listOfSet);//[[10, 5, 20], [], [], []]

        listOfSet.get(1).addAll(Arrays.asList(30,15,30));
        listOfSet.get(2).addAll(Arrays.asList(300,150,40));
        listOfSet.get(3).addAll(Arrays.asList(30000,1,5));

        System.out.println(listOfSet);//[[10, 5, 20], [30, 15], [300, 150, 40], [30000, 1, 5]]

        System.out.println("_____________________________________________________________");

        int[] arr1 ={1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};

        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        System.out.println(Arrays.toString(listOfArrays.get(0)));//[1, 2, 3, 4]

        listOfArrays.get(0)[2]=35;//first array index #2 reassigned to 35 from 3

        System.out.println(Arrays.toString(listOfArrays.get(0)));//[1, 2, 35, 4]

        System.out.println("_____________________________________________________________");

        //List<List<Employee>> teams = new ArrayList<>();









    }
}
