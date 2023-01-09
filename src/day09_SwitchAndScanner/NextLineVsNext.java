package day09_SwitchAndScanner;

import java.util.Scanner;

public class NextLineVsNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 45+Enter ==> Enter goes to scanner memory. Enter by default taken by nextLine data
                                    // so nextLine full name filled by Enter key, do not let you enter new input to nextLine.
        // Disadvantage for next line if it is used after another Scanner method.

        input.nextLine(); // That will clear out the memory by this nextLine method to fix the problem,
        // we have to enter another nextLine method before nextLine method to clear the memory

        System.out.println("Enter your full name: ");
        String full_name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("Full name = " + full_name);











    }
}
