package day04_concatenation;

public class PrimativeTypeCasting {
    public static void main(String[] args) {

        //implicit type casting -->smaller primitive type to large

        byte a = 15;
       short b = a;
       // short b = (short)a;

        System.out.println(b);

        int c = a;

        long d = 3000L;
        float f = d; //implicit casting
        System.out.println(f);

       //______________Explicit Casting______________

        int x = 100;
        byte y = (byte)x; //manually type (byte)x; not only x;
        float z = 20.8f;
        short q =(short)z; //z = 20.8 since short is integar data it only prints 20.

        System.out.println(q);

        double n1 = 2.1;
        byte n2 = (byte) n1; // n1=2.5;

        System.out.println(n2);
        System.out.println("____________________________________________");


        int num = 500;
        byte result = (byte) num; //explicit casting

        System.out.println(result);//  out of byte range result is -12

        int r = 50000;
        short t = (short) r;

        System.out.println(t);

        double u = 3000.5;
        int p = (int) u; //explicit casting

        System.out.println(p); //int prints integer number before dot

        int o = 100;
        double d1 = o;
        System.out.println(d1); // double is for decimals and print number as decimal, 100.0

































    }






}
