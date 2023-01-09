package day16_loopContinue;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String u, p;
        int attempt = 3;
        do{
            System.out.println("Enter your user name");
            u = sc.next();

            System.out.println("Enter your password");
            p= sc.next();

            attempt--;

            if(attempt==0){
                break;
            }

        }while(!(u.equals("Cydeo") && p.equals("WoodenSpoon"))); //while credentials are invalid, while block will be repeated
sc.close();




    }
}
