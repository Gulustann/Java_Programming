package day09_SwitchAndScanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");

        //char ch =input.next().charAt(0);
      //  System.out.println("You have entered : " + ch);

        System.out.println("Would you like to continue?");

       // String answer = input.next(); //print just one word - until space
        String answer = input.nextLine(); //reads first line



        System.out.println("You have entered: " + answer);

input.close();







    }
}
