package day07_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {
   int gradeLevel = 18;
   String result = "";
   if( gradeLevel <=5){ // false : gradeLevel >=6 That cond. giving by default to next level
       result = "Elementary school";
   } else if ( gradeLevel<=8) { //false: gradeLevel >=9. That cond. giving by default to next level
       result = "Middle school";
   } else if ( gradeLevel<=12){  // false: gradeLevel= >=13 That cond. giving by default to next level
       result = "High school";
   }else if ( gradeLevel<=16){ //false: gradeLevel>=17 That cond. giving by default to next level
       result = " College";
   } else {
       result = "Grad School";
   }
        System.out.println(result);







        /*
        2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are: 1 ~ 5: Elementary school
6 ~ 8: Middle school 9 ~ 12: High school 13 ~ 16: College
17 ~ 18: Grad School
Note: Assume that the given number is between 1 ~ 18
         */
    }
}
