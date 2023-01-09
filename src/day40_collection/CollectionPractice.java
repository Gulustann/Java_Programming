package day40_collection;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();

        collection.add(100);
        collection.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700));
        System.out.println(collection);

       // collection.getClass(2); //reference type decides what to call, so no access to get() method, need down casting

        ((ArrayList)collection).get(2);//after down casting get method is accessible now

        //System.out.println(((Stack)collection).pop());//class cast exception, no is a relation between stack and ArrayList

        System.out.println("_________________________________________________________");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700,100 ,100,100));
        System.out.println(collection2);//[400, 100, 500, 200, 600, 300, 700]

        //System.out.println(((ArrayList)collection2).get(4));//classCastException
        //first convert using constructor then use get method

        System.out.println(new ArrayList<>(collection2).get(4));//hastSet converted to arrayList - 600

        List<Integer> l = new ArrayList<>(collection2);




    }
}
