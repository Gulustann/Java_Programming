package day11_string;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two string");
String str1 = input.nextLine();
String str2 = input.nextLine();

//int length1 = str1.length();  OR you can do it like below (shorter)
//int length2 = str2.length();

String result= "";

if (str1.length()> str2.length()){
    result = str1 + " is the longest string";
}else if(str2.length()>str1.length()){
    result = str2 + " is the longest string";
}else{
    result= "Equal";
}
        System.out.println(result);
input.close();
     /*
        1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"

         */
    }
}
