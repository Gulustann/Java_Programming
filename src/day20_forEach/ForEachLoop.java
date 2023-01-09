package day20_forEach;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        System.out.println("____________________________________________");
        
        for(int each : number ){ //if number has 5 elements then loop run 5 times,
                                // and order is fixed from index 0 to last index
            System.out.println(each);
        }
        System.out.println("____________________________________________");
        
        
        
    }
}
