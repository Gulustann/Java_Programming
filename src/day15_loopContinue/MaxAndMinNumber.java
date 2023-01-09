package day15_loopContinue;

import java.util.Scanner;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
         int max= -2147483648, //any int number user enters will always be greater than this number, -2147483648
                 min=2147483647; //any int number user enters will always be less than this number, 2147483647

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number");
            int num= input.nextInt();

            if(num>max){
                max=num;
                }
            if(num<min){
                min=num;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

input.close();


    }
}
