package day10_string;
import java.util.Scanner; //You HAVE to add it. Bc it is in .util
import java.lang.String; //You can give it manually or you don't have to. Java does it automatically
// bc it is in .lang==>Java adds it automatically
public class StringIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str ="Java";

        System.out.println();

        input.close();
        System.out.println("___________________________________________");

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";
        String s4 = "Cat";

        System.out.println(s1==s4); //true - only one of them stored in java pool and shared by others
        System.out.println(s1==s3); //true   by String literal
        System.out.println(s3==s4); //true
        System.out.println("________________________________");

        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1 == str2); //false- by new keyword they are different,
        // new memory is opened in Heap


        System.out.println("________________________________________");

        String t1 = "Python";
        String t2 = new String("Python");
        ///In String pool 1 Python and 1 Python outside of the pool, inside the Heap
        String t3= new String("Python");

        System.out.println(t1); //Python
        System.out.println(t2); //Python
        System.out.println(t3); //Python

        System.out.println(t1==t2); //false
        System.out.println(t2==t3); //false



    }
}
