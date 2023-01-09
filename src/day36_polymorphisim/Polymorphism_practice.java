package day36_polymorphisim;

import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day30_inheritance.phoneTask.Samsung;

public class Polymorphism_practice {
    public static void main(String[] args) {


    Phone[] phones = {
            new IPhone("Iphone 11 Pro", "Large", "Black", 900),
            new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
            new IPhone("Iphone 9", "Medium", "Gold", 800),
            new Samsung("Galaxy S19", "Medium", "Pink", 700),
            new Samsung("Galaxy S20", "Large", "Silver", 850),
            new Samsung("Galaxy S21", "Large", "Silver", 950),
            new Nokia("XR20", "Small", "Pink", 350),
            new Nokia("G10", "Medium", "Pink", 99),
            new Nokia("G50", "Large", "Silver", 250),
            new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
            new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
            new Samsung("Galaxy S18", "Medium", "White", 750),
            new Samsung("Galaxy S17", "Large", "Silver", 650),
            new Nokia("G10", "Medium", "Black", 99),
            new IPhone("Iphone 6", "Small", "Gold", 400),
            new IPhone("Iphone 7", "Small", "White", 500)
    };

        for (Phone each : phones) {
            System.out.println(each.getModel()+" - "+ each.getColor()+" - "+ each.getPrice());
        }
        System.out.println("_____________________________________________________");

int countIphone=0;
int countSamsung=0;
        for (Phone each : phones) {
            if(each instanceof IPhone){
                countIphone++;
            }
            if(each instanceof Samsung){
                countSamsung++;
            }
        }
        System.out.println(countIphone);
        System.out.println(countSamsung);
        System.out.println("_____________________________________________________");

        for (Phone each : phones) {
            if((each instanceof IPhone || each instanceof Samsung )){
                if(each.getPrice()>=700){
                    System.out.println(each.getModel());
                }
            }
        }



    /*
      1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater


     */
    }
}
