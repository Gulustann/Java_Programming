package day09_SwitchAndScanner;

import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month number: ");
        int month = input.nextInt();
        String result = "";
       if (month>=1 && month<=12){
            result= (month==1)? "Jan" :(month==2)? "Feb" :(month==3)? "Mar" :(month==4)? "Apr" :(month==5)?
                    "May":(month==6)? "Jun" :(month==7)? "Jul" :(month==8)? "Aug" :(month==9)? "Sep"
                    :(month==10)? "Oct" :(month==11)? "Nov" : "Dec";

        }else{
            result = "Invalid";
        }
        System.out.println(result);
        input.close();




        /*
   3.1 Ask the user to enter a number
   3.2 Display the month name
         */
    }
}
