package day30_inheritance.phoneTask;

public class IPhone extends Phone{ //IPhone is a phone
    public static boolean hasApplePay=true;

    public IPhone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);//constructor call, have to fallow constructor call rules
    }


    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is face timing with " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(getModel() + " is face timing with " + email);
    }







}
