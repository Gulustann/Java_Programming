package day26_statics;

public class Iphone {
    public static String brand="Apple"; //static public String brand is OK, but not best practice
    //static: "Apple" is the brand for all iPhone objects
    public String model, color; //instance variable: model and color is different for iphone
    public double price; //instance variable: price is different for all iPhone objects
    public static String OS = "iOS"; //static: OS is same for all iPhone objects
    public static String madeIn = "Chine"; //static: all iPhones made in China
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix= true;

    /*public static void printPhoneInfo(){ //static only accepts static variable
        System.out.println("Model: " + model);
    }*/
    public void printPhoneInfo(){//instance methods accepts both static and instance variables
        System.out.println("Brand: " + brand +"Model: " + model +"\nColor: " + color + "\nPrice: " + price);
    }

    public static void printOS(){//static method only accepts static variable, not instance variable
        System.out.println("OS is: " + OS);
    }

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Attributes:
    brand, model, color, price, Operating System (OS), madeIn, hasBattery. hasTouchScreen, isExpensiveToFix


 */