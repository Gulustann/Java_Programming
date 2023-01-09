package day09_SwitchAndScanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");

        String fullName = input.nextLine();
        System.out.println("Your full name is : " + fullName);

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("Enter you gender: ");
        String gender = input.next(); // Female+Enter  It only reads Female, do not read Enter

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //28+Enter Only reads 28, 2nd Enter in the memory

        //input.nextLine(); or can be added here, important thing to be entered before last NextLine method
        System.out.println("Enter your street name: ");
        input.nextLine(); // Add this nextLine to clear the memory (that previous two Enter+ 1 Enter )
        String streetName = input.nextLine(); // You need another nextLine method before this to clear memory
input.close();





    }
}
