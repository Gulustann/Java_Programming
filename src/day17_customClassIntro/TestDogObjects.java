package day17_customClassIntro;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog(); //store info and call it for reuse
        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Gray";

        dog1.eat();

        System.out.println(dog1);
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        dog2.breed = "Golden Retriever";
        dog2.gender = 'F';
        dog2.age = 2;
        dog2.size = "Small";
        dog2.color = "Orange";
        System.out.println(dog2);

        Dog dog3=new Dog();

        dog3.setInfo("Loki", "Chow chow", "Medium", 'M', 3, "White" );

    }
}
