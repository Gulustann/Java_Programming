package day03_variables;

public class PrimativeDataTypeIntro2 {

    public static void main(String[] args) {

        //DataType variableName = Data;

        char a = '@';
        char b = '!';
        //char ab = 'ab';  //not applicable, only single character. Number can be assigned. Range : 0 to 65535


        System.out.println(a);
        System.out.println(b);

        System.out.println("_______________");

        char ch1 = 'A';
        System.out.println(ch1);  // this is one way

        char ch2 = 65;  //65 is from ASCII table and no quote needed
        System.out.println(ch2);

        System.out.println("___________________");

        char ch3 = 40000;  //if you assign a number > 127 you will get different single unknown characters
        System.out.println(ch3);

        System.out.println("______________");

        //char ch4 = -100 // gives error not in the range

        int sum = 'A' + 'B';
        //         65 +  66  = 131

        System.out.println(sum);

        System.out.println("____________");

       // boolean r1 = 123;  //error not for integar or decimal numbers

       // boolean r2 = 2.5;
        //boolean r3 = "Java";

        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10;  // true
        boolean r7 = 0 < -1; //false

        System.out.println(r6);
        System.out.println(r7);









    }
}
