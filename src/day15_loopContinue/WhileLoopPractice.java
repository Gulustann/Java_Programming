package day15_loopContinue;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age =input.nextInt();

        while(!(age>=1 && age<=150)){ //while the age is invalid, this loop needs to be repeated unknown of time
            System.out.println("Invalid entry! Please reenter your age");
            age=input.nextInt();
        }


        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

input.close();
    }
}
