package utilities;

public class StringUtility {
    public static void main(String[] args) {




    }
    public static String reverse(String str){
        String reverse =""; //to contain all the characters of the given string in reversed order
        for(int i = str.length()-1; i>=0; i--){ // i: index numbers of string starting from last index through index 0
            reverse += str.charAt(i); //to get each character of the string starting from the last index to index zero
        }
        return reverse;
    }
}
