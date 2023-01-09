package day37_exceptions;

import java.io.IOException;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program started");//printed
        try {
            System.out.println(9 / 0);//ArithmeticException- handle it w/ try&catch block - unchecked exception
            System.out.println("Try block");
        }catch (ArithmeticException e){//there should be IS A relationship between catch exception type and real exception
            System.out.println("Catch Block");
        }
        System.out.println("Program ending");//not printed due to previous exception


        System.out.println("_____________________________________________________");

        System.out.println("Program2 started");

        String str=null;

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try Block");
        }catch (RuntimeException e){//RuntimeException is Parent of all unchecked exception
            System.out.println("Catch Block");
        }
        System.out.println("Program2 ended");


        System.out.println("_____________________________________________________");

        System.out.println("Program3 started");
        try {
            Thread.sleep(3000);//checked exception - compile tells us  what exception it is: InterruptedException
            System.out.println("Try block");//try block handles that exception
        }catch (InterruptedException e){
            System.out.println("Catch Block");
        }
        System.out.println("Program3 ended");

    }
}
