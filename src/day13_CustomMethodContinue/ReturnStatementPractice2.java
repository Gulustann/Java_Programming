package day13_CustomMethodContinue;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

int number = new Scanner(System.in).nextInt();
if(number<1 || number>7){
    System.err.println("Invalid number: " + number);
    return;//exit the main method, not nested if
}
        System.out.println((number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wed" :(number==4)? "Thu" :(number==5)? "Fri"
                :(number==6)? "Sat" : "Sun");





    }





}