package day11_string;

public class StringMethod3 {
    public static void main(String[] args) {
String word = "Java";

boolean r1 = word.isEmpty();
        System.out.println(r1);

        System.out.println("_______________________________________________");
String str = "               ";
boolean r2 = str.isEmpty();
boolean r3 = str.isBlank();

        System.out.println(r2); //false
        System.out.println(r3); //true
        System.out.println("______________________________________________");

String str1 = "Cydeo";
String str2 = new String("Cydeo");

        System.out.println(str1==str2);//===>FALSE - different object so false
        System.out.println(str1.equals(str2)); //====>TRUE they have same characters even tough not same object

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3));  //FALSE

String s1 ="JAVA";
String s2 ="java";
        System.out.println(s1.equals(s2)); //FALSE
        System.out.println(s1.equalsIgnoreCase(s2)); //TURE

        System.out.println("______________________________________________");

        String students = "Hasan Naran Sumeye Nataliia";
        boolean hasAhmed = students.contains("Ahmed");
        System.out.println(hasAhmed); //false


        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.contains("java");
        System.out.println(hasJava);//false

        System.out.println("______________________________________________");
String name ="Michael";

boolean l = name.startsWith("Da");
        System.out.println(l); //FALSE not starts with Da
        String url = "www.cydeo.com";
        boolean valid = url.startsWith("www.");
        System.out.println(valid);
boolean t = url.endsWith(".com");
        System.out.println(t); //TRUE

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");
        System.out.println(isGmail); //TRUE

        boolean hotMail = email.endsWith("hotmail.com");
        System.out.println(hotMail); //FALSE







    }
}
