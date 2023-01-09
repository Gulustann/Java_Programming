package day31_InheritanceOverRiding;

class A{
    public int a=100;

}

public class FieldHiding extends A {
    public int a= 300; //parent class a hidden, not inherited to child class

    public static void main(String[] args) {
        System.out.println(new FieldHiding().a);
    }
}
