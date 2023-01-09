package day42_MapsContinue;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice5 {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");

        map.forEach( (k, v) -> { System.out.println(k +" : "+ v); } );
/*
A02 : Khashayar
A03 : Tatiana
B03 : Nora
C02 : Josh
D02 : Abidullah

 */



    }
}
