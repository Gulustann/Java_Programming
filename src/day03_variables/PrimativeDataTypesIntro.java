package day03_variables;

public class PrimativeDataTypesIntro {

    public static void main(String[] args) {

      //Data type    variableName = Data;

        //byte a = "Java"; //byte only accepts integer values (-128 to 127)
        // byte a = 20.5; // byte cannot take decimal numbers
       //byte a = 2000; //out of bytes range
        byte a = 20;

        //price of the car is $17500

        short p = 17500;
        System.out.println(p);
        System.out.println("p"); //not in "" then it prints letter p, not the data you stored in p

        //salary is $95000

        int s = 95000;
        System.out.println(s);

       // int n = 9999999999; //out of range

        //long n = 9999999999;  //int is the preferred data type inorder to force it to taken as long add l or L at the end of the data

        long n= 9999999999L;


        double gpa = 3.5; //double is preferred data type for all decimals

        float gpa2 = 3.5F;

        System.out.println(gpa2);






    }
}
