package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "20";
        System.out.println(str + 1); //201 concatenation

        // Integer num1 = Integer.parseInt(str); //unboxing

        int num = Integer.parseInt(str);
        System.out.println(num + 1); //21

        Integer num2 = Integer.valueOf(str);
        System.out.println(num2); //20

        System.out.println("__________________________________");

        String s = "20.5";

        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);
        System.out.println(num3);
        System.out.println(num4);

        System.out.println("__________________________________");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x); //parse==>converts primitive data type
        Boolean r2 = Boolean.valueOf(x); // valueOf==> converts string to wrapper class type

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("__________________________________");

        char ch = 'A';

        boolean isDigit = Character.isDigit(ch);
        System.out.println(isDigit);

        boolean isLetter = Character.isLetter(ch);
        System.out.println(isLetter);

        boolean isLowerCase = Character.isLowerCase(ch);
        System.out.println(isLowerCase);

        boolean isUpperCase = Character.isUpperCase(ch);
        System.out.println(isUpperCase);

        boolean isLetterOrDigit = Character.isLetterOrDigit(ch);
        System.out.println(isLetterOrDigit);

        boolean isSpecialChar = ! Character.isLetterOrDigit(ch);
        System.out.println(isSpecialChar);

        System.out.println("____________________________________________________");

        String string ="a1b2c3d4e5";

        int sum=0;
        for (char each : string.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt(each+"");
            }
        }
        System.out.println(sum);

    }
}
