package day19_ArraysIntro;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {
int[] arr1 = {10, 20, 30, 40, 50};
int[] arr2= arr1;
int[] arr3= arr2; // Only 1 arrays object and 3 variables referencing to this object

        arr1[0] = 1000;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println("______________________________________");

String[] a1={"Umran", "Mehmet"};
a1= new String[ ]{"James", "Daniel"};

        System.out.println(Arrays.toString(a1));





    }
}
