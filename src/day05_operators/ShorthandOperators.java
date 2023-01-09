package day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {
    int a = 20;
        System.out.println(a); // a=20
        System.out.println(a); //a=20

        a = 40;
        System.out.println(a); //a=40 after update

        a = 90;
        System.out.println(a); //a=90 - assignment operator

        System.out.println("_________________________________");

        double balance = 100;
        balance += 1000;
        System.out.println("balance = " + balance); // balance = 100 + 1000 = 1100

        balance +=500;
        System.out.println("balance = " + balance); //balance = 1600

        balance +=10000;
        System.out.println(balance);

        balance -=1000;
        System.out.println(balance);


        balance -=5000;
        System.out.println(balance);

        System.out.println("_______________________________");

        double salary = 45000;
        salary *=2; //salary=45000*2=90000
        System.out.println("salary = " + salary);

        salary *=3;
        System.out.println("salary = " + salary);

        double eth = 4;
        eth *=250;
        System.out.println("eth = " + eth);

        eth /=2;
        System.out.println("eth = " + eth);

        System.out.println("salary = " + salary);
        salary /=2;
        System.out.println("salary = " + salary);

        int b = 39;
        b %=7;  // b = 39 % 7 --> 4
        System.out.println(b); // 4










    }
}
