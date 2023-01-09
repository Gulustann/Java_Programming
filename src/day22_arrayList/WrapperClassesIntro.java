package day22_arrayList;

public class WrapperClassesIntro {
    public static void main(String[] args) {
       String str = "Java";

       int a1=10; //not supported in Collection and Map Data Structure, so converted wrapper class object as:
       Integer a2=10; //supported in Collection and Map Data Structure, Wrapper class object

        System.out.println("_______________________________________________");

        int b1 = 100;
        Integer b2= b1; //Autoboxing - converted to wrapper class object, so that can be used in data structures
                        // other than array

        //Long b3=b1; //error, not same data type
        //Double b4 = b1; //error
        double c1 = b1; //implicitly casted
        long c2= b1;

        char ch='A';
        Character ch2 = ch;  //Autoboxing

        double d1 = 5.5;
        Double d2=d1; //Autoboxing
        System.out.println("____________________UNBOXING___________________________");

        Integer n1=20;
        int n2=n1; //UNBOXING
       // long n3=n1; //even tough no error, not best practice, use its own data type
       // double n4=n1;//even tough no error, not best practice, use its own data type

        Character e1= 'Z';
        char e2=e1; //unboxing

       // int e3=e1;
        //long e4=e1;






    }
}
