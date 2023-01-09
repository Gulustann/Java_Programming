package day41_maps;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(70,80,90,100,110));

        List<Integer>[] arrayOfLists = new List[3];//array, array of List

        arrayOfLists[0]=list1;
        arrayOfLists[1]=list2;
        arrayOfLists[2]=list3;

        System.out.println(Arrays.toString(arrayOfLists));
        //[[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]

        arrayOfLists[0].set(4, 50);

        System.out.println(Arrays.toString(arrayOfLists));
        //[[1, 2, 3, 4, 50, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]

        System.out.println("_________________________________________________________");

        Set<Integer>[] arrayOfSets = new Set[5];

        System.out.println(Arrays.asList(arrayOfSets));//[null, null, null, null, null]

        arrayOfSets[0]=new LinkedHashSet<>();
        arrayOfSets[1]=new LinkedHashSet<>();
        arrayOfSets[2]=new LinkedHashSet<>();
        arrayOfSets[3]=new LinkedHashSet<>();
        arrayOfSets[4]=new LinkedHashSet<>();//LinkedHashSet cannot be replaced w/ArrayList, no IS A relationship with Set

        System.out.println(Arrays.asList(arrayOfSets));//[[], [], [], [], []]

        arrayOfSets[2].addAll(Arrays.asList(1,2,3,4));

        System.out.println(Arrays.asList(arrayOfSets));//[[], [], [1, 2, 3, 4], [], []]









    }
}
