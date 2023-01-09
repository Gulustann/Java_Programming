package day11_string;

public class StringMethod2 {
    public static void main(String[] args) {
        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";
sentence.replace("Python", "Java");
        System.out.println(sentence);// original one did not change since it is not assigned yet.

        sentence=sentence.replace("Python", "Java");

        System.out.println(sentence);

        System.out.println("____________________________________________________");
        String word = "java";
        word= word.replace('a', 'e'); //new string is jeve
        System.out.println(word); //  if we don't assigne it then it will print original one

        System.out.println("____________________________________________________");

        String sentence2 = "I love Java, Java is cool";

       sentence2 =  sentence2.replaceFirst("Java", "Python");
       //reassigned (setence2= sentence2.replace......) - Otherwise it prints original one

        System.out.println(sentence2);

        System.out.println("____________________________________________________");

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        sentence3 = sentence3.replaceFirst(", Java", ", Python");//second Java is first matching one

        System.out.println(sentence3);


        System.out.println("____________________________________________________");

        String sentence4 = "I love Java Programming";

        String languageName =sentence4.substring(7,10+1);
        System.out.println(languageName);

//______________________________________________________//

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        String today = sentence5.substring(9,15); // 14+1=15 if you keep it 14 then it will print Sunda not Sunday

        System.out.println(today);
//______________________________________________________//
   String email = "CydeoSchoolJavaProgramming@gmail.com";

   int beginning = email.indexOf('@') + 1; //+1 to find g index number, not @
   int ending = email.lastIndexOf('.'); //ending always +1 and in this case it is equavelent to index # of '.

String domain =email.substring(beginning, ending);
        System.out.println(domain);

        System.out.println("________________________________________________");
       String sentence6 = "I love Java programming";  //create "Java programming"
        String r1=sentence6.substring(7, sentence6.length()-1+1);

        System.out.println(r1);

String r2 = sentence6.substring(7);
        System.out.println(r2);

//______________________________________________________//
        String sentence7 = "Today is Sunday, Tomorrow is Monday";
        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ')+1);
        System.out.println(tomorrow);

//______________________________________________________//

        String sentence8 = "I study at Cydeo School";

        String schoolName = sentence8.substring(sentence8.indexOf("Cy")); //ot 11
        System.out.println(schoolName);

//______________________________________________________//
        System.out.println("___________________________________________________");

String str = "Python";
String result = (str +"\n").repeat(10);// repeats in different lines with (str+"\n")
        System.out.println(result);






    }
}
