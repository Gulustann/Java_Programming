package day14_MethodOverloadingForLoop;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
       // for(int i = 5; i<=10; i--){ //infinite loop i-- never gonna make i<=10
            //System.out.println("Hello World");

       // System.out.println("Hello Cydeo");//never executed dues to above infinite loop

    for(int i = 10; i>=5; i--){ //i:10,9,8,7,6,5
        System.out.println("Hello World"); //1,2,3,4,5,6====>prints 6 Hello World
    }
        System.out.println("________________________________________");
//sum of the number between 1-100

        int sum= 0;
        for (int i=1; i<=100; i++){
            sum +=i;
        }
        System.out.println(sum);
        System.out.println("________________________________________");
//print all the alphabet letters A-Z
        for(char i='A'; i<='Z'; i++){
            System.out.print(i + " "); //println print top to bottom. "print" prints in one line
        }
        System.out.println();
        System.out.println("Hello");
        System.out.println("________________________________________");
        for(char i='Z'; i>='A'; i--){
            System.out.print(i+ " ");
        }
        System.out.println(); //to print next statement in new line after "print" statement
        System.out.println("Cydeo");
        System.out.println("________________________________________");



}
}