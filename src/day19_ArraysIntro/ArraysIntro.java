package day19_ArraysIntro;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
int score1 = 85, score2=75, score3= 78, score4=88, score5=95;

        System.out.println("____________________________________________");
int[] scores = new int[5]; //This array's size is 5, can store 5 value - index:0~4
        scores[2]=78; //index 2- third element
        scores[0]=85; //index0 - first element
        scores[1]=75;
        scores[3]=88;
        scores[4]=95;  //if you don't assign a value, default is 0 for int, 0.0 for double, null for String
//scores=new int[10]; //index0-9 // after reassign new value, above size 5 and all its elements/values goes to garbage collection

       // scores=new int[50]; //index:0-49


        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);
        System.out.println("________________________________________________________________");

        for (int i = 0; i < scores.length; i++) { //i:index numbers of scores array 0-4

            System.out.println(scores[i]);

        }

        System.out.println("________________________________________________________________");
        System.out.println(scores[scores.length-1]);






    }
}
