package day36_polymorphisim;

public class Circle {
    private double radius;
    private final static double PI= 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius*radius*PI;
    }

    public double perimeter(){
        return  radius*2*PI;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Circle)){//if the specified object is not circle, then we should not compare them
            System.err.println("Invalid Object");
            System.exit(1);
        }
        if(radius == ((Circle) obj).radius){
            return true;
        }
        return false;
    }





}
