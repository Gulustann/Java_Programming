package day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(100 + 200);  //addition, number on both side
        System.out.println("100" + 200); //result is 100200
        System.out.println(40 - 10);
        System.out.println(50/6); //int results
        System.out.println(50/6.0); // double results, decimal
        System.out.println(50.0/6); // double results, decimal

        System.out.println(50d/6); // adding d makes the results double, decimal

        System.out.println(2.5/0.5); //decimal results, 5.0
        System.out.println((int) (2.5/0.5) ); //casted to int so no decimal anymore, result is 5
        //System.out.println(9/0); cannot devide by 0 like math

        System.out.println(10*2);
        System.out.println(20*12);

        System.out.println(100%13); //remainder is 13
        System.out.println(100%10); //remainder is 0
        System.out.println(45%8); //remainder is 5
















    }
}
