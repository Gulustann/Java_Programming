package day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {
        System.out.println("Program started");

        String str ="Java";

        try{
            str.charAt(100);
            System.out.println(9/0);
        }catch (NullPointerException e){
            System.out.println("NullPointer exception is caught");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
            e.printStackTrace();
        } finally {
            System.out.println("Finally block");//finally block executed regardless of exception handled or not handled
        }
        System.out.println("Program ended");

    }
}
