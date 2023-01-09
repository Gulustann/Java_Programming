package day24_arrayListContJavaDateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilityMethods {
    public static void main(String[] args) {
        System.out.println("_________________replaceAll__________________________________________");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));
        System.out.println(names);
        //1st WAY To replace "Java" with "Python"
       /* for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){
                names.set(i, "Python");
            }
        }
        System.out.println(names);*/

        //2nd way is easier
        Collections.replaceAll(names, "Java", "Python");
        System.out.println(names);

        System.out.println("_________________frequency__________________________________________");
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(0, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        int count = Collections.frequency(list, 50);
        System.out.println(count);


        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int countJava = Collections.frequency(words, "Java");
        System.out.println(countJava);

        //______________finding unique Elements_______________________________//
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(0, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        for (Integer each : numbers) {
            if(Collections.frequency(numbers, each) ==1){
                System.out.println(each); //unique elements 0,30
            }
        }






    }
}
