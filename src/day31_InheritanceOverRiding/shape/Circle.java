package day31_InheritanceOverRiding.shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {//Since parent class has default constructor, it is called implicitly, it will execute it
       setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*3.14;
    }

    @Override
    public double perimeter() {
        return radius*2* 3.14;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("o");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", radius='" + radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
