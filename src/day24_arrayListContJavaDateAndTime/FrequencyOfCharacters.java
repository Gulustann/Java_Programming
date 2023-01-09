package day24_arrayListContJavaDateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aaabbbbccccc"; //a3b4c5

        String result = "";

        for (String each : str.split("")) {   //str converted to array by str.split("")
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
                                        //string array converted to Collection type to use Collection methods
            if (!result.contains(each)) {
                result += each + frequency;
            }
        }
        System.out.println(result); //a3b4c5


    }
}
