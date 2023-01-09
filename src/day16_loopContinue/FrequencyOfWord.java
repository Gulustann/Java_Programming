package day16_loopContinue;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva";
        String word = "Java";

        // word= word.toLowerCase;
        //sentence = sentence.toLowercase;

        int count = 0;

        while(sentence.toLowerCase().contains(word.toLowerCase())){
            count++;
            sentence= sentence.toLowerCase().replaceFirst(word.toLowerCase(), "");
            //each time it will remove one word and count increase +1. When no more word, while loop stops
        }

        System.out.println(count);
/*
"Java Java Java Java" count =0;
"Java Java Java" count = 1;
"Java Java" count = 2
"Java" count =3
"" count =4
 */

    /*
        Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
         */
    }
}
