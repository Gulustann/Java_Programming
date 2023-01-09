package day42_MapsContinue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str ="bbcccaaaaa"; //LINKED HASH MAP ==> Insertion order preserved

        Map<String, Integer> map=new LinkedHashMap<>();

        for (String each : str.split("")) {//String converted to array
            int frequency= Collections.frequency(Arrays.asList(str.split("")), each);//array converted to Collection type

            //System.out.println(each+" : "+ frequency);

            map.put(each, frequency);
            //If map key was String==>converting string to char each.charAt(0)
        }

        System.out.println(map);//{b=2, c=3, a=5}








        /*
        1. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}

         */
    }
}
