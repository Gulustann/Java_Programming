package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysUtility {
    public static void main(String[] args) {


    }

    public static char[] mergeArrays(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];// need to make sure that 3rd array has enough capacity to
        // contain all the elements of first and second array
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] += arr2[i];
        }
        return arr3;
    }


    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];// need to make sure that 3rd array has enough capacity to
        // contain all the elements of first and second array
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] += arr2[i];
        }
        return arr3;
    }

    public static double[] mergeArrays(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];// need to make sure that 3rd array has enough capacity to
        // contain all the elements of first and second array
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] += arr2[i];
        }
        return arr3;
    }


    public static String[] mergeArrays(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length];// need to make sure that 3rd array has enough capacity to
        // contain all the elements of first and second array
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[k] = arr1[i];
            k++;
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] += arr2[i];
        }
        return arr3;
    }

    //-------------------------------------------------------------//

    public static int[] reversedArray(int[] array) {

        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, k = 0; i >= 0; i--) {
            reversedArray[k++] += array[i];
        }
        return reversedArray;
    }


    public static double[] reversedArray(double[] array) {

        double[] reversedArray = new double[array.length];

        for (int i = array.length - 1, k = 0; i >= 0; i--) {
            reversedArray[k++] += array[i];
        }
        return reversedArray;
    }

    public static char[] reversedArray(char[] array) {

        char[] reversedArray = new char[array.length];

        for (int i = array.length - 1, k = 0; i >= 0; i--) {
            reversedArray[k++] += array[i];
        }
        return reversedArray;
    }

    public static String[] reversedArray(String[] array) {

        String[] reversedArray = new String[array.length];

        for (int i = array.length - 1, k = 0; i >= 0; i--) {
            reversedArray[k++] = array[i];
        }
        return reversedArray;
    }
    //-------------------------------------------------------------//


    //This method adds only one additional element to array
    public static int[] addElement(int[] array, int element) {
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element; //assign last index number
        return new_array;
    }

    public static double[] addElement(double[] array, double element) {
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element; //assign last index number
        return new_array;
    }

    public static char[] addElement(char[] array, char element) {
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element; //assign last index number
        return new_array;
    }

    public static String[] addElement(String[] array, String element) {
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element; //assign last index number
        return new_array;
    }

    //-------------------------------------------------------------//
//This method checks if an array contains given element or not. Boolean type return value
    public static boolean contains(int[] array, int element) {
        boolean found = false;

        for (int search : array) {
            if (search == element) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static boolean contains(String[] array, String element) {
        boolean found = false;

        for (String search : array) {
            if (search.equals(element)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static boolean contains(double[] array, double element) {
        boolean found = false;

        for (double search : array) {
            if (search == element) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static boolean contains(char[] array, char element) {
        boolean found = false;

        for (char search : array) {
            if (search == element) {
                found = true;
                break;
            }
        }
        return found;
    }


    //-------------------------------------------------------------//
//replaces elements by their index number
    public static int[] replace(int[] arr, int index, int newElement){

        arr[index] = newElement;
        return  arr;
    }
    public static Double[] replace(Double[] arr, int index, Double newElement){

        arr[index] = newElement;
        return  arr;
    }
    public static String[] replace(String[] arr, int index, String newElement){

        arr[index] = newElement;
        return  arr;
    }
    public static char[] replace(char[] arr, int index, char newElement){

        arr[index] = newElement;
        return  arr;
    }

    //-------------------------------------------------------------//


    //Replaces all matching element to new element
    public static int[] replaceAllMatchingElement(int[] arr, int oldElement, int newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }
        return arr;
    }
    public static String[] replaceAllMatchingElement(String[] arr, String oldElement, String newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldElement)) {
                arr[i] = newElement;
            }
        }
        return arr;
    }
    public static Double[] replaceAllMatchingElement(Double[] arr, Double oldElement, Double newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static char[] replaceAllMatchingElement(char[] arr, char oldElement, char newElement) {
        for (char i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }
        return arr;
    }
    //-------------------------------------------------------------//

    //the method inserts the given element to the given index of the array and returns the new array

    public static ArrayList<Integer> insert(int[] arr, int index, int newElement) {
        ArrayList<Integer> list = new ArrayList<>(); //new ArrayList created to be able use add method
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i])); //each array elements added to arrayList
        }
        list.add(index, newElement); //new element added to specified index number using add method
        return list;
    }
    public static ArrayList<Character> insert(char[] arr, int index, char newElement) {
        ArrayList<Character> list = new ArrayList<>();
        for (char i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        list.add(index, newElement);
        return list;
    }
    public static ArrayList<String> insert(String[] arr, int index, String newElement) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        list.add(index, newElement);
        return list;
    }
    public static ArrayList<Double> insert(Double[] arr, int index, Double newElement) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        list.add(index, newElement);
        return list;
    }

    //-------------------------------------------------------------//
    //swaps the element at index i with the element at index j, and returns the new array
    public static ArrayList<Integer> swap(int[] arr, int index1, int index2){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.swap(list, index1, index2);
        return list;
    }
    public static ArrayList<Double> swap(Double[] arr, int index1, int index2){
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.swap(list, index1, index2);
        return list;
    }
    public static ArrayList<Character> swap(char[] arr, int index1, int index2){
        ArrayList<Character> list = new ArrayList<>();
        for (char i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.swap(list, index1, index2);
        return list;
    }
    public static ArrayList<String> swap(String[] arr, int index1, int index2){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.swap(list, index1, index2);
        return list;

    }

    //-------------------------------------------------------------//






}
