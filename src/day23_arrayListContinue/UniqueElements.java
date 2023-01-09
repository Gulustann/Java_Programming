package day23_arrayListContinue;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);

        for (Integer element : list) {

            int frequency = 0;
            String unique = "";

            for (Integer each : list) {
                if (each == element) {
                    frequency++;
                }

            }
            if (frequency == 1) {
                System.out.println(element); //2,4,6
                //break; //2 - if we use break; after printing first unique element (2) exits the loop
            }
        }


        //*2. Write a program that can find the average number from an arrayList of integers

    }
}
