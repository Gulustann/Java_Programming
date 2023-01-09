package day38_exceptionHandling;

import utilities.Library;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args){
        System.out.println("Hello Cydeo");

        //Thread.sleep(3500);
        Library.sleep(3.5);//exception handled  permenantly in Library sleep method by creating try&catch block

        System.out.println("How are you today?");

        System.out.println("___________________________________________________________");

        if(LocalTime.now().equals(LocalTime.of(22,0))){
            throw new BreakTimeException();
        }

        throw new BreakTimeException();//It's break time==>default constructor
        //throw new BreakTimeException("It's time to go home");
    }
}
