package exercise1;

import java.util.Scanner;

public class Eight {
	public static void main(String[] args) {
		Eight eight = new Eight();
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if(eight.checkNumber(n)) {
			System.out.println("The number is a power of two");
		}
		else {
			System.out.println("The number is not a power of two.");
		}
	}
	
	public boolean checkNumber(int n) {
		boolean check = true;
		int a;
		while(n != 1) {
			a = n % 2;
			n /= 2;
			if(a != 0) {
				check = false;
				break;
			}
		}
		return check;
	} 
}
