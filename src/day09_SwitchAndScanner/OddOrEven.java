package day09_SwitchAndScanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = input.nextByte();

        String result = (number%2==0)? "Even" : "Odd";

        System.out.println(result);

input.close();
/*
 1. Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even

 */
        /*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)


 */

    }
}
