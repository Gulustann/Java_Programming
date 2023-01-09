package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        int[] array = new int[5]; //{0,0,0,0,0}

        array[0]= 10;//{10,0,0,0,0}
        array[1]=20;//{10,20,0,0,0}
        array[2]=30;
        array[3]=40;
        array[4]=50;

        //array[5]=60; //index out of bond exception

        System.out.println(Arrays.toString(array)); //[10, 20, 0, 0, 0] size is fixed even tough you
                                                // assign 2 elements the rest will be default 0

        System.out.println("________________________________________________________");

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());// size of the ArrayList 0











    }
}
