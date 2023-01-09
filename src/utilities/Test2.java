package utilities;
import day27_accessModifiers.Data;//regular import -imports everything instance and static
import static  day27_accessModifiers.Data.*;//imports all static members (variables and methods)
//import static  day27_accessModifiers.Data.d;
//import static  day27_accessModifiers.Data.method3;
public class Test2 {
    public static void main(String[] args) {
        //System.out.println(Data.d);

        System.out.println(d);
        method3();

        System.out.println(e);
        method4();



    }
}
