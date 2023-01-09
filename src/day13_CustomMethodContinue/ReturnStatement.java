package day13_CustomMethodContinue;

import java.security.cert.CertificateRevokedException;

public class ReturnStatement {
    public static void main(String[] args) {

eligible(-50);

        System.out.println("______________________-");
        System.out.println("Test started");
        boolean exit = true;
        if(exit){
            return; //main method gets terminated
        }
        System.out.println("Test 1 completed"); //NOT PRINTED due to return; on line 14, main method terminated
        System.out.println("Test 2 started");//NOT PRINTED due to return; on line 14, main method terminated



    }
    public static void eligible(int age){
        if (age<0 || age>150){
            System.err.println("Invalid age: " + age);
            return; //exits the method if age is invalid, this method is terminated
        } //NOT NESTED IF, 2 independent if statement


        if(age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }
    }

public static int multiplication(int n1, int n2){
        int result = n1*n2;
        return result;
}






}
