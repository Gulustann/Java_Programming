package day31_InheritanceOverRiding.shape;

public class Triangle extends Shape{
    private double side1, side2_base, side3;
    private double height;

    public Triangle(double side1, double side2_base, double side3) {
        setSide1(side1);
        setSide2_base(side2_base);
        setSide3(side3);
        setHeight(height);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2_base() {
        return side2_base;
    }

    public void setSide2_base(double side2_base) {
        this.side2_base = side2_base;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        height=area()/side2_base * 2;
        this.height = height;
    }


    public double area() {
        return height* side2_base /2;
    }


    public double perimeter() {
        return side1+ side2_base +side3;
    }

    public void draw() {
        super.draw();
        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   *   *");
        System.out.println("  *     *");
        System.out.println(" *       *");
        System.out.println("* * * * * *");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", side1='" + side1 + '\'' +
                ", side2='" + side2_base + '\'' +
                ", side3='" + side3 + '\'' +
                ", height='" + height + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}
