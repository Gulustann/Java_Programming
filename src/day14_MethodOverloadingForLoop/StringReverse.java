package day14_MethodOverloadingForLoop;

public class StringReverse {
    public static void main(String[] args) {
        String str= "Java"; //reverse avaJ
        //           0123
String reverse ="";
        for(int i = 3; i>=0; i-- ){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("___________________________________");
        String name= "Ermek Keneshikovich Apazov";
        String result = reverse(name);
        System.out.println(result);



    }
    public static String reverse(String str){
        String reverse =""; //to contain all the characters of the given string in reversed order
        for(int i = str.length()-1; i>=0; i--){ // i: index numbers of string starting from last index through index 0
            reverse += str.charAt(i); //to get each character of the string starting from the last index to index zero
        }
        return reverse;
    }


}
