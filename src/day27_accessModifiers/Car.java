package day27_accessModifiers;

public class Car {

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels=4;

    public class CarEngine{ // class under class (nested class / inner class), can reach all memebrs of outer class w/o calling
        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }
    }

    public static class StaticInnerClass{ //Static class only accepts static members
        public void method(){
           // System.out.println(make); //ERROR only accepts static members
        }
    }

}
