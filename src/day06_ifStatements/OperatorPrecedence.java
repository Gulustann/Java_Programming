package day06_ifStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(5+2*3); //11 like math, first *, then +

        System.out.println(7+3-2/2); // division calculated first
        //                  7+3-1 = 9

        System.out.println(-5 + 2); //-3, math like

        System.out.println(10 > 9 == 8 < 7);  //< and > executed first, than ==
        //                  true       false ===> false

        System.out.println(10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A');
        //                  true ==  false &&  "Java" == "Python" || a=A
        //                      false       &&        false       ||  false
        //                                false                   || false
        //                                                     false

        System.out.println( 100>=20 && 40*2 > 60); // * has higher order than others
        //                   100>=20&& 80>60 >= and >, < has higher order
        //                     true &&  true
        //                        true

        int a =20;
        a +=10 + 2 *3; // a += 16 ===> a = 20+16 = 36

        System.out.println(a);  //36











    }
}
