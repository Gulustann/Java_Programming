package day08_ternary_switch;

public class TernaryIntro3 {
    public static void main(String[] args) {
        int score = 195;

        /*if(score >=0 && score<=100) { // nested if

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        }else {
            System.out.println("Invalid Score");
        }*/

        String result = (score >= 0 && score <= 100) ?
                (score >= 60) ? "Passed" : "Failed"
                : "Invalid";
        System.out.println(result);

        System.out.println("___________________________________");
int n= 7;
String day= (n>=1 && n<=7) ?
        (n==1)? "Mon" :(n==2)? "Tue" :(n==3)? "Wed" :(n==4)? "Thu" :(n==5)? "Fri" :(n==6)? "Sat" : "Sun"
        :"Invalid";

        System.out.println(day);






    }
}
