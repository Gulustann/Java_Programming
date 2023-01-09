package day21_multiDimentionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WarmUpTask_removeExtraSpaces {
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";

        String[] words = str.split(" ");

        str = "";
        for (String each : words) {
            if (!each.isEmpty()) { //if each element not empty
                str += each + " "; //added to str string
            }
        }
        str = str.trim(); // to get rid of the very last space at the end
        System.out.println(str);






        /*
        1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
         */
    }
}
