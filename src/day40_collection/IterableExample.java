package day40_collection;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));

      /*  for (Integer each : list) {
            if(each<5){
                list.remove(each);
            }
        }

        System.out.println(list);*/ //for each loop - remove method taking object, not index number, error

        for (int i = 0; i < list.size(); i++) {//does NOT WORK loop and remove method, that's why we need iterable
            if(list.get(i)<5){
                list.remove(i);
            }
        }
        System.out.println(list);//[2, 4, 5, 6, 7, 2, 4, 5, 6, 7] did not remove all elements <5

        System.out.println("___________________________________________________________");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        Iterator<Integer> it = list2.iterator();

        while(it.hasNext()){//while loop is preferred
            Integer each = it.next();
            if(each<5){
                it.remove();//remove method from Iteration, nor from Collection
            }
        }

        System.out.println(list2);//[5, 5, 6, 7, 5, 6, 7]

        System.out.println("___________________________________________________________");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext();) {
            Integer each = i.next();
            if(each<5){
                i.remove();
            }
        }
        System.out.println(list3);//[5, 5, 6, 7, 5, 6, 7]

        System.out.println("___________________________________________________________");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        list4.removeIf(each-> each<5 );//implicitly uses iterator
        System.out.println("___________________________________________________________");

        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        list5.removeIf(p->p<5);

        System.out.println(list5);//[5, 5, 6, 7, 5, 6, 7]






        
    }
}
