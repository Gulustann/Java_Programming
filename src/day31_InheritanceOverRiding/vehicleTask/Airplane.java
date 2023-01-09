package day31_InheritanceOverRiding.vehicleTask;

public class Airplane extends Vehicle{


    public Airplane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void fly(){
        System.out.println(getBrand()+" "+getModel()+" is flying");
    }
}
/*
Create a sub class of Vehicle named AirPlane

			Extra methods:
				fly()
 */