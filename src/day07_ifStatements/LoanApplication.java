package day07_ifStatements;

public class LoanApplication {
    public static void main(String[] args) {
        int salary = 55000;
        int creditScore = 680;

        if (salary >= 45000 && creditScore>=700){
            System.out.println("You are eligible for the loan");
        }else{
            System.out.println("You are not eligible for the loan");
        }
        System.out.println("_______________________________");
String result = "";
        if (salary >= 45000 && creditScore>=700){
            result = "You are eligible";
        }else{
            result =  "You are not eligible";
            System.out.println(result);
        }
    }
}
