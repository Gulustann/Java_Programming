package day08_ternary_switch;

public class TernariesIntro2 {
    public static void main(String[] args) {

int num = 100;
/*String result ="";
       if(num>0){
            result="Positive";
        }else if(num<0){
            result="Negative";
        }else{
            result="Zero";
        }
        System.out.println(result); */

String result = (num>0) ? "Positive":(num<0) ? "Negative" : "Zero";
//          only else if block has unhappy face above :(
        System.out.println(result);
        System.out.println("___________________________________________________");

int number = 7;
String day ="";

/*if(number==1){
    day="Mon";
}else if(number==2){
            day="Tue";
}else if (number ==3){
    day="Wed";
}else if (number==4){
    day="Thu";
}
else if (number ==5){
    day="Fri";
}else if(number==6){
    day="Sat";
}else {
    day="Sun";
}*/

  //1 if block +5 else if block + else block

String days = (number==1)? "Mon" :(number==2)? "Tue" : (number==3) ? "Wed" : (number==4)? "Thu" :(number==5)?"Fri"
            :(number==6)? "Sat" : "Sun";

        System.out.println(days);
int numb =12; // 1~12

        String month = (num==1)? "Jan" :(numb==2)? "Feb" :(numb==3)? "Mar" :(numb==4)? "Apr" :(numb==5)? "May"
                :(numb==6)? "Jun" :(numb==7)? "Jul" :(numb==8)? "Aug" :(numb==9)? "Sep" :(numb==10)? "Oct" :(numb==11)?
                "Nov" :"Dec";


        System.out.println(month);

    }
}
