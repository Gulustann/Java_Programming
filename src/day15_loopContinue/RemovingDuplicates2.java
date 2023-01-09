package day15_loopContinue;

public class RemovingDuplicates2 {
    public static void main(String[] args) {
        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (result.contains("" + str.charAt(i))) { //if the character is already contained in the new string skips adding that character
                continue; //Skip it
            }
            result += str.charAt(i);
        }

        System.out.println(result);
 /*
 Write a program that can remove the duplicated characters from  a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */

        System.out.println("____________________________________________________");
//Find the sum of all the even numbers between 50-100

        for (int i = 50; i < 101; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
      //__________________________________________________________//

        int sum = 0;

        for (int i = 50; i < 101; i++) { // OR for(int i =50; i<101; i+=2)
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println();
        System.out.println(sum);









    }
}
