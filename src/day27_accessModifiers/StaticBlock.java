package day27_accessModifiers;

public class StaticBlock {

    public StaticBlock(){ //constructor
        System.out.println("Constructor");
    }


    public static void main(String[] args) {//main method executed after static block
        System.out.println("Main Method");

        new StaticBlock();//static block executed just once
        new StaticBlock();//after creating StaticBlock constructor, this belongs to constructor now and executed 3 times
        new StaticBlock();
    }

    static{ //static block executed first and just once
        System.out.println("Static Block");//executed/printed first, then main method executed. Runs just once
        //can be before or after main method, doesn't matter but executed first, before main method
    }


}
