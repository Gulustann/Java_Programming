package day09_SwitchAndScanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 5;
        String result = "";
 //NOTE: Float, double, long and boolean NOT ACCEPTED in switch!!!
        // case value MUST MATCH w/switch expression data type. Like int and int, or char and char
        //break: for exiting switch
        //default blocks executed if no match in case expressions.
        //Order can be changed. doesn't matter. Break and default are NOT mandatory.
        // or logic we can use it in switch by declaring the case blocks back to back
        switch (month) { //2 ways for logical or ||. 1)put case 1 : Case2 ... or back to back
            case 2:
                result = "28 days";
                break;

            case 1: case 3:  case 5:  case 7: case 8: case 10: case 12: // first way for logical or (||)
                result = "31 days";
                break;


            case 4: // 2nd way for logical or (||)
            case 6:
            case 9:
            case 11:
                result="30 days";
                break;

            default:
                result= "Invalid";
        }

        /*
        Create a class named NumberOfDays. An integer variable named month is given
        Use switch statement to write a program that can find the number of days in the given number of month.

                EX:
                    month = 5

                output:
                    31 days

                (Assume that February has 28 days)

            Hints:
            	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11

         */
    }
}
