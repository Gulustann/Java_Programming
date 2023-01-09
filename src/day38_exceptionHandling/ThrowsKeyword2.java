package day38_exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws InterruptedException {
        method1();



    }

    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5Seconds();//still have exception bc it is not permanently handled w/throws keyword
        System.out.println("Hello Cydeo");

    }

    public static void method2() throws InterruptedException, FileNotFoundException {
        System.out.println("First program started");
        Thread.sleep(3000);
        System.out.println("First program ended");
        new FileInputStream("");

        Thread.sleep(5000);
    }




}
