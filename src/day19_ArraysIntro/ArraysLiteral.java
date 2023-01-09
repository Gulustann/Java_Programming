package day19_ArraysIntro;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLiteral {
    public static void main(String[] args) {
     int[] number = new int[5]; //if you don't know exact elements use this way

     int[] nums ={10, 20, 30, 40, 50}; //

        System.out.println(number.length); //size 5
        System.out.println(nums.length); //5

        System.out.println("number = " + Arrays.toString(number));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("____________________________________________________");

//element number:         1         2           3           4           5           6           7
        String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index number:  0          1           2           3           4           5           6
        int n=1;
        System.out.println(days [n-1]); //n-1== index number

        System.out.println("____________________________________________________");
        //Name of all months - use Arrays literal since we know number of elements and what those elements are

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        /*months = new String[12];  This way is much longer if you know exact elements than create Array literal
        months[0]= "Jan";
        months[1] = "Feb";
        months[2] = "Mar";
        .
        .
        .
        */

        System.out.println("Months = " + Arrays.toString(months));
        System.out.println("____________________________________________________");

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }



    }
}
