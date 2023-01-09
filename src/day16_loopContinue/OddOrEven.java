package day16_loopContinue;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
while (true) {

    System.out.println("Enter a number");
    int num = sc.nextInt();

    if (num % 2 == 0) {
        System.out.println("Even number " + num);
    } else {
        System.out.println("Odd number " + num);
    }

    System.out.println("would you like to add another number");
    String answer = sc.next().toLowerCase();

    while(!(answer.equals("yes") || answer.equals("no"))){ //while user provides invalid answer
        System.err.println("Invalid entry. Would you like to enter a number");
        answer=sc.next();
    }

    if (answer.equals("no")) {
        break;
    }
}


















    }
}
