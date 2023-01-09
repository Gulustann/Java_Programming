package day19_ArraysIntro;

import java.util.Arrays;

public class AlphabetOrder {
    public static void main(String[] args) {
     //   Create a char array and store all the alphabet letters in ascending order

       char[] ascending = new char[26]; //ascending = a,b,c ....,z index: 0-25
        char[] descending = new char[26]; // index: 0-25

        for (int i = 0, j='A', k='Z'; i < ascending.length; i++, j++, k--) {
            ascending[i]=(char)j; //A-Z
            descending[i] = (char)k; //Z-A
        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));

        System.out.println("_____________________________________________________");

        char[] charCharacters = new char[65535];

        for (int i = 0; i < charCharacters.length; i++) {
            charCharacters[i]= (char) i;
        }
        System.out.println(Arrays.toString(charCharacters));









	// Create a char array and store all the alphabet letters in descending order

    }
}
