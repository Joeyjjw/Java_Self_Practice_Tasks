package day03_operators_practice;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 65;
        int weeklyHours = 40;
        double stateTaxRate = 6;  // (given as a percentage)
        double federalTaxRate = 26; // (given as a percentage)
        stateTaxRate /= 100;
        federalTaxRate /= 100;
        double salaryBeforeTax = hourlyRate*weeklyHours*52;
        double stateTax = salaryBeforeTax*stateTaxRate;
        double federalTax =salaryBeforeTax*federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax-(totalTax);

        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("State tax is: $"+stateTax);
        System.out.println("Total tax is: $"+ totalTax);
        System.out.println("Net income is: $"+salaryAfterTax);


    }
}

/*
Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax (Yearly salary before tax)
				stateTax (Yearly state tax)
				federalTax (Yearly federal tax)
				totalTax (yearly total tax)
				salaryAfterTax (Yearly salary after tax)

		Assume that there are 52 work weeks in a year.

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0

 */