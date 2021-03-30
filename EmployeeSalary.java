package p1;

import java.util.Scanner;

public class EmployeeSalary {
	
public static void main(String[] args) {
		
		double basicSalary, hra, da, tax=0, totalSalaryMonthly, totalSalaryAnnual, finalAnnualSalary;
		System.out.println("Please enter the Basic Salary (Monthly) for the Employee");
		Scanner sc = new Scanner(System.in);
		basicSalary = sc.nextDouble();
		sc.close();
		
		hra = 0.4 * basicSalary;
		da = 0.6 * (basicSalary + hra);
		totalSalaryMonthly = basicSalary + hra + da;
		totalSalaryAnnual = totalSalaryMonthly * 12;
		
		if(totalSalaryAnnual < 200000) {
			tax = 0;
		}
		else if(totalSalaryAnnual >= 200000 && totalSalaryAnnual <=600000) {
			tax = 0.1 * totalSalaryAnnual;
		}
		else if(totalSalaryAnnual > 600000) {
			tax = 0.2 * totalSalaryAnnual;
		}
		finalAnnualSalary = totalSalaryAnnual - tax;
		
		
		System.out.print("The Annual Take-Home Salary for the employee is: " + finalAnnualSalary + 
				"\nThe Annual Salary (Before Tax Reduction) is: " + totalSalaryAnnual +
				"\nThe Annual Tax is: " + tax + 
				"\nThe Monthly Salary (Before Tax Reduction) is: " + totalSalaryMonthly +
				"\nThe HRA is: " + hra +
				"\nThe DA is: " + da + "\n");
	}

}
