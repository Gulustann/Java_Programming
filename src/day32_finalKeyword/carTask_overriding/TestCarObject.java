package day32_finalKeyword.carTask_overriding;

public class TestCarObject {
    public static void main(String[] args) {
       Toyota toyota = new Toyota("Camry", "Blue", 2020, 25000);
       Honda honda = new Honda("Accord", "Gray", 2019, 24000);
       Audi audi = new Audi("Q6", "Silver", 2021, 50000);
       BMW bmw = new BMW("X6", "Black", 2017, 45000);
       Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("___________________________________________");

        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();

        System.out.println("___________________________________________");

        //tesla.setPrice(45000); //Invalid price for Tesla car: 45000.0

        //tesla.setModel("Model H");//Invalid Tesla Model: Model H









    }
}
