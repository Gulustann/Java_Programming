package day19_ArraysIntro;

public class FindingMaxAndMinNumber {
    public static void main(String[] args) {
       //Find max number from an array

int[] number = {100, 20, 500, 40, -10, 30};
int maxNumber = number[0]; //10

        for (int i = 1; i < number.length; i++) { //index: 1, 2, 3, 4, 5. Index 0 assigned to maxNumber for comparison,
                                                //so starting i (index number) is 1, not 0
            if(number[i]>maxNumber){ //if number[i] greater than maxNumber(index 0==100) then max =number[i]
                maxNumber=number[i];
            }
        }

        System.out.println("maxNumber = " + maxNumber);

int min= number[0];

        for (int i = 1; i < number.length; i++) {
            if(number[i]<min){
                min= number[i];
            }

        }
        System.out.println("min = " + min);


    }
}
