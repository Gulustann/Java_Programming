package day23_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {
        //CONVERTING FROM ARRAY TO ARRAYLIST
      String[] arr = {"A", "B","C","D"} ; //ARRAY
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr)); //CONVERTED TO ARRAYLIST

        System.out.println(list);//[A, B, C, D]

        System.out.println("______________________________");

        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("Java", "Python", "C#") );

        String[] languages = list2.toArray(new String[list2.size()]); //or default 0 can be given for size
        System.out.println(Arrays.toString(languages));

        System.out.println("______________________________");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));










    }
}
