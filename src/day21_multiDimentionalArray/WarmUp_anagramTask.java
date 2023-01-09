package day21_multiDimentionalArray;

import java.util.Arrays;

public class WarmUp_anagramTask {
    public static void main(String[] args) {
        //anagram = build out of same number of letters and same letter
        String str1 = "heart";
        String str2 = "earth";

        String[] a1 = str1.split(""); //[h,e,a,r,t] OR str1.toCharArray(); gives same result
        String[] a2= str2.split(""); //[e,a,r,t,h]

 Arrays.sort(a1); // Now a1 = [a,e,h,r,t]
 Arrays.sort(a2); // [a,e,h,r,t]

        boolean isAnagram = Arrays.equals(a1, a2);

        System.out.println("isAnagram = " + isAnagram);

        
/*
2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false

 */


    }
}
