package day06_ifStatements;

import static java.lang.System.out;

/*
Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */
public class IdentifyNumber {
    public static void main(String[] args) {

        int number = 200;
        boolean positive = number > 0; //If the number is > 0 than the number is positive
        boolean negative = number < 0; //If the number is < 0, then it is negative
              boolean zero = number ==0; //If the number is zero = 0
        // boolean zero = !positive && !negative;    another way of writing zero expression
                      //=number is NOT positive AND NOT negative

        System.out.println(number + " is positive number: " + positive);
        System.out.println(number + " is negative number: " + negative);
        System.out.println(number + " is zero: " + zero);









    }
}
