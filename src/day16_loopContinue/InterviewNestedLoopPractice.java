package day16_loopContinue;

public class InterviewNestedLoopPractice {
    public static void main(String[] args) {
        String str = "aaabbccccddeeeeff";

        String result = "";  //b,d,f

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); //each character of str
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if(count==2 && !result.contains(ch+"")){
                result +=ch; //if each character appears in str twice and result does NOT contain ch,
                                            // then that character added to result
            }

        }

        System.out.println(result); //===> bdf

    }
}
