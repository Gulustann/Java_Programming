package day28_OOP_Encapsulation;

public class Person {
   public String name;
   public  int age;
   public char gender;
   public String language;
   public static String planet;
   public static boolean isHuman;
   public static boolean hasNose;
   public static int numberOfWings;
   public static int numOfHead;

   static{
       planet="Earth";
       isHuman =true;
       hasNose=true;
       numberOfWings=0;
       numOfHead=1;
   }
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, String language) {
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this(name, age); //one constructor cannot call more than one constructor
        this.gender = gender;
    }

    public static void printPlanetName(){
        System.out.println("Planet name: " + planet);
    }
    public void eat(String food){
        System.out.println(name + " eats " + food);
    }
    public void drink(String drink){
        System.out.println(name +" drinks " + drink);
    }
    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
/*
    1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()



     */
}
