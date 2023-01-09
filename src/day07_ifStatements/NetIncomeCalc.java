package day07_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {
int salary = 100000;
        boolean married = true;
double taxRate = 1;
if(salary >=130000){
    taxRate = 0.35;
}
if (salary>=100000 && salary<130000){
    taxRate = 0.3;
}
if (salary>=80 && salary<100000){
    taxRate = 0.25;
}
if (salary<80000){
    taxRate = 0.2;
}

if (married){
    taxRate -= 0.05; //if married tax rate reduced by 5%
}

double netIncome = salary * (1- taxRate);
        System.out.println("netIncome = " + netIncome);


         /*
    Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
     */
    }
}