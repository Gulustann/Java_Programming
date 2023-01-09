package day23_arrayListContinue;

import java.util.ArrayList;

public class UniqueElements2 {
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

        for (String each : names) {
            if(names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each); //Ali
                                        //Shukir
                //break;   //Ali only
            }
        }







    }
}
