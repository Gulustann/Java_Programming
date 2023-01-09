package day23_arrayListContinue;

import day19_ArraysIntro.ArraysLiteral;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        //ADD ALL Method

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers); //or list1.addAll(numbers); ==> adds in orders [1, 2, 3, 10, 20, 30, 40]

        System.out.println(list1);//[1, 10, 20, 30, 40, 2, 3]

        System.out.println("_____________________________________________________________");

        ArrayList<Integer> scores = new ArrayList();

        //scores.addAll(75,85,95,80,70); //error, only one argument accepted

        scores.addAll(Arrays.asList(75, 85, 95, 80, 70));
        System.out.println(scores); //[75, 85, 95, 80, 70]

        System.out.println("_____________________________________________________________");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Gadir", "Hasan", "Abdullah", "Bilal"));
        System.out.println(names); //[Gadir, Hasan, Abdullah, Bilal]

        names.addAll(2, Arrays.asList("Sukur", "Sumeye", "Tatiana"));

        System.out.println(names);//[Gadir, Hasan, Sukur, Sumeye, Tatiana, Abdullah, Bilal]

        System.out.println("_____________________________________________________________");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>();
        //l1.addAll(nums); //This is NOT a collection type
        l1.addAll(Arrays.asList(nums));//converted to collection type
        System.out.println(l1);

        //SECOND WAY TO ASSIGN ARRAY TO ArrayList as a Collection method:
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(nums));
        System.out.println(l2);

        System.out.println("_____________________________________________________________");

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        boolean hasAlena = employeeList.contains("Alena");
        System.out.println("hasAlena = " + hasAlena);//true

        boolean hasAlenaGadir = employeeList.containsAll(Arrays.asList("Alena", "Gadir"));
        System.out.println("hasAlenaGadir = " + hasAlenaGadir); //true

        boolean hasMuhtarAliKuzzat = employeeList.containsAll(Arrays.asList("Muhtar", "Ali", "Kuzzat"));
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);//FALSE

        System.out.println("_________________________removeAll____________________________________");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20));

        list.removeAll(Arrays.asList(10, 20));
        System.out.println(list);//[30, 40, 50, 60, 70]

        System.out.println("_________________________retainAll____________________________________");
        ArrayList<String> developers = new ArrayList<>();
        developers.addAll((Arrays.asList("Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar", "Alena")));

        developers.retainAll(Arrays.asList("Alena", "Khashayar", "Muhtar"));

        System.out.println(developers);

        System.out.println("-----------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(
                Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry",
                        "Paper towels"));

        groceriesList.retainAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato"));
        System.out.println(groceriesList); //[Eggs, Potato, Milk, Tomato] removes all un-matching elements

        //groceriesList.retainAll(Arrays.asList("Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));
//This remove all equals to retain all. Meant to get done same job
    }
}
