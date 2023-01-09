package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100); //0
        numbers.add(200); //1
        numbers.add(300); //2
        numbers.add(400);//4
        numbers.add(500);//5
        numbers.add(3,255); //3
        //numbers.add(300, 2000); Index out of bond error. NOT POSSIBLE, cannot skip index numbers

        System.out.println(numbers);  //[10,200,300,255,400,500]

        System.out.println("______________get___________________________");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("_________________________________________");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
        System.out.println("_________________________________________");

        for (Integer each : numbers) { //for (int each : numbers) ==> that's ok too but extra step of unboxing
            System.out.println(each);
        }













    }
}
