package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {
        String[] group1 = {"James", "Daniel", "Sare", "Almina"};
        String[] group2 = {"Mehmet", "Zennure", "Saliha"};
        String[] group3 = {"Beyonce", "Mike", "Case", "Olivia", "Ayse"};
        String[] group4 = {"Fatma", "Aysun"};

        String[][] groups = {group1, group2, group3, group4};

        for (String[] each1DArray : groups) {
            System.out.println(Arrays.toString(each1DArray)); //each 1D array printed in separate line
            //[James, Daniel, Sare, Almina]
            //[Mehmet, Zennure, Saliha]
            for (String eachElement : each1DArray) { //each element from each group printed on separate lines
                System.out.println(eachElement); //James
                //Daniel
                //Sare
                //Almina
            }
        }

        System.out.println("______________________________________________________");
        for (int i = groups.length - 1; i >= 0; i--) { //prints each group in reversed order
            String[] eachGroup = groups[i]; //
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }

        System.out.println("______________________________________________________");

        System.out.println(Arrays.deepToString(groups));










    }
}
