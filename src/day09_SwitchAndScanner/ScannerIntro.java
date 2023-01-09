package day09_SwitchAndScanner;
import java.util.Scanner; //regular import- imports only Scanner class

//import java.util.*; //wild import- imports everything from java.util package, cost more memory
// (resource) usage

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//for reading user inputs.If u don't have import statement (above) gives error
//              input= reference name
        //input.close(); // closes scanner method
        System.out.println("Enter your first number: ");

      byte num = input.nextByte(); //that will wait until u provide an input on output section than press "Enter" to print next statement

        System.out.println("Enter your second number: ");
      short num1=  input.nextShort();

        System.out.println("Enter you third number: ");
        int num3 = input.nextInt();

        System.out.println("Enter your forth number: ");
        long num4 = input.nextLong();

        input.close(); //closing scanner - cannot read user inputs again

       // int num5 = input.nextInt();
        //System.out.println("Your fifth number is: " + num5);

        //num5 input cannot be printed, because it is used after closing scanner

        System.out.println("First number is: " +num);
        System.out.println("Second number is: " +num1);
        System.out.println("Third number is: " + num3);
        System.out.println("Fourth number is: " + num4);



    }
}
