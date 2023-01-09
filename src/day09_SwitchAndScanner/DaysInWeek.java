package day09_SwitchAndScanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in); //if just one input then we don't have to use variable "Scanner input= "


        System.out.println("Enter day number: ");
     // new Scanner(System.in).nextInt() //use this way ONLY IF u don't use it more than once. Goes to garbage collection

        int num = input.nextInt();

        String day = "Invalid";

        if(num>=1 && num<=7){
            day =(num==1)? "Mon" :(num==2)? "Tue" :(num==3)? "Wed" :(num==4)? "Thu" :(num==5)? "Fri" :(num==6)?
                    "Sat" : "Sun";
        }
        System.out.println(day);
        input.close();






    }
}
