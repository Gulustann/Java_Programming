package day15_loopContinue;


public class Interview_removeDuplicate {
    public static void main(String[] args) {


        String str= "xxxxxxxdddddrrrrrrrrhjukkkkkkkk";
        String result=""; //"abc"


        for (int i = 0; i < str.length(); i++) { //i: index number of giving string, str. from 0 to last index
            char each = str.charAt(i); //each character of the string str
if(!result.contains(""+each)){ //char "(each) coverted to string by concating with ""+
    result +=each; //if result does not contain character, then it will be added, otherwise skip the character adding
}
        }
        System.out.println(result);

/*
 Write a program that can remove the duplicated characters from  a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */

    }
}
