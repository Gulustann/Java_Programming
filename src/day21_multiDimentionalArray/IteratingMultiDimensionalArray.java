package day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        //index :        0   1  2   0  1  2   3  4   0  1
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}};
        //index:            0               1           2

        for (int i = 0; i < arr2D.length; i++) { //i: index number of one dimensional array in arr2D
            int[] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length; j++) { //j: index numbers of elements in each 1D array of arr2D
                int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }
        System.out.println("_____________________________________________");

        for (int[] each1DArray : arr2D) {
            System.out.println(Arrays.toString(each1DArray));
            for (int eachEl : each1DArray) {
                System.out.println(eachEl);
            }
        }


        System.out.println("_____________________________________________");

        for (int k = 0; k < arr2D.length; k++) {
            for (int m = arr2D[k].length - 1; m >= 0; m--) {
                System.out.println(arr2D[k][m]);
            }
        }
        System.out.println("_____________________________________________");

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }


    }
}
