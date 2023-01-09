package day25_constructor;

public class ConstructorsIntro {

    public ConstructorsIntro(){
        System.out.println("Object is created by using no argument constructor");
    }
public ConstructorsIntro(int a){ //no-argument constructor, same name as class
    System.out.println("Object is created by using int argument constructor");
}


    public static void main(String[] args) {
       ConstructorsIntro obj1 =  new ConstructorsIntro(10); //no-argument constructor, same name as class

        ConstructorsIntro obj2 =  new ConstructorsIntro(10); //each object has its own memory

        ConstructorsIntro obj3 =  new ConstructorsIntro();






    }
}
