package day34_abstraction_interface.car;

public class Honda extends Car{
    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    protected void start() {//access modifier same or more visible compare to parent class
        System.out.println("Twist the ket to ignition to start "+getMake()+" "+getModel());
    }
}
