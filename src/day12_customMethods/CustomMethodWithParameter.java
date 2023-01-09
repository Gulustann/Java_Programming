package day12_customMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {
        oddOrEven(5);

        oddOrEvenOrZero(5);
eligibleToBuyAlcohol(121);
grade(75);
greaterNumber(63,63);
initials("Gulustan", "Tahmisoglu");


    }
//The method takes an argument number and verifies if number is odd or even
    public static void oddOrEven (int number){
        if(number%2==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }

    //create a method if a person eligible to buy alcohol
public static void eligibleToBuyAlcohol(int age){
        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }
}

    //create a method that can check is a number is odd, even or zero
public static void oddOrEvenOrZero(int num){
if(num ==0) {
        System.out.println(num + " is zero");
    }else if(num%2!=0){
        System.out.println(num + " is odd number");
    }else{
        System.out.println(num + " is even number");
    }
}


    //create a method that can calculate the grade of the students
public static void grade (int score){
   char grade= (score>=90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C':(score>=60)? 'D' : 'F';
    System.out.println(grade);
}

//create a method that can display the initials of a person
    public static void initials (String firstName, String lastName){

        System.out.println("initial is " +firstName.charAt(0) + "." + (lastName.charAt(0)));
    }

//create a method that can print the greater number between two numbers, if both are equal then it prints "Equal";
    public static void greaterNumber(int num1, int num2){
 if(num1>num2){
     System.out.println(num1 + " is greater than " + num2);
 }else if (num2>num1){
     System.out.println(num2 + " is greater than " + num1);
 }else{
     System.out.println(num1 + " and " +num2 + " are equal");
 }
    }



}
