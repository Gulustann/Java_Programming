package day34_abstraction_interface.animalTask;

public interface Playable {
    boolean isFriendly = true; //only static and final variable allowed in interface. So default value and given implicitly
    //access modifier is by default public, given implicitly

/*
    public static void main(String[] args) {
        System.out.println(isFriendly); //that means it is static - under static method w/o error
       // isFriendly=false; //Error==> proves it is final

    }

    public default void method1(){//interface-->cannot give instance method but accept default method
//public ==> optional to write bc by default it is public
    }*/

    //public abstract void play(); //by default it is public and abstract so no need to write

    void play(); //abstract and public


}
