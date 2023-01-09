package day27_accessModifiers;

import java.util.Arrays;

public class TestCircleObject {
    public static void main(String[] args) {
    Circle c1 = new Circle(5);
    Circle c2 = new Circle(4);
    Circle c3 = new Circle(1);
    Circle c4 = new Circle(2);

    Circle[] circles = {c1,c2,c3,c4};

        for (Circle eachCircle : circles) {
            System.out.print(eachCircle.radius +" : "+ eachCircle.calcArea()+", ");
        }
        System.out.println();

        System.out.println(Circle.pi); //static called by class name

        System.out.println(c1.calcArea()); //instance called by object

        System.out.println(c1);
        System.out.println(Arrays.toString(circles));








    }
}
