package day13_CustomMethodContinue;

public class ReturnMethodIntro {
    public static void main(String[] args) {
      // int total= sum(20, 40); //error bc sum method is void method and void method does not return any data
int total =addition(10, 20);
        System.out.println("_______________________");
square(10);
        System.out.println(square(10));

        System.out.println("____________________________");
        System.out.println(cube(5));
        cube(10);
    }
   /* public static void sum(int n1, int n2){
        int result = n1+n2;
        System.out.println(result);
    } */

public static int addition(int num1, int num2){
    int result = num1+ num2;
    return result;
}

public static int square (int num){
    int square = num*num;
    System.out.println(square);
    return square;
}
public static int cube (int num){
    int cube = square(num)*num; // or =num*num*num
    return  cube;
}


}
