package p1;

import java.util.Scanner;

public class DateSuffix {
	
public static void main(String[] args) {
		
		int day;
		System.out.println("Please enter the day of the month");
		Scanner sc = new Scanner(System.in);
		day = sc.nextInt();
		sc.close();
		
		if(day < 1 || day > 31) {
			System.out.println("Invalid day! Please enter a number between 1 and 31.");
		}
		else {
			System.out.println(day%100);
			System.out.print(day);
			if(((day % 10) == 1) && (day != 11)) {
				System.out.println("st");
			}
			else if(((day % 10) == 2) && (day != 12)) {
				System.out.println("nd");
			}
			else if(((day % 10) == 3) && (day != 13)) {
				System.out.println("rd");
			}
			else {
				System.out.println("th");
			}
			
		}
		
	}

}
