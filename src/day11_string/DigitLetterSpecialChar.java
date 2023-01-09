package day11_string;

import java.util.Scanner;

class DigitLetterSpecialChar {
    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();  //one time use scanner then will be deleted from memory, no closing needed


        if(str.length()>=1){  //index number cannot be less than zero, has at least one character
            char f = str.charAt(0);   //f=first character of string
            if(f>=48 && f<=57){
                System.out.println("first character is digit");
            }else if(f>=65 && f<=90){
                System.out.println("first character is uppercase letter");
            }else if (f>=97 && f<=122){
                System.out.println("first character is uppercase letter");
            }else{
                System.out.println("first character is special character");
            }

        }else {
            System.out.println("String is empty");
        }







        /*3. Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table

*/





    }
}
