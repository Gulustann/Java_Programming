package day36_polymorphisim;

public class TestEqualsMethod {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(15);

        System.out.println(c1 == c2); // == going to compare memory allocation==>FALSE

        System.out.println(c1.equals(c2));//True
        System.out.println(c1.equals(c3));//False

        System.out.println("______________________________________________________");

        IPhone iphone1 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);

        IPhone iphone2 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);


        System.out.println( iphone1.equals(iphone2) );





    }
}
