package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {
        int[][] arr2D_1 = {{1,2}, {3,4,5} };
        int[][] arr2D_2 = {{6,7,8,9}, {10,11}, {12,13,14}};
        int[][] arr2D_3 ={{15,16,17,18}};

        //index of 1D:          0       1           0       1           2               0
        int[][][] array3D = {{{1,2}, {3,4,5} },{{6,7,8,9}, {10,11}, {12,13,14}}, {{15,16,17,18}}};
        //index of 2D arr:               0                  1                          2
        //[index # of 2D array] [index # of 1D array][index number of element]
        //3D array contains only 2D arrays

        System.out.println(Arrays.deepToString(array3D));

        System.out.println(Arrays.deepToString(array3D[1])); //[[[6,7,8,9], [10,11], [12,13,14]]]

        System.out.println(Arrays.toString(array3D[0][1])); //[3,4,5] - USE ToString METHOD for 1D array

        System.out.println(Arrays.toString(array3D[1][0]));//[6,7,8,9]

        System.out.println(array3D[1][2][2]); //14 - to print element NO NEED ANY METHOD

        System.out.println(array3D[2][0][2]); //17

        System.out.println("____________________________________________________________");

        for (int i = 0; i < array3D.length; i++) { //i: index number of each 2D array
            int[][] each2DArray = array3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) { //j: index number of each 1D array
                int[] each1DArray = each2DArray[j];
                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) {
                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);
                }


            }

        }












    }
}
