package day20_forEach;

import java.util.Arrays;

import utilities.ArraysUtility;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4}; //Array size is fixed, increase capacity
        int[] arr2 = {5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length];// need to make sure that 3rd array has enough capacity to
        // contain all the elements of first and second array
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] += arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("______________________________");
        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};
        int[] a3 = ArraysUtility.mergeArrays(a1, a2);
        System.out.println(Arrays.toString(a3));

        System.out.println("______________________________");

        double[] b1 = {10.5, 5.8, 3.5, 6.5, 8.5};
        double[] b2 = {20.5, 15.5, 13.5};

        double[] b3 = ArraysUtility.mergeArrays(b1, b2);

        System.out.println(Arrays.toString(b3));

        System.out.println("______________________________");

        char[] ch1 = {'A', 'b', 'c', 'D', 'e'};
        char[] ch2 = {'X', 'Y', 'Z'};

        char[] ch3 = ArraysUtility.mergeArrays(ch1, ch2);
        System.out.println(Arrays.toString(ch3));

        System.out.println("______________________________");

        String[] c1 = {"Java", "Python", "JavaScript", "Ruby"};
        String[] c2 = {"C#", "C++", "Swift"};

        String[] c3 = ArraysUtility.mergeArrays(c1, c2);
        System.out.println(Arrays.toString(c3));


        /*
        2. write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
         */
    }
}
