package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {
        //pre increment/decrement


        int x = 10;
        System.out.println(++x); //11, after this line if you use x w/o ++ the value is changed to 11
        System.out.println(x);

        int y = 100;
        System.out.println(--y);// 99, after this statement y = 99 in memory
        System.out.println(y); //99

        System.out.println("__________________________________");
int a = 50;
        System.out.println(a++); //this is post increment/decrement. First uses original value, 50. Next time uses +/- 1 value
        System.out.println(a); //This is second time and it increased by 1 after using first original one

        int b = 25;
        System.out.println(b--); //b=25 (post decrement, original value doesn't change at first but the second time)
        System.out.println(b); //b=24


        int n = 30;
        int m = n++; // m=30, n=31
        System.out.println("n = " + n);
        System.out.println("m = " + m);

int z = 60;
int q = z--; //q=60, z=59
        System.out.println("z = " + z);
        System.out.println("q = " + q);










    }
}
