package day38_exceptionHandling;

public class BreakTimeException extends RuntimeException{//unchecked exception

    public BreakTimeException(){//default constructor
        super("It's break time");
    }

    public BreakTimeException(String message){//constructor with String argument
        super(message);
    }
}
