package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int a = 1000;
        int b =200;

        System.out.println( a > b ); //boolean, gives true or false result
        System.out.println( b > a );

        boolean aIsGreater = a>b;
        System.out.println(aIsGreater); //true
        System.out.println("___________________________");

        int score = 75;
        boolean passed = score >= 60;
        System.out.println(passed);

        int age =21;
        boolean eligiableToBuyAlcohol = age >= 21;
        System.out.println(eligiableToBuyAlcohol);

        boolean eligiableToVote = age >= 18;
        System.out.println(eligiableToVote);

        System.out.println("____________________________");

        System.out.println(100 > 100); //boolean expression - false

        System.out.println(100 >= 100); //true
        System.out.println(100 <= 85); //false

        score = 48;

        boolean failed = score < 60;
        System.out.println(failed); //ture

        System.out.println( 100 < 200); //boolean true
        System.out.println( 100 < 20); //false

        System.out.println("___________________________________");

        // true
        System.out.println( 95 <= 100); //ture
        System.out.println(100 <= 100); //ture
        System.out.println(10 <= 5); //false

        System.out.println("________________________");

        System.out.println('a'>'b'); //char-false characters have correspending number on ASCII table
        //                 97   98
        //System.out.println( Java <= "C#");
        // <,>, <=, >= only applicable to only numbers. Char characters has numbers. Otherwise give compiler error


        












    }
}
