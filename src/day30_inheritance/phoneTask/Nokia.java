package day30_inheritance.phoneTask;

public class Nokia extends Phone{
    public Nokia(String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }
    public void selfDefence(){
        System.out.println(getBrand() + " is a very useful self defence material.");
    }
}
