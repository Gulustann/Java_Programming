package day19_ArraysIntro;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("How many number do you want to enter?");
        int total= sc.nextInt();
        int sum= 0;

        int[] numbers =new int[total];
        for (int i = 0; i < total; i++) {
            System.out.println("Enter a number");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        double average= sum/(double)total; // int/int=int so to convert it double by casting

        DecimalFormat df=new DecimalFormat("0.00");

        System.out.println("Numbers  = " + Arrays.toString(numbers) );
        System.out.println("average = " + df.format(average));





        /*
        5. AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number

         */
    }
}
