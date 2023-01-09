package day20_forEach;

import java.util.Arrays;

public class MultiplyOddNumber {
    public static void main(String[] args) {
       int[] array = { 1,2,3,4,5,6,7,8,9,10 } ;

        for (int i = 0; i < array.length; i++) {
            if(array[i] %2 !=0){ //OR if(array[i] % 2 == 0){ Continue; }
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));



        /*
        1. write a program that can multiply each odd number of an integer array by 2
		            ex:
		            	array = [1,2,3,4,5];

	                output:
	                	array =[2,2,6,4,10]
         */
    }
}
