package day16_loopContinue;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "Cydeo",
                correctPassword = "Cydeo123";

        System.out.println("Enter you username");
        String username = sc.next();

        System.out.println("Enter you password");
        String password = sc.next();


        if (username.equals(correctUsername) && password.equals(correctPassword)) {//if credentials are correct
            System.out.println("logged in");
        } else { //otherwise
            for (int i = 0; i < 3; i++) { //i== 0,1,2
                if(i!=2){
                    System.err.println("Invalid username and password. Please re-enter");
                }else{
                    System.err.println("This is your last chance now. Please enter correct username and password");
                }

                System.out.println("Enter your username");
                username = sc.next();

                System.out.println("Enter you password");
                password = sc.next();

                if (username.equals(correctUsername) && password.equals(correctPassword)) {//if user enters valid credentials
                    System.out.println("You are now logged in");
                    break; //exits the loop
                }
            }
                if(!(username.equals(correctUsername) && password.equals(correctPassword))){//after all 3 attempts if the username and password still incorrect
                    System.err.println("Your account is locked. Please connect support team.");

        }
    }


sc.close();









        /*
        1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."

         */
}

public static void cydeoLogIn(String username, String password){
    if(username.equals("Cydeo") && password.equals("Cydeo123"))    {
        System.out.println("Logged in");
    }else{
        System.out.println("Invalid credentials");

    }




}
}
