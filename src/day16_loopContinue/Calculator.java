package day16_loopContinue;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        char operator = '+';

        String yesOrNo = "yes";


        do {
            System.out.println("Enter a number");
            num1 = sc.nextDouble();

            System.out.println("Enter a math operator");
            operator = sc.next().charAt(0);
            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("Invalid operator! Please re-enter operator");
                operator = sc.next().charAt(0);
            }

            System.out.println("Enter your second number");
            num2 = sc.nextDouble();
            if (operator == '+') {
                System.out.println(num1 + num2);
            } else if (operator == '-') {
                System.out.println(num1 - num2);
            } else if (operator == '*') {
                System.out.println(num1 * num2);
            } else {
                System.out.println(num1 / num2);
            }

            System.out.println("Would you like to continue?");
            yesOrNo = sc.next();

            if (yesOrNo.equals("no")) {
                break;
            } else {
                while (!(yesOrNo.equalsIgnoreCase("no") || yesOrNo.equalsIgnoreCase("yes"))) {
                    System.out.println("invalid entry. Would you like to continue");
                    yesOrNo = sc.next();
                }
            }

        } while (yesOrNo.equalsIgnoreCase("yes"));

        sc.close();








        /*
        -Ask user enter a number - double
        -Ask user a math operator - +,-,* and / - if invalid repeat the asking over and over until
        user enter a valid math operator
        - Ask user enter a second number
        - display the calc result
        -Ask "Would you like to continue?" Yes/No - yes: repeat no: stop, invalid: "invalid entry.
        Would you like to continue?"

         */
    }
}
