package day17_customClassIntro;

public class InterviewUniqueCharacter1 {
    public static void main(String[] args) {
String str="aabcccd";
String unique ="";
//1 WAY TO SOLVE THIS PROBLEM:
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))== str.lastIndexOf(str.charAt(i))){
                unique+=str.charAt(i);
            }
        }
        System.out.println(unique);







        /*
        1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
         */
    }
}
