package day38_exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

       /* System.out.println("Program1 started");

        //System.out.println(100/0); unchecked exception==> do not use throws keyword
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("program1 ended");

        System.out.println("______________________________________________________");

        System.out.println("Program2 started");

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("program1 ended");*/
        System.out.println("Program1 started");

        Thread.sleep(5000);

        System.out.println("Program1 ended");

        System.out.println("_________________________________");

        System.out.println("Program2 started");

        Thread.sleep(5000);

        System.out.println("Program2 ended");

        System.out.println("_________________________________");

        System.out.println("Program3 started");

        //FileInputStream file = new FileInputStream("");
        Thread.sleep(3000);

        System.out.println("Program3 ended");


    }

}
