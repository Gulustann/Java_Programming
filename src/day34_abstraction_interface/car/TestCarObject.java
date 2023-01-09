package day34_abstraction_interface.car;

public class TestCarObject {
    public static void main(String[] args) {

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("____________________________________________________");

        honda.stop(); //final stop method
        audi.stop();
        tesla.stop();

        System.out.println("____________________________________________________");

        honda.start(); //abstract start method
        audi.start();
        tesla.start();

        System.out.println("____________________________________________________");

        audi.autoPark();
        tesla.autoPilot();

    }
}
