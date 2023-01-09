package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

int[] array = {1,2,3,4,5};
int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, k=0; i >= 0; i--) {
            reversedArray[k++] += array[i];
        }
        System.out.println(Arrays.toString(reversedArray));

        System.out.println("___________________________________");

int[] nums = {100, 200, 300, 400, 500};
        nums = ArraysUtility.reversedArray(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("___________________________________");

        double[] a1 = {1.5, 2.5, 3.5, 4.5, 5.5};
       a1= ArraysUtility.reversedArray(a1);
        System.out.println(Arrays.toString(a1));


        /*
        3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};

         */
    }
}
