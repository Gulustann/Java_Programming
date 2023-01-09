package day09_SwitchAndScanner;

import java.util.Scanner;

public class EligibleOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age: ");

        int age = input.nextInt();

        String result = (age>=21)? "Eligible" : "Not eligible";

        System.out.println(result);

input.close();


        /*
        2.1 Ask the user to enter his/her age
            2.2 write a program that can check if the person eligible to buy alcohol
         */
    }
}
