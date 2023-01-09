package day16_loopContinue;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean cond = false;

        for (; cond; ) {
            System.out.println("Hello Cydeo-for loop");
        }

        System.out.println("____________________________________________");

while (cond){
    System.out.println("Hello Cydeo-while loop");
}
        System.out.println("____________________________________________");
do{
    System.out.println("Hello Cydeo-Do while loop"); //since boolean is false, only DoWhile loop is executed only once
}while (cond);



    }
}
