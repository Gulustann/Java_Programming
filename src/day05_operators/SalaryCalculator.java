package day05_operators;

public class SalaryCalculator {
    /*
    1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560
     */
    public static void main(String[] args) {
      int hourlyRate = 50,
      weeklyHours = 45;
    double stateTaxRate = 0.06,
    federalTaxRate = 0.26;

    double salaryBeforeTax = hourlyRate*weeklyHours*52,
            stateTax = salaryBeforeTax*stateTaxRate,
                    federalTax = salaryBeforeTax*federalTaxRate,
            totalTax = stateTax+federalTax,
            salaryAfterTax = salaryBeforeTax-totalTax;

        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("stateTaxRate = " + stateTaxRate);
        System.out.println("federalTaxRate = " + federalTaxRate);
        System.out.println("output:");
        System.out.println("\tGross pay is:" + "$" + (int)salaryBeforeTax);
        System.out.println("\tFederal tax is:" + "$" + (int)federalTax);
        System.out.println("\tState tax is:" + "$" + (int)stateTax);
        System.out.println("\tTotal tax is:" + "$" + (int)totalTax);
        System.out.println("\tNet income is:" + (int)salaryAfterTax);
        System.out.println("_______________________________________");

        System.out.println("Gross pay is: $" + salaryBeforeTax +
                "\nFederal tax is: $" + federalTax +
                "\nState tax is: $" + stateTax +
                "\nTotal Tax is: $" + totalTax +
                "\nNet income is:" + salaryAfterTax);







    }

}
