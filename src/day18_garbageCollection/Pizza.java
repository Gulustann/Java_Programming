package day18_garbageCollection;
public class Pizza {

    public char size;//instance variable- can create multiple separate copies
    public int numberOfCheeseToppings, OfPepperoniTopping;

    //calculate the total price of the pizza, returns it as double
    public double calcCost(){
        double totalPrice = 0;

        switch(size){
            case 's': case'S':
                totalPrice =10+ 2*(numberOfCheeseToppings+OfPepperoniTopping);
                break;
            case 'm': case 'M':
                totalPrice =12+ 2*(numberOfCheeseToppings+OfPepperoniTopping);
                break;
            case 'l': case 'L':
                totalPrice =14+ 2*(numberOfCheeseToppings+OfPepperoniTopping);
                break;
            default:
                System.err.println("Invalid size" + size);
        }

        return totalPrice;
    }

    public void setInfo(char size, int numberOfCheeseToppings, int OfPepperoniTopping){
       this.size=size;
       this.numberOfCheeseToppings=numberOfCheeseToppings;
       this.OfPepperoniTopping= OfPepperoniTopping;
    }

//displays/prints as string
   public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", OfPepperoniTopping=" + OfPepperoniTopping +
                ", Total Price=" + calcCost() +
                '}';
    }

/*
                1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping

                 */

}
