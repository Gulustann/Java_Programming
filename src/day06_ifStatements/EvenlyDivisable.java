package day06_ifStatements;
/*
Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

            Evenly Divisible ==> remainder is zero
 */
public class EvenlyDivisable {
    public static void main(String[] args) {

 int number = 45;

 boolean divisiableBy2 = number % 2 == 0; // number is divisable by 2, remainder is 0
 boolean divisableBy3 = number % 3 == 0; // number is divisable by 3, remainder is 0
 boolean divisableBy5 = number % 5 ==0; //number is divisable by 5, remainder is 0

        System.out.println(number + " is divisable by 2: " + divisiableBy2);
        System.out.println(number + " is divisable by 3: " + divisableBy3);
        System.out.println(number + " is divisable by 5: " + divisableBy5);










    }
}
