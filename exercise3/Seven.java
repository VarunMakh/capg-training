package exercise3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Seven {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate today = LocalDate.now();
		
		System.out.println("Enter a date (yyyy-MM-dd):");
		
		LocalDate date = LocalDate.parse(sc.nextLine(), format);
		
		int dayDifference = (int) ChronoUnit.DAYS.between(date, today);
		int monthDifference = (int) ChronoUnit.MONTHS.between(date, today);
		int yearDifference = (int) ChronoUnit.YEARS.between(date, today);
		
		System.out.println("Duration from now:");
		System.out.println("Years: " + yearDifference);
		System.out.println("Months: " + monthDifference);
		System.out.println("Days: " + dayDifference);
	}
}
