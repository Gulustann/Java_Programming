package day26_statics;

public class TestIphoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iPhone12", "Black", 1000);

        System.out.println(iphone.model);
        System.out.println(iphone.color);
        System.out.println(iphone.price);

        iphone.printPhoneInfo();

        /*System.out.println(iphone.brand);//ERROR - do not call static members through instance variable
        System.out.println(iphone.OS);
        iphone.printPhoneInfo();*/

        System.out.println(Iphone.brand);//call static object and methods by calling class name(Iphone)
        System.out.println(Iphone.OS);
        Iphone.printOS();


    }
}
