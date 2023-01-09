package day13_CustomMethodContinue;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
input.close();
        if (month<1 || month>12){
            System.err.println("Invalid number");
            return; //terminates main method
        }

        switch (month){
            case 2:
                System.out.println("28 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("31 days");
        }







    }
}
