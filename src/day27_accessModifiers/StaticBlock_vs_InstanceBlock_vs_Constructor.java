package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {
   public  StaticBlock_vs_InstanceBlock_vs_Constructor(){ //constructor
       System.out.println("Constructor");
   }
    { //instance block
        System.out.println("Instance Block");
    }
    static{
        System.out.println("Static Block"); //First executed, ALWAYS
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();
        new StaticBlock_vs_InstanceBlock_vs_Constructor();
/*
Static Block
Main method
Instance Block
Constructor
Instance Block
Constructor

 */




    }



}
