package day42_MapsContinue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {//Character converted to array
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);//array converted to Collection type
            if (frequency == 1) {
                map.put(each.charAt(0), frequency);//converting string to char each.charAt(0)
            }
        }

        System.out.println(map);//{b=1, d=1, f=1}








/*
2. Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}

 */


    }
}
