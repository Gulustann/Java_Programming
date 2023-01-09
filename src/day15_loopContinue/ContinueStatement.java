package day15_loopContinue;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {

            if(i==4) {
                continue;
            }
                System.out.println(i);
        }
        System.out.println("_________________________________________________________________");
        for (int i = 10; i < 21; i++) {
            if(i%2==0){ //if "i" is even skip the current iteration
                continue;
            }
            System.out.println(i);
        }
        System.out.println("_________________________________________________________________");
        for(char i ='A'; i<='G'; i++){
            if(i=='B'|| i=='E'){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("_________________________________________________________________");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }





    }
}
