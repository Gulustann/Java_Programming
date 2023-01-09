package day08_ternary_switch;

public class IfStatementAndTernariesPractice {
    public static void main(String[] args) {
      int score = 185;
      String result ="";

      if(score>=1 && score<=100){
           result = (score>=90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)? "D" : "F";
        }else{
          result ="Invalid Score";
        }

        System.out.println(result);
        System.out.println("_______________________________________________");
String res = (score>=1 && score<=100)?
        (score>=90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)? "D" : "F"
        :"Invalid";
        System.out.println(res);












    }
}
