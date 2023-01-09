package day08_ternary_switch;

public class SwitchIntro {
    public static void main(String[] args) {
      char grade='B';
/*
A: Excellent
B: Great job
C: Good
D: Passed
F: Failed
 */
String result="";
if(grade=='A'){
    result="Excellent";
}else if (grade=='B'){
    result="Good Job";
}else if (grade=='C'){
    result="Good";
}else if (grade=='D'){
    result="Passed";
}else{
    result="Failed";
}

        System.out.println(result);
        System.out.println("________________________________________________");

 switch (grade){
     case 'A':
         System.out.println("Excellent"); //if you do not close the case it will execute all print statements, not only excellent
         break;
     case 'B':
         System.out.println("Great Job");
         break;
     case 'C':
         System.out.println("Good");
         break;
     case 'D':
         System.out.println("Passed");
         break;
     case 'F':
         System.out.println("Failed");
         break;
     default:
         System.out.println("Invalid"); //in default statement, break is optional. No error if you use it or not
 }
//order of the case and default does not matter. But, if default not at the end, then you have to add break statement,
        //otherwise it will continue to print following statement. In this case, no matter what is at the end,
        // it doesn't matter to have or not to have break







    }
}
