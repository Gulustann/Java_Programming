package day06_ifStatements;

public class Cigarettes {
    /*
    . A variable named age is declared and given, Write a program that can check if the person is eligible to buy cigarettes
Ex:
age = 20
output:
You are not eligible to buy Cigarettes
     */
    public static void main(String[] args) {
      int age = 18;
      boolean eligible = age>21 && age<100;

      if(!eligible){
          System.out.println("You are not eligible to bu Cigarettes");
      }

      if(eligible){
          System.out.println("You are eligible to but Cigarettes");

      }

        System.out.println("___________________________________________");
if (age <21 || age > 100){
    System.out.println("You are not eligible to bu Cigarettes");;


}
if (age >21 && age <100){
    System.out.println("You are eligible to but Cigarettes");
}








    }
}
