package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls() {
        //this();//ERRORR- Constructor cannot call itself in its body
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a) {
        this();
        System.out.println("Constructor with an argument");
        // this();//cannot call constructor here, it has to be first step in another constructor to call a constructor
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }
    public ConstructorCalls(String c){
        this(2.5);
       // this(); //ERROR- one constructor cannot call more than one constructor in its body
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        method1();
        System.out.println("________________________");
        method2();

    }

    public static void method1() {
        //ConstructorCalls(); //ERROR- cannot call constructor by its name
        //this(); //ERRORR - constructor can be called only in another constructor, not method
        System.out.println("Method1");
    }

    public static void method2() {
        method1();
        System.out.println("Method2");
    }


}
