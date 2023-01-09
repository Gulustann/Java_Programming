package day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {
    public static void main(String[] args) {

        System.out.println("Program started");

        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[100]);
        } catch (RuntimeException e) {
            e.printStackTrace();//displays full details of the exception after the execution of the program
        }
        System.out.println("Program ended");

        System.out.println("__________________________________________________");

        System.out.println("Program2 started");
        try {//if try block handles exception, it goes to garbage collection
            System.out.println(9 / 0);
        }catch (RuntimeException e){
            e.printStackTrace();//prints details about exception that is handled by catch block
            System.out.println(e.getMessage());//not full details, but only exception message
            //printStackTrace is better choice compare to getMessage bc it gives all details about exception
        }

        System.out.println("__________________________________________________");

        System.out.println("Program3 started");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Program3 ended");

        System.out.println("__________________________________________________");



    }
}