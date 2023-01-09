package day31_InheritanceOverRiding.shape;

public class TestShapeObject {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square);
        square.draw();

        System.out.println("____________________________________________");

        Circle circle=new Circle(3.5);
        System.out.println(circle);
        circle.draw();
        System.out.println("____________________________________________");

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println(rectangle);
        rectangle.draw();
        System.out.println("____________________________________________");

Triangle triangle = new Triangle(5,5,5);
        System.out.println(triangle);

    }
}
