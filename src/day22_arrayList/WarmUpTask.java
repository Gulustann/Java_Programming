package day22_arrayList;

public class WarmUpTask {
    public static void main(String[] args) {
        int[][] array = {{100, 200, 300}, {10, 1000, 50}, {-200, 400, 0}};
        int max = -2147483648; //OR array[0][0] ==> very first element of 1D array compared to other elements
        int min = 2147483647;
        for (int[] each1D : array) {
            for (int element : each1D) {
                if (element > max) {
                    max = element;
                }
                if (element < min) {
                    min = element;
                }
            }
        }

        System.out.println("Min number is: " + min);
        System.out.println("Max number is: " + max);





        /*Write a program that can find the min and max numbers from a two D array of integers
         */


    }
}
