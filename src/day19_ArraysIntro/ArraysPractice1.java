package day19_ArraysIntro;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        String[] myGroup = new String[5]; //Last index number= 5-1=4
        myGroup[0]="Gulcin";
        myGroup[1]="Abdullah";
        myGroup[2]="Sumeye";
        myGroup[3]="Kashhayar";
        myGroup[4]="Aseel";
       // myGroup[5]="Muhtar"; ==>OUT OF BOUND EXCEPTION

        System.out.println(Arrays.toString(myGroup));

myGroup[1] = "Kuzzat";
        System.out.println(myGroup);
        System.out.println("________________________________________________________________");
        for (int i = myGroup.length-1; i >=0; i--) {
            System.out.println(myGroup[i]);
        }
        System.out.println("________________________________________________________________");

        for (int i = 0; i < myGroup.length; i++) { //mygroup.fori + Enter
        }
            for (int i1 = myGroup.length - 1; i1 >= 0; i1--) { //myGroup.forr + Enter

            }
            
        }
        

    }

