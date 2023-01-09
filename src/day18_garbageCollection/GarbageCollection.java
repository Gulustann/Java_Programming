package day18_garbageCollection;

import day17_customClassIntro.Dog;

public class GarbageCollection {
    public static void main(String[] args) {
      String s1= "Java";
      s1= null; //no memory for null - null means no object created. "Java" now eligible for garbage collection
        System.out.println(s1);
        //System.out.println(s1.toUpperCase());//Null pointer exception
        //System.out.println(s1.replace(null, "Python"));//Null pointer exception

        System.out.println("___________________________________________");
String a=""; //An object
String b= null; //NOT an object, does not exist

        System.out.println("___________________________________________");

        String str1= "Python";
        str1= "CYDEO"; //now "Python" eligible for garbage collection

        System.out.println(str1);
        System.out.println("___________________________________________");

        Dog dog1= new Dog();
        dog1.setInfo("Loki", "Chow chow", "Medium", 'M', 3, "Black");

        Dog dog2= new Dog();
        dog2.setInfo("Chuck", "Bulldog", "Small", 'F', 5, "White");

        dog1= dog2; //original dog1 info goes to garbage collector



        System.out.println(dog1);
        System.out.println(dog2);


    }
}
