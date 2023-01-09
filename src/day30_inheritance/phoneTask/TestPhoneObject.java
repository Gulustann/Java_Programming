package day30_inheritance.phoneTask;

public class TestPhoneObject {
    public static void main(String[] args) {
        IPhone iphone = new IPhone("iPhone 12", "Large", "Black", 1000.5);

        Samsung samsung = new Samsung("Galaxy S22", "Medium", "White", 1100);

        Nokia nokia = new Nokia("Brick", "Small", "Pink", 50);

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);


        iphone.text(1213456789);
        samsung.text(123456789);
        nokia.text(123456789);

        iphone.faceTime(122345678);
        //samsung.faceTime(11345678);

        samsung.freeze();
        // iphone.freeze();
        // nokia.freeze();

        nokia.selfDefence();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


    }
}
