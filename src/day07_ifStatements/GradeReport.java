package day07_ifStatements;

public class GradeReport {
    public static void main(String[] args) {

   int score = 60;
   String result = "Your grade is: ";

   if(score>=90 && score<=100){ //false : score <90, no need to type &&<90 for next condition, it is already <90 that's why 2nd if is executed
       result += "A";
   }else if ( score>=80 && score<90){ //No need to type && score<90 because if it is >90 first one will be executed and no reading second statement
       result += "B";
   } else if (score >=70 ) { // false : score <70
       result += "C";
   } else if (score >=60 ){ //false : score <60
       result += "D";
   }else{
       result += "F";
   }
        System.out.println(result);





        /*
        2. An integer variable named score is declared and given, Write a program that can print the grade of the student
Ex:
score = 95
output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100
         */
    }
}
