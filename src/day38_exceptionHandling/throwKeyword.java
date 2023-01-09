package day38_exceptionHandling;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class throwKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) {
            /*System.err.println("invalid age");
            System.exit(1);*/
            if (age < 0) {
                throw new InputMismatchException("Age of the person cannot be negative: " + age);
            } else {
                throw new InputMismatchException("age of the person cannot be  greater than 150: " + age);
            }
        }
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println("_________________________________________________________");

       // throw new RuntimeException("Runtime exception");
       // System.out.println("Hello World");

        try {
            throw new FileNotFoundException("");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("_________________________________________________________");

        RuntimeException exception = new RuntimeException();

       // throw exception;

        throw new RuntimeException();

       // n throw new Person("Jimmy", 45, 'M');//no IS A relationship w/Throwable==> ERROR




    }
}
