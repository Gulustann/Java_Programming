package day27_accessModifiers;

import day25_constructor.ConstructorsIntro;

public class Test {
    public static void main(String[] args) {
        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);


        System.out.println("_____________________________________");


        System.out.println(AccessModifiers.publicData); //public accessible within same package
        System.out.println(AccessModifiers.protectedData); ////protected accessible within same package
        System.out.println(AccessModifiers.defaultData);//default accessible within same package
        //System.out.println(AccessModifiers.privatData);//not accessible outside of the class even-tough in the same package

        new AccessModifiers(); //constructor public accessible

        AccessModifiers.publicMethod();
         AccessModifiers.protectedMethod();//accessible method
        AccessModifiers.defaultMethod();//accessible method
        //AccessModifiers.privateMethod();//Not accessible method
    }
}
