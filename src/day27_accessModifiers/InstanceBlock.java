package day27_accessModifiers;

public class InstanceBlock {

    {
        System.out.println("instance Block");//runs before the constructor
    }

    public InstanceBlock(){
        System.out.println("Constructor");
    }
    public static void main(String[] args){
        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();

/*
instance Block
Constructor
instance Block
Constructor
instance Block
Constructor
 */
    }








}
