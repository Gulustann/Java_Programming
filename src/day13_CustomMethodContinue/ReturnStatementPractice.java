package day13_CustomMethodContinue;

import java.util.Scanner;

public class ReturnStatementPractice {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in)  ;
        char grade = input.next().charAt(0);

        boolean isValid = grade =='A' || grade =='C' || grade=='D' || grade=='F';
        if(!isValid){
            System.err.println("Invalid grade");;
            return; //terminates the main method if that if statement is used
        }
        System.out.println((grade=='A')? "Excellent" :(grade=='B')? "Great job" :(grade=='C')? "Good" :(grade=='D')?
                "Pass" : "Fail");


        }




    }

