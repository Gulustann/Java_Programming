package day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = 6;

        //{1,2,3,4,5,6} ==> to expect this array need to create new array becasue size is fixed

        int[] new_array = Arrays.copyOf(array, array.length + 1);

        //System.out.println(Arrays.toString(new_array)); //[1, 2, 3, 4, 5, 0]

        new_array[new_array.length - 1] = element; //assign last index number

        System.out.println(Arrays.toString(new_array)); //[1, 2, 3, 4, 5, 6]

        System.out.println("________________________________________");
        int[] numbers = {100, 90, 80, 70, 60};

        numbers = ArraysUtility.addElement(numbers, 50); //reassign to numbers bc original one size is fixed
        // cannot add additional element

        System.out.println(Arrays.toString(numbers));

        double[] nums = {1.5, 2.5, 3.5, 4.5};
        nums = ArraysUtility.addElement(nums, 5.5); //[1.5, 2.5, 3.5, 4.5, 5.5]
        //This method does not change original one, instead create new array to add new element, bc size cannot be changed
        System.out.println(Arrays.toString(nums));

        nums = ArraysUtility.addElement(nums, 6.5);//[1.5, 2.5, 3.5, 4.5, 5.5, 6.5]
        System.out.println(Arrays.toString(nums));

        System.out.println("________________________________________");

        String[] name = {"Yasin", "Sumeyye", "Ermek"};
        name=ArraysUtility.addElement(name, "Umran");
        System.out.println(Arrays.toString(name));//[Yasin, Sumeyye, Ermek, Umran]

        name= ArraysUtility.addElement(name, "Muhtar");
        System.out.println(Arrays.toString(name)); //[Yasin, Sumeyye, Ermek, Umran, Muhtar]

        System.out.println("_______________________________________________");

        int[] score={75, 95, 67, 38, 87, 96};

        System.out.println(ArraysUtility.contains(score, 88));


    }
}
