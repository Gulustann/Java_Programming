package day05_operators;

import java.security.spec.RSAOtherPrimeInfo;

public class RelationalOperators2 {
    public static void main(String[] args) {
       // ==: Equal Operator =: Assignment Operator

        System.out.println(1000 == 2000); //numbers
        System.out.println("Java" == "Java"); //String text
        System.out.println("java" == "JAVA"); //false, uppercase lower case
        System.out.println("Muhtar" == "Good Guy");
        System.out.println(true == false); //boolean
        System.out.println("_______________________________________");

        // != : Not equal Operator
        System.out.println();
        System.out.println(1000 != 2000); //numbers
        System.out.println("Java" != "Java"); //String text
        System.out.println("java" != "JAVA"); //false, uppercase lower case
        System.out.println("Muhtar" != "Good Guy");
        System.out.println(true != false); //boolean

        System.out.println("______________________________________________");

        // && Logical AND, all conditions has to be true for "true" result

        double salary = 25000,
                creditScore = 750;
        int age = 25;
        boolean eligiableForLoan = salary > 30000 && creditScore >= 650 && age>=18;
        //                           false                   true            true ====>false
        System.out.println(eligiableForLoan);

        age = 18;
                String country = "USA";
        boolean eligiableToVote = age >= 18 && country == "USA";
        //                         true            true    =====>true
        System.out.println(eligiableToVote);


        System.out.println("_____________________________________________");
        // || Logical OR

        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer); // false, maybe is not yes or no

        System.out.println("____________________________________");
        char grade = 'B';
        boolean passed = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println(passed);

        System.out.println("_____________________________________________");

        // ! Logical NOT

        System.out.println(true); //true
        System.out.println(!true); //not true = false

        String a = "yes";
        boolean yes = a == "yes";
        boolean no = !yes;
        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("______________________________________");

        int score = 65;
        boolean passsed = score >= 60;
        boolean fail = !passsed;

        System.out.println("passsed = " + passsed);
        System.out.println("fail = " + fail);
        System.out.println("_____________________________");

        System.out.println( true == !false && false == !true && true != !true );
        //                     true                true               true


















    }
}
