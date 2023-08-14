
package com.mycompany.tax_calculator;
import java.util.Scanner;

public class Tax_calculator {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        
        double taxAmount;
      
        if (salary <= 12000) {
            taxAmount = 0;
        } else if (salary <= 20000) {
            taxAmount = 0.02 * (salary - 12000);
        } else if (salary <= 30000) {
            taxAmount = 0.05 * (salary - 20000) + 160;
        } else if (salary <= 50000) {
            taxAmount = 0.10 * (salary - 30000) + 560;
        } else if (salary <= 70000) {
            taxAmount = 0.15 * (salary - 50000) + 1560;
        } else if (salary <= 100000) {
            taxAmount = 0.25 * (salary - 70000) + 3560;
        } else if (salary <= 150000) {
            taxAmount = 0.30 * (salary - 100000) + 9060;
        } else {
            taxAmount = 0.35 * (salary - 150000) + 23160;
        }
        
        // Calculate salary after tax deduction
        double salaryAfterTax = salary - taxAmount;
     
        System.out.println("Tax amount: " + taxAmount);
        System.out.println("Salary after tax deduction: " + salaryAfterTax);
    }
}

    

