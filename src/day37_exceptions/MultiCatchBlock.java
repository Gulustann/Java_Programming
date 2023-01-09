package day37_exceptions;

import day35_polymorphisim.transportationTask.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {
        System.out.println("Prgram1 started");
        Car car =null;

        try {
            car.drive();//NullPointerException
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second Catch Block: ClassCastException");
            e.printStackTrace();
        }catch (NullPointerException e){//This cacth block is executed
            System.out.println("Third catch block: NullPointerException");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Forth Catch Block: IndexOutOfBond");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth Catch Block: RunTimeException - Parent of all unchecked exceptions");
            e.printStackTrace();
        }

        System.out.println("Program1 ended");


    }


}
