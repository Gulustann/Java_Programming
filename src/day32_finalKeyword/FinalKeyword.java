package day32_finalKeyword;

import java.time.LocalDate;

class Student {//extends String {//with finale keyword class is now immutable and can never be inherited
    //String is a final class in java.lang package so cannot be parent class

    public final void language(){
        System.out.println("Java Programming");
    }

}




public final class FinalKeyword extends Student{//cannot be parent if class has final keyword
   /* public void language(){ //==>Error after final keyword
        System.out.println("Python Programming");
        Final method can never be overridden
    }*/

/*public final FinalKeyword(){//ERROR - final keywords cannot be applied to constructor

}*/

    public static void main(String[] args) {
     char gender = 'M';

        System.out.println(gender); //M

        gender='F';

        System.out.println(gender);//F

        final int number =10;
       // number=20; //ERROR cannot re-assign



        final LocalDate DOB=LocalDate.now();
        System.out.println(DOB); //2022-12-12-->Today's date. Almis birthday:))))

     //   DOB=DOB.plusYears(1);
      //  System.out.println(DOB);//2023-12-12

        System.out.println("_____________________________________________________");

        //new FinalKeyword().language();//Python Programming
        new Student().language();//Java Programming
        System.out.println("_____________________________________________________");
        final String name="James";//if we add final keyword, the James never be eligible garbage collection, cannot be changed
       // name=null; //==> now James is eligible for garbage collection

        //name ="Daniel"; //after reassigning also James eligible for garbage collection






    }
}
