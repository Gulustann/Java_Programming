package day26_statics;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
       // this(a); //ERROR - constructor cannot call itself bc constructor with int arg contains default const
        System.out.println("Default");
    }
    public ConstructorCalls2(int a){//default, int arg
        this(); //calling default constructor w/o any arguments
        System.out.println("int arg");
    }
    public ConstructorCalls2(String a){//default, int arg, string arg
        this(10);
        System.out.println("String arg");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2(); //default cons executed
        ConstructorCalls2 obj2 = new ConstructorCalls2(10);
        //second cons contains first constructor so bot first and second cons are executed

        System.out.println("_________________________________________________");
        ConstructorCalls2 obj3 = new ConstructorCalls2("Java");
        //String constructor linked to second cons and second cons linked to first one (chain rules)
        //so it prints first second and third constructor (default, int arg, string arg)









    }











}
