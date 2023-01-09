package day17_customClassIntro;

public class UniqueCharacters2 {
    public static void main(String[] args) {

//Find frequency and then find the ones that frequency ==1;

        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) { //outer loop repeat the below loop for every single character

            char ch = str.charAt(j); //first character in the string compared to other characters,
            // whenever there is a match frequency increases by 1
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { //how many time ch has appeared in str
                if (str.charAt(i) == ch) { //if the ch has appeared in the str
                    frequency++; //frequency increased by 1
                }
            }

            if (frequency == 1) { //if frequency ==1; then character is unique
                unique += ch;
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
