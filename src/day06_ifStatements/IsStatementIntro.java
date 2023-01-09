package day06_ifStatements;

public class IsStatementIntro {
    public static void main(String[] args) {
     int number = -100;
     boolean positive = number>0;
     boolean negative = number < 0;
     boolean zero = number ==0;

// conditions will executed only is statement is true.
     if (positive) {
         System.out.println(number + " is positive");
     }
        if (negative) {System.out.println(number + " is negative");}
       if (zero){ System.out.println(number + " is zero");}

        System.out.println("___________________________________________");
int num = 100;
       if (num>0){System.out.println(num + " is positive");} //True. Executed
        if (num<0){System.out.println(num + " is negative");} // NOT true not executed
        if (num==0){System.out.println(num + " is zero");} // NOT true not executed












    }
}
