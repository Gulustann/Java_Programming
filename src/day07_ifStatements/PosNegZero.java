package day07_ifStatements;

public class PosNegZero {
    /*
    2. An integer variable named number is declared and given, Write a program can identify if the number is positive, negative or zero
Ex:
number = 20
output: Positive
     */

    public static void main(String[] args) { //multi branch if statement. Prints first true result and does not check the rest

       int n = 20;
       String result= "";

       if(n<0){
           result = "Negative";
       }else if (n==0){
           result = "Zero";
       } else {
            result = "Positive";
        }
        System.out.println(result);

        System.out.println("______________________________");

// multiple single if statement: Disadvantage==> checks every single if statements
if (n<0){
    result = "Negative";
}
if (n==0){
    result = "Zero";
}
if (n>0){
    result = "Positive";
}
        System.out.println(result);













    }
}
