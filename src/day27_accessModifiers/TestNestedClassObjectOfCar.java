package day27_accessModifiers;

public class TestNestedClassObjectOfCar {
    public static void main(String[] args) {
    Car obj1 = new Car(); //Car object
    obj1.new CarEngine();   //CarEngine object, cannot be used w/o obj1

        new Car.StaticInnerClass(); //once inner class is static, no need to obj to call the inner class
Car.CarEngine obj2 = obj1.new CarEngine(); //car engine obj, non static class

Car.StaticInnerClass obj3 = new Car.StaticInnerClass(); //static class


    }
}
