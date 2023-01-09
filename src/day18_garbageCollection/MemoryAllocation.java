package day18_garbageCollection;

import day17_customClassIntro.Employee;

class Car{
        public String brand;
        public String model;
        public String color;
        public int year;




    }
    public class MemoryAllocation{
        public static void main(String[] args) {

         int a= 100;   //local variable - stored in stack memory

            Car car = new Car();
            //stack     heap (outside String pool)
            System.out.println("__________________________________________");
            Employee employee1 = new Employee();
            Employee employee2= employee1; //1 object(in heap) and two variables (in stack)
            employee1.setInfo("Gulustan", 35, 'f', "Java Developer", 150000, "A123");
            System.out.println(employee1);
            System.out.println(employee2);

            System.out.println("__________________________________________");
String batch1= new String("Java"); //one object in heap- 3 reference variable in stack. "Java" in heap - String pool
String batch2= batch1;
String batch3= batch1;


        }
public static void method1(){ //in stack
          int b= 200;  //stored in stack memory, it is primative, not an object
}

public static void method2(){ //in stack
           String c="Hello world";  //referencing to an object (String object from String class)
        //   stack      heap (String pool)

    String d = new String("Hello World");
    //d in stack     heap (Outside the String pool)
}



    }




