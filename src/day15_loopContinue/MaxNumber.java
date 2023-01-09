package day15_loopContinue;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num;
        int max = -2147483648;


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            num=input.nextInt();

            if(num>max){
                max=num;
            }
        }

        System.out.println("max = " + max);

        /*
        1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number
         */
    }
}
