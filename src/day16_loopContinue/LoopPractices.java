package day16_loopContinue;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello" + i);
        }
        System.out.println("_____________________________________________");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello" + i);
        }
        System.out.println("_____________________________________________");
        int j = 0;
        while (j < 5) {
            System.out.println("Hello" + j);
            j++;
        }
        System.out.println("_____________________________________________");
        int k = 0;
        do {
            System.out.println("Hello" + k);
            k++;
        } while (k < 5);
        System.out.println("_____________________________________________");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you score");
        int score = sc.nextInt();

        while (score > 100 || score < 0) { //while score is invalid
            System.out.println("Invalid score, please re-enter your score");
            score = sc.nextInt();
        }
        if (score >= 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

sc.close();
    }
}
