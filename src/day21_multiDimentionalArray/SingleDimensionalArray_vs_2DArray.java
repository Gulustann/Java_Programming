package day21_multiDimentionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_2DArray {
    public static void main(String[] args) {
        int[] array1D = new int[10]; //size of this array is 10
        System.out.println(Arrays.toString(array1D)); //[0,0,0,0,0,0,0,0,0,0]  10 - 0s as 0 is default number for int

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};
        int[] arr3 = {9, 10};
        int[] arr4 = {11, 12, 13, 14, 15};
        int[] arr5 = {16, 17, 18, 19, 20, 21};

        int[][] arr2D = new int[5][]; //give the size to first bracket ALWAYS
        System.out.println(Arrays.deepToString(arr2D)); //[null, null, null, null, null]

        arr2D[0] = array1D;
        System.out.println(Arrays.deepToString(arr2D)); //[[0, 0, 0, 0, 0, 0, 0, 0, 0, 0], null, null, null, null]


        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;
        System.out.println(Arrays.deepToString(arr2D));
    //[[1, 2, 3, 4, 5], [6, 7, 8], [9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19, 20, 21]]






    }
}
