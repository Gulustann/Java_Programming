package day06_ifStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {
        int number = 156;

        boolean even = number % 2 ==0,
                odd = !even;

        if (even){
            System.out.println(number + " is even number");
        }
        if (odd){ // instead of creating odd boolean, !even can be used.
            System.out.println(number + " is odd number");
        }
if (!even){
    System.out.println(number + " is odd number");
}

        System.out.println("_________________________________________");
if(number%2==0){
    System.out.println("Even number");
}

        if(number%2!=0){
            System.out.println("Odd number");
        }










    }
}
