package day13_CustomMethodContinue;

public class PracticeTasks {
    public static void main(String[] args) {
        System.out.println(isOdd(53));
        System.out.println(isEven(66));
        int num = 200;
        if(isEven(num)){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }

    }

    public static boolean isOdd(int num) {
        //return (num % 2 != 0) ? true : false;
        if(num%2 !=0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isEven(int num) {
        return !isOdd(num);
    }

public static int maxNumber(int n1, int n2){
 // return (n1>n2)? n1 : n2;
   if(n1>n2){
       return n1;
   }     //else block is not needed bc n1 is not greater, then it will execute second return block n2. See below
      return n2;
}


}
