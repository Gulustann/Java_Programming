package day36_polymorphisim;

public class Square {
    private double side;

    public Square(double side) {
       setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) {

        if( !(obj instanceof Square) ){
            System.err.println("Invalid Object, Object must be square");
            System.exit(1);
        }


        if(side ==  ( (Square)obj ).side ){
            return true;
        }

        return false;
    }

}
