package day11_string;

public class StringMethod1 {
    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL"; //all java objects are immutable-cannot change existing string
        str1.toLowerCase(); //"cydeo school":

        System.out.println(str1); //still printing uppercase, modification is not possible

        str1 = str1.toLowerCase(); //now converted to lower case because reassigned - this one is immutable too

        System.out.println(str1); //after reassigning it is lower case now

        System.out.println("________________________________________");

        String str2 = "java programming";

        str2.toUpperCase(); //no change this way. Need to reassign. This creates new object: JAVA PROGRAMMING

        System.out.println(str2); //java programming-no change

        String str3 = str2.toUpperCase();
        System.out.println(str3); //JAVA PROGRAMMING
        //now str2 =java programming and str3=JAVA PROGRAMMING

        System.out.println("__________________________________________");

        String word = "Wooden Spoon";
        word.toUpperCase(); //WOODEN SPOON -new string

        word.toLowerCase(); // wooden spoon - new string

        System.out.println(word); // new objects created but not stored. Result is first one Wooden Spoon
        word = word.toUpperCase();

        System.out.println(word); //reassigned and now upper case WOODEN SPOON

        word = word.toLowerCase();
        System.out.println(word); // now it is lower case. now value is the very last assigned value

        System.out.println("______________________________________________________");

        String str4 ="              Cydeo School";

        str4.trim(); //"Cydeo School" exclude any white spaces
        System.out.println(str4);

        str4 =  str4.trim(); //reassigned
        System.out.println(str4); //removed white spaces

        System.out.println("__________________________________________");

       String sentence1 = "Today is Sunday, and we have Java Class"; //to make we We with indexOf to calc

int index1 = sentence1.indexOf('w'); //checks characters from roght to left. First cahracter it finds give you index number
        System.out.println(index1);

        String s1 = "I Love Java Programming";
        int firstA = s1.indexOf('a'); //first 'a' - 'a' always give you first a
        System.out.println(firstA);

int secondA = s1.indexOf("a "); //"a " space after second a is included to specify which a- unuiqe
        System.out.println(secondA);
        System.out.println("______________________________________________________");
String s2 ="Java Python JavaScript Cydeo Python";
int a1 = s2.indexOf('a');
        System.out.println(a1);

int a2 = s2.indexOf("a Python"); // cannot use "va" it gives index number of v
        System.out.println(a2);


        int a3 = s2.indexOf("avaS"); //if type av then it will print index # of second a
        System.out.println(a3);

        int a4 = s2.indexOf("aS"); //make it unique!!!! - right to left
        System.out.println(a4);
        System.out.println("________________________________");

        String w = "Java";
        System.out.println(w.indexOf('a')); //1
        System.out.println(w.lastIndexOf('a')); //from left to right first one. ==3

String w2 = "Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('a'));

        System.out.println(w2.lastIndexOf('P')); //last p from right and first from left





    }
}
