package exercise1;

import java.util.Scanner;

public class Two {
	
	public static void main(String[] args) {
		
		System.out.println("The following is a signal:");
		System.out.println("1. Red");
		System.out.println("2. Yellow");
		System.out.println("3. Green");
		
		System.out.println("Please select a number representing each of the signal colours!");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		switch(x) {
		case 1: {
			System.out.println("\nSTOP!");
			break;
		}
		case 2: {
			System.out.println("\nREADY!");
			break;
		}
		case 3: {
			System.out.println("\nGO!");
			break;
		}
		}
	}

}
