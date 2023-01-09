package utilities;
import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;//imports everything both instances and statics variables and method
public class Test {
    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("_______________________");

        System.out.println( AccessModifiers.publicData);
       // System.out.println(AccessModifiers.protectedData);//protected not always accessible in different packages
       // System.out.println(AccessModifiers.defaultData);//default IS NOT accessible in different package
//System.out.println(AccessModifiers.privatData);//not accessible outside of the class even-tough in the same package

        new AccessModifiers(); //public constructor can be accessed from different pacages

        AccessModifiers.publicMethod();
       // AccessModifiers.protectedMethod();//Not accessible method
        //AccessModifiers.defaultMethod();//Not accessible method
       // AccessModifiers.privateMethod();//Not accessible method


    }
}
