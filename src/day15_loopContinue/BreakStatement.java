package day15_loopContinue;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==6){ //6 is not printed bc print statement after the break;
                break; //if i's value reach 6, it terminates the loop
            }

            System.out.println(i);
        }
        System.out.println("_____________________________________________");

        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.println(i);
            if(i=='J'){ //J printed bc break statement after the print statement
                break;
            }
        }
        System.out.println("_____________________________________________");

for(;;){
    System.out.println("Hello");
    break; //terminated infinent loop
}

    }
}
