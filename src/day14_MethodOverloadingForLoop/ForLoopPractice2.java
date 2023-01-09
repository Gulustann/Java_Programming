package day14_MethodOverloadingForLoop;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();
        }
        System.out.println("______________________________");
int sum=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            sum += input.nextInt();
        }
        System.out.println("sum: " + sum);

        System.out.println("______________________________");

        //write a program that can ask the user enter a number for five times, print the max number
        //write a program that can ask the user enter a number for five times, print the min number

    }
}
