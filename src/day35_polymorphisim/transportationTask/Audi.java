package day35_polymorphisim.transportationTask;

public class Audi extends Car implements AutoPark{


    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void transportPeople() {
        System.out.println(getMake()+" "+getModel());
    }

    @Override
    public void start() {

    }

    @Override
    public void autoPark() {

    }
}
