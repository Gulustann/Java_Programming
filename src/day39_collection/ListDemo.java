package day39_collection;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();//Array based class==>retreving element faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        List<Integer> linkedList = new LinkedList<>();//Node base class(doubly linked list)
        // ==>inserting and deleting faster(add(), addAll(), remove(), removeAll(), retainAll() )
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("_____________________________________________________");


        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);


        System.out.println("_____________________________________________________");

        Stack<Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack); //[100, 200, 300]

        int lastElement = stack.pop();

        System.out.println(stack);//[100, 200]

        int secondLastElement = stack.pop();

        System.out.println(secondLastElement);//200







    }
}
