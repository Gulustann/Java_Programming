package day07_ifStatements;

public class ifStatementWithOutCurlyBraces {
    public static void main(String[] args) {
        int age = 32;

        if (age >= 21) { //This curly braces is not necessary because there is only one statement
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
        System.out.println("__________________________");

        if (age >= 21) System.out.println("Eligible"); // if...else statement w/o curly braces.
        else System.out.println("Not Eligible");
        System.out.println("___________________");

        int itemnum = 1;
        if (itemnum == 1)
            System.out.println("Eggs");
            // System.out.println("Orange");
        else if (itemnum == 2) {
            System.out.println("Milk");
            System.out.println("Onion");
        } else {
            System.out.println("Apple");
            System.out.println("Cherry");
        }
        System.out.println("__________________________________");
        int day = 2; // 1-7

        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else System.out.println("Sunday");

// if statement w/o curly braces is NOT a good practice!


    }
}