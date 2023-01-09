package day04_concatenation;

public class ShippingAddress {
    /*
    2. Declarethefollowingvariables:
1. name
2. buildingNumber 3. streetName
4. city
5. state
6. zipCode
3. Useconcatenationtoprintthefullshippingaddress Ex:
Your Shipping address is:
Aaron Kissinger 13621A Legacy Circle Fairfax, VA 22030
     */

    public static void main(String[] args) {
        String name = "Aaron Kissinger",
                buildingNumber = "13621A",
                streetName = "Legacy Circle",
                cityName = "Fairfox",
                state = "VA";

        int zipCode = 22030;


        System.out.println("Your shipping address is:");
        System.out.println("\t" + name);
        System.out.println("\t" + buildingNumber + " " + streetName);
        System.out.println("\t" + cityName + ", " + state + " " + zipCode);

        System.out.println("Your shopping address is:\n\t" + name + "\n\t" + buildingNumber + " " + streetName
        + "\n\t" + cityName + ", " + state + " " + zipCode);










    }
}
