package day23_arrayListContinue;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeyye");
        names.add("Ali");
        names.add("Sumeyye");
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");

        ArrayList<String> nonDuplicates = new ArrayList<>();

        for (String each : names) {
            if(nonDuplicates.contains(each)){
                continue;
            }
            nonDuplicates.add(each);
        }
        System.out.println(nonDuplicates);

        names = nonDuplicates; //reassign to make it eligible for garbage collection
        System.out.println(names);




    }
}
