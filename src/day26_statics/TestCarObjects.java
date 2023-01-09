package day26_statics;

public class TestCarObjects {
    public static void main(String[] args) {
     Car car1 = new Car("Ford" );
        System.out.println(car1);

        Car car2 = new Car("Audi", "Q4");
        System.out.println(car2);

        Car car3 = new Car("Toyota", "Camry", 2022);
        System.out.println(car3);

        Car car4 = new Car("Honda", "Civic", 2019, 35000);
        System.out.println(car4);

        Car car5 = new Car("Tesla", "S", 2022, 75000, "Purple");
        System.out.println(car5);




    }
}
