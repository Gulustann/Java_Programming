package day40_collection;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new PriorityQueue<>();//allows duplicate, order not preserved, does not accept null
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        //queue1.addAll(Arrays.asList(null,null,null,null,null));//queue does not accept null


        System.out.println(queue1);//[10, 10, 10, 40, 40, 200, 40, 300, 200, 90, 90, 300, 300, 200, 90]

        int num1 = queue1.poll(); //==>FIFO==>queue
        System.out.println(queue1);//[10, 40, 10, 90, 40, 200, 40, 300, 200, 90, 90, 300, 300, 200]

        queue1.poll();
        queue1.poll();
        queue1.poll();//first 3 elements being removed now

        System.out.println(queue1);//[40, 90, 40, 200, 90, 200, 200, 300, 300, 300, 90]

        //System.out.println(queue1.get(4));//Error, no get method

        System.out.println("__________________________________________________________________");

        Queue<Integer> queue2 = new ArrayDeque<>();//insertion order preserved, does NOT accepts null, no duplicates
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        //queue2.addAll(Arrays.asList(null,null,null,null,null));


        System.out.println(queue2);//[10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        queue2.poll();//first 10 removed
        System.out.println(queue2);//[200, 300, 40, 90, 10, 200, 300, 40, 90]

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);//[]
        //System.out.println(queue2.get(4));//Error, no get method

        System.out.println("__________________________________________________________________");

        Queue<Integer> queue3 = new LinkedList<>();//preserve order, allows duplicates, accepts null, has index
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(null,null,null,null,null));//also a List, has index #, accepts null

        System.out.println(queue3);//[10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        queue3.poll();//first element removed
        System.out.println(queue3);//[200, 300, 40, 90, 10, 200, 300, 40, 90]


        System.out.println(((LinkedList)queue3).get(4));//has index number bc child of also Link along with Queue


        System.out.println("___________________________________________________________");

        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(list.get(1));

        System.out.println(list);//[10, 200, 300, 40, 90]

        ( (LinkedList)list).poll();//removed first element, FIFO
        System.out.println(list);//[200, 300, 40, 90]

        /*((Stack) list).pop();//LIFO - LinkedList does not have is a relation w/Stack-->Exception
        System.out.println(list);*/

    }
}
