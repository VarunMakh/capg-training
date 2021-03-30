package p1;

import java.util.Scanner;

public class EmployeeSalary {
	
public static void main(String[] args) {
		
		double basicSalary, hra, da, tax=0, totalSalary, salary;
		System.out.println("Please enter the Basic Salary for the Employee");
		Scanner sc = new Scanner(System.in);
		basicSalary = sc.nextInt();
		sc.close();
		
		hra = 0.4 * basicSalary;
		da = 0.6 * (basicSalary + hra);
		salary = basicSalary + hra + da;
		if(salary < 200000) {
			tax = 0;
		}
		else if(salary >= 200000 && salary <=600000) {
			tax = 0.1 * salary;
		}
		else if(salary > 600000) {
			tax = 0.2 * salary;
		}
		totalSalary = salary - tax;
		
		
		System.out.print("The Annual Take-Home Salary for the employee is: " + totalSalary + "\nThe Annual Tax is: " + tax + "\n");
	}

}
