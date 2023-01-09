package day06_ifStatements;
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)


 */
public class OddOrEven {
    public static void main(String[] args) {

int number = 20;

boolean even = number % 2 == 0; //if number is diveded by 2, if remainder is 0 means that the number is even number

boolean odd = !even; //or = number % 2 != 0 //remainder is not equal to zero
        //     not even number

        System.out.println(number + " is an even number: " + even);
        System.out.println(number + " is an odd number: " + odd);












    }
}
