package day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {
    public static void main(String[] args) {
        String str= "Java";
        //char ch = str.charAt(250);//Exception - unchecked StringIndexOutOfBoundsException
        //System.out.println(ch);

        Pizza pizza = null;
        System.out.println(pizza);
        //pizza.calcCost(); //object is null, and it does not reference anything==> null pointer exception-unchecked

        System.out.println(50/0);//ArithmeticException - unchecked

        System.out.println("Hello World");

        System.out.println("_____________________BUG_________________________________");

        int score = 100;

        if(score>59){
            System.out.println("Your grade is D");
        } else if (score>70) {//bug : >=70 & if grade is >59 then 70 will not be checked, grade is D
            System.out.println("Your grade is C");
        }
        System.out.println("_____________________Checked Exceptions_________________________________");

        //FileInputStream file = new FileInputStream(""); //compile error - compiler tells you it's an exception, checked

        //Thread.sleep(3000);//checked exception





    }
}
