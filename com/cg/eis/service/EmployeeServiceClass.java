package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.*;

public class EmployeeServiceClass extends Employee implements EmployeeService{
	
	Employee employee = new Employee();
	Scanner sc = new Scanner(System.in);

	public EmployeeServiceClass() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public void getDetailsFromUser() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID");
		employee.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Employee Name");
		employee.setName(sc.nextLine());
		System.out.println("Enter Employee Designation");
		employee.setDesignation(sc.nextLine());
		System.out.println("Enter Employee Salary");
		employee.setSalary(Double.parseDouble(sc.nextLine()));
	}

	@Override
	public void findInsuranceScheme() {
		// TODO Auto-generated method stub
		if(employee.getDesignation().equals("Manager") || employee.getSalary() > 200000) {
			employee.setInsuranceScheme("A");
		}
		else if(employee.getDesignation().equals("Team Leader") || (((employee.getSalary() > 50000) && (employee.getSalary() < 200000)))){
			employee.setInsuranceScheme("B");
		}
		else {
			employee.setInsuranceScheme("C");
		}
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("The Employee Details are as follows:");
		System.out.println("ID: " + employee.getId());
		System.out.println("Name: " + employee.getName());
		System.out.println("Designation: " + employee.getDesignation());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Insurance Scheme: " + employee.getInsuranceScheme());
	}
	
	

}
