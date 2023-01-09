package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khasayar");
        map.put("D02", "Abdullah");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println(map.size());
        System.out.println(map);
        //{A02=Khasayar, A04=Tatiana, A05=Tatiana, A06=Tatiana, A07=Tatiana, B03=Nora, C02=Josh, D02=Abdullah}

        System.out.println(map.get("A04"));

        map.put("A04", "Lucy");
        System.out.println(map);
        //{A02=Khasayar, A04=Lucy, A05=Tatiana, A06=Tatiana, A07=Tatiana, B03=Nora, C02=Josh, D02=Abdullah}

        map.put("A06", "Madiyar");

        System.out.println(map.get("B03"));

        map.replace("CO2", "Aseel");
        map.replace("A07", "Marika");
        System.out.println(map);//{A02=Khasayar, A04=Lucy, A05=Tatiana, A06=Madiyar, A07=Marika, B03=Nora, C02=Josh, D02=Abdullah}

        map.remove("A05");
        System.out.println(map);//{A02=Khasayar, A04=Lucy, A06=Madiyar, A07=Marika, B03=Nora, C02=Josh, D02=Abdullah}

        System.out.println(map.containsKey("B03"));//true
        System.out.println(map.containsKey("B98"));//false

        System.out.println(map.containsValue("Lucy"));//true
        System.out.println(map.containsValue("Muhtar"));//false

        System.out.println(map.isEmpty());//false
        System.out.println(map.equals(map));//true

    //map.clear(); //set the size zero

    }
}
/*
pair: id-name
 */