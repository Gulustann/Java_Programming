package day37_exceptions;

public class Pizza {
    private char size;
    private int numberOfCheeseToppings, numberOfPepperoniToppings;

    public char getSize() {
        return size;
    }

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public double calcCost(){
        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseToppings + numberOfPepperoniToppings);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseToppings + numberOfPepperoniToppings);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseToppings + numberOfPepperoniToppings);
                break;

            default:
                System.err.println("Invalid size: "+size);

        }

        return totalPrice;
    }
    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseToppings +
                ", numberOfPepperoniTopping=" + numberOfPepperoniToppings +
                ", total price=" + calcCost() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if( !(obj instanceof Pizza )){ // if the specified object is not pizza
            System.err.println("Invalid object: "+obj);
            System.exit(1);
        }

        Pizza pizza = (Pizza)obj; //down casting assigned to pizza variable for multiple use

        if(size ==   pizza.getSize()   ){
            if( numberOfPepperoniToppings == pizza.getNumberOfPepperoniToppings()){
                return true;
            }
        }

        return false;
    }
//If we do not change implementation of equals method, original one will be executed and it gives false when parameters are same


    /*
    1. Create a class named Pizza
			variables:
				size (char), numberOfCheeseTopping, numberOfPepperoniTopping

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				calcCost(): returns the total cost of the pizza

			Override toString method to print Pizza object info when the object is passed in the print statement

			Override equals method that returns true if the pizza object is equal to the specified pizza object

     */
}
