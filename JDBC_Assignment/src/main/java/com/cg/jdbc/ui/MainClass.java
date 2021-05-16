package com.cg.jdbc.ui;

import java.util.List;
import java.util.Scanner;

import com.cg.jdbc.bean.Instructor;
import com.cg.jdbc.dto.InstructorLocationCountDTO;
import com.cg.jdbc.service.InstructorService;
import com.cg.jdbc.service.InstructorServiceImpl;

public class MainClass {

	InstructorService service;

	public MainClass() {
		service = new InstructorServiceImpl();
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass obj = new MainClass();
		while (true) {
			System.out.println("1. Insert");
			System.out.println("2. Show all");
			System.out.println("3. Search instructor by id");
			System.out.println("4. Search instructors by location");
			System.out.println("5. Display count of instructors by location");
			System.out.println("0. Exit");

			int choice = Integer.parseInt(sc.nextLine());
			if (choice == 1) {
				obj.insertInstructorDetailsFromUser();
			}
			if (choice == 2) {
				obj.readInstructorDetails();
			}
			if (choice == 3) {
				obj.printInstructorByCode();
			}
			if (choice == 4) {
				obj.printInstructionByLocation();
			}
			if (choice == 5) {
				obj.printLocationCount();
			}
			if (choice == 6) {
				obj.DeleteInstructorDetailsFromUser();
			}
			if (choice == 0) {
				System.exit(0);
			}
		}

	}

	public void insertInstructorDetailsFromUser() {

		// ... write code to read data hope
		Instructor instructor = new Instructor(100, "A", 5000, 10000, "a.z@cg.com", "Z");
		try {
			boolean result = service.insertInstructor(instructor);

			if (result)
				System.out.println("Instructor added successfully!");
			else
				System.out.println("Unexpected Error! Please contact the system admin.");
		} catch (Exception e) {
			showErr(e);
		}
	}

	public void DeleteInstructorDetailsFromUser() {
		int code = Integer.parseInt(sc.nextLine());
		try {
			boolean result = service.delteInstructorByCode(code);

			if (result)
				System.out.println("Instructor deleted successfully!");
			else
				System.out.println("Unexpected Error! Please contact the system admin.");
		} catch (Exception e) {
			showErr(e);
		}

	}

	public void printInstructorByCode() {
		int code = Integer.parseInt(sc.nextLine());
		try {
			List<Instructor> list = service.getInstructorByCode(code);
			list.stream().forEach(Instructor -> displayInstructor(Instructor));
		} catch (Exception e) {
			// TODO: handle exception
			showErr(e);
		}
	}

	public void printInstructionByLocation() {
		String location = sc.nextLine();
		try {
			List<Instructor> list = service.getInstructorsByLocation(location);
			list.stream().forEach(Instructor -> displayInstructor(Instructor));
		} catch (Exception e) {
			// TODO: handle exception
			showErr(e);
		}
	}

	public void printLocationCount() {
		try {
			List<InstructorLocationCountDTO> list = service.getInstructorsCountByLocation();
			list.stream().forEach(InstructorLocationCountDTO -> displayInstructorCount(InstructorLocationCountDTO));
		} catch (Exception e) {
			// TODO: handle exception

			showErr(e);
		}

	}

	public void readInstructorDetails() {
		try {
			List<Instructor> list = service.getInstructors();

			list.stream().forEach(instructor -> displayInstructor(instructor));
		} catch (Exception e) {
			showErr(e);
		}
	}

	public void displayInstructor(Instructor instructor) {
		System.out.println(instructor);
	}

	public void showErr(Exception e) {
		System.out.println(e);
	}

	public void displayInstructorCount(InstructorLocationCountDTO instructor) {
		System.out.println(instructor);
	}
}
