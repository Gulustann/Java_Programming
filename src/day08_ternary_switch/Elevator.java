package day08_ternary_switch;

public class Elevator {
    public static void main(String[] args) {
        int floor = 0;
        String result = ""; // if "invalid result" assigned to string result then you don't need last else block
// or to optimize result = ""Floor" + floor + is selected. Companies: "; can be written with last else statement

        if (floor >= 1 && floor <= 3) {
            if (floor == 1) result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            else if (floor == 2) result = "Floor 2 selected. Companies: Cydeo, NASA, Intelsat";
            else result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
        } else {
            result = "Invalid floor";
        }
        System.out.println(result);

        System.out.println("______________________________________________");

        String res = "invalid floor";

        if(floor>=1 && floor<=3){
            res="Floor " + floor + " is selected. Companies: ";

        if (floor == 1) res += "Lobby, Verizon, Starbucks";
        else if (floor == 2) res += "Cydeo, NASA, Intelsat";
        else res += "Lyft, BofA, Stake house";
        }
        System.out.println(res);

        /*
        1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"
         */
    }
}
