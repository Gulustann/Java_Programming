package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine().trim().replace(" ", "");
        //trim and replace methods make sure that white spaces and additional spaces between the characters

        System.out.println("Enter you last name");
        String lastName=input.nextLine().trim().replace(" ", "");
input.close();
        firstName= firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
                //getting first character of first name    // getting the remaining characters of first name
        lastName= lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
        System.out.println("Full name is: " + firstName + " " + lastName);

        System.out.println("______________________________________________");


        /*
         1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School

         */
    }
}
