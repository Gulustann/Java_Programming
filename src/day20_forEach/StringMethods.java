package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str= "Cydeo School";

       char[] array= str.replace(" ", "").toCharArray(); //replace :to get rid of spaces
        System.out.println(Arrays.toString(array));
        System.out.println("____________________________________________");

        String str2="Today is a great day to learn Java"; //8 words, 7 spaces
String[] words = str2.split(" ");
        System.out.println(Arrays.toString(words)); // splited by space

        String[] words1 = str2.split("great");
        System.out.println(Arrays.toString(words1)); // splited by great
        System.out.println("____________________________________________");

        String sentence ="I love Java"; //reverse sentence as: Java love, I

String[] arr = ArraysUtility.reversedArray(sentence.split(" "));
//contains each word of giving string [I, love, Java  ], then reversed by calling reverse method from utilities

        System.out.println(Arrays.toString(arr));

String reversedSentence = ""; //"Java love I"

        for (int i = 0; i < arr.length; i++) {
            reversedSentence +=arr[i]+ " ";
        }
        System.out.println(reversedSentence);

    }
}
