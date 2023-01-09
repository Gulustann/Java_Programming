package day16_loopContinue;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str = "caabbbcccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { //i: index number of the str
            if (str.charAt(i) == ch) {
                // when each character in str equals to given char==> count +1
                count++;
            }
        }
        System.out.println(count);








/*
write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5

 */

    }
}
