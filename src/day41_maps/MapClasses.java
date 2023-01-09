package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();//random order, accepts null key, null values
        hashMap.put("Daniel", 95000);//cannot switch key & value order, first key then value
        System.out.println(hashMap);//{Daniel=95000}

        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 55000);
        System.out.println(hashMap);//{Emily=100000, Daniel=95000, Bella=55000}==>random order

        hashMap.put("Daniel", 75000);
        hashMap.put("Daniel", 105000);
        hashMap.put("Daniel", 68000);//last value

        System.out.println(hashMap);//{Emily=100000, Daniel=68000, Bella=55000}
        //no duplicates, last value assigned to Daniel
        //put() method also updates the value and reassign last value

        hashMap.put("Aeron", 78000);
        System.out.println(hashMap);//{Emily=100000, Daniel=68000, Aeron=78000, Bella=55000}

        hashMap.put("Chris", null);
        hashMap.put("Brianna", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 110000);
        hashMap.put(null, 100000);//last one is accepted

        System.out.println(hashMap);//{Brianna=null, null=100000, Emily=100000, Chris=null, Daniel=68000, Aeron=78000, Bella=55000}

        System.out.println("______________________________________________________________");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();//insertion order, accepts null key, null values

        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 55000);
        linkedHashMap.put("Daniel", 75000);
        linkedHashMap.put("Daniel", 105000);
        linkedHashMap.put("Daniel", 68000);//last value
        linkedHashMap.put("Aeron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Brianna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);//last one is accepted

        System.out.println("linkedHashMap = " + linkedHashMap);
//linkedHashMap = {Daniel=68000, Emily=100000, Bella=55000, Aeron=78000, Chris=null, Brianna=null, null=100000}
        //insertion order is preserved

        System.out.println("______________________________________________________________");

        Map<String, Integer> treeMap = new TreeMap<>();//sorted order, does NOT accept null key, but accepts null values
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 55000);
        treeMap.put("Daniel", 75000);
        treeMap.put("Daniel", 105000);
        treeMap.put("Daniel", 68000);//last value
        treeMap.put("Aeron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Brianna", null);
        //treeMap.put(null, 120000); Key cannot be null in treeMap but value can be null
       //treeMap.put(null, 110000);
        //treeMap.put(null, 100000);//last one is accepted

        System.out.println(treeMap);
        //{Aeron=78000, Bella=55000, Brianna=null, Chris=null, Daniel=68000, Emily=100000}
        //Key cannot be null in treeMap but value can be null, ASCENDING order

        System.out.println("______________________________________________________________");
        
        Map<String, Integer> hashTable = new Hashtable<>();//random order, does NOT accept null key or null value, Synchronized

        hashTable.put("Daniel", 95000);
        hashTable.put("Emily", 100000);
        hashTable.put("Bella", 55000);
        hashTable.put("Daniel", 75000);
        hashTable.put("Daniel", 105000);
        hashTable.put("Daniel", 68000);//last value
        hashTable.put("Aeron", 78000);
        //hashTable.put("Chris", null);
        //hashTable.put("Brianna", null);
        //hashTable.put(null, 120000);
        //hashTable.put(null, 110000);
        try {
            hashTable.put("Diana", 100000);//last one is accepted
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println(hashTable);
        //{Daniel=68000, Emily=100000, Aeron=78000, Bella=55000}
        //Does NOT accept null key or value, random order

/*
pair: name & salary
Daniel=95000
Emily=100000
Bella=85000



 */







    }
}
