package day14_MethodOverloadingForLoop;

public class WarmUpTasks {
    public static void main(String[] args) {
        System.out.println(combine("java", "apple"));

String s1 = ""+true; //+++> true-->char, converted to String with "" + added


        System.out.println("_____________________________________");
        System.out.println(sumOfTwoIntNumbers(10,20));
        System.out.println(sumOfThreeIntNumbers(10,20,30));
        System.out.println(sumOfFourIntNumbers(10,20,30,40));

    }
    public static String combine(String str1, String str2){
        String result="";

        if(str1.endsWith(""+str2.charAt(0))){ //or if( str1.charAt(str1.length()-1) == str2.charAt(0) ){
            result= str1 + str2.substring(1) ;
        }else{
            result=str1 + str2;
        }
return result;

      /*
       Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight
       */
    }

    public static int sumOfTwoIntNumbers(int n1, int n2) {
       return n1+n2;
    }

    public static int sumOfThreeIntNumbers(int n1, int n2, int n3){
        return n1+n2+n3; // or return sumOfTwoIntNumbers(n1, n2) + n3;
    }
    public static int sumOfFourIntNumbers(int n1, int n2, int n3, int n4){
        return sumOfThreeIntNumbers(n1, n2, n3) + n4;//or return sumOfTwoIntNumbers(n1, n2) + sumOfTwoIntNumbers(n3, n4);
    //or sumOfTwoIntNumbers(sumOfTwoIntNumbers(sumOfThreeIntNumbers(n1, n2, n3) + n4)
    }

/*
Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers

 */

}
