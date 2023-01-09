package day16_loopContinue;

public class InterviewFrequencyOfCharacters {
    public static void main(String[] args) {
      String str= "AAABBCCCCDDDDD";



      String result ="";


        for (int i = 0; i < str.length(); i++) {
            int count =0;
            if(! result.contains(str.charAt(i)+"")){
                result += str.charAt(i); //adding each character
            }else {
                continue; //skip
            }
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)== str.charAt(j)){
                  count++;
                }
            }
result += count;
        }
        System.out.println(result);


      //output: A3B2C4D5








    }
}
