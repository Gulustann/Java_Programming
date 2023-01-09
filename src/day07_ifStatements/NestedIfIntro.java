package day07_ifStatements;

public class NestedIfIntro {
    public static void main(String[] args) {
      int score =-95;

        if(score >=0 && score<=100) { // nested if

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        }else {
            System.out.println("Invalid Score");
        }
        System.out.println("___________________________________");

        int age = 150;

        if(age >1 && age<120) {
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }

        }else{
            System.out.println("Invalid age");
        }

        System.out.println("_________________________________");
int day = 2;

if(day>=1 && day<=7) {
    if (day == 1) {
        System.out.println("Mon");
    } else if (day == 2) {
        System.out.println("Tue");
    } else if (day == 3) {
        System.out.println("Wed");
    } else if (day == 4) {
        System.out.println("Thu");
    } else if (day == 5) {
        System.out.println("Fri");
    } else if (day == 6) {
        System.out.println("Sat");
    } else if (day == 7) {
        System.out.println("Sun");
    }
}else {
    System.out.println("Invalid number");
}





    }
}
