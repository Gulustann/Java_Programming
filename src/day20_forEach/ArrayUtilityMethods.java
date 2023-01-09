package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {
        int[] score = {70, 100, 80, 90, 65};
        System.out.println(Arrays.toString(score));
        String result = Arrays.toString(score); //converting array object to String
        System.out.println(result);

        System.out.println("____________________________________");
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};
        boolean r1 = Arrays.equals(a1, a2); //true, if elements are same, order is different ==> FALSE
        System.out.println(r1);

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};
        boolean r2 = Arrays.equals(ch1, ch2); //FALSE, order is different even tough elements are same
        System.out.println(r2);


        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};
        boolean r3 = Arrays.equals(s1, s2);
        System.out.println(r3);

        System.out.println("____________________________________");

        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum number is " + nums[0]);
        System.out.println("Maximum number is " + nums[nums.length - 1]);

        System.out.println("____________________________________");
        String[] b1 = {"A", "B", "C"}; //A, B, C
        String[] b2 = {"A", "B", "C"}; //A, B, C

        Arrays.sort(b1);
        Arrays.sort(b2);

        System.out.println(Arrays.equals(b1, b2)); //after sorting, then it is true
        System.out.println("____________________________________");

        String[] students = {"Gulustan", "Yasar", "Ali", "Alena", "Abdullah"};
        System.out.println(Arrays.toString(students));

        Arrays.sort(students); //sorted in ascending order
        System.out.println(Arrays.toString(students));

        System.out.println("____________________________________");

        int[] array = {10, 20, 30, 40, 50, 60, 70};
        int[] array2 = Arrays.copyOf(array, 4); //first four elements of array
        int[] array3 = Arrays.copyOf(array, 10); // seven elements from array copied, the rest is assigned default, 0

        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

        System.out.println("____________________________________");

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);
        System.out.println(Arrays.toString(n3));

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j] = n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("____________________________________");

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        //index:    0     1    2    3    4    5    6
        char[] result1 = Arrays.copyOf(ch, 20); //assigns default 0 after 7 elements in ch
        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch, 2, 5); //excluding last index, 5.
        System.out.println(Arrays.toString(result2)); //C D E

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length); //includes last index

        System.out.println(Arrays.toString(result3));


    }
}
