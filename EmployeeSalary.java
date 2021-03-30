package p1;

import java.util.Scanner;

public class EmployeeSalary {
	
public static void main(String[] args) {
		
		double basicSalary, hra, da, tax=0, totalSalary;
		System.out.println("Please enter the Basic Salary for the Employee");
		Scanner sc = new Scanner(System.in);
		basicSalary = sc.nextInt();
		sc.close();
		
		hra = 0.4 * basicSalary;
		da = 0.6 * (basicSalary + hra);
		
		if(basicSalary < 200000) {
			tax = 0;
		}
		else if(basicSalary >= 200000 && basicSalary <=600000) {
			tax = 0.1 * basicSalary;
		}
		else if(basicSalary > 600000) {
			tax = 0.2 * basicSalary;
		}
		
		totalSalary = basicSalary + hra + da - tax;
		
		
		System.out.print("The Annual Take-Home Salary for the employee is: " + totalSalary + "\nThe Annual Tax is: " + tax + "\nThe Annual HRA is: " + hra + "\nThe Annual DA is: " + da + "\n");
	}

}
